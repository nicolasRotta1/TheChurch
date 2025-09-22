package Categoria.CategoriaPlayer.Categorias;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.EfeitoPlayer;
import Habilidades.HabilidadesFactoryPlayer;
import java.util.Arrays;

public class GuardiaoSagrado extends CategoriaPlayer {
    public GuardiaoSagrado() {
        super(
            "Guardião Sagrado",
            "Protetor avançado de aliados.",
            Arrays.asList(Vantagem.CONTRA_FANTASMAS, Vantagem.CONTRA_POLTERGEIST),
            Arrays.asList(Fraqueza.VULNERAVEL_A_LOBISOMENS, Fraqueza.VULNERAVEL_A_VAMPIROS),
            Arrays.asList(HabilidadesFactoryPlayer.PROTECAO_SUPREMA, HabilidadesFactoryPlayer.AURA_PROTETORA2, HabilidadesFactoryPlayer.FORCA_GUARDIAO),
            Arrays.asList(EfeitoPlayer.AUMENTO_DEF, EfeitoPlayer.AUMENTO_MAG)
        );
    }

    @Override
    public void configurarEvolucoes() {
        addEvolucao(AvatarDaLuz.class);
    }
}
