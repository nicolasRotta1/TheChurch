package Batalha;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Personagens.Player;
import Personagens.Inimigo;
import Personagens.Personagem;
import Habilidades.Habilidade;

import java.util.List;
import java.util.Scanner;

public class Batalha {

    private List<Player> jogadores;
    private Inimigo inimigo;
    private Scanner scanner = new Scanner(System.in);

    public Batalha(List<Player> jogadores, Inimigo inimigo) {
        this.jogadores = jogadores;
        this.inimigo = inimigo;
    }

    public void iniciar() {
        System.out.println("=== Batalha Iniciada ===");

        // Enquanto inimigo e pelo menos um jogador estiverem vivos
        while (inimigo.estaVivo() && jogadores.stream().anyMatch(Player::estaVivo)) {
            mostrarStatus();

            // ---- Turno dos jogadores ----
            for (Player player : jogadores) {
                if (!player.estaVivo()) continue; // ignora jogadores mortos

                System.out.println("\n--- Turno de " + player.getNome() + " ---");
                turnoPlayer(player);

                // Limpar buffs/debuffs do jogador ao final do turno
                player.limparEfeitosTemporarios();

                if (!inimigo.estaVivo()) {
                    System.out.println(inimigo.getNome() + " foi derrotado!");
                    player.ganharExperiencia(inimigo.getXp());
                    encerrar();
                    return;
                }
            }

            // ---- Turno do inimigo atacando todos os jogadores vivos ----
            System.out.println("\n--- Turno do inimigo: " + inimigo.getNome() + " ---");
            for (Player player : jogadores) {
                if (!player.estaVivo()) continue;
                turnoInimigo(player);
            }

            // Limpar buffs/debuffs do inimigo ao final do turno
            inimigo.limparEfeitosTemporarios();

            // Checar jogadores derrotados
            for (Player player : jogadores) {
                if (!player.estaVivo()) {
                    System.out.println(player.getNome() + " foi derrotado!");
                }
            }
        }

        encerrar();
    }

    private void mostrarStatus() {
        System.out.println("\n--- Status ---");
        for (Player player : jogadores) {
            player.mostrarStatus();
        }
        inimigo.mostrarStatus();
        System.out.println("---------------\n");
    }

    private void turnoPlayer(Player player) {
        System.out.println("Escolha uma ação:");
        System.out.println("1) Ataque");
        System.out.println("2) Usar habilidade");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> player.atacar(inimigo);
            case 2 -> {
                // Faz cast do categoria para CategoriaPlayer
                Habilidade hab = null;
                if (player.getCategoria() instanceof CategoriaPlayer catPlayer) {
                    // Aqui você pega a primeira habilidade como exemplo
                    List<Habilidade> habilidades = catPlayer.getHabilidades();
                    if (habilidades != null && !habilidades.isEmpty()) {
                        hab = habilidades.get(0); // ou qualquer lógica de seleção
                    }
                }

                if (hab != null) {
                    player.usarHabilidade(hab, inimigo);
                } else {
                    System.out.println("Nenhuma habilidade disponível! Usando ataque básico.");
                    player.atacar(inimigo);
                }
            }
            default -> {
                System.out.println("Ação inválida! Usando ataque padrão.");
                player.atacar(inimigo);
            }
        }
    }

    private void turnoInimigo(Player alvo) {
        if (!inimigo.estaVivo()) return;

        List<Habilidade> habs = inimigo.getHabilidades();
        if (habs != null && !habs.isEmpty()) {
            Habilidade hab = habs.get((int) (Math.random() * habs.size()));
            inimigo.usarHabilidade(hab, alvo);
        } else {
            inimigo.atacar(alvo);
        }
    }

    private void encerrar() {
        System.out.println("=== Batalha Encerrada ===");
    }
}
