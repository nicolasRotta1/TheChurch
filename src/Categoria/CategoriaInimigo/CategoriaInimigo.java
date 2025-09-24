package Categoria.CategoriaInimigo;

import Categoria.CategoriaGeral;
import Categoria.TipoCriatura;
import Categoria.Efeito;

import java.util.List;

public abstract class CategoriaInimigo extends CategoriaGeral {

    private TipoCriatura tipoCriatura;

    public CategoriaInimigo(String nome,
                            String descricao,
                            List<Efeito> efeitos,
                            TipoCriatura tipoCriatura) {
        super(nome, descricao,efeitos); // passa a lista de efeitos para a superclasse
        this.tipoCriatura = tipoCriatura;
    }

    public TipoCriatura getTipoCriatura() { return tipoCriatura; }
}
