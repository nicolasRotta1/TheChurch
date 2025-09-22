package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class PaladinoIniciante extends CategoriaPlayer {
    public PaladinoIniciante() {
        super(
            "Paladino Iniciante",
            "Inicia como guerreiro sagrado.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST,
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS),
            Arrays.asList(HabilidadesFactory.GOLPE_ABENCOADO, HabilidadesFactory.PROTECAO_DIVINA),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(PaladinoDaLuz.class);
        addEvolucao(CavaleiroDivino.class);
    }
}
