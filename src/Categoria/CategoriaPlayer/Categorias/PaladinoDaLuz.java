package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class PaladinoDaLuz extends CategoriaPlayer {
    public PaladinoDaLuz() {
        super(
            "Paladino da Luz",
            "Intermediário guerreiro sagrado.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_ANJOS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_BRUXOS),
            Arrays.asList(HabilidadesFactoryPlayer.ATAQUE_CELESTIAL, HabilidadesFactoryPlayer.FORCA_LUZ, HabilidadesFactoryPlayer.VIGOR_DIVINO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(TemplarioSupremo.class);
    }
}
