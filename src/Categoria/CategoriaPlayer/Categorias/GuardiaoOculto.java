package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.Efeito;
import Categoria.EfeitoPlayer;
import Habilidades.Habilidade;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class GuardiaoOculto extends CategoriaPlayer {
    public GuardiaoOculto() {
        super(
            "Guardião Oculto",
            "Protetor discreto.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.GOLPE_ESTRATEGICO, HabilidadesFactory.TATICA_PERFEITA, HabilidadesFactory.RESILIENCIA_OCULTA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_VEL)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CaçadorLendario.class);
    }
}
