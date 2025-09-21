package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class Arceclerigo extends CategoriaPlayer {
    public Arceclerigo() {
        super(
            "Arceclérigo",
            "Líder espiritual.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_LOBISOMENS),
            Arrays.asList(HabilidadesFactory.CURA_SUPREMA, HabilidadesFactory.AURA_SAGRADA, HabilidadesFactory.PROTECAO_TOTAL, HabilidadesFactory.AURA_DA_LUZ),
            Arrays.asList(EfeitoPlayer.AUMENTO_MAG, EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.BUFF_CURA)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(AvatarDaLuz.class);
    }
}
