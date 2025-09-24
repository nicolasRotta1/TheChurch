package Personagens;

import Categoria.CategoriaController;
import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Categorias.ClerigoAprendiz;
import Categoria.CategoriaPlayer.Categorias.DetetiveParanormal;
import Categoria.CategoriaPlayer.Categorias.ExorcistaAprendiz;
import Categoria.CategoriaPlayer.Categorias.PaladinoIniciante;

import java.util.ArrayList;
import java.util.List;


public class PlayerFactory {
    static CategoriaController categoriaController = new CategoriaController();
    // Valores iniciais padrão
    private static final int HP_INICIAL = 100;
    private static final int ATAQUE_INICIAL = 20;
    private static final int DEFESA_INICIAL = 10;
    private static final int MAGIA_INICIAL = 5;
    private static final double ESQUIVA_INICIAL = 0.05; // 5%
    private static final double CRITICO_INICIAL = 0.1;   // 10%
    private static final int ENERGIA_INICIAL = 50;
    private static final int LEVEL_INICIAL = 1;
    private static final int PONTOS_STATUS_INICIAL = 0;
    private static final int XP_INICIAL = 0;
    private static final int PONTOS_FE_INICIAL = 0;

    // =======================
    // Criação de player padrão
    // =======================
    public static Player criarNovoPlayer(String nome, CategoriaPlayer categoria) {
        Player player = new Player(
                nome,
                categoria,
                HP_INICIAL,
                ATAQUE_INICIAL,
                DEFESA_INICIAL,
                MAGIA_INICIAL,
                ESQUIVA_INICIAL,
                CRITICO_INICIAL,
                ENERGIA_INICIAL,
                LEVEL_INICIAL,
                PONTOS_STATUS_INICIAL,
                XP_INICIAL,
                PONTOS_FE_INICIAL
        );

        // Aplica os efeitos da categoria automaticamente
        categoriaController.AplicarEfeitos(player);

        return player;
    }

    // =======================
    // Criação de player customizado
    // =======================
    public static Player criarPlayerCustomizado(String nome, CategoriaPlayer categoria,
                                                int hp, int ataque, int defesa, int magia, int velocidade,
                                                double esquiva, double critico, int energia,
                                                int level, int pontosStatus, int experiencia, int pontosFe) {

        Player player = new Player(
                nome,
                categoria,
                hp,
                ataque,
                defesa,
                magia,
                esquiva,
                critico,
                energia,
                level,
                pontosStatus,
                experiencia,
                pontosFe
        );

        // Aplica os efeitos da categoria automaticamente
        categoriaController.AplicarEfeitos(player);

        return player;
    }
    public static List<Player> getPlayersIniciais() {
        List<Player> players = new ArrayList<>();

        // Exorcistas Aprendiz
        players.add(criarNovoPlayer("Lucien Armand", new ExorcistaAprendiz()));
        players.add(criarNovoPlayer("Sofia Valente", new ExorcistaAprendiz()));

        // Paladinos Iniciante
        players.add(criarNovoPlayer("Gideon Ferraz", new PaladinoIniciante()));
        players.add(criarNovoPlayer("Isadora Cruz", new PaladinoIniciante()));

        // Detetives Paranormal
        players.add(criarNovoPlayer("Victor Sombra", new DetetiveParanormal()));
        players.add(criarNovoPlayer("Helena Noctis", new DetetiveParanormal()));

        // Clérigos Aprendiz
        players.add(criarNovoPlayer("Matias Luz", new ClerigoAprendiz()));
        players.add(criarNovoPlayer("Clarisse Benedita", new ClerigoAprendiz()));

        return players;
    }

}
