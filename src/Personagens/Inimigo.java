package Personagens;

public class Inimigo extends Personagem{

    public Inimigo(String nome, int hp, int atack) {
        super(nome, hp, atack);
    }

    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
    }
}
