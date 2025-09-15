package Personagens;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Habilidades.Habilidade;

public class Player extends Personagem {
    private int experiencia;
    private int pontosStatus;
    private int pontosLevel;
    private Habilidade arma;

    public Player(String nome, CategoriaPlayer categoria) {
        super(nome, categoria);
        this.experiencia = 0;
        this.pontosStatus = 0;
        this.pontosLevel = 0;
        // Arma padrão básica
        this.arma = new Habilidade("Ataque Básico", "Físico", 1.0, "Um ataque básico");
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + " causando " + ataque + " de dano!");
        alvo.receberDano(ataque);
    }

    @Override
    public void subirLevel() {
        level++;
        pontosStatus += 5;
        System.out.println(nome + " subiu para o nível " + level + "! (+5 pontos de status)");
    }

    public void ganharExperiencia(int xp) {
        experiencia += xp;
        pontosLevel += xp;
        System.out.println(nome + " ganhou " + xp + " de XP! (Total: " + experiencia + ")");
        if (experiencia >= level * 100) {
            experiencia -= level * 100;
            subirLevel();
        }
    }

    @Override
    public void mostrarStatus() {
        System.out.println("[" + getClass().getSimpleName() + "] " + nome +
                " | HP: " + hp +
                " | ATQ: " + ataque +
                " | LVL: " + level+
                " | Categoria: " + categoria.getNome());
    }

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
            default -> System.out.println("Atributo inválido.");
        }
    }

    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {
        if (habilidade != null) {
            System.out.println(nome + " usa " + habilidade.getNome() + " contra " + alvo.getNome() + "!");
            habilidade.executar(this, alvo);
            System.out.println("Causou " + habilidade.CalcularDanoFinal(this) + " de dano!");
        } else {
            // Ataque básico se não tem habilidade
            System.out.println(nome + " ataca " + alvo.getNome() + "!");
            alvo.receberDano(this.ataque);
            System.out.println("Causou " + this.ataque + " de dano!");
        }
    }

    public void subirStatus() {
        if (pontosStatus > 0) {
            System.out.println("Você tem " + pontosStatus + " pontos para distribuir:");
            System.out.println("(1) Vida (+10 HP)");
            System.out.println("(2) Ataque (+2 ATQ)");
            // Por simplicidade, vamos distribuir automaticamente
            if (pontosStatus >= 2) {
                distribuirPonto("vida", 1);
                distribuirPonto("ataque", 1);
            } else if (pontosStatus == 1) {
                distribuirPonto("vida", 1);
            }
        } else {
            System.out.println(nome + " não tem pontos para distribuir!");
        }
    }

    public void equiparArma(Habilidade novaArma) {
        this.arma = novaArma;
        System.out.println(nome + " equipou " + novaArma.getNome() + "!");
    }

    // Getters and Setters
    public int getPontosLevel() {
        return pontosLevel;
    }

    public void setPontosLevel(int pontosLevel) {
        this.pontosLevel = pontosLevel;
    }

    public Habilidade getArma() {
        return arma;
    }

    public void setArma(Habilidade arma) {
        this.arma = arma;
    }

    public int getPontosStatus() {
        return pontosStatus;
    }
}
