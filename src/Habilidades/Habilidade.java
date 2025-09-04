package Habilidades;

public class Habilidade {
    private String nome;
    private int danoBase;
    private String tipoDano;
    private String descricao;

    public Habilidade(String nome, int danoBase, String tipoDano, String descricao) {
        this.nome = nome;
        this.danoBase = danoBase;
        this.tipoDano = tipoDano;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public String getDescricao() {
        return descricao;
    }

    // Metodo corrigido para retornar o dano base
    public int getDanoBase() {
        return danoBase;
    }
}
