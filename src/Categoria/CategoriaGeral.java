package Categoria;

import Habilidades.Habilidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CategoriaGeral {
    protected String nome;
    protected String descricao;
    protected List<Habilidade> habilidades;
    protected List<Efeito> efeitos;

    public CategoriaGeral(String nome, String descricao, List<Habilidade> habilidades, List<Efeito> efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        this.habilidades = habilidades != null ? habilidades : new ArrayList<>();
        this.efeitos = efeitos != null ? efeitos : new ArrayList<>();
    }

    public String getNome() { return nome; }

    public List<Habilidade> getHabilidades() { return Collections.unmodifiableList(habilidades); }

    public List<Efeito> getEfeitos() { return Collections.unmodifiableList(efeitos); }
}
