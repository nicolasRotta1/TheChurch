package Habilidades;

import Personagens.Personagem;

public abstract class GritoAssombrado extends Habilidade implements IHabilidade {
    public GritoAssombrado(String nome, int danoBase, String tipo, String descricao) {
        super(nome, danoBase, tipo, descricao);
    }
    public void executar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " gritou e confundiu " + alvo.getNome());
        alvo.receberDano(20);
        // lógica extra: reduzir ataque, paralisar, etc.
    }
    public String getNome() { return "Grito Assombrado"; }
    public String getDescricao() { return "Confunde o jogador e reduz seu ataque por 1 turno."; }

}
