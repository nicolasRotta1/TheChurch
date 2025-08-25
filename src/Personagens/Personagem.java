package Personagens;

public abstract class Personagem implements IPersonagem{
    private int id;
    private String nome;
    private int hp;
    private int atack;
    private static int ContadorId;

    public Personagem(String nome, int hp, int atack) {
        this.id = ContadorId;
        this.nome = nome;
        this.hp = hp;
        this.atack = atack;
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.setHp(alvo.getHp()-getAtack());
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public static int getContadorId() {
        return ContadorId;
    }

    public static void setContadorId(int contadorId) {
        ContadorId = contadorId;
    }
}
