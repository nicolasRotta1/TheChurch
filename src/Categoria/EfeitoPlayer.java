package Categoria;

public enum EfeitoPlayer implements Efeito {
    // Buffs
    AUMENTO_ATQ("ATQ", 1.2, "Aumento de ataque"),
    AUMENTO_DEF("DEF", 1.2, "Aumento de defesa"),
    AUMENTO_MAG("MAG", 1.2, "Aumento de magia"),
    AUMENTO_ENERGIA("ENE", 1.3, "Aumento de energia"),
    BUFF_CURA("CURA", 1.5, "Buff de cura"),

    // Debuffs
    REDUCAO_ATQ("ATQ", 0.8, "Redução de ataque"),
    REDUCAO_DEF("DEF", 0.8, "Redução de defesa"),
    REDUCAO_MAG("MAG", 0.8, "Redução de magia"),
    ENFRAQUECIMENTO("HP", 0.9, "Redução de vida máxima");

    private final String tag;
    private final double multiplicador;
    private final String descricao;

    EfeitoPlayer(String tag, double multiplicador, String descricao) {
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
