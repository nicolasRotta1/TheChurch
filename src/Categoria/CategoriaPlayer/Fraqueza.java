package Categoria.CategoriaPlayer;

import Categoria.TipoCriatura;

public enum Fraqueza {
    VULNERAVEL_A_FANTASMAS(TipoCriatura.FANTASMA),
    VULNERAVEL_A_POLTERGEIST(TipoCriatura.POLTERGEIST),
    VULNERAVEL_A_ESPIRITOS(TipoCriatura.ESPIRITO),
    VULNERAVEL_A_VAMPIROS(TipoCriatura.VAMPIRO),
    VULNERAVEL_A_DEMONIOS(TipoCriatura.DEMONIO),
    VULNERAVEL_A_BRUXOS(TipoCriatura.BRUXO),
    VULNERAVEL_A_LOBISOMENS(TipoCriatura.LOBISOMEM),
    VULNERAVEL_A_ANJOS(TipoCriatura.ANJO_CAIDO),
    VULNERAVEL_A_BONECOS(TipoCriatura.BONECO_AMALDICOADO),
    VULNERAVEL_A_OBJETOS(TipoCriatura.OBJETO_AMALDICOADO),
    VULNERAVEL_A_PESTES(TipoCriatura.CRIATURA_DA_PESTE),
    VULNERAVEL_A_ABERRACOES(TipoCriatura.ABERRACAO_DEMONIACA),
    VULNERAVEL_A_ANTICRISTO(TipoCriatura.ANTI_CRISTO);

    private final TipoCriatura tipo;

    Fraqueza(TipoCriatura tipo) {
        this.tipo = tipo;
    }

    public TipoCriatura getTipo() {
        return tipo;
    }
}
