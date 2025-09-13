package Personagens.Inimigos;


import Categoria.CategoriaInimigo.CategoriaInimigo;
import Personagens.Personagem;

public abstract class Inimigo extends Personagem {
    //Pode ter um metodo que calcula isso com base no level do inimigo na classe dele e se ele e um boss
    protected int xp;

    public Inimigo(String nome, CategoriaInimigo categoria, int xp) {
        super(nome, categoria);
        this.xp = xp;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("O inimigo " + nome + " ataca " + alvo.getNome() + " causando " + ataque + " de dano!");
        alvo.receberDano(ataque);
    }

    @Override
    public void subirLevel() {
        // Inimigos podem evoluir de forma fixa
        level++;
        ataque += 4;
        hp += 30;
        System.out.println(nome+" se fortalece!");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("[" + getClass().getSimpleName() + "] " + nome +
                " | HP: " + hp +
                " | ATQ: " + ataque +
                " | LVL: " + level+
                " | Categoria: " + categoria.getNome());
    }
}
