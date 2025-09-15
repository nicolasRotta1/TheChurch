package Batalha;

import Personagens.Player;
import Personagens.Inimigos.Inimigo;
import java.util.List;
import java.util.Scanner;

public class Batalha implements IBatalha{
    private Scanner sc = new Scanner(System.in);

    @Override
    public void iniciarBatalha(List<Player> jogadores, Inimigo inimigo) {
        delay(500);
        System.out.println("*** Luta contra " + inimigo.getNome() + " comecou!");
        System.out.println("Tipo: " + inimigo.getTipo() + " | HP: " + inimigo.getHp() + " | Dano: " + inimigo.getAtaque());
        delay(2000);
        while (inimigo.getHp() > 0 && jogadores.stream().anyMatch(p -> p.getHp() > 0)) {
            for (Player jogador : jogadores) {
                if (jogador.getHp() <= 0) continue;

                System.out.println("\n>>> Turno de " + jogador.getNome());
                System.out.println("Seu HP: " + jogador.getHp());
                System.out.println("Inimigo HP: " + inimigo.getHp());

                System.out.println("Escolha sua acao:");
                System.out.println("(1) Atacar");
                System.out.println("(2) Subir Status");
                System.out.println("(3) Fugir");

                int escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        jogador.usarHabilidade(jogador.getArma(), inimigo);
                        break;
                    case 2:
                        jogador.subirStatus();
                        break;
                    case 3:
                        System.out.println(jogador.getNome() + " fugiu da batalha!");
                        jogador.setHp(0);
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }

                if (inimigo.getHp() <= 0) break;
            }

            if (inimigo.getHp() > 0) {
                Player alvo = escolherAlvo(jogadores);
                if (alvo != null) {
                    inimigo.atacar(alvo);
                    System.out.println("\n*** " + inimigo.getNome() + " atacou " + alvo.getNome() + " causando " + inimigo.getAtaque() + " de dano.");
                }
            }
        }

        if (inimigo.getHp() <= 0) {
            System.out.println("\n*** VITORIA! " + inimigo.getNome() + " foi derrotado!");
            System.out.println("Todos os jogadores vivos recebem " + inimigo.getXp() + " XP!");
            for (Player jogador : jogadores) {
                if (jogador.getHp() > 0) {
                    System.out.println(jogador.getNome() + " recebeu XP!");
                }
            }
        } else {
            System.out.println("\n*** Todos os jogadores foram derrotados...");
        }
    }
    @Override
    public Player escolherAlvo(List<Player> jogadores) {
        for (Player p : jogadores) {
            if (p.getHp() > 0) return p;
        }
        return null;
    }

    public void delay(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
