package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CurandeiroSupremo extends CategoriaPlayer {
    public CurandeiroSupremo() {
        super(
            "Curandeiro Supremo",
            "Perito em cura.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.GRANDE_CURA, HabilidadesFactory.AURA_VITAL, HabilidadesFactory.INSPIRACAO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ENERGIA, EfeitoPlayer.AUMENTO_MAG)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Arceclerigo.class);
    }
}
