package Personagens.Inimigos;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Habilidades.Habilidade;
import Personagens.Personagem;

public abstract class Inimigo extends Personagem {

    protected int xp;
    protected String tipo;

    public Inimigo(String nome, CategoriaInimigo categoria, int hp, int ataque, int defesa, int magia,
                   int velocidade, double esquiva, double critico, int resistenciaMagica, int energia,
                   int level, int xp) {

        super(nome, categoria, hp, ataque, defesa, magia, velocidade, esquiva, critico, resistenciaMagica, energia);
        this.level = level;
        this.xp = xp;
        this.tipo = categoria.getTipoCriatura();
    }

    // =======================
    // Ataque
    // =======================
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


    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {
        if (habilidade != null) {
            System.out.println(nome + " usa " + habilidade.getNome() + " contra " + alvo.getNome() + "!");
            habilidade.executar(this, alvo);
        } else {
            atacar(alvo); // ataque básico
        }
    }

    // =======================
    // Level
    // =======================
    @Override
    public void subirLevel() {
        level++;
        ataque += 4;
        hp += 30;
        defesa += 2;
        magia += 1;
        velocidade += 1;
        energia += 5;
        System.out.println(nome + " se fortalece!");
    }

    // =======================
    // Status
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
                " | Tipo: " + tipo +
                " | XP: " + xp);
    }

    // =======================
    // Getters
    // =======================
    public int getXp() { return xp; }
    public String getTipo() { return tipo; }
    public int getAtaque() { return ataque; }
}
