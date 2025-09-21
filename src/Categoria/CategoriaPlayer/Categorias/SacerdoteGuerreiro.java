package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class SacerdoteGuerreiro extends CategoriaPlayer {
    public SacerdoteGuerreiro() {
        super(
            "Sacerdote Guerreiro",
            "Combina magia sagrada e combate físico.",
            Arrays.asList("DEMONIO"),
            Arrays.asList("LOBISOMEM", "BRUXA"),
            Arrays.asList(HabilidadesFactory.GOLPE_SAGRADO, HabilidadesFactory.FORCA_DIVINA, HabilidadesFactory.RESISTENCIA_SAGRADA),
            Arrays.asList(EfeitoPlayer.AUMENTO_ATQ, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(TemplarioSagrado.class);
    }
}
