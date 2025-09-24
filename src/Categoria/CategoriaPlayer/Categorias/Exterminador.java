package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class Exterminador extends CategoriaPlayer {
    public Exterminador() {
        super(
            "Exterminador",
            "Uso de tecnologia e armas.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_VAMPIROS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_BRUXOS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactoryPlayer.RAIOS_TECNOLOGICOS, HabilidadesFactoryPlayer.SISTEMA_DESATIVACAO, HabilidadesFactoryPlayer.PRECISAO_TECNICA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(GuardiaoOculto.class);
    }
}
