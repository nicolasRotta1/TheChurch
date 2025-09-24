package Categoria;

import Habilidades.Habilidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CategoriaGeral {
    protected String nome;
    protected String descricao;
    protected List<Efeito> efeitos;

    public CategoriaGeral(String nome, String descricao, List<Efeito> efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        this.efeitos = efeitos != null ? efeitos : new ArrayList<>();
    }

    public String getNome() { return nome; }

    public List<Efeito> getEfeitos() { return Collections.unmodifiableList(efeitos); }
}
