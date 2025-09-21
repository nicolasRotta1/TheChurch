package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CaçadorDeSombras extends CategoriaPlayer {
    public CaçadorDeSombras() {
        super(
            "Caçador de Sombras",
            "Combina furtividade e ataque.",
            Arrays.asList("FANTASMA"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.TIRO_SOMBRA, HabilidadesFactory.AGILIDADE_SOMBRAS, HabilidadesFactory.MEDO_SOMBRIO),
            Arrays.asList(EfeitoPlayer.AUMENTO_VEL)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Exterminador.class);
    }
}
