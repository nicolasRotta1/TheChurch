package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class ObjetoAmaldicoado extends CategoriaInimigo {
    public ObjetoAmaldicoado() {
        super(
                "Objeto Amaldiçoado",
                "Objeto possuído que causa danos inesperados",
                List.of(EfeitoInimigo.POSSE, EfeitoInimigo.MALDICAO_DURA),
                TipoCriatura.OBJETO_AMALDICOADO
        );
    }
}
