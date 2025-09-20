package Categoria;

import Personagens.Personagem;

public class CategoriaController implements ICategoria {

    private CategoriaGeral categoria;

    public CategoriaController(CategoriaGeral categoria) {
        this.categoria = categoria;
    }


    public CategoriaGeral getcategoria() {
        return categoria;
    }


    @Override
    public void subirStatus(Personagem personagem) {

    }

    @Override
    public void verificarFraqueza(Personagem alvo) {

    }

}
