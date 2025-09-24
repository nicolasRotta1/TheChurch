package Categoria;

public enum EfeitoInimigo implements Efeito {

    // Fantasma
    INVISIBILIDADE("DEF", 1.5, "Aumenta a defesa do fantasma, difícil de acertar"),
    SUSTO("VEL", 1.2, "Assusta o alvo, aumentando a chance de esquiva"),

    // Poltergeist
    TELECINESE("ATQ", 1.3, "Ataca objetos à distância, causando dano extra"),
    CAOS("MAG", 1.2, "Confunde o alvo, aumentando o dano mágico"),

    // Vampiro
    SUGA_VIDA("HP", 1.2, "Recupera HP ao atacar o alvo"),
    MORDIDA_VAMPIRICA("ATQ", 1.4, "Causa dano extra contra inimigos vivos"),

    // Bruxo
    MALDICAO("MAG", 1.5, "Reduz magia do alvo a cada turno"),
    CONJURAR_FEITICO("ATQ", 1.3, "Dano mágico aumentado"),

    // Demônio
    FURIA_ABSOLUTA("ATQ", 1.5, "Dano aumentado quando HP está baixo"),
    CHAMA_DO_INFERNO("MAG", 1.6, "Dano mágico em área"),

    // Espírito
    POEIRA_ESPIRITUAL("DEF", 1.3, "Reduz chance do alvo de acertar"),
    LAMENTO("MAG", 1.2, "Dano psicológico reduz defesa do alvo"),

    // Lobisomem
    FORCA_ANIMAL("ATQ", 1.5, "Dano físico aumentado à noite"),
    MORDIDA_RAPIDA("VEL", 1.3, "Aumenta velocidade de ataque"),

    // Anjo Caído
    CORRUPCAO("MAG", 1.4, "Dano mágico aumentado contra humanos"),
    ASAS_NEGRAS("VEL", 1.3, "Aumenta chance de esquiva"),

    // Boneco Amaldiçoado
    MALDICAO_VIVA("ATQ", 1.4, "Dano extra contra jogadores descuidados"),
    TERROR_SILENCIOSO("DEF", 1.2, "Aumenta defesa contra ataques físicos"),

    // Objeto Amaldiçoado
    POSSE("ATQ", 1.3, "Ataca através de objetos próximos"),
    MALDICAO_DURA("DEF", 1.3, "Aumenta defesa contra ataques físicos"),

    // Criatura da Peste
    TOXINA("MAG", 1.4, "Dano contínuo de veneno por turno"),
    EPIDEMIA("VEL", 1.2, "Aumenta velocidade de ataque de criaturas próximas"),

    // Aberração Demoníaca
    HORROR_ABSOLUTO("ATQ", 1.6, "Dano físico extremamente alto"),
    CORRUPCAO_TOTAL("MAG", 1.6, "Dano mágico extremamente alto");

    private final String tag;
    private final double mult;
    private final String desc;

    EfeitoInimigo(String tag, double mult, String desc) {
        this.tag = tag;
        this.mult = mult;
        this.desc = desc;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public double getMultiplicador() {
        return mult;
    }

    @Override
    public String getDescricao() {
        return desc;
    }
}
