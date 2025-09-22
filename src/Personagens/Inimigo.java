package Personagens;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Habilidades.Habilidade;

import java.util.ArrayList;
import java.util.List;

public abstract class Inimigo extends Personagem {

    protected int xp;
    protected List<Habilidade> habilidades;


    public Inimigo(String nome, CategoriaInimigo categoria, int hp, int ataque, int defesa, int magia,
                   double esquiva, double critico, int energia,
                   int level, int xp) {

        super(nome, categoria, hp, ataque, defesa, magia, esquiva, critico,  energia);

        this.level = level;
        this.xp = xp;
        this.habilidades = new ArrayList<>();
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
                " | ENE: " + energia +
                " | LVL: " + level +
                " | Categoria: " + categoria.getNome() +
                " | XP: " + xp);
    }

    // =======================
    // Getters
    // =======================
    public int getXp() { return xp; }
    public int getAtaque() { return ataque; }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}
