package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class FantasmaComum extends CategoriaInimigo {
    public FantasmaComum() {
        super(
                "Fantasma Comum",
                "Espírito perdido que assombra locais antigos",
                List.of(EfeitoInimigo.INVISIBILIDADE, EfeitoInimigo.SUSTO),
                TipoCriatura.FANTASMA
        );
    }
}
