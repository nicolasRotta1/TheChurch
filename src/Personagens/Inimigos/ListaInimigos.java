package Personagens.Inimigos;


import Classe.ClassesInimigo.ClasseInimigo;
import Personagens.Personagem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaInimigos {

    public static List<Inimigo> listaInimigos() {
        List<Inimigo> listaInimigos = new ArrayList<>();

        List<String> fraquezasVampiro = new ArrayList<>();
        fraquezasVampiro.addAll(Arrays.asList("alho", "espelho"));

        Inimigo vampiroNosferato = new Inimigo(
                "Vampiro Nosferato",
                fraquezasVampiro,
                100,
                100);


        @Override
        public String getTipoCriatura () {
            return super.getTipoCriatura();
        }
    }

    {


        @Override
        public void atacar (Personagem alvo){
        super.atacar(alvo);
    }
    }
}
}
