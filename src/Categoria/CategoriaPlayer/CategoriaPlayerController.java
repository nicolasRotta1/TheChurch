package Categoria.CategoriaPlayer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriaPlayerController implements ICategoriaPlayer {
    private Map<Class<? extends CategoriaPlayer>, List<Class<? extends CategoriaPlayer> >> evolucoes;

    public CategoriaPlayerController() {
        evolucoes = new HashMap<>();
        configurarEvolucoes();
    }

    public void configurarEvolucoes() {
        // Adicione todas as evoluções aqui
    }

    public List<Class<? extends CategoriaPlayer>> getEvolucoes(CategoriaPlayer classeAtual) {
        return evolucoes.getOrDefault(classeAtual.getClass(), List.of());
    }

    public CategoriaPlayer evoluir(CategoriaPlayer classeAtual, int escolha) throws Exception {
        List<Class<? extends CategoriaPlayer>> opcoes = getEvolucoes(classeAtual);
        if (opcoes.isEmpty() || escolha < 0 || escolha >= opcoes.size()) {
            throw new IllegalArgumentException("Evolução inválida!");
        }
        return opcoes.get(escolha).getDeclaredConstructor().newInstance();
    }
}