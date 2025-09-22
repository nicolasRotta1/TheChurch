package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class ExorcistaExperiente extends CategoriaPlayer {
    public ExorcistaExperiente() {
        super(
            "Exorcista Experiente",
            "Exorcista com mais prática.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_BRUXOS),
            Arrays.asList(HabilidadesFactory.EXORCISMO_LEVE, HabilidadesFactory.AURA_PROTETORA, HabilidadesFactory.MEDO_FANTASMAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.REDUCAO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(MestreExorcista.class);
        addEvolucao(SacerdoteGuerreiro.class);
    }
}
