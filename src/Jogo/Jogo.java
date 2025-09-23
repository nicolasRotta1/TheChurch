package Jogo;

import Batalha.Batalha;
import Personagens.Player;
import Personagens.PlayerFactory;
import Personagens.Inimigo;
import Personagens.InimigoFactory;
import Igreja.Igreja; // Importe a classe Igreja

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Jogo {

    private List<Player> jogadores = new ArrayList<>();
    private List<Inimigo> inimigos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Igreja igreja; // Adicione o atributo para a Igreja

    // História dividida em trechos
    private String[] historia = {
            " \nApós um evento cósmico inexplicável, o Sol desapareceu do céu, mergulhando o mundo em uma escuridão eterna. Você é responsável por proteger a igreja e nossos fiéis.",
            "As trevas tomaram conta da Terra, e entidades malignas — antes apenas lendas — despertaram com fome de fé e luz.",
            "No coração de um vilarejo devastado, uma antiga igreja permanece de pé, envolta por véus de proteção divina.",
            "É o último refúgio da humanidade, onde os Sobreviventes da Fé se reúnem para resistir ao avanço das forças do mal.",
            "Você controla os últimos representantes da fé: Jesus, Padre, Freira Guerreira, Monge Errante, Caçador de Relíquias, Profeta Cego e Exorcista Aprendiz.",
            "Cada um possui habilidades únicas de cura, proteção, ataque e revelação espiritual.",
            "🕍 A Igreja como Campo de Batalha\nA igreja não é apenas um cenário — é um personagem vivo.",
            "Seus corredores, altares e catacumbas escondem relíquias sagradas, armadilhas demoníacas e portais para outras dimensões.",
            "Os inimigos invadem o templo em ondas, tentando corromper o sagrado e apagar a última chama de esperança.",
            "Sua missão: defender a igreja, proteger os moradores abrigados nela, purificar os invasores e avançar até o confronto final contra o Anticristo."
    };

    private int historiaIndex = 0; // controla em qual parte da história está

    public void iniciar() {
        // Carregar jogadores iniciais
        jogadores = PlayerFactory.getPlayersIniciais();

        // Crie uma nova instância da Igreja aqui
        igreja = new Igreja("A Última Igreja");

        // Carregar inimigos da campanha
        inimigos.add(InimigoFactory.criarFantasminha());
        inimigos.add(InimigoFactory.criarPoltergeistMenor());
        inimigos.add(InimigoFactory.criarVampiroNefesfato());
        inimigos.add(InimigoFactory.criarBruxoCorrupto());
        inimigos.add(InimigoFactory.criarDemonioInfernal());
        inimigos.add(InimigoFactory.criarAnjoCaidoSupremo());
        inimigos.add(InimigoFactory.criarAnticristo());

        escreverDevagar("=== Bem-vindo à Campanha de THE CHURCH ===");

        boolean prontoParaBatalha = false;

        while (!prontoParaBatalha) {
            mostrarStatusJogadores();
            System.out.println("\n=== Menu ===");
            System.out.println("1) Evoluir jogadores");
            System.out.println("2) Subir status dos jogadores");
            System.out.println("3) Iniciar batalhas");
            System.out.println("4) Mostrar Status dos jogadores");
            System.out.println("5) Checar HP da Igreja");

            System.out.print("Escolha uma opção: ");

            // Adicionado try-catch para lidar com entrada de texto inválida
            try {
                int escolha = sc.nextInt();
                sc.nextLine(); // Consome a nova linha

                switch (escolha) {
                    case 1 -> evoluirJogadores();
                    case 2 -> distribuirStatusJogadores();
                    case 3 -> prontoParaBatalha = true;
                    case 4 -> mostrarStatusJogadores();
                    case 5 -> System.out.println("HP da Igreja: " + igreja.getHp()); // Nova opção para checar o HP da igreja
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.nextLine(); // Limpa o buffer de entrada
            }
        }

        iniciarCampanha();
    }

    private void mostrarHistoria() {
        if (historiaIndex < historia.length) {
            System.out.println("\n--- THE CHURCH ---");

            // divide o trecho em frases menores
            String[] partes = historia[historiaIndex].split("(?<=\\.)");

            for (String parte : partes) {
                System.out.println(parte.trim());
                try {
                    Thread.sleep(2000); // 2 segundos entre frases
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            historiaIndex++;
            System.out.println("\nVOCÊ ESTÁ PRONTO PARA ESSA BATALHA? ENTÃO PRESSIONE ENTER E RESPIRE FUNDO...");
            sc.nextLine();
        }
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
        sc.nextLine(); // Consome a nova linha
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
        escreverDevagar("\n=== Iniciando Campanha ===");

        for (Inimigo inimigo : inimigos) {
            // Checa se todos os jogadores estão mortos OU se a Igreja foi destruída
            List<Player> jogadoresVivos = jogadores.stream().filter(Player::estaVivo).collect(Collectors.toList());
            if (jogadoresVivos.isEmpty() || igreja.estaDestruida()) {
                escreverDevagar("\nCampanha finalizada. O HP da Igreja é " + igreja.getHp());
                return; // Fim da campanha
            }

            mostrarHistoria(); // Mostra parte da narrativa antes de cada inimigo

            escreverDevagar("\n>>> Um inimigo aparece!");
            inimigo.mostrarStatus();

            // Corrija a linha abaixo para passar o objeto igreja
            Batalha batalha = new Batalha(jogadoresVivos, inimigo, igreja);
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

            escreverDevagar("\nPressione ENTER para continuar...");
            sc.nextLine();
        }

        // Checa a condição de vitória final
        if (!igreja.estaDestruida()) {
            escreverDevagar("\nCampanha finalizada! Todos os inimigos derrotados!");
            mostrarResumoFinal();
        } else {
            escreverDevagar("\nA Igreja foi destruída. Fim da campanha!");
        }

    }

    private void mostrarResumoFinal() {
        escreverDevagar("\n=== Resumo Final dos Jogadores ===");
        for (Player p : jogadores) {
            String status = p.estaVivo() ? "VIVO" : "DERROTADO";
            escreverDevagar(p.getNome() + " | HP: " + p.getHp() + " | XP: " + p.getExperiencia() + " | Status: " + status);
        }
    }

    // --- NOVO MÉTODO: Digita uma string caractere por caractere
    private void escreverDevagar(String mensagem) {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            try {
                Thread.sleep(30); // Atraso de 30 milissegundos por caractere
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // Pula para a próxima linha
    }
}