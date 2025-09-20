package Habilidades;
import Personagens.Personagem;

public abstract class Habilidade implements IHabilidade {
    protected String nome;
    protected TipoHabilidade tipo;
    protected double multiplicador;
    protected String descricao;

    public Habilidade(String nome, TipoHabilidade tipo, double mult, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.multiplicador = mult;
        this.descricao = descricao;
    }

    // Cada tipo de habilidade (dano, cura) terá sua própria lógica
    @Override
    public abstract void executar(Personagem atacante, Personagem alvo);

    // O cálculo base pode ser diferente para cada tipo de habilidade
    @Override
    public abstract double calcularEfeitoBase(Personagem personagem);

    public String getNome() { return nome; }
}