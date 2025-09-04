package Personagens;

import Habilidades.Habilidade;

import java.util.Random;

public abstract class Personagem {
    private int id;
    private String nome;
    private int hp;
    private int atack;
    private static int ContadorId;
    private boolean doBem;
    private boolean jogador;
    private String hierarquia;

    public Personagem(String nome, int hp, int atack, boolean doBem, boolean jogador, String hierarquia) {
        this.id = ++ContadorId;
        this.nome = nome;
        this.hp = hp;
        this.atack = atack;
        this.doBem = doBem;
        this.jogador = jogador;
        this.hierarquia = hierarquia;
    }

    public void atacar(Personagem alvo) {
        int dano = getAtack() + new Random().nextInt(5);
        alvo.receberDano(dano);
    }

    public void receberDano(int dano) {
        this.hp -= dano;
    }

    public void subirHierarquia() {
        if (this.hierarquia.equalsIgnoreCase("Exorcista Aprendiz")) {
            this.hierarquia = "Exorcista";
        } else if (this.hierarquia.equalsIgnoreCase("Exorcista")) {
            this.hierarquia = "Exorcista Mestre";
        } else if (this.hierarquia.equalsIgnoreCase("Exorcista Mestre")) {
            this.hierarquia = "Sacerdote";
        } else if (this.hierarquia.equalsIgnoreCase("Sacerdote")) {
            this.hierarquia = "Padre";
        } else if (this.hierarquia.equalsIgnoreCase("Padre")) {
            this.hierarquia = "Jesus Cristo"; // nível máximo
        }
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }

    public boolean isDoBem() {
        return doBem;
    }

    public void setDoBem(boolean doBem) {
        this.doBem = doBem;
    }

    public boolean isJogador() {
        return jogador;
    }

    public void setJogador(boolean jogador) {
        this.jogador = jogador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public static int getContadorId() {
        return ContadorId;
    }

    public static void setContadorId(int contadorId) {
        ContadorId = contadorId;
    }

    public abstract void defender();

    public abstract void usarHabilidade(Habilidade habilidade, Personagem alvo);
}
