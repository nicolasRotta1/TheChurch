package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class CaçadorLendario extends CategoriaPlayer {
    public CaçadorLendario() {
        super(
            "Caçador Lendário",
            "Caçador lendário.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST, Vantagem.CONTRA_DEMONIOS, Vantagem.CONTRA_BONECOS, Vantagem.CONTRA_ABERRACOES, Vantagem.CONTRA_VAMPIROS, Vantagem.CONTRA_ANJOS, Vantagem.CONTRA_BRUXOS, Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_LOBISOMENS, Vantagem.CONTRA_OBJETOS, Vantagem.CONTRA_PESTES),
            Arrays.asList(),
            Arrays.asList(HabilidadesFactoryPlayer.EXECUCAO_LENDARIA, HabilidadesFactoryPlayer.MESTRE_CACADOR, HabilidadesFactoryPlayer.INTIMIDACAO, HabilidadesFactoryPlayer.VELOCIDADE_SUPREMA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
