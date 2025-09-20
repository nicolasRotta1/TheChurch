package Habilidades;

import Personagens.Personagem;
import Categoria.Utils;

public class HabilidadeDeDanoFísico extends Habilidade {

    public HabilidadeDeDanoFísico(String nome, TipoHabilidade tipo, double mult, String descricao) {
        super(nome, tipo, mult, descricao);
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        double base = calcularEfeitoBase(atacante);

        // Considera vantagem de categoria se houver
        double multVantagem = 1.0;
        if (atacante.getCategoria() != null && alvo.getCategoria() != null) {
            multVantagem = Utils.calcularMultiplicador(atacante.getCategoria(), alvo.getCategoria());
        }

        int danoFinal = (int) Math.round(base * multVantagem - alvo.getDefesa());
        if (danoFinal < 0) danoFinal = 0;
        alvo.receberDano(danoFinal);

        System.out.println(atacante.getNome() + " usou " + getNome() + " em " + alvo.getNome() +
                " causando " + danoFinal + " de dano físico!");
    }

    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return personagem.getAtaque() * multiplicador;
    }
}
