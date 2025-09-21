package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class Arcexorcista extends CategoriaPlayer {
    public Arcexorcista() {
        super(
            "Arcexorcista",
            "Cume da linhagem Exorcista.",
                Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
                Arrays.asList(Fraqueza.VULNERAVEL_A_LOBISOMENS),
            Arrays.asList(HabilidadesFactory.EXORCISMO_SUPREMO, HabilidadesFactory.MALDICAO_PURIFICADORA, HabilidadesFactory.AURA_SUPREMA, HabilidadesFactory.ESCUDO_DIVINO),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
