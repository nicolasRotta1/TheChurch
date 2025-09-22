package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class ClerigoCombatente extends CategoriaPlayer {
    public ClerigoCombatente() {
        super(
            "Clérigo Combatente",
            "Clérigo que usa combate físico.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_VAMPIROS),
            Arrays.asList(HabilidadesFactory.CHICOTE_SAGRADO, HabilidadesFactory.BENCAO, HabilidadesFactory.VIGOR_SAGRADO),
            Arrays.asList(EfeitoPlayer.AUMENTO_ENERGIA, EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(SacerdoteDaLuz.class);
    }
}
