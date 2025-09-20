package Categoria;
public enum EfeitoGeral implements Efeito {
    CONTRA_FANTASMAS("FANTASMA",1.5,"Mais eficaz contra fantasmas"),
    CONTRA_VAMPIROS("VAMPIRO",1.5,"Mais eficaz contra vampiros"),
    CONTRA_DEMONIOS("DEMONIO",1.5,"Mais eficaz contra demônios"),
    TIPO_FANTASMA("FANTASMA",1.0,"Tipo Fantasma"),
    TIPO_VAMPIRO("VAMPIRO",1.0,"Tipo Vampiro"),
    TIPO_DEMONIO("DEMONIO",1.0,"Tipo Demônio"),
    RESISTENCIA_MALDICAO("MALDICAO",1.0,"Resistente a maldições");

    private final String tag; private final double multiplicador;
    private final String descricao;

    EfeitoGeral(String tag,double multiplicador,String descricao){
        this.tag=tag;
        this.multiplicador=multiplicador;
        this.descricao=descricao;
    }

    @Override public String getTag(){return tag;}
    @Override public double getMultiplicador(){return multiplicador;}
    @Override public String getDescricao(){return descricao;}
}
