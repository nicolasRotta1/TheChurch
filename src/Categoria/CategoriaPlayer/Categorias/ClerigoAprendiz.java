package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactory;
import java.util.Arrays;

public class ClerigoAprendiz extends CategoriaPlayer {
    public ClerigoAprendiz() {
        super(
            "Clérigo Aprendiz",
            "Inicia no caminho da cura.",
            Arrays.asList("ALIADO"),
            Arrays.asList("DEMONIO"),
            Arrays.asList(HabilidadesFactory.PEQUENA_BENCAO, HabilidadesFactory.PROTECAO_INICIAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(ClerigoCombatente.class);
        addEvolucao(CurandeiroSupremo.class);
    }
}
