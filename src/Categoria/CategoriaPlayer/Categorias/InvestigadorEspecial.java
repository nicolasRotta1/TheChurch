package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class InvestigadorEspecial extends CategoriaPlayer {
    public InvestigadorEspecial() {
        super(
            "Investigador Especial",
            "Investigador mais capaz.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactoryPlayer.ARMADILHA_PARANORMAL, HabilidadesFactoryPlayer.ALERTA_SOBRENATURAL, HabilidadesFactoryPlayer.ASTUCIA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CaçadorDasSombras.class);
    }
}
