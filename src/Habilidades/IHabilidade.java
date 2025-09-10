package Habilidades;

import Personagens.Personagem;

public interface IHabilidade {
    void executar(Personagem atacante, Personagem alvo);
    double CalcularDanoFinal(Personagem personagem);
}
