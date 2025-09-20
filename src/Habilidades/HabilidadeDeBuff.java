package Habilidades;

import Personagens.Personagem;

public class HabilidadeDeBuff extends Habilidade {

    private String atributo; // atributo que será buffado
    private int quantidade;

    public HabilidadeDeBuff(String nome, String atributo, int quantidade, String descricao) {
        super(nome, TipoHabilidade.BUFF, 1.0, descricao);
        this.atributo = atributo.toLowerCase();
        this.quantidade = quantidade;
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        switch (atributo) {
            case "ataque" -> alvo.setAtaque(alvo.getAtaque() + quantidade);
            case "defesa" -> alvo.setDefesa(alvo.getDefesa() + quantidade);
            case "magia" -> alvo.setMagia(alvo.getMagia() + quantidade);
            case "velocidade" -> alvo.setVelocidade(alvo.getVelocidade() + quantidade);
            case "energia" -> alvo.setEnergia(alvo.getEnergia() + quantidade);
            default -> System.out.println("Atributo inválido para buff!");
        }
        System.out.println(atacante.getNome() + " usou " + getNome() + " e aumentou " + atributo + " de " + alvo.getNome() + " em " + quantidade);
    }

    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return quantidade; // retorna quantidade de aumento
    }
}
