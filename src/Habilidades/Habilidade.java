package Habilidades;

import Personagens.Personagem;

public class Habilidade implements IHabilidade{
    private int id;
    private String nome;
    private String tipoHabilidade;
    private double danoFinal;
    private String descricao;
    private static int ContadorId;

    public Habilidade(String nome, String tipoHabilidade, double danoFinal, String descricao) {
        ContadorId++;
        this.id = ContadorId;
        this.nome = nome;
        this.tipoHabilidade = tipoHabilidade;
        this.danoFinal = danoFinal;
        this.descricao = descricao;
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        alvo.receberDano(CalcularDanoFinal(atacante));
    }

    @Override
    public double CalcularDanoFinal(Personagem personagem) {
        return (personagem.getAtaque() * danoFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoHabilidade() {
        return tipoHabilidade;
    }

    public void setTipoHabilidade(String tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }

    public double getDanoFinal() {
        return danoFinal;
    }

    public void setDanoFinal(double danoFinal) {
        this.danoFinal = danoFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
