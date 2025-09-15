package Categoria.CategoriaPlayer;

import java.util.Arrays;
import java.util.List;

public class Guerreiro extends CategoriaPlayer {
    public Guerreiro() {
        super("Guerreiro", "Combatente corajoso especializado em combate físico", 
              Arrays.asList("Alta resistência", "Força física", "Combate corpo a corpo"), 
              Arrays.asList("Magia complexa", "Ataques à distância"),
              List.of()); // Sem evoluções por enquanto
    }
}
