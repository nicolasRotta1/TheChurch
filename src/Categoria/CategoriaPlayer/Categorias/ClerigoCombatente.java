package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class ClerigoCombatente extends CategoriaPlayer {
    public ClerigoCombatente() {
        super(
            "Clérigo Combatente",
            "Clérigo que usa combate físico.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.CHICOTE_SAGRADO, HabilidadesFactory.BENCAO, HabilidadesFactory.VIGOR_SAGRADO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ENERGIA, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(SacerdoteDaLuz.class);
    }
}
