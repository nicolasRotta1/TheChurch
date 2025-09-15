package Personagens.Inimigos;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Habilidades.Habilidade;
import java.util.Arrays;

// Categoria específica para Saci
class CategoriaSaci extends CategoriaInimigo {
    public CategoriaSaci() {
        super("Saci", "Travesso das matas", 
              Arrays.asList("Agilidade", "Travessuras"), 
              Arrays.asList("Cruzes", "Rezas"),
              "Lenda Urbana");
    }
}

public class Saci extends Inimigo {
    public Saci() {
        super("Saci-Pererê", new CategoriaSaci(), 40);
        this.hp = 80;
        this.ataque = 30;
        this.habilidade = new Habilidade("Redemoinho", "Mágico", 1.2, "Cria um redemoinho que atordoa o inimigo");
    }
}
