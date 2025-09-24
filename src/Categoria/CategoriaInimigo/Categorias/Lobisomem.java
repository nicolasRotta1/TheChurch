package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class Lobisomem extends CategoriaInimigo {
    public Lobisomem() {
        super(
                "Lobisomem Selvagem",
                "Criatura lupina que ataca à noite",
                List.of(EfeitoInimigo.FORCA_ANIMAL, EfeitoInimigo.MORDIDA_RAPIDA),
                TipoCriatura.LOBISOMEM
        );
    }
}
