import Personagens.Inimigo;
import Personagens.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inimigo inimigo = new Inimigo("Chuck", 100, 70);
        Player player = new Player("Chuck Norris", 500,50 );

        inimigo.atacar(player);
        System.out.println(player.getHp());
        player.atacar(inimigo);
        System.out.println(inimigo.getHp());

    }
}