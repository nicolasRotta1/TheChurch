package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CampeaoCelestial extends CategoriaPlayer {
    public CampeaoCelestial() {
        super(
            "Campeão Celestial",
            "Campeão com poder celestial.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST, Vantagem.CONTRA_DEMONIOS, Vantagem.CONTRA_BONECOS, Vantagem.CONTRA_ABERRACOES, Vantagem.CONTRA_VAMPIROS, Vantagem.CONTRA_ANJOS, Vantagem.CONTRA_BRUXOS, Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_LOBISOMENS, Vantagem.CONTRA_OBJETOS, Vantagem.CONTRA_PESTES),
            Arrays.asList(),
            Arrays.asList(HabilidadesFactory.GOLPE_CELESTIAL, HabilidadesFactory.FORCA_SUPREMA, HabilidadesFactory.VELOCIDADE_SUPREMA, HabilidadesFactory.MEDO_CELESTIAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_VEL, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // Sem evoluções
    }
}
