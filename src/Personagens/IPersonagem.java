package Personagens;

public interface IPersonagem {

    // Identidade
    int getId();
    String getNome();
    void setNome(String nome);

    // Atributos
    int getHp();
    void setHp(int hp);
    int getAtaque();
    void setAtaque(int ataque);

    // Combate
    void atacar(Personagem alvo);
    void receberDano(double dano);
    boolean estaVivo();

    // Progressão
    int getLevel();
    void subirLevel();

    // Exibição
    void mostrarStatus();
}
