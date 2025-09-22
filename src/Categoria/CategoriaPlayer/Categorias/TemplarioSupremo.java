package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class TemplarioSupremo extends CategoriaPlayer {
    public TemplarioSupremo() {
        super(
            "Templário Supremo",
            "Guerreiro templário avançado.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.MARTEL_JUSTICA, HabilidadesFactory.ESCUDO_SUPREMO, HabilidadesFactory.INSPIRACAO_TEMPLARIA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CampeaoCelestial.class);
    }
}
