package Personagens;

import Categoria.CategoriaPlayer.CategoriaPlayer;

public class PlayerFactory {

    // Valores iniciais padrão
    private static final int HP_INICIAL = 100;
    private static final int ATAQUE_INICIAL = 20;
    private static final int DEFESA_INICIAL = 10;
    private static final int MAGIA_INICIAL = 5;
    private static final int VELOCIDADE_INICIAL = 5;
    private static final double ESQUIVA_INICIAL = 0.05; // 5%
    private static final double CRITICO_INICIAL = 0.1;   // 10%
    private static final int RESISTENCIA_MAGICA_INICIAL = 5;
    private static final int ENERGIA_INICIAL = 50;
    private static final int LEVEL_INICIAL = 1;
    private static final int PONTOS_STATUS_INICIAL = 0;
    private static final int XP_INICIAL = 0;
    private static final int PONTOS_FE_INICIAL = 0;

    // =======================
    // Criação de player padrão
    // =======================
    public static Player criarNovoPlayer(String nome, CategoriaPlayer categoria) {
        return new Player(
                nome,
                categoria,
                HP_INICIAL,
                ATAQUE_INICIAL,
                DEFESA_INICIAL,
                MAGIA_INICIAL,
                VELOCIDADE_INICIAL,
                ESQUIVA_INICIAL,
                CRITICO_INICIAL,
                RESISTENCIA_MAGICA_INICIAL,
                ENERGIA_INICIAL,
                LEVEL_INICIAL,
                PONTOS_STATUS_INICIAL,
                XP_INICIAL,
                PONTOS_FE_INICIAL
        );
    }

    // =======================
    // Criação de player customizado
    // =======================
    public static Player criarPlayerCustomizado(String nome, CategoriaPlayer categoria,
                                                int hp, int ataque, int defesa, int magia, int velocidade,
                                                double esquiva, double critico, int resistenciaMagica, int energia,
                                                int level, int pontosStatus, int experiencia, int pontosFe) {
        return new Player(
                nome,
                categoria,
                hp,
                ataque,
                defesa,
                magia,
                velocidade,
                esquiva,
                critico,
                resistenciaMagica,
                energia,
                level,
                pontosStatus,
                experiencia,
                pontosFe
        );
    }
}
