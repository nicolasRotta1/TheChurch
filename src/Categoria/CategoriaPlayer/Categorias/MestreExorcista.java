package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class MestreExorcista extends CategoriaPlayer {
    public MestreExorcista() {
        super(
            "Mestre Exorcista",
            "Mestre dos exorcismos.",
            Arrays.asList("FANTASMA", "DEMONIO"),
            Arrays.asList("BRUXA"),
            Arrays.asList(HabilidadesFactory.EXORCISMO_AVANCADO, HabilidadesFactory.AURA_SAGRADA, HabilidadesFactory.FORCA_ESPIRITUAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Arcexorcista.class);
    }
}
