package Jogo;

import Batalha.IBatalha;
import Habilidades.Habilidade;
import Habilidades.IHabilidade;
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
                new Habilidade("Mordida Sombria", 30, "Físico", "Nosferato morde e suga sangue, recuperando parte do HP.")));

        inimigos.add(new Inimigo("Vampiro Drácula", 350, 40, 250, "Boss",
                new Habilidade("Servos das Sombras", 35, "Magia", "Invoca servos das trevas e aumenta sua velocidade de ataque.")));

        inimigos.add(new Inimigo("Annabelle", 300, 35, 300, "Normal",
                new Habilidade("Possessão de Boneco", 40, "Magia", "Possui um boneco e força o jogador a atacar um aliado.")));

        inimigos.add(new Inimigo("Chucky", 220, 28, 220, "Normal",
                new Habilidade("Lâminas Envenenadas", 30, "Físico", "Ataca duas vezes com facas envenenadas, causando dano crítico.")));

        inimigos.add(new Inimigo("Súcubo", 280, 32, 280, "Normal",
                new Habilidade("Roubo de Vida", 35, "Magia", "Rouba HP do jogador e pode controlá-lo por 1 turno.")));

        inimigos.add(new Inimigo("Lilith", 600, 50, 600, "Sub-Boss",
                new Habilidade("Véu Dimensional", 45, "Magia", "Invoca demônios e manipula véus para confundir os jogadores.")));

        inimigos.add(new Inimigo("Cavaleiro da Morte", 450, 42, 400, "Normal",
                new Habilidade("Praga Sombria", 40, "Físico", "Espalha doenças que reduzem HP gradualmente em área.")));

        inimigos.add(new Inimigo("Espantalho Vivo", 320, 30, 250, "Normal",
                new Habilidade("Campo de Medo", 33, "Psicológico", "Invoca corvos e cria pânico nos jogadores.")));

        inimigos.add(new Inimigo("Dama de Branco", 280, 28, 250, "Normal",
                new Habilidade("Grito Paralisante", 30, "Psicológico", "Hipnotiza e paralisa os jogadores por 1 turno.")));

        inimigos.add(new Inimigo("Cérbero das Sombras", 700, 55, 700, "Sub-Boss",
                new Habilidade("Três Mordidas Flamejantes", 50, "Físico", "Ataca 3 vezes com fogo sombrio das cabeças.")));

        inimigos.add(new Inimigo("Anticristo", 1200, 70, 1500, "Final Boss",
                new Habilidade("Eclipse Sombrio", 70, "Magia", "Controla o Coração do Sol e lança magia destrutiva em área.")));
    }


    public void iniciarCampanha() {
        carregarJogadores();
        carregarInimigos();

        System.out.println("🎮 Campanha iniciada! Prepare-se para enfrentar lendas urbanas...");

        for (Inimigo inimigo : inimigos) {
            System.out.println("\n==============================");
            System.out.println("⚔️ Novo inimigo: " + inimigo.getNome() + " (" + inimigo.getTipo() + ")");

            if (inimigo.getHabilidade() != null) {
                System.out.println("🧠 Habilidade especial: " + inimigo.getHabilidade().getNome());
                System.out.println("📜 Descrição: " + inimigo.getHabilidade().getDescricao());
            }

            System.out.println("==============================");
            IBatalha batalha = new IBatalha();
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
                // Se quiser, pode chamar jogador.subirNivel() aqui
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

}
