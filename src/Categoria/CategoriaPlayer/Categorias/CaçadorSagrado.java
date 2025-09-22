package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class CaçadorSagrado extends CategoriaPlayer {
    public CaçadorSagrado() {
        super(
            "Caçador Sagrado",
            "Especialista final em caçar criaturas sagradas.",
            Arrays.asList(Vantagem.CONTRA_DEMONIOS, Vantagem.CONTRA_VAMPIROS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_ESPIRITOS),
            Arrays.asList(HabilidadesFactoryPlayer.TIRO_SAGRADO, HabilidadesFactoryPlayer.FURIA_CACADORA, HabilidadesFactoryPlayer.MEDO_DEMONIACO, HabilidadesFactoryPlayer.VIGOR_SAGRADO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_ENERGIA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        // sem evoluções
    }
}
