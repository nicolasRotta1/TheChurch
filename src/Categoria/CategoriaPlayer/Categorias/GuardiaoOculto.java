package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class GuardiaoOculto extends CategoriaPlayer {
    public GuardiaoOculto() {
        super(
            "Guardião Oculto",
            "Protetor discreto.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_DEMONIOS, Fraqueza.VULNERAVEL_A_VAMPIROS),
            Arrays.asList(HabilidadesFactoryPlayer.GOLPE_ESTRATEGICO, HabilidadesFactoryPlayer.TATICA_PERFEITA, HabilidadesFactoryPlayer.RESILIENCIA_OCULTA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CaçadorLendario.class);
    }
}
