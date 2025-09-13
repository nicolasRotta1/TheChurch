package Personagens;

import Categoria.CategoriaGeral;

public abstract class Personagem implements IPersonagem {
    protected static int contadorId = 0;
    protected int id;
    protected String nome;
    protected CategoriaGeral categoria;
    protected int hp;
    protected int ataque;
    protected int level;
    protected boolean isVivo;

    public Personagem(String nome, CategoriaGeral categoria) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.categoria = categoria;
        this.hp = 100;
        this.ataque = 20;
        this.level = 1;
        this.isVivo = true;
    }

    // ---------- Métodos comuns ----------
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public CategoriaGeral getCategoriaGeral() {
        return categoria;
    }

    public void setCategoriaGeral(CategoriaGeral categoria) {
        this.categoria = categoria;
    }

    public void setVivo(boolean vivo) {
        isVivo = vivo;
    }

    @Override
    public void receberDano(double dano) {
        this.hp -= dano;
        if (this.hp < 0) this.hp = 0;
    }

    @Override
    public boolean estaVivo() {
        setVivo(false);
        return this.hp >= 0;}

    @Override
    public int getLevel() {
        return level;
    }

    // ---------- Métodos a serem sobrescritos ----------
    @Override
    public abstract void atacar(Personagem alvo);

    @Override
    public abstract void subirLevel();

    @Override
    public abstract void mostrarStatus();


    }

