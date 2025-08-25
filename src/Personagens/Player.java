package Personagens;

public class Player extends Personagem{

    public Player(String nome, int hp, int atack) {
        super(nome, hp, atack);
    }

    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
    }
}
