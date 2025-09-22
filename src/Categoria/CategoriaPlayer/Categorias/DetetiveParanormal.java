package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class DetetiveParanormal extends CategoriaPlayer {
    public DetetiveParanormal() {
        super(
            "Detetive Paranormal",
            "Inicia investigando fenômenos.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_ESPIRITOS,
            Arrays.asList(HabilidadesFactory.INVESTIGAR_VULNERABILIDADE, HabilidadesFactory.MARCA_INVESTIGADOR),
            Arrays.asList(EfeitoPlayer.AUMENTO_VEL)
            );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(InvestigadorEspecial.class);
    }
}
