package Classe;

import Personagens.Personagem;

public class ClasseController implements IClasse {

    private ClasseGeral classe;

    public ClasseController(ClasseGeral classe) {
        this.classe = classe;
    }

    public ClasseGeral getClasse() {
        return classe;
    }


    @Override
    public void subirStatus(Personagem personagem) {

    }

    @Override
    public void verificarFraqueza(Personagem alvo) {

    }

}
