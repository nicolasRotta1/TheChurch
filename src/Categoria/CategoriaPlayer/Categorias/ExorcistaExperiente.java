package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class ExorcistaExperiente extends CategoriaPlayer {
    public ExorcistaExperiente() {
        super(
            "Exorcista Experiente",
            "Exorcista com mais prática.",
            Arrays.asList("FANTASMA", "DEMONIO"),
            Arrays.asList("BRUXA"),
            Arrays.asList(HabilidadesFactory.EXORCISMO_LEVE, HabilidadesFactory.AURA_PROTETORA, HabilidadesFactory.MEDO_FANTASMAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.REDUCAO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(MestreExorcista.class);
        addEvolucao(SacerdoteGuerreiro.class);
    }
}
