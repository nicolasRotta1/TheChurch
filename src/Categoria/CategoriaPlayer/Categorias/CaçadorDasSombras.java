package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class CaçadorDasSombras extends CategoriaPlayer {
    public CaçadorDasSombras() {
        super(
            "Caçador das Sombras",
            "Combina furtividade e ataque.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactoryPlayer.TIRO_SOMBRA, HabilidadesFactoryPlayer.AGILIDADE_SOMBRAS, HabilidadesFactoryPlayer.MEDO_SOMBRIO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Exterminador.class);
    }
}
