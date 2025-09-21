package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class AvatarSagrado extends CategoriaPlayer {
    public AvatarSagrado() {
        super(
            "Avatar Sagrado",
            "Forma suprema do guerreiro sagrado.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.APOCALIPSE_SAGRADO, HabilidadesFactory.AURA_DIVINA, HabilidadesFactory.ESCUDO_CELESTIAL, HabilidadesFactory.DESTRUICAO_SAGRADA),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
