package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class Vampiro extends CategoriaInimigo {
    public Vampiro() {
        super(
                "Vampiro",
                "Vampiro ancestral sedento de sangue",
                List.of(EfeitoInimigo.SUGA_VIDA, EfeitoInimigo.MORDIDA_VAMPIRICA),
                TipoCriatura.VAMPIRO
        );
    }
}
