package Personagens;

import java.util.Random;

public abstract class Personagem implements IPersonagem{
    private int id;
    private String nome;
    private int hp;
    private int atack;
    private static int ContadorId;

    public Personagem(String nome, int hp, int atack) {
        this.id = ++ContadorId;
        this.nome = nome;
        this.hp = hp;
        this.atack = atack;
    }

    @Override
    //adicao do metodo receber dano que é melhor controlado pelo personagem
    public void atacar(Personagem alvo) {
        int dano = getAtack()+new Random().nextInt(5);// 0 a 4 de bonus aleatorio
        alvo.receberDano(dano);
    }
    public void receberDano(int dano){
        this.hp -=dano;
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
}
