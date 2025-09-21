package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CurandeiroSupremo extends CategoriaPlayer {
    public CurandeiroSupremo() {
        super(
            "Curandeiro Supremo",
            "Perito em cura.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.GRANDE_CURA, HabilidadesFactory.AURA_VITAL, HabilidadesFactory.INSPIRACAO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ENERGIA, EfeitoPlayer.AUMENTO_MAG)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Arceclerigo.class);
    }
}
