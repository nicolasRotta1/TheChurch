package Categoria.CategoriaPlayer;

import java.util.List;


public interface ICategoriaPlayer {
    void configurarEvolucoes();

    List<Class<? extends CategoriaPlayer>> getEvolucoes(CategoriaPlayer classeAtual);

    CategoriaPlayer evoluir(CategoriaPlayer classeAtual, int escolha) throws Exception;
}
