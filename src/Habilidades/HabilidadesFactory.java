package Habilidades;

import java.util.List;

public class HabilidadesFactory {

    // =======================
    // Habilidades de dano físico
    // =======================
    public static final Habilidade ATAQUE_BASICO = new HabilidadeDeDanoFísico(
            "Ataque Básico",
            TipoHabilidade.PRIMARIA,
            1.0,
            "Ataque físico normal usando ataque do personagem"
    );

    public static final Habilidade GOLPE_FORTE = new HabilidadeDeDanoFísico(
            "Golpe Forte",
            TipoHabilidade.ESPECIAL,
            1.5,
            "Golpe físico poderoso"
    );

    // =======================
    // Habilidades de dano mágico
    // =======================
    public static final Habilidade BOLA_DE_FOGO = new HabilidadeDeDanoMagico(
            "Bola de Fogo",
            TipoHabilidade.ESPECIAL,
            1.5,
            "Ataque mágico baseado em magia"
    );

    // =======================
    // Habilidades de cura
    // =======================
    public static final Habilidade CURA_LEVE = new HabilidadeDeCura(
            "Cura Leve",
            TipoHabilidade.CURA,
            0.8,
            "Cura pequena baseada em magia"
    );

    public static final Habilidade CURA_FORTE = new HabilidadeDeCura(
            "Cura Forte",
            TipoHabilidade.CURA,
            1.5,
            "Cura grande baseada em magia"
    );

    // =======================
    // Habilidades de buff
    // =======================
    public static final Habilidade BUFF_ATAQUE = new HabilidadeDeBuff(
            "Força Divina",
            "ataque",
            5,
            "Aumenta ataque do alvo temporariamente"
    );

    public static final Habilidade BUFF_DEFESA = new HabilidadeDeBuff(
            "Pele de Pedra",
            "defesa",
            5,
            "Aumenta defesa do alvo temporariamente"
    );

    // =======================
    // Habilidades de debuff
    // =======================
    public static final Habilidade DEBUFF_ATAQUE = new HabilidadeDeDebuff(
            "Fraqueza",
            "ataque",
            3,
            "Reduz ataque do alvo temporariamente"
    );

    public static final Habilidade DEBUFF_VELOCIDADE = new HabilidadeDeDebuff(
            "Lentidão",
            "velocidade",
            2,
            "Reduz velocidade do alvo temporariamente"
    );

    // =======================
    // Listas de habilidades
    // =======================
    public static List<Habilidade> getBasicas() {
        return List.of(ATAQUE_BASICO, CURA_LEVE, BUFF_ATAQUE, DEBUFF_ATAQUE);
    }

    public static List<Habilidade> getEspeciais() {
        return List.of(GOLPE_FORTE, BOLA_DE_FOGO, CURA_FORTE, BUFF_DEFESA, DEBUFF_VELOCIDADE);
    }
}
