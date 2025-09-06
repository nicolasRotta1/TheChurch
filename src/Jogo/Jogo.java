package Jogo;

import Batalha.Batalha;
import Habilidades.Habilidade;
import Personagens.Player;
import Personagens.Inimigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private List<Player> jogadores = new ArrayList<>();
    private List<Inimigo> inimigos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void carregarJogadores() {
        jogadores.add(new Player("Ruthe"));
        jogadores.add(new Player("Cecilia"));
        jogadores.add(new Player("Lucas"));
        jogadores.add(new Player("João"));
        jogadores.add(new Player("Ana"));
    }

    private void carregarInimigos() {
        inimigos.add(new Inimigo("Vampiro Nosferato", 200, 25, 150, "Normal",
                new Habilidade("Mordida Sombria", 30, "Físico", "Nosferato morde e suga sangue, recuperando parte do HP."),
                "Alho / Espelho", "Torna-se mais rápido e mortal"));

        inimigos.add(new Inimigo("Vampiro Drácula", 350, 40, 250, "Boss",
                new Habilidade("Servos das Sombras", 35, "Magia", "Invoca servos das trevas e aumenta sua velocidade de ataque."),
                "Alho / Espelho (ou estaca)", "Ganha servos das sombras e habilidades estratégicas"));

        inimigos.add(new Inimigo("Annabelle", 300, 35, 300, "Normal",
                new Habilidade("Possessão de Boneco", 40, "Magia", "Possui um boneco e força o jogador a atacar um aliado."),
                "Sal grosso / Água benta", "Passa a possuir bonecos invocados"));

        inimigos.add(new Inimigo("Chucky", 220, 28, 220, "Normal",
                new Habilidade("Lâminas Envenenadas", 30, "Físico", "Ataca duas vezes com facas envenenadas, causando dano crítico."),
                "Sal grosso / Água benta", "Adquire lâminas envenenadas e ataques críticos"));

        inimigos.add(new Inimigo("Súcubo", 280, 32, 280, "Normal",
                new Habilidade("Roubo de Vida", 35, "Magia", "Rouba HP do jogador e pode controlá-lo por 1 turno."),
                "Exorcismo", "Rouba vida e pode controlar heróis por 1 turno"));

        inimigos.add(new Inimigo("Anticristo", 1200, 70, 1500, "Final Boss",
                new Habilidade("Eclipse Sombrio", 70, "Magia", "Controla o Coração do Sol e lança magia destrutiva em área."),
                "Todos os remanescentes", "Controla o Eclipse e o Coração do Sol"));
    }


    public void iniciarCampanha() {
        carregarJogadores();
        carregarInimigos();

        delay(200);
        System.out.println("🎮 Campanha iniciada! Prepare-se para enfrentar lendas urbanas...");
        delay(500);
        for (Inimigo inimigo : inimigos) {
            System.out.println("\n==============================");
            System.out.println("⚔️ Novo inimigo: " + inimigo.getNome() + " (" + inimigo.getTipo() + ")");

            if (inimigo.getHabilidade() != null) {
                System.out.println("🧠 Habilidade especial: " + inimigo.getHabilidade().getNome());
                System.out.println("📜 Descrição: " + inimigo.getHabilidade().getDescricao());
                delay(5000);
            }

            System.out.println("==============================");
            Batalha batalha = new Batalha();
            batalha.iniciarBatalha(jogadores, inimigo);

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
