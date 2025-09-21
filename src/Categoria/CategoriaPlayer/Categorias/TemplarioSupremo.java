package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class TemplarioSupremo extends CategoriaPlayer {
    public TemplarioSupremo() {
        super(
            "Templário Supremo",
            "Guerreiro templário avançado.",
            Arrays.asList("DEMONIO"),
            Arrays.asList("MAQUINA"),
            Arrays.asList(HabilidadesFactory.MARTEL_JUSTICA, HabilidadesFactory.ESCUDO_SUPREMO, HabilidadesFactory.INSPIRACAO_TEMPLARIA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CampeaoCelestial.class);
    }
}
