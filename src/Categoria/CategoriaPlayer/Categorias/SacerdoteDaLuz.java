package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class SacerdoteDaLuz extends CategoriaPlayer {
    public SacerdoteDaLuz() {
        super(
            "Sacerdote da Luz",
            "Combina luz e combate.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.LUZ_PURIFICADORA, HabilidadesFactory.MALDICAO_LUZ, HabilidadesFactory.ESCUDO_SAGRADO),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(PaladinoSagrado.class);
    }
}
