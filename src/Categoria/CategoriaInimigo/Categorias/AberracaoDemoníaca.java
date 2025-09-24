package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class AberracaoDemoníaca extends CategoriaInimigo {
    public AberracaoDemoníaca() {
        super(
                "Aberração Demoníaca",
                "Monstro deformado do inferno",
                List.of(EfeitoInimigo.HORROR_ABSOLUTO, EfeitoInimigo.CORRUPCAO_TOTAL),
                TipoCriatura.ABERRACAO_DEMONIACA
        );
    }
}
