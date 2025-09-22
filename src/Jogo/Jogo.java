package Jogo;

import Batalha.Batalha;
import Personagens.Player;
import Personagens.PlayerFactory;
import Personagens.Inimigo;
import Personagens.InimigoFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

    private List<Player> jogadores = new ArrayList<>();
    private List<Inimigo> inimigos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        // Carregar jogadores iniciais
        jogadores = PlayerFactory.getPlayersIniciais();

        // Carregar inimigos da campanha
        inimigos.add(InimigoFactory.criarFantasminha());
        inimigos.add(InimigoFactory.criarPoltergeistMenor());
        inimigos.add(InimigoFactory.criarVampiroNefesfato());
        inimigos.add(InimigoFactory.criarBruxoCorrupto());
        inimigos.add(InimigoFactory.criarDemonioInfernal());
        inimigos.add(InimigoFactory.criarAnjoCaidoSupremo());
        inimigos.add(InimigoFactory.criarAnticristo());

        System.out.println("=== Bem-vindo à Campanha ===");

        boolean prontoParaBatalha = false;

        while (!prontoParaBatalha) {
            mostrarStatusJogadores();
            System.out.println("\n=== Menu ===");
            System.out.println("1) Evoluir jogadores");
            System.out.println("2) Subir status dos jogadores");
            System.out.println("3) Iniciar batalhas");
            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> evoluirJogadores();
                case 2 -> distribuirStatusJogadores();
                case 3 -> prontoParaBatalha = true;
                default -> System.out.println("Opção inválida!");
            }
        }

        iniciarCampanha();
    }

    private void mostrarStatusJogadores() {
        System.out.println("\n--- Status dos Jogadores ---");
        for (Player p : jogadores) {
            p.mostrarStatus();
        }
    }

    private void evoluirJogadores() {
        System.out.println("\n=== Evoluir Jogadores ===");
        for (int i = 0; i < jogadores.size(); i++) {
            Player p = jogadores.get(i);
            System.out.println((i + 1) + ") " + p.getNome());
        }
        System.out.print("Escolha o jogador para evoluir (0 para voltar): ");
        int escolha = sc.nextInt() - 1;
        if (escolha >= 0 && escolha < jogadores.size()) {
            Player p = jogadores.get(escolha);
            System.out.println("Escolha a evolução (exemplo: 0, 1, 2...)");
            p.evoluir(0); // Pode colocar lógica para escolher qual evolução
        }
    }

    private void distribuirStatusJogadores() {
        System.out.println("\n=== Distribuir Pontos de Status ===");
        for (Player p : jogadores) {
            System.out.println("Distribuindo pontos de " + p.getNome());
            p.subirStatus();
        }
    }

    private void iniciarCampanha() {
        System.out.println("\n=== Iniciando Campanha ===");

        for (Inimigo inimigo : inimigos) {
            System.out.println("\n>>> Um inimigo aparece!");
            inimigo.mostrarStatus();

            Batalha batalha = new Batalha(jogadores.get(0), inimigo); // Exemplo: 1 player x 1 inimigo
            batalha.iniciar();

            // Recompensa de XP
            for (Player p : jogadores) {
                if (p.estaVivo()) {
                    p.ganharExperiencia(inimigo.getXp());
                }
            }

            // Recuperação simples entre batalhas
            for (Player p : jogadores) {
                if (p.estaVivo()) {
                    p.setHp(p.getHp() + 20); // Recupera HP
                }
            }

            // Checa se todos os jogadores estão mortos
            boolean todosDerrotados = jogadores.stream().allMatch(p -> !p.estaVivo());
            if (todosDerrotados) {
                System.out.println("\nTodos os jogadores foram derrotados. Fim da campanha!");
                return;
            }

            System.out.println("\nPressione ENTER para continuar...");
            sc.nextLine();
            sc.nextLine();
        }

        System.out.println("\nCampanha finalizada! Todos os inimigos derrotados!");
        mostrarResumoFinal();
    }

    private void mostrarResumoFinal() {
        System.out.println("\n=== Resumo Final dos Jogadores ===");
        for (Player p : jogadores) {
            String status = p.estaVivo() ? "VIVO" : "DERROTADO";
            System.out.println(p.getNome() + " | HP: " + p.getHp() + " | XP: " + p.getExperiencia() + " | Status: " + status);
        }
    }
}
