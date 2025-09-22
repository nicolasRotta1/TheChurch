package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.EfeitoInimigo;
import java.util.List;

public class BonecoAmaldicoado extends CategoriaInimigo {
    public BonecoAmaldicoado() {
        super(
                "Boneco Amaldiçoado",
                "Boneco possuído que ataca inocentes",
                List.of(EfeitoInimigo.MALDICAO_VIVA, EfeitoInimigo.TERROR_SILENCIOSO),
                TipoCriatura.BONECO_AMALDICOADO
        );
    }
}
