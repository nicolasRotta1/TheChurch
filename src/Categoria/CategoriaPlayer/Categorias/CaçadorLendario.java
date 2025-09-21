package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CaçadorLendario extends CategoriaPlayer {
    public CaçadorLendario() {
        super(
            "Caçador Lendário",
            "Caçador lendário.",
            Arrays.asList("FANTASMA", "DEMONIO"),
            Arrays.asList("MAQUINA"),
            Arrays.asList(HabilidadesFactory.EXECUCAO_LENDARIA, HabilidadesFactory.MESTRE_CACADOR, HabilidadesFactory.INTIMIDACAO, HabilidadesFactory.VELOCIDADE_SUPREMA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_VEL, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
