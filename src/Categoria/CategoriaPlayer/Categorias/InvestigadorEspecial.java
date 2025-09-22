package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class InvestigadorEspecial extends CategoriaPlayer {
    public InvestigadorEspecial() {
        super(
            "Investigador Especial",
            "Investigador mais capaz.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.ARMADILHA_PARANORMAL, HabilidadesFactory.ALERTA_SOBRENATURAL, HabilidadesFactory.ASTUCIA),
            Arrays.asList(EfeitoPlayer.AUMENTO_VEL, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CaçadorDasSombras.class);
    }
}
