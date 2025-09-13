package Categoria.CategoriaPlayer;

import Categoria.CategoriaGeral;
import java.util.ArrayList;
import java.util.List;

public abstract class CategoriaPlayer extends CategoriaGeral {

    private List<Class<? extends CategoriaPlayer>> evolucoes = new ArrayList<>();

    public CategoriaPlayer(String nome, String descricao, List<String> vantagens, List<String> fraquezas, List<Class<? extends CategoriaPlayer>> evolucoes) {
        super(nome, descricao, vantagens, fraquezas);
        this.evolucoes = evolucoes;
    }

    public void addEvolucao(Class<? extends CategoriaPlayer> classe) {
        evolucoes.add(classe);
    }

    public List<Class<? extends CategoriaPlayer>> getEvolucoes() {
        return evolucoes;
    }


}
