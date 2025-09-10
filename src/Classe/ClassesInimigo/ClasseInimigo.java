package Classe.ClassesInimigo;

import Classe.ClasseGeral;
import java.util.List;

public abstract class ClasseInimigo extends ClasseGeral {

    private String tipoCriatura;

    public ClasseInimigo(String nome, String descricao, List<String> vantagens, List<String> fraquezas, String tipoCriatura) {
        super(nome, descricao, vantagens, fraquezas);
        this.tipoCriatura = tipoCriatura;
    }

    public String getTipoCriatura() {
        return tipoCriatura;
    }
}
