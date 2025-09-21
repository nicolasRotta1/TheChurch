    package Categoria.CategoriaPlayer;

import Categoria.CategoriaGeral;
import Categoria.Efeito;
import Habilidades.Habilidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CategoriaPlayer extends CategoriaGeral {
    private final List<Class<? extends CategoriaPlayer>> evolucoes;

    public CategoriaPlayer(String nome, String descricao, List<String> vantagens, List<String> fraquezas,
                           List<Habilidade> habilidades, List<Efeito> efeitos) {
        super(nome, descricao, vantagens, fraquezas, habilidades, efeitos);
        this.evolucoes = new ArrayList<>();
        configurarEvolucoes(); // toda subclasse já define suas evoluções
    }

    public void addEvolucao(Class<? extends CategoriaPlayer> cls) {
        if (cls != null && !evolucoes.contains(cls)) {
            evolucoes.add(cls);
        }
    }

    public List<Class<? extends CategoriaPlayer>> getEvolucoes() {
        return Collections.unmodifiableList(evolucoes);
    }

    // ===============================
    // Aplicar efeitos no Player
    // ===============================
    public void aplicarEfeitos(Personagens.Player player) {
        for (Efeito efeito : getEfeitos()) {
            switch (efeito.getTag()) {
                case "ATQ" -> player.setAtaque((int) (player.getAtaque() * efeito.getMultiplicador()));
                case "DEF" -> player.setDefesa((int) (player.getDefesa() * efeito.getMultiplicador()));
                case "MAG" -> player.setMagia((int) (player.getMagia() * efeito.getMultiplicador()));
                case "VEL" -> player.setVelocidade((int) (player.getVelocidade() * efeito.getMultiplicador()));
                case "ENE" -> player.setEnergia((int) (player.getEnergia() * efeito.getMultiplicador()));
                case "HP" -> player.setHp((int) (player.getHp() * efeito.getMultiplicador()));
                case "CURA" -> {
                    int cura = (int) (20 * efeito.getMultiplicador()); // exemplo fixo
                    player.setHp(player.getHp() + cura);
                    System.out.println(player.getNome() + " recebeu um buff de cura: +" + cura + " HP");
                }
            }
        }
    }

    public abstract void configurarEvolucoes();
}
