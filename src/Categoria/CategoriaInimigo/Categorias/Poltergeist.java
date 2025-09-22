package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class Poltergeist extends CategoriaInimigo {
    public Poltergeist() {
        super(
                "Poltergeist",
                "Espírito turbulento que arremessa objetos",
                List.of(EfeitoInimigo.TELECINESE, EfeitoInimigo.CAOS),
                TipoCriatura.POLTERGEIST
        );
    }
}
