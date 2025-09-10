package Classe;

import Habilidades.Habilidade;
import java.util.List;

public abstract class ClasseGeral {
    private int id;
    private String nome;
    private String descricao;
    private List<String> vantagens;
    private List<String> fraquezas;
    protected List<Habilidade> habilidades;
    private static int ContadorId;

    public ClasseGeral(String nome, String descricao, List<String> vantagens, List<String> fraquezas) {
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


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setVantagens(List<String> vantagens) {
        this.vantagens = vantagens;
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

