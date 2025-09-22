package Habilidades;

import Personagens.Personagem;

public class HabilidadeDeDanoMagico extends Habilidade {

    public HabilidadeDeDanoMagico(String nome, TipoHabilidade tipo, double mult, String descricao) {
        super(nome, tipo, mult, descricao);
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        double base = calcularEfeitoBase(atacante);
        int danoFinal = (int) base;
        if (danoFinal < 0) danoFinal = 0;
        alvo.receberDano(danoFinal);

        System.out.println(atacante.getNome() + " usou " + getNome() + " em " + alvo.getNome() +
                " causando " + danoFinal + " de dano mágico!");
    }

    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return personagem.getMagia() * multiplicador;
    }
}
