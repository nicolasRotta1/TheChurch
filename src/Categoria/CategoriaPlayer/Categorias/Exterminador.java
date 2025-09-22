package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class Exterminador extends CategoriaPlayer {
    public Exterminador() {
        super(
            "Exterminador",
            "Uso de tecnologia e armas.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_VAMPIROS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_BRUXOS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.RAIOS_TECNOLOGICOS, HabilidadesFactory.SISTEMA_DESATIVACAO, HabilidadesFactory.PRECISAO_TECNICA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_VEL)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(GuardiaoOculto.class);
    }
}
