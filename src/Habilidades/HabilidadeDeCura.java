package Habilidades;

import Personagens.Personagem;

public class HabilidadeDeCura extends Habilidade {

    public HabilidadeDeCura(String nome, TipoHabilidade tipo, double mult, String descricao) {
        super(nome, tipo, mult, descricao);
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        int cura = (int) Math.round(calcularEfeitoBase(atacante));
        alvo.receberCura(cura);
        System.out.println(atacante.getNome() + " usou " + getNome() + " e curou " + cura + " HP em " + alvo.getNome());
    }

    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return personagem.getMagia() * multiplicador;
    }
}
