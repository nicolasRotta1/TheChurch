package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class AvatarSagrado extends CategoriaPlayer {
    public AvatarSagrado() {
        super(
            "Avatar Sagrado",
            "Forma suprema do guerreiro sagrado.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST, Vantagem.CONTRA_DEMONIOS, Vantagem.CONTRA_BONECOS, Vantagem.CONTRA_ABERRACOES, Vantagem.CONTRA_VAMPIROS, Vantagem.CONTRA_ANJOS, Vantagem.CONTRA_BRUXOS, Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_LOBISOMENS, Vantagem.CONTRA_OBJETOS, Vantagem.CONTRA_PESTES),
            Arrays.asList(),
            Arrays.asList(HabilidadesFactoryPlayer.APOCALIPSE_SAGRADO, HabilidadesFactoryPlayer.AURA_DIVINA, HabilidadesFactoryPlayer.ESCUDO_CELESTIAL, HabilidadesFactoryPlayer.DESTRUICAO_SAGRADA),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
