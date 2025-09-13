package Categoria;

import Habilidades.Habilidade;
import java.util.List;

public abstract class CategoriaGeral {
    protected int id;
    protected String nome;
    protected String descricao;
    protected List<String> vantagens;
    protected List<String> fraquezas;
    protected List<Habilidade> habilidades;
    protected static int ContadorId;

    public CategoriaGeral(String nome, String descricao, List<String> vantagens, List<String> fraquezas) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.descricao = descricao;
        this.vantagens = vantagens;
        this.fraquezas = fraquezas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getVantagens() {
        return vantagens;
    }

    public void setVantagens(List<String> vantagens) {
        this.vantagens = vantagens;
    }

    public List<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(List<String> fraquezas) {
        this.fraquezas = fraquezas;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}

