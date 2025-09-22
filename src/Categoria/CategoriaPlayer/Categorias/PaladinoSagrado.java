package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class PaladinoSagrado extends CategoriaPlayer {
    public PaladinoSagrado() {
        super(
            "Paladino Sagrado",
            "Combate e proteção em alto nível.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_BRUXOS),
            Arrays.asList(HabilidadesFactory.GOLPE_DA_LUZ, HabilidadesFactory.ESCUDO_DIVINO, HabilidadesFactory.FORCA_LUZ, HabilidadesFactory.RETALIACAO_SAGRADA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // Sem evoluções
    }
}
