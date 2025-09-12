package Personagens.Inimigos;


import Classe.ClassesInimigo.ClasseInimigo;
import Personagens.Personagem;

public abstract class Inimigo extends Personagem {

    public Inimigo(String nome, ClasseInimigo classeInimigo,  int hp, int ataque) {
        super(nome, classeInimigo, hp, ataque);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("O inimigo " + nome + " ataca " + alvo.getNome() + " causando " + ataque + " de dano!");
        alvo.receberDano(ataque);
    }

    @Override
    public void subirLevel() {
        // Inimigos podem evoluir de forma fixa (exemplo: bosses)
        level++;
        ataque += 3;
        hp += 15;
        System.out.println(nome + " ficou mais forte! (LVL " + level + ")");
    }


}
