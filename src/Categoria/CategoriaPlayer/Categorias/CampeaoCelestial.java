package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CampeaoCelestial extends CategoriaPlayer {
    public CampeaoCelestial() {
        super(
            "Campeão Celestial",
            "Campeão com poder celestial.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.GOLPE_CELESTIAL, HabilidadesFactory.FORCA_SUPREMA, HabilidadesFactory.VELOCIDADE_SUPREMA, HabilidadesFactory.MEDO_CELESTIAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_VEL, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // Sem evoluções
    }
}
