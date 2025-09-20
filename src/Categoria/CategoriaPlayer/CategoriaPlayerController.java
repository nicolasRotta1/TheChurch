package Categoria.CategoriaPlayer;

import java.util.List;

public class CategoriaPlayerController {

    public List<Class<? extends CategoriaPlayer>> getEvolucoes(CategoriaPlayer atual) {
        return atual.getEvolucoes();
    }

    public CategoriaPlayer evoluir(CategoriaPlayer atual, int escolha) throws Exception {
        List<Class<? extends CategoriaPlayer>> evolucoes = atual.getEvolucoes();
        if (escolha < 0 || escolha >= evolucoes.size()) {
            throw new IllegalArgumentException("Escolha inválida!");
        }


        return evolucoes.get(escolha).getDeclaredConstructor().newInstance();
    }
}
