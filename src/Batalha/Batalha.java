package Batalha;

import Personagens.Player;
import Personagens.Inimigo;
import Personagens.Personagem;
import Habilidades.Habilidade;

import java.util.List;
import java.util.Scanner;

public class Batalha {

    private Player player;
    private Inimigo inimigo;
    private Scanner scanner = new Scanner(System.in);

    public Batalha(Player player, Inimigo inimigo) {
        this.player = player;
        this.inimigo = inimigo;
    }

    public void iniciar() {
        System.out.println("=== Batalha Iniciada ===");
        System.out.println(player.getNome() + " VS " + inimigo.getNome());

        // Loop de batalha enquanto ambos estiverem vivos
        while (player.estaVivo() && inimigo.estaVivo()) {
            mostrarStatus();

            // Turno do Player
            turnoPlayer();

            if (!inimigo.estaVivo()) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
                player.ganharExperiencia(inimigo.getXp());
                break;
            }

            // Turno do Inimigo
            turnoInimigo();

            if (!player.estaVivo()) {
                System.out.println(player.getNome() + " foi derrotado!");
                break;
            }
        }

        System.out.println("=== Batalha Encerrada ===");
    }

    private void mostrarStatus() {
        System.out.println("\n--- Status ---");
        player.mostrarStatus();
        inimigo.mostrarStatus();
        System.out.println("---------------\n");
    }

    private void turnoPlayer() {
        System.out.println("Escolha uma ação:");
        System.out.println("1) Ataque");
        System.out.println("2) Usar habilidade");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                player.atacar(inimigo);
                break;
            case 2:
                // Exemplo: usa a primeira habilidade disponível do player
                Habilidade hab = null; // Substituir por método que seleciona habilidade
                player.usarHabilidade(hab, inimigo);
                break;
            default:
                System.out.println("Ação inválida! Usando ataque padrão.");
                player.atacar(inimigo);
                break;
        }
    }

    private void turnoInimigo() {
        System.out.println("\nTurno de " + inimigo.getNome() + "!");
        List<Habilidade> habs = inimigo.getHabilidades();
        if (habs != null && !habs.isEmpty()) {
            // Usa habilidade aleatória
            Habilidade hab = habs.get((int) (Math.random() * habs.size()));
            inimigo.usarHabilidade(hab, player);
        } else {
            inimigo.atacar(player);
        }
    }
}
