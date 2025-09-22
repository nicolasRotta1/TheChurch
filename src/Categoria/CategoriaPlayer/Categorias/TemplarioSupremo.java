package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class TemplarioSupremo extends CategoriaPlayer {
    public TemplarioSupremo() {
        super(
            "Templário Supremo",
            "Guerreiro templário avançado.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactoryPlayer.MARTEL_JUSTICA, HabilidadesFactoryPlayer.ESCUDO_SUPREMO, HabilidadesFactoryPlayer.INSPIRACAO_TEMPLARIA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CampeaoCelestial.class);
    }
}
