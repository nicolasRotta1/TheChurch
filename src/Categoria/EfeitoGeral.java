package Categoria;

public enum EfeitoGeral implements Efeito {
    // Fantasmas
    CONTRA_FANTASMAS("FANTASMA", 1.5, "Mais eficaz contra fantasmas"),
    TIPO_FANTASMA("FANTASMA", 1.0, "Tipo Fantasma"),

    // Vampiros
    CONTRA_VAMPIROS("VAMPIRO", 1.5, "Mais eficaz contra vampiros"),
    TIPO_VAMPIRO("VAMPIRO", 1.0, "Tipo Vampiro"),

    // Demônios
    CONTRA_DEMONIOS("DEMONIO", 1.5, "Mais eficaz contra demônios"),
    TIPO_DEMONIO("DEMONIO", 1.0, "Tipo Demônio"),

    // Lobisomens
    CONTRA_LOBISOMENS("LOBISOMEM", 1.5, "Mais eficaz contra lobisomens"),
    TIPO_LOBISOMEM("LOBISOMEM", 1.0, "Tipo Lobisomem"),

    // Bruxas
    CONTRA_BRUXAS("BRUXA", 1.5, "Mais eficaz contra bruxas"),
    TIPO_BRUXA("BRUXA", 1.0, "Tipo Bruxa"),

    // Possuídos
    CONTRA_POSSUIDOS("POSSUIDO", 1.5, "Mais eficaz contra possuídos"),
    TIPO_POSSUIDO("POSSUIDO", 1.0, "Tipo Possuído"),

    // Bonecos amaldiçoados
    CONTRA_BONECOS("BONECO_AMALDICOADO", 1.5, "Mais eficaz contra bonecos amaldiçoados"),
    TIPO_BONECO("BONECO_AMALDICOADO", 1.0, "Tipo Boneco Amaldiçoado"),

    // Objetos amaldiçoados
    CONTRA_OBJETOS("OBJETO_AMALDICOADO", 1.5, "Mais eficaz contra objetos amaldiçoados"),
    TIPO_OBJETO("OBJETO_AMALDICOADO", 1.0, "Tipo Objeto Amaldiçoado"),

    // Anjos caídos
    CONTRA_ANJOS("ANJO_CAIDO", 1.5, "Mais eficaz contra anjos caídos"),
    TIPO_ANJO("ANJO_CAIDO", 1.0, "Tipo Anjo Caído"),

    // Criaturas da peste
    CONTRA_PESTES("CRiATURA_DA_PESTE", 1.5, "Mais eficaz contra criaturas da peste"),
    TIPO_PESTE("CRiATURA_DA_PESTE", 1.0, "Tipo Criatura da Peste"),

    // Aberrações demoníacas
    CONTRA_ABERRACOES("ABERRACAO_DEMONIACA", 1.5, "Mais eficaz contra aberrações demoníacas"),
    TIPO_ABERRACAO("ABERRACAO_DEMONIACA", 1.0, "Tipo Aberração Demoníaca"),

    // Resistências gerais
    RESISTENCIA_MALDICAO("MALDICAO", 1.0, "Resistente a maldições");

    private final String tag;
    private final double multiplicador;
    private final String descricao;

    EfeitoGeral(String tag, double multiplicador, String descricao) {
        this.tag = tag;
        this.multiplicador = multiplicador;
        this.descricao = descricao;
    }

    @Override
    public String getTag() { return tag; }

    @Override
    public double getMultiplicador() { return multiplicador; }

    @Override
    public String getDescricao() { return descricao; }
}
