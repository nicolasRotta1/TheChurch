package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class ClerigoAprendiz extends CategoriaPlayer {
    public ClerigoAprendiz() {
        super(
            "Clérigo Aprendiz",
            "Inicia no caminho da cura.",
            Arrays.asList(Vantagem.CONTRA_ESPIRITOS),
            Arrays.asList(Fraqueza.VULNERAVEL_A_DEMONIOS),
            Arrays.asList(HabilidadesFactoryPlayer.PEQUENA_BENCAO, HabilidadesFactoryPlayer.PROTECAO_INICIAL),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(ClerigoCombatente.class);
        addEvolucao(CurandeiroSupremo.class);
    }
}
