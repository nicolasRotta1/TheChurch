package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class AnjoCaido extends CategoriaInimigo {
    public AnjoCaido() {
        super(
                "Anjo Caído",
                "Ser celestial corrompido",
                List.of(EfeitoInimigo.CORRUPCAO, EfeitoInimigo.ASAS_NEGRAS),
                TipoCriatura.ANJO_CAIDO
        );
    }
}
