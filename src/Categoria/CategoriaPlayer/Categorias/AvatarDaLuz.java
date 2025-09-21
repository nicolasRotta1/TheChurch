package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Vantagem;
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
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST, Vantagem.CONTRA_DEMONIOS, Vantagem.CONTRA_BONECOS, Vantagem.CONTRA_ABERRACOES, Vantagem.CONTRA_VAMPIROS, Vantagem.CONTRA_ANJOS, Vantagem.CONTRA_BRUXOS, Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_LOBISOMENS, Vantagem.CONTRA_OBJETOS, Vantagem.CONTRA_PESTES),
            Arrays.asList(),
            Arrays.asList(HabilidadesFactory.JUÍZO_FINAL, HabilidadesFactory.AURA_SUPREMA, HabilidadesFactory.CURA_CONTINUA, HabilidadesFactory.PURIFICACAO),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
