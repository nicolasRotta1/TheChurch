package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class TemplarioSagrado extends CategoriaPlayer {
    public TemplarioSagrado() {
        super(
            "Templário Sagrado",
            "Guerreiro sagrado equilibrado.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_ESPIRITOS),
            Arrays.asList(HabilidadesFactory.MARTEL_SAGRADO, HabilidadesFactory.PROTECAO_DIVINA, HabilidadesFactory.TATICA_PERFEITA, HabilidadesFactory.DESMORALIZAR_INIMIGOS),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_VEL)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
