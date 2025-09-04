import Batalha.IBatalha;
import Personagens.Inimigo;
import Personagens.Player;
// inicia o jogo e chama os modulos
public class Main {
    public static void main(String[] args) {
        Player jogador = new Player("Ruthe");
        Inimigo inimigo = new Inimigo("Slenderman", 80, 8, 30);

        IBatalha interfaceBatalha = new IBatalha();
        IBatalha.iniciarBatalha(jogador, inimigo);
    }
}