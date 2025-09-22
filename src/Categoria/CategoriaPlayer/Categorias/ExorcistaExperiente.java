package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class ExorcistaExperiente extends CategoriaPlayer {
    public ExorcistaExperiente() {
        super(
            "Exorcista Experiente",
            "Exorcista com mais prática.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_BRUXOS),
            Arrays.asList(HabilidadesFactoryPlayer.EXORCISMO_LEVE, HabilidadesFactoryPlayer.AURA_PROTETORA, HabilidadesFactoryPlayer.MEDO_FANTASMAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.REDUCAO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(MestreExorcista.class);
        addEvolucao(SacerdoteGuerreiro.class);
    }
}
