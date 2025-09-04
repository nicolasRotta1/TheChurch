package Habilidades;

public class Habilidade {
    private String nome;
    private int danoBase;
    private String tipo;
    private String descricao;

    public Habilidade(String nome, int danoBase, String tipo, String descricao) {
        this.nome = nome;
        this.danoBase = danoBase;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}
