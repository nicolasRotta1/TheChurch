package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class CaçadorDasSombras extends CategoriaPlayer {
    public CaçadorDasSombras() {
        super(
            "Caçador das Sombras",
            "Combina furtividade e ataque.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.TIRO_SOMBRA, HabilidadesFactory.AGILIDADE_SOMBRAS, HabilidadesFactory.MEDO_SOMBRIO),
            Arrays.asList(EfeitoPlayer.AUMENTO_VEL)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Exterminador.class);
    }
}
