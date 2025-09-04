package Personagens;

import Habilidades.Habilidade;

public class Inimigo extends Personagem {
    private int xp;
    private String tipo;
    private Habilidade habilidade;
    private String fraqueza;
    private String habilidadesEstrategicas;

    public Inimigo(String nome, int hp, int atack, int xp, String tipo, Habilidade habilidade, String fraqueza, String habilidadesEstrategicas) {
        super(nome, hp, atack, false, false, tipo);
        this.xp = xp;
        this.tipo = tipo;
        this.habilidade = habilidade;
        this.fraqueza = fraqueza;
        this.habilidadesEstrategicas = habilidadesEstrategicas;
    }

    @Override
    public void atacar(Personagem alvo) {
        // Lógica de ataque do inimigo
        int dano = getAtack();
        System.out.println(this.getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano!");
        alvo.receberDano(dano);
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " está se defendendo!");
    }

    @Override
    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {
        if (habilidade != null) {
            System.out.println(getNome() + " usou a habilidade " + habilidade.getNome() + " contra " + alvo.getNome());
            int dano = habilidade.getDanoBase() + getAtack();
            alvo.receberDano(dano);
            System.out.println(alvo.getNome() + " recebeu " + dano + " de dano da habilidade " + habilidade.getNome());
        }
    }

    // Getters
    public int getXp() {
        return xp;
    }

    public String getTipo() {
        return tipo;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public String getHabilidadesEstrategicas() {
        return habilidadesEstrategicas;
    }
}
