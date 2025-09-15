package Categoria.CategoriaPlayer;

import java.util.Arrays;
import java.util.List;

public class Padre extends CategoriaPlayer {
    public Padre() {
        super("Padre", "Servo da fé, especialista em combater o mal", 
              Arrays.asList("Resistência a magia negra", "Cura", "Exorcismo"), 
              Arrays.asList("Ataques físicos", "Armas profanas"),
              List.of()); // Sem evoluções por enquanto
    }
}
