package Habilidades;

import Personagens.Personagem;

public interface IHabilidade {
    void executar(Personagem atacante, Personagem alvo);
    String getNome();
    String getDescricao();
}
