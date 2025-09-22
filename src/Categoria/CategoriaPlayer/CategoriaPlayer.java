package Categoria.CategoriaPlayer;

import Categoria.*;
import Habilidades.Habilidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CategoriaPlayer extends CategoriaGeral {
    private final List<Class<? extends CategoriaPlayer>> evolucoes;
    private final List<Vantagem> vantagens;
    private final List<Fraqueza> fraquezas;
    protected List<Habilidade> habilidades;

    public CategoriaPlayer(String nome, String descricao,
                           List<Vantagem> vantagens, List<Fraqueza> fraquezas,
                           List<Habilidade> habilidades, List<Efeito> efeitos) {
        super(nome, descricao, efeitos);
        this.habilidades = habilidades != null ? habilidades : new ArrayList<>();
        this.vantagens = vantagens;
        this.fraquezas = fraquezas;
        this.evolucoes = new ArrayList<>(); // lista mutável para addEvolucao()
        configurarEvolucoes();
    }

    public List<Vantagem> getVantagensEnum() { return vantagens; }
    public List<Fraqueza> getFraquezasEnum() { return fraquezas; }
    public List<Class<? extends CategoriaPlayer>> getEvolucoes() { return evolucoes; }

    protected void addEvolucao(Class<? extends CategoriaPlayer> cls) {
        if (cls != null && !evolucoes.contains(cls)) {
            evolucoes.add(cls);
        }
    }

    public abstract void configurarEvolucoes();

    public int getCustoEvolucao() {
        return 10; // por exemplo, cada evolução custa 10 pontos de fé
    }

    public List<Habilidade> getHabilidades() { return Collections.unmodifiableList(habilidades); }
}
