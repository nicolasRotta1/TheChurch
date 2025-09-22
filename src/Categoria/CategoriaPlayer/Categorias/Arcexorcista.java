package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class Arcexorcista extends CategoriaPlayer {
    public Arcexorcista() {
        super(
            "Arcexorcista",
            "Cume da linhagem Exorcista.",
                Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
                Arrays.asList(Fraqueza.VULNERAVEL_A_LOBISOMENS),
            Arrays.asList(HabilidadesFactoryPlayer.EXORCISMO_SUPREMO, HabilidadesFactoryPlayer.MALDICAO_PURIFICADORA, HabilidadesFactoryPlayer.AURA_SUPREMA, HabilidadesFactoryPlayer.ESCUDO_DIVINO),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
