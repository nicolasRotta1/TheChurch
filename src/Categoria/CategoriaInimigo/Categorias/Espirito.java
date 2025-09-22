package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class Espirito extends CategoriaInimigo {
    public Espirito() {
        super(
                "Espírito Errante",
                "Alma perturbada que assusta os vivos",
                List.of(EfeitoInimigo.POEIRA_ESPIRITUAL, EfeitoInimigo.LAMENTO),
                TipoCriatura.ESPIRITO
        );
    }
}
