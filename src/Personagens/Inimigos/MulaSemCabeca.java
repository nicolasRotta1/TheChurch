package Personagens.Inimigos;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Habilidades.Habilidade;
import java.util.Arrays;

// Categoria específica para Mula Sem Cabeça
class CategoriaMulaSemCabeca extends CategoriaInimigo {
    public CategoriaMulaSemCabeca() {
        super("Mula Sem Cabeça", "Criatura amaldiçoada", 
              Arrays.asList("Força", "Resistência"), 
              Arrays.asList("Água benta", "Objetos sagrados"),
              "Criatura Amaldiçoada");
    }
}

public class MulaSemCabeca extends Inimigo {
    public MulaSemCabeca() {
        super("Mula Sem Cabeça", new CategoriaMulaSemCabeca(), 70);
        this.hp = 150;
        this.ataque = 35;
        this.habilidade = new Habilidade("Chamas Infernais", "Fogo", 1.5, "Respira chamas pelos buracos do pescoço");
    }
}
