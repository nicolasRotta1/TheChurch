package Personagens.Inimigos;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Habilidades.Habilidade;
import java.util.Arrays;

// Categoria específica para Curupira
class CategoriaCurupira extends CategoriaInimigo {
    public CategoriaCurupira() {
        super("Curupira", "Protetor da floresta", 
              Arrays.asList("Velocidade", "Conhece a floresta"), 
              Arrays.asList("Água benta", "Cruzes"),
              "Lenda Urbana");
    }
}

public class Curupira extends Inimigo {
    public Curupira() {
        super("Curupira", new CategoriaCurupira(), 50);
        this.hp = 120;
        this.ataque = 25;
        this.habilidade = new Habilidade("Pés Virados", "Mágico", 1.3, "Confunde o inimigo com seus pés virados");
    }
}
