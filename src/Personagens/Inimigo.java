package Personagens;

import Habilidades.Habilidade;
import Habilidades.IHabilidade;

public class Inimigo extends Personagem {
    private int xp;
    private String tipo;
    private Habilidade habilidade;

    public Inimigo(String nome, int hp, int atack, int xp, String tipo, Habilidade habilidade) {
        super(nome, hp, atack);
        this.xp = xp;
        this.tipo = tipo;
        this.habilidade = habilidade;
    }

    // Personaliza o ataque com chance de crítico
    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getAtack();
        if (Math.random() < 0.2) { // 20% de chance de crítico
            dano *= 2;
            System.out.println(getNome() + " realizou um ataque crítico!");
        }
        alvo.receberDano(dano);
    }

    @Override
    public void defender() {

    }

    @Override
    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {

    }

    // Método para conceder XP ao jogador após derrota
    public int concederXp() {
        return this.xp;
    }

    public int getXp() {
        return xp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }
}
