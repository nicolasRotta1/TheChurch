package Batalha;

import Personagens.Player;
import Personagens.Inimigos.Inimigo;
import java.util.List;

public interface IBatalha {
    void iniciarBatalha(List<Player> jogadores, Inimigo inimigo);

    Player escolherAlvo(List<Player> jogadores);
}