package Categoria;

import Personagens.Personagem;


public interface ICategoria {
     void subirStatus(Personagem personagem);
     void verificarFraqueza(Personagem alvo);
}
