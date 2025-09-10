package Classe.ClassePlayer;

import Classe.ClasseGeral;
import java.util.ArrayList;
import java.util.List;

public abstract class ClassePlayer extends ClasseGeral {

    private List<Class<? extends ClassePlayer>> evolucoes = new ArrayList<>();

    public ClassePlayer(String nome, String descricao, List<String> vantagens, List<String> fraquezas, List<Class<? extends ClassePlayer>> evolucoes) {
        super(nome, descricao, vantagens, fraquezas);
        this.evolucoes = evolucoes;
    }

    public void addEvolucao(Class<? extends ClassePlayer> classe) {
        evolucoes.add(classe);
    }

    public List<Class<? extends ClassePlayer>> getEvolucoes() {
        return evolucoes;
    }


}
