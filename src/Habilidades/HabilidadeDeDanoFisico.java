package Habilidades;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.CategoriaPlayer.CategoriaPlayer;
import Personagens.Personagem;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.TipoCriatura;

public class HabilidadeDeDanoFisico extends Habilidade {

    public HabilidadeDeDanoFisico(String nome, TipoHabilidade tipo, double mult, String descricao) {
        super(nome, tipo, mult, descricao);
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        double base = calcularEfeitoBase(atacante);

        // ========================
        // Multiplicador por vantagem/fraqueza
        // ========================
        double multFinal = 1.0;
        TipoCriatura tipoAlvo = null;

        if (alvo.getCategoria() instanceof CategoriaInimigo) {
            tipoAlvo = ((CategoriaInimigo) alvo.getCategoria()).getTipoCriatura();
        }

        if (atacante.getCategoria() instanceof CategoriaPlayer) {
            CategoriaPlayer catPlayer = (CategoriaPlayer) atacante.getCategoria();

            // Vantagens
            for (Vantagem v : catPlayer.getVantagensEnum()) {
                if (v.getTipo() == tipoAlvo) {
                    multFinal *= 1.5;
                    System.out.println("Vantagem aplicada! Dano aumentado.");
                }
            }

            // Fraquezas
            for (Fraqueza f : catPlayer.getFraquezasEnum()) {
                if (f.getTipo() == tipoAlvo) {
                    multFinal *= 0.5;
                    System.out.println("Fraqueza aplicada! Dano reduzido.");
                }
            }
        }

        // Crítico
        if (atacante.atacarCritico()) {
            base *= 2;
            System.out.println("ACERTO CRÍTICO!");
        }

        int danoFinal = (int) Math.round(base * multFinal - alvo.getDefesa());
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
