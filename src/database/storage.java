package database;

import java.util.*;

/**
 * Banco de dados, o jogo não tem um db em si, então ele simula memoria no storage da aplicação.
 * Cada "tabela" estamos colocando um Map com ID e o objeto.
 * Cada tabela tem métodos para: adicionar, buscar e listar.
 */
public class BancoDeDados {
    // Tabelas simuladas em memória
    private Map<Integer, Object> personagem = new HashMap<>();
    private Map<Integer, Object> habilidade = new HashMap<>();
    private Map<Integer, Object> inimigo = new HashMap<>();
    private Map<Integer, Object> fraquezaPersonagem = new HashMap<>();
    private Map<Integer, Object> batalha = new HashMap<>();
    private Map<Integer, Object> jogo = new HashMap<>();
    private Map<Integer, Object> chamaDaFe = new HashMap<>();

    // Metodos Personagem
    public void adicionarPersonagem(int id, Object p) {
        personagem.put(id, p);
    }
    public Object buscarPersonagem(int id) {
        return personagem.get(id);
    }
    public Collection<Object> listarPersonagens() {
        return personagem.values();
    }

    // Metodos Habilidade
    public void adicionarHabilidade(int id, Object h) {
        habilidade.put(id, h);
    }
    public Object buscarHabilidade(int id) {
        return habilidade.get(id);
    }
    public Collection<Object> listarHabilidades() {
        return habilidade.values();
    }

    // Metodos Inimigo
    public void adicionarInimigo(int id, Object i) {
        inimigo.put(id, i);
    }
    public Object buscarInimigo(int id) {
        return inimigo.get(id);
    }
    public Collection<Object> listarInimigos() {
        return inimigo.values();
    }

    // Metodos FraquesaPersonagem
    public void adicionarFraquezaPersonagem(int id, Object f) {
        fraquezaPersonagem.put(id, f);
    }
    public Object buscarFraquezaPersonagem(int id) {
        return fraquezaPersonagem.get(id);
    }
    public Collection<Object> listarFraquezasPersonagem() {
        return fraquezaPersonagem.values();
    }

    // Metodos Batalha
    public void adicionarBatalha(int id, Object b) {
        batalha.put(id, b);
    }
    public Object buscarBatalha(int id) {
        return batalha.get(id);
    }
    public Collection<Object> listarBatalhas() {
        return batalha.values();
    }

    // Metodos Jogo
    public void adicionarJogo(int id, Object j) {
        jogo.put(id, j);
    }
    public Object buscarJogo(int id) {
        return jogo.get(id);
    }
    public Collection<Object> listarJogos() {
        return jogo.values();
    }

    // Metodos ChamadaFe
    public void adicionarChamaDaFe(int id, Object c) {
        chamaDaFe.put(id, c);
    }
    public Object buscarChamaDaFe(int id) {
        return chamaDaFe.get(id);
    }
    public Collection<Object> listarChamasDaFe() {
        return chamaDaFe.values();
    }
}
