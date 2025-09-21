package Categoria.CategoriaPlayer;

import Categoria.TipoCriatura;

public enum Vantagem {
    CONTRA_FANTASMAS(TipoCriatura.FANTASMA),
    CONTRA_POLTERGEIST(TipoCriatura.POLTERGEIST),
    CONTRA_ESPIRITOS(TipoCriatura.ESPIRITO),
    CONTRA_VAMPIROS(TipoCriatura.VAMPIRO),
    CONTRA_DEMONIOS(TipoCriatura.DEMONIO),
    CONTRA_BRUXOS(TipoCriatura.BRUXO),
    CONTRA_LOBISOMENS(TipoCriatura.LOBISOMEM),
    CONTRA_ANJOS(TipoCriatura.ANJO_CAIDO),
    CONTRA_BONECOS(TipoCriatura.BONECO_AMALDICOADO),
    CONTRA_OBJETOS(TipoCriatura.OBJETO_AMALDICOADO),
    CONTRA_PESTES(TipoCriatura.CRIATURA_DA_PESTE),
    CONTRA_ABERRACOES(TipoCriatura.ABERRACAO_DEMONIACA);

    private final TipoCriatura tipo;

    Vantagem(TipoCriatura tipo) {
        this.tipo = tipo;
    }

    public TipoCriatura getTipo() {
        return tipo;
    }
}
