package Classe.ClassePlayer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassePlayerController implements IClassePlayer{
    private Map<Class<? extends ClassePlayer>, List<Class<? extends ClassePlayer> >> evolucoes;

    public ClassePlayerController() {
        evolucoes = new HashMap<>();
        configurarEvolucoes();
    }

    public void configurarEvolucoes() {
        // Adicione todas as evoluções aqui
    }

    public List<Class<? extends ClassePlayer>> getEvolucoes(ClassePlayer classeAtual) {
        return evolucoes.getOrDefault(classeAtual.getClass(), List.of());
    }

    public ClassePlayer evoluir(ClassePlayer classeAtual, int escolha) throws Exception {
        List<Class<? extends ClassePlayer>> opcoes = getEvolucoes(classeAtual);
        if (opcoes.isEmpty() || escolha < 0 || escolha >= opcoes.size()) {
            throw new IllegalArgumentException("Evolução inválida!");
        }
        return opcoes.get(escolha).getDeclaredConstructor().newInstance();
    }
}