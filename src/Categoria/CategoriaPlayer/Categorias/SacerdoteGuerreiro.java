package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class SacerdoteGuerreiro extends CategoriaPlayer {
    public SacerdoteGuerreiro() {
        super(
            "Sacerdote Guerreiro",
            "Combina magia sagrada e combate físico.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_BRUXOS, Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactory.GOLPE_SAGRADO, HabilidadesFactory.FORCA_DIVINA, HabilidadesFactory.RESISTENCIA_SAGRADA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(TemplarioSagrado.class);
    }
}
