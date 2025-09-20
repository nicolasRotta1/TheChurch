package Categoria;
import Habilidades.Habilidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public abstract class CategoriaGeral {
    protected String nome;
    protected String descricao;
    protected List<String> vantagens;
    protected List<String> fraquezas;
    protected List<Habilidade> habilidades;
    protected List<Efeito> efeitos;

    public CategoriaGeral(String nome,String descricao,List<String> vantagens,List<String> fraquezas,List<Habilidade> habilidades){
        this.nome=nome;
        this.descricao=descricao;
        this.vantagens=vantagens;
        this.fraquezas=fraquezas;
        this.habilidades=habilidades;
        this.efeitos=new ArrayList<>();

    }
    public CategoriaGeral(String nome,String descricao,List<String> vantagens,List<String> fraquezas,List<Habilidade> habilidades,List<Efeito> efeitos){
        this(nome,descricao,vantagens,fraquezas,habilidades);
        if (efeitos!=null) this.efeitos.addAll(efeitos);
    }

    public String getNome(){
        return nome;
    }

    public List<Efeito> getEfeitos(){
        return Collections.unmodifiableList(efeitos);
    }

}
