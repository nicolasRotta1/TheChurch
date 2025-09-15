package Categoria.CategoriaPlayer;

import java.util.Arrays;
import java.util.List;

public class Caçador extends CategoriaPlayer {
    public Caçador() {
        super("Caçador", "Especialista em rastrear e combater criaturas", 
              Arrays.asList("Conhecimento sobre criaturas", "Precisão", "Armadilhas"), 
              Arrays.asList("Magia", "Ataques mágicos"),
              List.of()); // Sem evoluções por enquanto
    }
}
