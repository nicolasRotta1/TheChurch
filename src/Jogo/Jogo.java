package Jogo;

import Batalha.Batalha;
import Habilidades.Habilidade;
import Personagens.Player;
import Personagens.Inimigos.Inimigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private List<Player> jogadores = new ArrayList<>();
    private List<Inimigo> inimigos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void carregarJogadores() {


    private void carregarInimigos() {

    }


    public void iniciarCampanha() {
        carregarJogadores();
        carregarInimigos();

        delay(200);
        System.out.println("🎮 Campanha iniciada! Prepare-se para enfrentar lendas urbanas...");
        delay(500);
        for (Inimigo inimigo : inimigos) {

            }

            System.out.println("==============================");
            Batalha batalha = new Batalha();
            batalha.iniciarBatalha(jogadores, );

            System.out.println("\n✨ Recompensas da batalha:");

            if (inimigo.getHp() <= 0 && inimigo.getHabilidade() != null) {
                for (Player jogador : jogadores) {
                    if (jogador.getHp() > 0) {
                        jogador.equiparArma(inimigo.getHabilidade());
                        break;
                    }
                }
            }

            distribuirXp(inimigo.getXp());

            System.out.println("\n❤️ Recuperação dos jogadores:");
            for (Player jogador : jogadores) {
                if (jogador.getHp() > 0) {
                    int hpMax = 100;
                    jogador.setHp(Math.min(jogador.getHp() + 20, hpMax));
                    System.out.println("- " + jogador.getNome() + " recuperou 20 HP.");
                }
            }

            boolean todosDerrotados = jogadores.stream().allMatch(j -> j.getHp() <= 0);
            if (todosDerrotados) {
                System.out.println("\n💀 Todos os jogadores foram derrotados! Campanha encerrada.");
                mostrarResumoFinal();
                return;
            }

            System.out.println("\n➡️ Pressione ENTER para continuar...");
            sc.nextLine();
        }

        System.out.println("\n🏁 Campanha finalizada! Todos os inimigos foram derrotados!");
        mostrarResumoFinal();
    }

    private void distribuirXp(int xp) {
        for (Player jogador : jogadores) {
            if (jogador.getHp() > 0) {
                jogador.setPontosLevel(jogador.getPontosLevel() + xp);
                System.out.println(jogador.getNome() + " ganhou " + xp + " XP!");
            }
        }
    }
    private void mostrarResumoFinal() {
        System.out.println("\n📜 Resumo dos jogadores:");
        for (Player jogador : jogadores) {
            String nomeArma = (jogador.getArma() != null) ? jogador.getArma().getNome() : "Nenhuma";
            String status = (jogador.getHp() > 0) ? "🟢 Vivo" : "🔴 Derrotado";

            System.out.println("- " + jogador.getNome()
                    + " | HP: " + jogador.getHp()
                    + " | XP: " + jogador.getPontosLevel()
                    + " | Arma: " + nomeArma
                    + " | Status: " + status);
        }
    }

    public void LimparTela(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public void delay(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
