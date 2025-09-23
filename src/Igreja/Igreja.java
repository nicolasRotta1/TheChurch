package Igreja;

public class Igreja {
    private int id;
    private String nome;
    private int hp;
    private static int contadorId = 0;

    public Igreja(String nome) {
        this.id = ++contadorId;
        this.nome = nome;
        this.hp = 500;
    }

    // Adicione o método para a igreja receber dano
    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public boolean estaDestruida() {
        return this.hp <= 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Igreja { " +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", hp=" + hp +
                " }";
    }
}