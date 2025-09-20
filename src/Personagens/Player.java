package Personagens;

import Categoria.CategoriaGeral;
import Categoria.CategoriaPlayer.CategoriaPlayer;
import Habilidades.Habilidade;

import java.util.Scanner;

public class Player extends Personagem {

    private int experiencia;
    private int pontosStatus;
    private int pontosFe;

    public Player(String nome, CategoriaPlayer categoria,
                  int hp, int ataque, int defesa, int magia, int velocidade,
                  double esquiva, double critico, int resistenciaMagica, int energia,
                  int level, int pontosStatus, int experiencia, int pontosFe) {

        super(nome, categoria, hp, ataque, defesa, magia, velocidade, esquiva, critico, resistenciaMagica, energia);
        this.level = level;
        this.pontosStatus = pontosStatus;
        this.experiencia = experiencia;
        this.pontosFe = pontosFe;
    }

    // =======================
    // Level e XP
    // =======================
    public void subirLevel() {
        level++;
        pontosStatus += 5;
        System.out.println(nome + " subiu para o nível " + level + "! (+5 pontos de status)");
    }

    @Override
    public void atacar(Personagem alvo) {
        double chanceEsquiva = Math.random();
        if (chanceEsquiva < alvo.getEsquiva()) {
            System.out.println(alvo.getNome() + " esquivou do ataque!");
            return;
        }

        // Dano reduzido pela defesa
        int dano = (int)(this.ataque * (1 - 0.05 * alvo.getDefesa()));
        if (dano < 0) dano = 0;

        // Crítico
        if (Math.random() < this.critico) {
            dano *= 2;
            System.out.println("CRÍTICO!");
        }

        alvo.setHp(alvo.getHp() - dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " causando " + dano + " de dano! (HP restante: " + alvo.getHp() + ")");
    }


    public void ganharExperiencia(int xp) {
        experiencia += xp;
        System.out.println(nome + " ganhou " + xp + " de XP! (Total: " + experiencia + ")");
        if (experiencia >= level * 100) {
            experiencia -= level * 100;
            subirLevel();
        }
    }

    // =======================
    // Ataque e habilidades
    // =======================


    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {
        if (habilidade != null) {
            System.out.println(nome + " usa " + habilidade.getNome() + " contra " + alvo.getNome() + "!");
            habilidade.executar(this, alvo);
        } else {
            atacar(alvo); // ataque básico se não tem habilidade
        }
    }

    // =======================
    // Distribuição de pontos
    // =======================
    public void distribuirPonto(String atributo, int quantidade) {
        if (pontosStatus <= 0) {
            System.out.println("Você não tem pontos para distribuir.");
            return;
        }
        if (pontosStatus < quantidade){
            System.out.println("Você não tem pontos o suficiente para distribuir");
            return;
        }

        switch (atributo.toLowerCase()) {
            case "vida" -> {
                hp += quantidade * 10;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou HP! HP atual: " + hp);
            }
            case "ataque" -> {
                ataque += quantidade * 2;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou ATQ! ATQ atual: " + ataque);
            }
            case "defesa" -> {
                defesa += quantidade * 1;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou DEF! DEF atual: " + defesa);
            }
            case "magia" -> {
                magia += quantidade * 1;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou MAG! MAG atual: " + magia);
            }
            case "velocidade" -> {
                velocidade += quantidade * 1;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou VEL! VEL atual: " + velocidade);
            }
            case "energia" -> {
                energia += quantidade * 5;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou ENE! ENE atual: " + energia);
            }
            default -> System.out.println("Atributo inválido.");
        }
    }

    public void subirStatus() {
        if (pontosStatus > 0) {
            while (true) {
                System.out.println("Você tem " + pontosStatus + " pontos para distribuir:");
                System.out.println("(1) Vida (+10 HP)");
                System.out.println("(2) Ataque (+2 ATQ)");
                System.out.println("(3) Defesa (+1 DEF)");
                System.out.println("(4) Magia (+1 MAG)");
                System.out.println("(5) Velocidade (+1 VEL)");
                System.out.println("(6) Energia (+5 ENE)");
                System.out.println("(7) Sair");


                Scanner scanner = new Scanner(System.in);
                int escolha = scanner.nextInt();


                if (escolha == 7) break;
                switch (escolha) {
                    case 1:
                        distribuirPonto("vida", 1);
                        break;
                    case 2:
                        distribuirPonto("ataque", 1);
                        break;
                    case 3:
                        distribuirPonto("defesa", 1);
                        break;
                    case 4:
                        distribuirPonto("magia", 1);
                        break;
                    case 5:
                        distribuirPonto("velocidade", 1);
                        break;
                    case 6:
                        distribuirPonto("energia", 1);
                        break;
                    default:
                        System.out.println("Escolha inválida! Tente novamente.");
                        break;
                }
            }

        } else {
            System.out.println(nome + " não tem pontos para distribuir!");
        }
    }


    // =======================
    // Status do Player
    // =======================
    @Override
    public void mostrarStatus() {
        System.out.println("[" + getClass().getSimpleName() + "] " + nome +
                " | HP: " + hp +
                " | ATQ: " + ataque +
                " | DEF: " + defesa +
                " | MAG: " + magia +
                " | VEL: " + velocidade +
                " | ENE: " + energia +
                " | LVL: " + level +
                " | Categoria: " + categoria.getNome() +
                " | XP: " + experiencia);
    }

    // =======================
    // Getters e setters
    // =======================
    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public int getPontosStatus() { return pontosStatus; }
    public void setPontosStatus(int pontosStatus) { this.pontosStatus = pontosStatus; }

    public int getPontosFe() { return pontosFe; }
    public void setPontosFe(int pontosFe) { this.pontosFe = pontosFe; }
}
