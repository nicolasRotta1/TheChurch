package Habilidades;

import java.util.List;

public class HabilidadesFactory {

    // =======================
    // Habilidades de dano físico
    // =======================
    public static final Habilidade CAJADO_SAGRADO = new HabilidadeDeDanoMagico("Cajado Sagrado", TipoHabilidade.PRIMARIA, 1.0, "Dano mágico com fé inicial");
    public static final Habilidade EXORCISMO_LEVE = new HabilidadeDeDanoMagico("Exorcismo Leve", TipoHabilidade.PRIMARIA, 1.2, "Dano mágico a fantasmas");
    public static final Habilidade BALA_SAGRADA = new HabilidadeDeDanoFisico("Bala Sagrada", TipoHabilidade.PRIMARIA, 1.3, "Dano físico contra demônios e vampiros");
    public static final Habilidade GOLPE_SAGRADO = new HabilidadeDeDanoFisico("Golpe Sagrado", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico abençoado");
    public static final Habilidade TIRO_SAGRADO = new HabilidadeDeDanoFisico("Tiro Sagrado", TipoHabilidade.PRIMARIA, 1.5, "Ataque físico com energia sagrada");
    public static final Habilidade MARTEL_SAGRADO = new HabilidadeDeDanoFisico("Martelo Sagrado", TipoHabilidade.PRIMARIA, 1.6, "Ataque físico pesado");
    public static final Habilidade CHICOTE_SAGRADO = new HabilidadeDeDanoFisico("Chicote Sagrado", TipoHabilidade.PRIMARIA, 1.2, "Ataque físico leve do clérigo");
    public static final Habilidade ATAQUE_CELESTIAL = new HabilidadeDeDanoFisico("Ataque Celestial", TipoHabilidade.PRIMARIA, 1.3, "Golpe físico com bênção divina");
    public static final Habilidade TIRO_SOMBRA = new HabilidadeDeDanoFisico("Tiro Sombrio", TipoHabilidade.PRIMARIA, 1.3, "Ataque físico com sombras");
    public static final Habilidade INVESTIDA_DIVINA = new HabilidadeDeDanoFisico("Investida Divina", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico com força divina");
    public static final Habilidade MARTEL_JUSTICA = new HabilidadeDeDanoFisico("Martelo da Justiça", TipoHabilidade.PRIMARIA, 1.5, "Golpe físico sagrado");
    public static final Habilidade GOLPE_CELESTIAL = new HabilidadeDeDanoFisico("Golpe Celestial", TipoHabilidade.ESPECIAL, 2.0, "Ataque físico e mágico poderoso");
    public static final Habilidade INVESTIGAR_VULNERABILIDADE = new HabilidadeDeDanoFisico("Investigar Vulnerabilidade", TipoHabilidade.PRIMARIA, 1.0, "Ataque físico leve, revela fraquezas");
    public static final Habilidade ARMADILHA_PARANORMAL = new HabilidadeDeDanoFisico("Armadilha Paranormal", TipoHabilidade.PRIMARIA, 1.2, "Armadilha física");
    public static final Habilidade RAIOS_TECNOLOGICOS = new HabilidadeDeDanoFisico("Raios Tecnológicos", TipoHabilidade.ESPECIAL, 1.5, "Ataque físico e mágico tecnológico");
    public static final Habilidade GOLPE_ESTRATEGICO = new HabilidadeDeDanoFisico("Golpe Estratégico", TipoHabilidade.PRIMARIA, 1.4, "Ataque físico com estratégia");
    public static final Habilidade EXORCISMO_AVANCADO = new HabilidadeDeDanoMagico(
            "Exorcismo Avançado",
            TipoHabilidade.ESPECIAL,
            2.0,
            "Exorcismo poderoso que causa dano mágico aumentado"
    );

    // =======================
    // Habilidades de dano mágico
    // =======================
    public static final Habilidade EXORCISMO_SUPREMO = new HabilidadeDeDanoMagico("Exorcismo Supremo", TipoHabilidade.ESPECIAL, 2.0, "Exorcismo poderoso");
    public static final Habilidade LUZ_PURIFICADORA = new HabilidadeDeDanoMagico("Luz Purificadora", TipoHabilidade.PRIMARIA, 1.5, "Dano mágico contra mortos-vivos");
    public static final Habilidade JUÍZO_FINAL = new HabilidadeDeDanoMagico("Juízo Final", TipoHabilidade.ESPECIAL, 2.5, "Dano mágico massivo");
    public static final Habilidade APOCALIPSE_SAGRADO = new HabilidadeDeDanoMagico("Apocalipse Sagrado", TipoHabilidade.ESPECIAL, 3.0, "Dano mágico massivo em área");

    // =======================
    // Habilidades de cura
    // =======================
    public static final Habilidade PEQUENA_BENCAO = new HabilidadeDeCura("Pequena Benção", TipoHabilidade.CURA, 1.0, "Cura pequena");
    public static final Habilidade BENCAO = new HabilidadeDeCura("Benção", TipoHabilidade.CURA, 1.2, "Cura média");
    public static final Habilidade GRANDE_CURA = new HabilidadeDeCura("Grande Cura", TipoHabilidade.CURA, 1.5, "Cura poderosa");
    public static final Habilidade CURA_SUPREMA = new HabilidadeDeCura("Cura Suprema", TipoHabilidade.CURA, 2.0, "Cura máxima");
    public static final Habilidade CURA_CONTINUA = new HabilidadeDeCura("Cura Contínua", TipoHabilidade.CURA, 0.5, "Cura por turno");

    // =======================
// Habilidades de buff
// =======================
    public static final Habilidade FE_INICIAL = new HabilidadeDeBuff("Fé Inicial", List.of("magia"), 5, "Aumenta magia");
    public static final Habilidade AURA_PROTETORA = new HabilidadeDeBuff("Aura Protetora", List.of("defesa"), 5, "Aumenta defesa");
    public static final Habilidade VIGOR_CACADOR = new HabilidadeDeBuff("Vigor Caçador", List.of("velocidade"), 5, "Aumenta velocidade");
    public static final Habilidade AURA_SAGRADA = new HabilidadeDeBuff("Aura Sagrada", List.of("defesa"), 5, "Aumenta defesa");
    public static final Habilidade FORCA_ESPIRITUAL = new HabilidadeDeBuff("Força Espiritual", List.of("magia"), 5, "Aumenta magia");
    public static final Habilidade FORCA_DIVINA = new HabilidadeDeBuff("Força Divina", List.of("ataque"), 5, "Aumenta ataque");
    public static final Habilidade RESISTENCIA_SAGRADA = new HabilidadeDeBuff("Resistência Sagrada", List.of("energia"), 10, "Aumenta HP");
    public static final Habilidade AURA_SUPREMA = new HabilidadeDeBuff("Aura Suprema", List.of("ataque","defesa","magia","velocidade","energia"), 5, "Aumenta todos os atributos aliados");
    public static final Habilidade ESCUDO_DIVINO = new HabilidadeDeBuff("Escudo Divino", List.of("defesa","energia"), 10, "Aumenta defesa e HP");
    public static final Habilidade FURIA_CACADORA = new HabilidadeDeBuff("Fúria Caçadora", List.of("ataque","velocidade"), 5, "Aumenta ataque e velocidade");
    public static final Habilidade VIGOR_SAGRADO = new HabilidadeDeBuff("Vigor Sagrado", List.of("energia","HP"), 10, "Aumenta energia e HP");
    public static final Habilidade PROTECAO_DIVINA = new HabilidadeDeBuff("Proteção Divina", List.of("defesa","energia"), 10, "Aumenta defesa e HP");
    public static final Habilidade TATICA_PERFEITA = new HabilidadeDeBuff("Tática Perfeita", List.of("velocidade"), 5, "Aumenta velocidade");
    public static final Habilidade ASTUCIA = new HabilidadeDeBuff("Astúcia", List.of("velocidade","defesa"), 5, "Aumenta velocidade e defesa");
    public static final Habilidade AGILIDADE_SOMBRAS = new HabilidadeDeBuff("Agilidade das Sombras", List.of("velocidade"), 5, "Aumenta velocidade");
    public static final Habilidade PRECISAO_TECNICA = new HabilidadeDeBuff("Precisão Técnica", List.of("ataque","velocidade"), 5, "Aumenta ataque e velocidade");
    public static final Habilidade RESILIENCIA_OCULTA = new HabilidadeDeBuff("Resiliência Oculta", List.of("energia"), 10, "Aumenta HP");
    public static final Habilidade FORCA_LUZ = new HabilidadeDeBuff("Força da Luz", List.of("ataque"), 5, "Aumenta ataque");
    public static final Habilidade VIGOR_DIVINO = new HabilidadeDeBuff("Vigor Divino", List.of("energia","HP"), 10, "Aumenta HP e energia");
    public static final Habilidade FORTALEZA_SAGRADA = new HabilidadeDeBuff("Fortaleza Sagrada", List.of("defesa","energia"), 10, "Aumenta defesa e HP");
    public static final Habilidade RESISTENCIA = new HabilidadeDeBuff("Resistência", List.of("defesa","magia"), 5, "Aumenta defesa e magia");
    public static final Habilidade ESCUDO_SUPREMO = new HabilidadeDeBuff("Escudo Supremo", List.of("defesa","magia"), 5, "Aumenta defesa e magia");
    public static final Habilidade INSPIRACAO_TEMPLARIA = new HabilidadeDeBuff("Inspiração Templária", List.of("ataque","velocidade"), 5, "Aumenta ataque e velocidade");
    public static final Habilidade AURA_PROTETORA2 = new HabilidadeDeBuff("Aura Protetora", List.of("ataque","defesa","magia","velocidade","energia"), 5, "Protege aliados");
    public static final Habilidade FORCA_GUARDIAO = new HabilidadeDeBuff("Força de Guardião", List.of("defesa","energia"), 10, "Aumenta defesa e HP aliados");
    public static final Habilidade FORCA_SUPREMA = new HabilidadeDeBuff("Força Suprema", List.of("ataque","defesa","magia","velocidade","energia"), 5, "Aumenta todos os atributos");
    public static final Habilidade VELOCIDADE_SUPREMA = new HabilidadeDeBuff("Velocidade Suprema", List.of("velocidade","energia"), 5, "Aumenta velocidade e energia aliados");
    public static final Habilidade AURA_DIVINA = new HabilidadeDeBuff("Aura Divina", List.of("ataque","defesa","magia","velocidade","energia"), 5, "Todos os atributos aliados + cura contínua");
    public static final Habilidade ESCUDO_CELESTIAL = new HabilidadeDeBuff("Escudo Celestial", List.of("defesa","energia"), 10, "Aumenta defesa e HP aliados");
    public static final Habilidade PROTECAO_TOTAL = new HabilidadeDeBuff("Proteção Total", List.of("ataque","defesa","magia","velocidade","energia"), 5, "Buff que aumenta todos os atributos aliados");

    // =======================
// Habilidades de debuff
// =======================
    public static final Habilidade MEDO_FANTASMAL = new HabilidadeDeDebuff("Medo Fantasmal", List.of("ataque"), 5, "Reduz ataque inimigo");
    public static final Habilidade INTIMIDACAO_DEMONIACA = new HabilidadeDeDebuff("Intimidação Demoníaca", List.of("magia"), 5, "Reduz magia inimiga");
    public static final Habilidade MALDICAO_PURIFICADORA = new HabilidadeDeDebuff("Maldição Purificadora", List.of("magia"), 5, "Reduz magia inimiga");
    public static final Habilidade MEDO_DEMONIACO = new HabilidadeDeDebuff("Medo Demoníaco", List.of("ataque"), 5, "Reduz ataque inimigo");
    public static final Habilidade DESMORALIZAR_INIMIGOS = new HabilidadeDeDebuff("Desmoralizar Inimigos", List.of("magia","ataque"), 5, "Reduz magia e ataque inimigo");
    public static final Habilidade MALDICAO_LUZ = new HabilidadeDeDebuff("Maldição da Luz", List.of("ataque"), 5, "Reduz ataque inimigo");
    public static final Habilidade RETALIACAO_SAGRADA = new HabilidadeDeDebuff("Retaliação Sagrada", List.of("velocidade"), 5, "Reduz velocidade inimiga");
    public static final Habilidade PURIFICACAO = new HabilidadeDeDebuff("Purificação", List.of("debuffs"), 5, "Remove debuffs inimigos");
    public static final Habilidade MARCA_INVESTIGADOR = new HabilidadeDeDebuff("Marca do Investigador", List.of("defesa"), 5, "Reduz defesa inimiga");
    public static final Habilidade ALERTA_SOBRENATURAL = new HabilidadeDeDebuff("Alerta Sobrenatural", List.of("velocidade"), 5, "Reduz velocidade inimiga");
    public static final Habilidade MEDO_SOMBRIO = new HabilidadeDeDebuff("Medo Sombrio", List.of("ataque"), 5, "Reduz ataque inimigo");
    public static final Habilidade SISTEMA_DESATIVACAO = new HabilidadeDeDebuff("Sistema de Desativação", List.of("magia"), 5, "Reduz magia inimiga");
    public static final Habilidade INTIMIDACAO = new HabilidadeDeDebuff("Intimidação", List.of("ataque","defesa"), 5, "Reduz ataque e defesa inimiga");
    public static final Habilidade MEDO_CELESTIAL = new HabilidadeDeDebuff("Medo Celestial", List.of("ataque","magia"), 5, "Reduz ataque e magia inimiga");
    public static final Habilidade DESTRUICAO_SAGRADA = new HabilidadeDeDebuff("Destruição Sagrada", List.of("ataque","defesa","magia","velocidade","energia"), 5, "Debuff poderoso que reduz todos os atributos dos inimigos");
    public static final Habilidade AURA_DA_LUZ = new HabilidadeDeDebuff("Aura da Luz", List.of("ataque","magia"), 5, "Debuff que reduz ataque e magia dos inimigos");

}