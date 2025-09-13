package Categoria.CategoriaInimigo;

import Categoria.CategoriaGeral;
import java.util.List;

public abstract class CategoriaInimigo extends CategoriaGeral {

    private String tipoCriatura;

    public CategoriaInimigo(String nome, String descricao, List<String> vantagens, List<String> fraquezas, String tipoCriatura) {
        super(nome, descricao, vantagens, fraquezas);
        this.tipoCriatura = tipoCriatura;
    }

    public String getTipoCriatura() {
        return tipoCriatura;
    }
}
