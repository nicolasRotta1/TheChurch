package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class MestreExorcista extends CategoriaPlayer {
    public MestreExorcista() {
        super(
            "Mestre Exorcista",
            "Mestre dos exorcismos.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_LOBISOMENS),
            Arrays.asList(HabilidadesFactoryPlayer.EXORCISMO_AVANCADO, HabilidadesFactoryPlayer.AURA_SAGRADA, HabilidadesFactoryPlayer.FORCA_ESPIRITUAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(Arcexorcista.class);
    }
}
