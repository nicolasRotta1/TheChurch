package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class ExorcistaAprendiz extends CategoriaPlayer {
    public ExorcistaAprendiz() {
        super(
            "Exorcista Aprendiz",
            "Iniciado nos rituais de exorcismo.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS),
            Arrays.asList(HabilidadesFactory.CAJADO_SAGRADO, HabilidadesFactory.FE_INICIAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG)
        );
    }

    @Override
    public void configurarEvolucoes() {
      addEvolucao(ExorcistaExperiente.class);
      addEvolucao(CacadorDeDemônios.class);
    }
}
