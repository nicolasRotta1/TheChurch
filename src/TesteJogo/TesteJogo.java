package TesteJogo;

import Batalha.IBatalha;
import Jogo.Jogo;
import Personagens.Inimigo;
import Personagens.Player;

// inicia o jogo e chama os modulos
public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarCampanha();
    }
}