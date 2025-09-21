package Habilidades;

import Personagens.Personagem;

import java.util.List;

public class HabilidadeDeBuff extends Habilidade {

    private final List<String> atributos; // atributos que serão buffados
    private final int quantidade;

    public HabilidadeDeBuff(String nome, List<String> atributos, int quantidade, String descricao) {
        super(nome, TipoHabilidade.BUFF, 1.0, descricao);
        this.atributos = atributos.stream().map(String::toLowerCase).toList(); // padroniza minúsculas
        this.quantidade = quantidade;
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        for (String atributo : atributos) {
            switch (atributo) {
                case "ataque" -> alvo.setAtaque(alvo.getAtaque() + quantidade);
                case "defesa" -> alvo.setDefesa(alvo.getDefesa() + quantidade);
                case "magia" -> alvo.setMagia(alvo.getMagia() + quantidade);
                case "velocidade" -> alvo.setVelocidade(alvo.getVelocidade() + quantidade);
                case "energia" -> alvo.setEnergia(alvo.getEnergia() + quantidade);
                default -> System.out.println("Atributo inválido para buff: " + atributo);
            }
        }

        System.out.println(atacante.getNome() + " usou " + getNome() + " e aumentou " +
                atributos + " de " + alvo.getNome() + " em " + quantidade);
    }

    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return quantidade; // mantém simples, aplica a cada atributo
    }
}
