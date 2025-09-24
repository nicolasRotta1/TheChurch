package Habilidades;

import java.util.List;

public class HabilidadesFactoryInimigo {

    // =======================
// FANTASMA
// =======================
    public static final Habilidade TOQUE_ESPECTRAL = new HabilidadeDeDanoFisico("Toque Espectral", TipoHabilidade.PRIMARIA, 1.2, "Dano físico fantasmagórico");
    public static final Habilidade INVESTIDA_SOMBRA = new HabilidadeDeDanoFisico("Investida Sombria", TipoHabilidade.PRIMARIA, 1.3, "Ataque físico espectral rápido");
    public static final Habilidade RAIO_FANTASMA = new HabilidadeDeDanoMagico("Raio Fantasma", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico espiritual");
    public static final Habilidade ESPECTRO_ABISSAL = new HabilidadeDeDanoMagico("Espectro Abissal", TipoHabilidade.ESPECIAL, 1.5, "Dano mágico poderoso do além");
    public static final Habilidade CURA_FANTASMAL = new HabilidadeDeCura("Cura Fantasmal", TipoHabilidade.CURA, 1.2, "Restaura HP do fantasma");
    public static final Habilidade REGENERACAO_ETEREA = new HabilidadeDeCura("Regeneração Etérea", TipoHabilidade.CURA, 1.3, "Cura gradual baseada na energia espiritual");
    public static final Habilidade DESORIENTACAO_FANTASMAL = new HabilidadeDeDebuff("Desorientação Fantasmal", List.of("defesa","ataque"), 5, "Reduz velocidade e ataque do alvo");
    public static final Habilidade FANTASMA_ASSOMBRADOR = new HabilidadeDeDebuff("Fantasma Assombrador", List.of("defesa","magia"), 5, "Reduz defesa e magia do inimigo");
    public static final Habilidade SOMBRAS_PROTETORAS = new HabilidadeDeBuff("Sombras Protetoras", List.of("defesa"), 5, "Aumenta defesa de fantasmas");
    public static final Habilidade AURA_ESPECTRAL = new HabilidadeDeBuff("Aura Espectral", List.of("ataque","magia"), 5, "Aumenta ataque e magia de fantasmas");

    // =======================
// POLTERGEIST
// =======================
    public static final Habilidade ARREMESSO_OBS = new HabilidadeDeDanoFisico("Arremesso Objeto", TipoHabilidade.PRIMARIA, 1.3, "Dano físico com objetos telecinéticos");
    public static final Habilidade IMPACTO_SOMBRA = new HabilidadeDeDanoFisico("Impacto Sombrio", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico causado por energia fantasma");
    public static final Habilidade GRITO_ASSOMBROSO = new HabilidadeDeDanoMagico("Grito Assombroso", TipoHabilidade.PRIMARIA, 1.2, "Dano mágico que assusta o inimigo");
    public static final Habilidade RAIO_PARANORMAL = new HabilidadeDeDanoMagico("Raio Paranormal", TipoHabilidade.ESPECIAL, 1.5, "Dano mágico intenso");
    public static final Habilidade CURA_POLTERGEIST = new HabilidadeDeCura("Cura Poltergeist", TipoHabilidade.CURA, 1.2, "Restaura HP do poltergeist");
    public static final Habilidade REGENERACAO_TERROR = new HabilidadeDeCura("Regeneração do Terror", TipoHabilidade.CURA, 1.3, "Cura gradual baseada na energia de medo");
    public static final Habilidade CONFUSAO_POLTERGEIST = new HabilidadeDeDebuff("Confusão", List.of("ataque","defesa"), 5, "Reduz ataque e defesa do inimigo");
    public static final Habilidade TERROR_POLTERGEIST = new HabilidadeDeDebuff("Terror Poltergeist", List.of("defesa"), 5, "Reduz velocidade inimiga");
    public static final Habilidade PROTECAO_POLTERGEIST = new HabilidadeDeBuff("Proteção Poltergeist", List.of("defesa"), 5, "Aumenta defesa de poltergeists");
    public static final Habilidade FORCA_POLTERGEIST = new HabilidadeDeBuff("Força Poltergeist", List.of("ataque","magia"), 5, "Aumenta ataque e magia de poltergeists");

    // =======================
// VAMPIRO
// =======================
    public static final Habilidade MORDIDA_VAMPIRICA = new HabilidadeDeDanoFisico("Mordida Vampírica", TipoHabilidade.PRIMARIA, 1.5, "Rouba HP do alvo");
    public static final Habilidade GARRA_SANGUINARIA = new HabilidadeDeDanoFisico("Garrrra Sanguinária", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico rápido que drena energia");
    public static final Habilidade SUGA_ALMA = new HabilidadeDeDanoMagico("Suga Alma", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico que rouba energia vital");
    public static final Habilidade CORRUPCAO_SANGUINARIA = new HabilidadeDeDanoMagico("Corrupção Sanguinária", TipoHabilidade.ESPECIAL, 1.6, "Dano mágico e enfraquecimento do inimigo");
    public static final Habilidade REGENERACAO_VAMPIRICA = new HabilidadeDeCura("Regeneração Vampírica", TipoHabilidade.CURA, 1.2, "Cura baseada no HP perdido");
    public static final Habilidade FOME_ETERNAL = new HabilidadeDeCura("Fome Eterna", TipoHabilidade.CURA, 1.3, "Cura baseada na energia drenada dos inimigos");
    public static final Habilidade AURA_TERROR_VAMPIRICO = new HabilidadeDeBuff("Aura de Terror", List.of("ataque","defesa"), 5, "Aumenta ataque e defesa de vampiros próximos");
    public static final Habilidade SANGUE_SOMBRIO = new HabilidadeDeBuff("Sangue Sombrio", List.of("ataque","magia"), 5, "Aumenta ataque e magia de vampiros");
    public static final Habilidade MEDO_VAMPIRICO = new HabilidadeDeDebuff("Medo Vampírico", List.of("ataque"), 5, "Reduz ataque inimigo");
    public static final Habilidade MALDICAO_VAMPIRICA = new HabilidadeDeDebuff("Maldição Vampírica", List.of("magia","defesa"), 5, "Reduz magia e defesa inimiga");

    // =======================
// BRUXO
// =======================
    public static final Habilidade MALDICAO_ARCANICA = new HabilidadeDeDanoMagico("Maldição Arcânica", TipoHabilidade.PRIMARIA, 1.4, "Dano mágico arcano");
    public static final Habilidade INVOCACAO_SOMBRA = new HabilidadeDeDanoFisico("Invocação Sombria", TipoHabilidade.ESPECIAL, 1.8, "Ataque físico com criaturas sombrias");
    public static final Habilidade RAIO_ARCANICO = new HabilidadeDeDanoMagico("Raio Arcânico", TipoHabilidade.ESPECIAL, 1.6, "Dano mágico intenso com energia arcana");
    public static final Habilidade GOLPE_ARCANICO = new HabilidadeDeDanoFisico("Golpe Arcânico", TipoHabilidade.PRIMARIA, 1.5, "Ataque físico mágico do bruxo");
    public static final Habilidade CURA_ARCANICA = new HabilidadeDeCura("Cura Arcânica", TipoHabilidade.CURA, 1.2, "Restaura HP do bruxo com magia");
    public static final Habilidade REGENERACAO_ARCANICA = new HabilidadeDeCura("Regeneração Arcânica", TipoHabilidade.CURA, 1.3, "Cura gradual de HP com energia arcana");
    public static final Habilidade PROTECAO_ARCANICA = new HabilidadeDeBuff("Proteção Arcânica", List.of("defesa","magia"), 5, "Aumenta defesa e magia do bruxo");
    public static final Habilidade ENERGIA_ARCANICA = new HabilidadeDeBuff("Energia Arcânica", List.of("magia","ataque"), 5, "Aumenta magia e ataque do bruxo");
    public static final Habilidade CURSE_WEAKNESS = new HabilidadeDeDebuff("Maldição da Fraqueza", List.of("ataque","defesa"), 5, "Reduz ataque e defesa do inimigo");
    public static final Habilidade HEX_ARCANICO = new HabilidadeDeDebuff("Hex Arcânico", List.of("defesa","magia"), 5, "Reduz velocidade e magia do inimigo");

    // =======================
// DEMÔNIO
// =======================
    public static final Habilidade CHAMA_DO_INFERNO = new HabilidadeDeDanoMagico("Chama do Inferno", TipoHabilidade.ESPECIAL, 2.0, "Dano mágico em área de fogo infernal");
    public static final Habilidade GOLPE_ABISSAL = new HabilidadeDeDanoFisico("Golpe Abissal", TipoHabilidade.ESPECIAL, 2.0, "Ataque físico poderoso");
    public static final Habilidade LAMINA_DO_ABISMO = new HabilidadeDeDanoFisico("Lâmina do Abismo", TipoHabilidade.PRIMARIA, 1.6, "Ataque físico afiado");
    public static final Habilidade RAIOS_DO_INFERNO = new HabilidadeDeDanoMagico("Raios do Inferno", TipoHabilidade.PRIMARIA, 1.7, "Dano mágico com energia demoníaca");
    public static final Habilidade REGEN_DEMONIACA = new HabilidadeDeCura("Regeneração Demoníaca", TipoHabilidade.CURA, 1.3, "Cura do HP do demônio com energia maligna");
    public static final Habilidade ABSORVER_ENERGIA = new HabilidadeDeCura("Absorver Energia", TipoHabilidade.CURA, 1.4, "Cura baseada no dano causado");
    public static final Habilidade FURIA_DEMONIACA = new HabilidadeDeBuff("Fúria Demoníaca", List.of("ataque"), 5, "Aumenta ataque do demônio");
    public static final Habilidade TERROR_ABISSAL = new HabilidadeDeBuff("Terror Abissal", List.of("ataque", "defesa"), 5, "Aumenta ataque e velocidade do demônio");
    public static final Habilidade INTIMIDACAO_DEMONIACA = new HabilidadeDeDebuff("Intimidação Demoníaca", List.of("magia"), 5, "Reduz magia inimiga");
    public static final Habilidade MALDICAO_DO_INFERNO = new HabilidadeDeDebuff("Maldição do Inferno", List.of("ataque","defesa"), 5, "Reduz ataque e defesa do inimigo");

    // =======================
// ESPÍRITO
// =======================
    public static final Habilidade TOQUE_ESPIRITUAL = new HabilidadeDeDanoFisico("Toque Espiritual", TipoHabilidade.PRIMARIA, 1.2, "Dano físico espiritual");
    public static final Habilidade INVESTIDA_ESPIRITUAL = new HabilidadeDeDanoFisico("Investida Espiritual", TipoHabilidade.PRIMARIA, 1.3, "Ataque físico fantasmagórico");
    public static final Habilidade RAIO_ESPIRITUAL = new HabilidadeDeDanoMagico("Raio Espiritual", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico espiritual");
    public static final Habilidade CHOQUE_ESPIRITUAL = new HabilidadeDeDanoMagico("Choque Espiritual", TipoHabilidade.ESPECIAL, 1.6, "Dano mágico poderoso de espírito");
    public static final Habilidade CURA_ESPIRITUAL = new HabilidadeDeCura("Cura Espiritual", TipoHabilidade.CURA, 1.2, "Cura HP com energia espiritual");
    public static final Habilidade REGEN_ESPIRITUAL = new HabilidadeDeCura("Regeneração Espiritual", TipoHabilidade.CURA, 1.3, "Cura gradual do espírito");
    public static final Habilidade ESCUDO_ESPIRITUAL = new HabilidadeDeBuff("Escudo Espiritual", List.of("defesa"), 5, "Aumenta defesa do espírito");
    public static final Habilidade AURA_ESPIRITUAL = new HabilidadeDeBuff("Aura Espiritual", List.of("ataque","magia"), 5, "Aumenta ataque e magia do espírito");
    public static final Habilidade CONFUSAO_ESPIRITUAL = new HabilidadeDeDebuff("Confusão Espiritual", List.of("defesa","ataque"), 5, "Reduz velocidade e ataque inimigo");
    public static final Habilidade TERROR_ESPIRITUAL = new HabilidadeDeDebuff("Terror Espiritual", List.of("defesa","magia"), 5, "Reduz defesa e magia do inimigo");

    // =======================
// LOBISOMEM
// =======================
    public static final Habilidade INVESTIDA_LOBISOMEM = new HabilidadeDeDanoFisico("Investida Lupina", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico rápido");
    public static final Habilidade GARRA_FEROZ = new HabilidadeDeDanoFisico("Garra Feroz", TipoHabilidade.PRIMARIA, 1.5, "Ataque físico brutal");
    public static final Habilidade UIVO_MAGICO = new HabilidadeDeDanoMagico("Uivo Mágico", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico que assusta inimigos");
    public static final Habilidade RONCO_ARCANO = new HabilidadeDeDanoMagico("Ronco Arcano", TipoHabilidade.ESPECIAL, 1.6, "Dano mágico poderoso");
    public static final Habilidade CURA_LOBISOMEM = new HabilidadeDeCura("Cura Lupina", TipoHabilidade.CURA, 1.2, "Cura HP com energia bestial");
    public static final Habilidade REGENERACAO_LOBISOMEM = new HabilidadeDeCura("Regeneração Lupina", TipoHabilidade.CURA, 1.3, "Cura gradual baseada na fúria");
    public static final Habilidade RAIVA_LOBISOMEM = new HabilidadeDeBuff("Raiva Lupina", List.of("ataque","defesa"), 5, "Aumenta ataque e velocidade");
    public static final Habilidade RESISTENCIA_LOBISOMEM = new HabilidadeDeBuff("Resistência Lupina", List.of("defesa","HP"), 5, "Aumenta defesa e HP");
    public static final Habilidade MEDO_LUPINO = new HabilidadeDeDebuff("Medo Lupino", List.of("defesa"), 5, "Reduz defesa do alvo");
    public static final Habilidade TERROR_LOPINO = new HabilidadeDeDebuff("Terror Lupino", List.of("ataque","magia"), 5, "Reduz ataque e magia inimiga");

    // =======================
// ANJO_CAÍDO
// =======================
    public static final Habilidade LUZ_CORRUPTA = new HabilidadeDeDanoMagico("Luz Corrupta", TipoHabilidade.PRIMARIA, 1.5, "Dano mágico corrompido");
    public static final Habilidade GOLPE_AEREO = new HabilidadeDeDanoFisico("Golpe Aéreo", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico devastador");
    public static final Habilidade MALDICAO_CELESTIAL = new HabilidadeDeDebuff("Maldição Celestial", List.of("ataque","magia"), 5, "Reduz ataque e magia do inimigo");
    public static final Habilidade DESOLACAO = new HabilidadeDeDebuff("Desolação", List.of("defesa","ataque"), 5, "Reduz defesa e ataque do inimigo");
    public static final Habilidade BENCAO_MALDITA = new HabilidadeDeBuff("Bênção Maldita", List.of("ataque","magia"), 5, "Aumenta ataque e magia do Anjo Caído");
    public static final Habilidade PROTECAO_SOMBRA = new HabilidadeDeBuff("Proteção Sombria", List.of("defesa","ataque"), 5, "Aumenta defesa e o ataque");
    public static final Habilidade CURA_CELSTIAL = new HabilidadeDeCura("Cura Celestial", TipoHabilidade.CURA, 1.3, "Cura HP do Anjo Caído");
    public static final Habilidade REGENERACAO_CORRUPTA = new HabilidadeDeCura("Regeneração Corrupta", TipoHabilidade.CURA, 1.4, "Cura gradual com energia corrompida");

    // =======================
// BONECO_AMALDIÇOADO
// =======================
    public static final Habilidade PICADA_MALDITA = new HabilidadeDeDanoFisico("Picada Maldita", TipoHabilidade.PRIMARIA, 1.2, "Ataque físico do boneco");
    public static final Habilidade CORTE_FANTASMAL = new HabilidadeDeDanoFisico("Corte Fantasmal", TipoHabilidade.PRIMARIA, 1.3, "Dano físico espectral");
    public static final Habilidade ASSOMBRACAO = new HabilidadeDeDanoMagico("Assombração", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico fantasmagórico");
    public static final Habilidade RAIO_MALDITO = new HabilidadeDeDanoMagico("Raio Maldito", TipoHabilidade.ESPECIAL, 1.6, "Dano mágico intenso");
    public static final Habilidade CURA_MALDITA = new HabilidadeDeCura("Cura Maldita", TipoHabilidade.CURA, 1.2, "Cura HP do boneco amaldiçoado");
    public static final Habilidade REGENERACAO_MALDITA = new HabilidadeDeCura("Regeneração Maldita", TipoHabilidade.CURA, 1.3, "Cura gradual baseada em maldição");
    public static final Habilidade AURA_MALDITA = new HabilidadeDeBuff("Aura Maldita", List.of("ataque","defesa"), 5, "Aumenta ataque e defesa aliados próximos");
    public static final Habilidade ESCUDO_MALDITO = new HabilidadeDeBuff("Escudo Maldito", List.of("defesa","HP"), 5, "Aumenta defesa e HP do boneco");
    public static final Habilidade DESORIENTACAO_BONECO = new HabilidadeDeDebuff("Desorientação", List.of("velocidade","ataque"), 5, "Reduz velocidade e ataque inimigo");
    public static final Habilidade TERROR_BONECO = new HabilidadeDeDebuff("Terror do Boneco", List.of("defesa","magia"), 5, "Reduz defesa e magia inimiga");

    // =======================
// OBJETO_AMALDIÇOADO
// =======================
    public static final Habilidade EXPLOSAO_OBJETO = new HabilidadeDeDanoFisico("Explosão do Objeto", TipoHabilidade.PRIMARIA, 1.4, "Dano físico com objeto");
    public static final Habilidade LÂMINA_FANTASMA = new HabilidadeDeDanoFisico("Lâmina Fantasma", TipoHabilidade.PRIMARIA, 1.3, "Dano físico espectral");
    public static final Habilidade MALDICAO_OBJETO = new HabilidadeDeDanoMagico("Maldição do Objeto", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico de objeto amaldiçoado");
    public static final Habilidade RAIO_OBJETO = new HabilidadeDeDanoMagico("Raio do Objeto", TipoHabilidade.ESPECIAL, 1.6, "Dano mágico intenso");
    public static final Habilidade CURA_OBJETO = new HabilidadeDeCura("Cura Objeto", TipoHabilidade.CURA, 1.2, "Cura HP do objeto amaldiçoado");
    public static final Habilidade REGENERACAO_OBJETO = new HabilidadeDeCura("Regeneração Objeto", TipoHabilidade.CURA, 1.3, "Cura gradual com energia amaldiçoada");
    public static final Habilidade ESCUDO_OBJETO = new HabilidadeDeBuff("Escudo do Objeto", List.of("defesa","HP"), 5, "Aumenta defesa e HP do objeto");
    public static final Habilidade AURA_OBJETO = new HabilidadeDeBuff("Aura do Objeto", List.of("ataque","magia"), 5, "Aumenta ataque e magia aliados");
    public static final Habilidade DESORIENTACAO_OBJETO = new HabilidadeDeDebuff("Desorientação", List.of("velocidade","ataque"), 5, "Reduz velocidade e ataque inimigo");
    public static final Habilidade MEDO_OBJETO = new HabilidadeDeDebuff("Medo do Objeto", List.of("defesa","magia"), 5, "Reduz defesa e magia inimiga");

    // =======================
// CRIATURA_DA_PESTE
// =======================
    public static final Habilidade VENENO_PESTE = new HabilidadeDeDanoFisico("Veneno da Peste", TipoHabilidade.PRIMARIA, 1.3, "Dano físico com veneno");
    public static final Habilidade GOLPE_PESTE = new HabilidadeDeDanoFisico("Golpe Pestilento", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico devastador");
    public static final Habilidade PESTE_MALDITA = new HabilidadeDeDanoMagico("Praga Maldita", TipoHabilidade.ESPECIAL, 1.5, "Dano mágico com peste");
    public static final Habilidade DOENCA_MAGICA = new HabilidadeDeDanoMagico("Doença Mágica", TipoHabilidade.PRIMARIA, 1.3, "Dano mágico debilitante");
    public static final Habilidade CURA_PESTE = new HabilidadeDeCura("Cura da Peste", TipoHabilidade.CURA, 1.2, "Cura HP da criatura da peste");
    public static final Habilidade REGENERACAO_PESTE = new HabilidadeDeCura("Regeneração Pestilenta", TipoHabilidade.CURA, 1.3, "Cura gradual com energia da peste");
    public static final Habilidade ESCUDO_PESTE = new HabilidadeDeBuff("Escudo Pestilento", List.of("defesa","HP"), 5, "Aumenta defesa e HP");
    public static final Habilidade AURA_PESTE = new HabilidadeDeBuff("Aura Pestilenta", List.of("ataque","velocidade"), 5, "Aumenta ataque e velocidade aliados");
    public static final Habilidade MALDICAO_PESTE = new HabilidadeDeDebuff("Maldição da Peste", List.of("defesa","magia"), 5, "Reduz defesa e magia inimiga");
    public static final Habilidade DOENCA_PESTE = new HabilidadeDeDebuff("Doença da Peste", List.of("velocidade","ataque"), 5, "Reduz velocidade e ataque inimigo");

    // =======================
// ABERRAÇÃO_DEMONÍACA
// =======================
    public static final Habilidade DESTRUIDOR_ABERRACAO = new HabilidadeDeDanoFisico("Destruidor Demoníaco", TipoHabilidade.ESPECIAL, 2.0, "Ataque físico poderoso");
    public static final Habilidade GOLPE_CORRUPTO = new HabilidadeDeDanoFisico("Golpe Corrupto", TipoHabilidade.PRIMARIA, 1.6, "Ataque físico com energia demoníaca");
    public static final Habilidade CORRUPCAO_ABERRACAO = new HabilidadeDeDanoMagico("Corrupção Demoníaca", TipoHabilidade.ESPECIAL, 2.0, "Dano mágico massivo");
    public static final Habilidade RAIO_ABERRACAO = new HabilidadeDeDanoMagico("Raio Corrupto", TipoHabilidade.PRIMARIA, 1.5, "Dano mágico intenso");
    public static final Habilidade CURA_ABERRACAO = new HabilidadeDeCura("Cura da Aberração", TipoHabilidade.CURA, 1.3, "Cura HP da aberração demoníaca");
    public static final Habilidade REGENERACAO_ABERRACAO = new HabilidadeDeCura("Regeneração da Aberração", TipoHabilidade.CURA, 1.4, "Cura gradual baseada em corrupção");
    public static final Habilidade FURIA_ABERRACAO = new HabilidadeDeBuff("Fúria da Aberração", List.of("ataque","velocidade"), 5, "Aumenta ataque e velocidade");
    public static final Habilidade ESCUDO_ABERRACAO = new HabilidadeDeBuff("Escudo da Aberração", List.of("defesa","HP"), 5, "Aumenta defesa e HP");
    public static final Habilidade TERROR_ABERRACAO = new HabilidadeDeDebuff("Terror Demoníaco", List.of("ataque","defesa","magia"), 5, "Reduz todos os atributos inimigos");
    public static final Habilidade CORRUPCAO_ABERRACAO_DEB = new HabilidadeDeDebuff("Corrupção Maligna", List.of("ataque","magia"), 5, "Reduz ataque e magia inimiga");


    // =======================
// ANTICRISTO (BOSS FINAL)
// =======================

    // =======================
// Dano Físico
// =======================
    public static final Habilidade GOLPE_DO_CAOS = new HabilidadeDeDanoFisico(
            "Golpe do Caos",
            TipoHabilidade.ESPECIAL,
            2.5,
            "Ataque físico devastador que causa grande dano e ignora parte da defesa inimiga"
    );

    public static final Habilidade ESPADA_DA_DECADENCIA = new HabilidadeDeDanoFisico(
            "Espada da Decadência",
            TipoHabilidade.ESPECIAL,
            2.8,
            "Golpe físico massivo que corrói a energia vital do inimigo"
    );

    // =======================
// Dano Mágico
// =======================
    public static final Habilidade RAIO_APOCALIPTICO = new HabilidadeDeDanoMagico(
            "Raio Apocalíptico",
            TipoHabilidade.ESPECIAL,
            3.0,
            "Dano mágico massivo em área, causa grande destruição e reduz resistência mágica inimiga"
    );

    public static final Habilidade CORRUPCAO_ABSOLUTA = new HabilidadeDeDanoMagico(
            "Corrupção Absoluta",
            TipoHabilidade.ESPECIAL,
            2.7,
            "Dano mágico direto com efeito de drenagem de HP e energia do inimigo"
    );

    // =======================
// Buff
// =======================
    public static final Habilidade AURA_DO_TERROR = new HabilidadeDeBuff(
            "Aura do Terror",
            List.of("ataque","defesa","magia","velocidade","energia"),
            10,
            "Aumenta todos os atributos do Anticristo por 3 turnos, espalhando medo nos inimigos"
    );

    public static final Habilidade FORCA_DO_ABISMO = new HabilidadeDeBuff(
            "Força do Abismo",
            List.of("ataque","magia","velocidade"),
            10,
            "Aumenta ataque, magia e velocidade drasticamente, preparando um ataque devastador"
    );

    // =======================
// Debuff
// =======================
    public static final Habilidade MALDICAO_DO_APOCALIPSE = new HabilidadeDeDebuff(
            "Maldição do Apocalipse",
            List.of("ataque","defesa","magia","velocidade"),
            10,
            "Reduz todos os atributos dos inimigos, deixando-os vulneráveis"
    );

    public static final Habilidade DESOLACAO_FINAL = new HabilidadeDeDebuff(
            "Desolação Final",
            List.of("defesa","energia"),
            10,
            "Reduz defesa e HP de todos os inimigos, causando pânico e perda de energia"
    );

    // =======================
// Cura
// =======================
    public static final Habilidade REGENERACAO_ABSOLUTA = new HabilidadeDeCura(
            "Regeneração Absoluta",
            TipoHabilidade.CURA,
            2.5,
            "Cura massiva do Anticristo, recuperando grande parte do HP perdido"
    );

    public static final Habilidade SUCÇÃO_VITAL = new HabilidadeDeCura(
            "Sucção Vital",
            TipoHabilidade.CURA,
            2.0,
            "Cura absorvendo a energia vital dos inimigos, restaurando HP e energia"
    );

}
