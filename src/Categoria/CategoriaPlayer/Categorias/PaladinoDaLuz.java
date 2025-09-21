package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Categorias.TemplarioSupremo;
import Categoria.Efeito;
import Categoria.EfeitoPlayer;
import Habilidades.Habilidade;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class PaladinoDaLuz extends CategoriaPlayer {
    public PaladinoDaLuz() {
        super(
            "Paladino da Luz",
            "Intermediário guerreiro sagrado.",
            Arrays.asList("DEMONIO"),
            Arrays.asList("FANTASMA"),
            Arrays.asList(HabilidadesFactory.ATAQUE_CELESTIAL, HabilidadesFactory.FORCA_LUZ, HabilidadesFactory.VIGOR_DIVINO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(TemplarioSupremo.class);
    }
}
