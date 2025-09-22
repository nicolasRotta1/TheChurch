package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class Arceclerigo extends CategoriaPlayer {
    public Arceclerigo() {
        super(
            "Arceclérigo",
            "Líder espiritual.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_LOBISOMENS),
            Arrays.asList(HabilidadesFactoryPlayer.CURA_SUPREMA, HabilidadesFactoryPlayer.AURA_SAGRADA, HabilidadesFactoryPlayer.PROTECAO_TOTAL, HabilidadesFactoryPlayer.AURA_DA_LUZ),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(AvatarDaLuz.class);
    }
}
