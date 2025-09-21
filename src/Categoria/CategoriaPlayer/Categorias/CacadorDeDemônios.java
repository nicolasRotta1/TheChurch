package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CacadorDeDemônios extends CategoriaPlayer {
    public CacadorDeDemônios() {
        super(
            "Caçador de Demônios",
            "Especialista em caçar demônios.",
            Arrays.asList("DEMONIO"),
            Arrays.asList("VAMPIRO"),
            Arrays.asList(HabilidadesFactory.BALA_SAGRADA, HabilidadesFactory.VIGOR_CACADOR, HabilidadesFactory.INTIMIDACAO_DEMONIACA),
            Arrays.asList(EfeitoPlayer.AUMENTO_VEL)
        );
    }

    @Override
    public void configurarEvolucoes() {
    }
}
