package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class SacerdoteDaLuz extends CategoriaPlayer {
    public SacerdoteDaLuz() {
        super(
            "Sacerdote da Luz",
            "Combina luz e combate.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactoryPlayer.LUZ_PURIFICADORA, HabilidadesFactoryPlayer.MALDICAO_LUZ, HabilidadesFactoryPlayer.ESCUDO_SAGRADO),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(PaladinoSagrado.class);
    }
}
