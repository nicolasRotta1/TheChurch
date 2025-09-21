package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CaçadorSagrado extends CategoriaPlayer {
    public CaçadorSagrado() {
        super(
            "Caçador Sagrado",
            "Especialista final em caçar criaturas sagradas.",
            Arrays.asList("DEMONIO", "FANTASMA"),
            Arrays.asList("VAMPIRO"),
            Arrays.asList(HabilidadesFactory.TIRO_SAGRADO, HabilidadesFactory.FURIA_CACADORA, HabilidadesFactory.MEDO_DEMONIACO, HabilidadesFactory.VIGOR_SAGRADO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_VEL, EfeitoPlayer.AUMENTO_ENERGIA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
