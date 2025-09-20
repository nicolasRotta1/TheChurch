package Categoria.CategoriaInimigo;

import Categoria.CategoriaGeral;
import Habilidades.Habilidade;

import java.util.List;

public abstract class CategoriaInimigo extends CategoriaGeral {

    private String tipoCriatura;

    public CategoriaInimigo(String nome, String descricao, List<String> vantagens, List<String> fraquezas, List<Habilidade> habilidades, String tipoCriatura) {
        super(nome, descricao, vantagens, fraquezas, habilidades);
        this.tipoCriatura = tipoCriatura;
    }

    public String getTipoCriatura() {
        return tipoCriatura;
    }
}
