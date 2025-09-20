package Categoria;
public enum EfeitoPlayer implements Efeito {
    AUMENTO_ATQ("ATQ",1.2,"Aumento de ataque"),
    BUFF_CURA("CURA",1.2,"Buff de cura");

    private final String tag; private final double multiplicador;

    private final String descricao;

    EfeitoPlayer(String tag,double m,String d){
        this.tag=tag;
        this.multiplicador=m;
        this.descricao=d;
    }

    @Override public String getTag(){
        return tag;
    }

    @Override public double getMultiplicador(){
        return multiplicador;
    }

    @Override public String getDescricao(){return descricao;} }
