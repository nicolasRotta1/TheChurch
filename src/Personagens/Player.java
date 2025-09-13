package Personagens;

import Categoria.CategoriaPlayer.CategoriaPlayer;

public class Player extends Personagem {
    private int experiencia;
    private int pontosStatus;

    public Player(String nome, CategoriaPlayer categoria) {
        super(nome, categoria);
        this.experiencia = 0;
        this.pontosStatus = 0;
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
}
