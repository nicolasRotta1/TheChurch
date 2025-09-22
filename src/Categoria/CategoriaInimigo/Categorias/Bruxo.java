package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class Bruxo extends CategoriaInimigo {
    public Bruxo() {
        super(
                "Bruxo Sombrio",
                "Mago maligno que lança maldições",
                List.of(EfeitoInimigo.MALDICAO, EfeitoInimigo.CONJURAR_FEITICO),
                TipoCriatura.BRUXO
        );
    }
}
