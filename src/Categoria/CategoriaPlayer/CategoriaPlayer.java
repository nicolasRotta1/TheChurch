package Categoria.CategoriaPlayer;

import Categoria.CategoriaGeral;
import Habilidades.Habilidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CategoriaPlayer extends CategoriaGeral {
    private final List<Class<? extends CategoriaPlayer>> evolucoes;

    public CategoriaPlayer(String nome, String descricao, List<String> vantagens, List<String> fraquezas,
                           List<Habilidade> habilidades, List<Categoria.Efeito> efeitos) {
        super(nome, descricao, vantagens, fraquezas, habilidades, efeitos);
        this.evolucoes = new ArrayList<>();
        configurarEvolucoes(); // toda subclasse já define suas evoluções
    }

    public void addEvolucao(Class<? extends CategoriaPlayer> cls) {
        if (cls != null && !evolucoes.contains(cls)) {
            evolucoes.add(cls);
        }
    }

    public List<Class<? extends CategoriaPlayer>> getEvolucoes() {
        return Collections.unmodifiableList(evolucoes);
    }


    public abstract void configurarEvolucoes();
}
