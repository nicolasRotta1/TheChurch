package Habilidades;

import Personagens.Personagem;

public class HabilidadeDeDebuff extends Habilidade {

    private String atributo;
    private int quantidade;

    public HabilidadeDeDebuff(String nome, String atributo, int quantidade, String descricao) {
        super(nome, TipoHabilidade.DEBUFF, 1.0, descricao);
        this.atributo = atributo.toLowerCase();
        this.quantidade = quantidade;
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        switch (atributo) {
            case "ataque" -> alvo.setAtaque(Math.max(0, alvo.getAtaque() - quantidade));
            case "defesa" -> alvo.setDefesa(Math.max(0, alvo.getDefesa() - quantidade));
            case "magia" -> alvo.setMagia(Math.max(0, alvo.getMagia() - quantidade));
            case "velocidade" -> alvo.setVelocidade(Math.max(0, alvo.getVelocidade() - quantidade));
            case "energia" -> alvo.setEnergia(Math.max(0, alvo.getEnergia() - quantidade));
            default -> System.out.println("Atributo inválido para debuff!");
        }
        System.out.println(atacante.getNome() + " usou " + getNome() + " e reduziu " + atributo + " de " + alvo.getNome() + " em " + quantidade);
    }

    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return quantidade;
    }
}
