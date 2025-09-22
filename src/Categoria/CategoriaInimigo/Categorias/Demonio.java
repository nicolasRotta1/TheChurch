package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class Demonio extends CategoriaInimigo {
    public Demonio() {
        super(
                "Demônio Infernal",
                "Ser do inferno com grande fúria",
                List.of(EfeitoInimigo.FURIA_ABSOLUTA, EfeitoInimigo.CHAMA_DO_INFERNO),
                TipoCriatura.DEMONIO
        );
    }
}
