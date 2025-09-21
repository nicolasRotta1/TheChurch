package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.Efeito;
import Categoria.EfeitoPlayer;
import Habilidades.Habilidade;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class GuardiaoSagrado extends CategoriaPlayer {
    public GuardiaoSagrado() {
        super(
            "Guardião Sagrado",
            "Protetor avançado de aliados.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.PROTECAO_SUPREMA, HabilidadesFactory.AURA_PROTETORA2, HabilidadesFactory.FORCA_GUARDIAO),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_MAG)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(AvatarDaLuz.class);
    }
}
