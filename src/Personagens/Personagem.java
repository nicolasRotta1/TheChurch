package Personagens;

import Categoria.CategoriaGeral;
import Habilidades.Habilidade;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem implements IPersonagem {
    private static int contador = 0;
    protected int id;
    protected String nome;
    protected CategoriaGeral categoria;

    // Atributos de combate
    protected int hp;
    protected int ataque;
    protected int defesa;            // Reduz dano recebido
    protected int magia;             // Para habilidades especiais
    protected double esquiva;        // 0.0 a 1.0, chance de evitar ataques
    protected double critico;        // 0.0 a 1.0, chance de dano crítico
    protected int energia;           // Para usar habilidades

    // Valores base (usados para resetar buffs/debuffs temporários)
    private int ataqueBase;
    private int defesaBase;
    private int magiaBase;
    private int energiaBase;

    protected int level;
    protected boolean vivo = true;

    // Lista para efeitos temporários (buffs/debuffs de 1 turno)
    protected List<Habilidade> efeitosTemporarios = new ArrayList<>();

    public Personagem(String nome, CategoriaGeral categoria, int hp, int ataque, int defesa,
                      int magia, double esquiva, double critico, int energia) {
        this.id = ++contador;
        this.nome = nome;
        this.categoria = categoria;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.esquiva = esquiva;
        this.critico = critico;
        this.energia = energia;

        // guardar valores base
        this.ataqueBase = ataque;
        this.defesaBase = defesa;
        this.magiaBase = magia;
        this.energiaBase = energia;
    }

    // =======================
    // Métodos de combate
    // =======================

    @Override
    public void receberDano(double dano) {
        int danoFinal = (int) Math.round(dano - defesa);
        if (danoFinal < 0) danoFinal = 0;
        this.hp -= danoFinal;
        if (this.hp <= 0) {
            this.hp = 0;
            this.vivo = false;
        }
    }

    @Override
    public void receberCura(int cura) {
        this.hp += cura;
        // opcional: limitar ao HP máximo
    }

    public void adicionarStatus(String status) {
        // implementação de status, por exemplo adicionar em uma lista de status
        System.out.println(nome + " recebeu status: " + status);
    }

    public boolean tentarEsquiva() {
        return Math.random() < esquiva;
    }

    public boolean atacarCritico() {
        return Math.random() < critico;
    }

    /**
     * Reseta atributos modificados e remove buffs/debuffs temporários.
     * Deve ser chamado no fim do turno.
     */
    public void limparEfeitosTemporarios() {
        this.ataque = this.ataqueBase;
        this.defesa = this.defesaBase;
        this.magia  = this.magiaBase;
        this.energia = this.energiaBase;

        this.efeitosTemporarios.clear();
    }

    @Override
    public boolean estaVivo() {
        return vivo && hp > 0;
    }

    // =======================
    // Getters e Setters
    // =======================

    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public CategoriaGeral getCategoria() { return categoria; }
    public void setCategoria(CategoriaGeral categoria) { this.categoria = categoria; }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public int getDefesa() { return defesa; }
    public void setDefesa(int defesa) { this.defesa = defesa; }

    public int getMagia() { return magia; }
    public void setMagia(int magia) { this.magia = magia; }

    public double getEsquiva() { return esquiva; }
    public void setEsquiva(double esquiva) { this.esquiva = esquiva; }

    public double getCritico() { return critico; }
    public void setCritico(double critico) { this.critico = critico; }

    public int getEnergia() { return energia; }
    public void setEnergia(int energia) { this.energia = energia; }

    @Override
    public int getLevel() { return level; }

    public boolean isVivo() { return vivo; }
    public void setVivo(boolean vivo) { this.vivo = vivo; }

    public List<Habilidade> getEfeitosTemporarios() {
        return efeitosTemporarios;
    }

    // =======================
    // Métodos abstratos
    // =======================

    @Override
    public abstract void atacar(Personagem alvo);

    @Override
    public abstract void mostrarStatus();
}
