package Categoria;
public enum EfeitoInimigo implements Efeito{
    INVOCAR_MINIONS("MINIONS",1.0,"Invoca minions"),
    SOMBRA("SOMBRA",1.1,"Poder das sombras");
    private final String tag; private final double mult;

    private final String desc; EfeitoInimigo(String tag,double mult,String d){
        this.tag=tag;
        this.mult=mult;
        this.desc=d;
    }

    @Override public String getTag(){
        return tag;
    }

    @Override public double getMultiplicador(){
        return mult;
    }

    @Override public String getDescricao(){
        return desc;
    }

}
