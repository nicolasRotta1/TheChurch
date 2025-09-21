package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.Efeito;
import Categoria.EfeitoPlayer;
import Habilidades.Habilidade;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class AvatarDaLuz extends CategoriaPlayer {
    public AvatarDaLuz() {
        super(
            "Avatar da Luz",
            "Forma suprema da luz.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.JUÍZO_FINAL, HabilidadesFactory.AURA_SUPREMA, HabilidadesFactory.CURA_CONTINUA, HabilidadesFactory.PURIFICACAO),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
