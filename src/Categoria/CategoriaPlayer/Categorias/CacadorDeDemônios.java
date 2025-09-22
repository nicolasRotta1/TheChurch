package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class CacadorDeDemônios extends CategoriaPlayer {
    public CacadorDeDemônios() {
        super(
            "Caçador de Demônios",
            "Especialista em caçar demônios.",
            Arrays.asList(Vantagem.CONTRA_DEMONIOS, Vantagem.CONTRA_VAMPIROS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_FANTASMAS, Fraqueza.VULNERAVEL_A_ESPIRITOS),
            Arrays.asList(HabilidadesFactoryPlayer.BALA_SAGRADA, HabilidadesFactoryPlayer.VIGOR_CACADOR, HabilidadesFactoryPlayer.INTIMIDACAO_DEMONIACA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(CaçadorSagrado.class);
    }
}
