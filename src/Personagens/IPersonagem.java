package Personagens;

import Habilidades.Habilidade;

public interface IPersonagem {
    void atacar(Personagem alvo);
    void defender();
    void usarHabilidade(Habilidade habilidade, Personagem alvo);
}
