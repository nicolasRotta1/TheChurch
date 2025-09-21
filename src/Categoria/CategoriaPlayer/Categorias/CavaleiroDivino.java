package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CavaleiroDivino extends CategoriaPlayer {
    public CavaleiroDivino() {
        super(
            "Cavaleiro Divino",
            "Cavaleiro com poderes divinos.",
            Arrays.asList("DEMONIO"),
            Arrays.asList("VAMPIRO"),
            Arrays.asList(HabilidadesFactory.INVESTIDA_DIVINA, HabilidadesFactory.FORTALEZA_SAGRADA, HabilidadesFactory.RESISTENCIA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(GuardiaoSagrado.class);
    }
}
