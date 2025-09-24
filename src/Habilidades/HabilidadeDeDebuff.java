package Habilidades;

import Personagens.Personagem;

import java.util.List;

public class HabilidadeDeDebuff extends Habilidade {

    private final List<String> atributos; // atributos que serão afetados
    private final int quantidade;

    public HabilidadeDeDebuff(String nome, List<String> atributos, int quantidade, String descricao) {
        super(nome, TipoHabilidade.DEBUFF, 1.0, descricao);
        this.atributos = atributos.stream().map(String::toLowerCase).toList(); // padroniza minúsculas
        this.quantidade = quantidade;
    }

    @Override
    public void executar(Personagem atacante, Personagem alvo) {
        for (String atributo : atributos) {
            switch (atributo) {
                case "ataque" -> alvo.setAtaque(Math.max(0, alvo.getAtaque() - quantidade));
                case "defesa" -> alvo.setDefesa(Math.max(0, alvo.getDefesa() - quantidade));
                case "magia" -> alvo.setMagia(Math.max(0, alvo.getMagia() - quantidade));
                case "energia" -> alvo.setEnergia(Math.max(0, alvo.getEnergia() - quantidade));
                default -> System.out.println("Atributo inválido para debuff: " + atributo);
            }
        }

        // Adiciona este debuff aos efeitos temporários do alvo
        alvo.getEfeitosTemporarios().add(this);

        System.out.println(atacante.getNome() + " usou " + getNome() + " e reduziu " +
                atributos + " de " + alvo.getNome() + " em " + quantidade + " (1 turno)");
    }


    @Override
    public double calcularEfeitoBase(Personagem personagem) {
        return quantidade; // mantém simples, quantidade aplicada a cada atributo
    }
}
