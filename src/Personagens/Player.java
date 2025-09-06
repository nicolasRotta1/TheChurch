package Personagens;

import Habilidades.Habilidade;
import java.util.Scanner;

public class Player extends Personagem {
    private int level;
    private int pontosLevel;
    private int pontosStatus;
    private Habilidade arma;
    private Scanner sc = new Scanner(System.in);

    public Player(String nome) {
        super(nome, 100, 5, true, true, "Exorcista Aprendiz");
        this.level = 1;
        this.pontosLevel = 50;
        this.pontosStatus = 3;
        this.arma = new Habilidade("Pistolinha", 10, "Físico", "Uma arma básica de fogo.");
    }

    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " está se defendendo!");
    }

    @Override
    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {
        System.out.println(getNome() + " usou a habilidade " + habilidade.getNome() + " contra " + alvo.getNome());
        int dano = habilidade.getDanoBase() + getAtack();
        alvo.receberDano(dano);
        System.out.println(alvo.getNome() + " recebeu " + dano + " de dano da habilidade " + habilidade.getNome());
    }

    public Habilidade getArma() {
        return arma;
    }

    public void equiparArma(Habilidade novaArma) {
        this.arma = novaArma;
        System.out.println("🆕 " + getNome() + " equipou a arma do inimigo: " + novaArma.getNome());
    }

    public void subirStatus() {
        int pontos;
        System.out.println("Deseja upar que atributo:");
        System.out.println("(1) - Ataque | (2) - Vida | (3) - Defesa");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Quantos pontos deseja colocar em ataque:");
                pontos = sc.nextInt();
                setAtack(getAtack() + pontos * 2);
                break;
            case 2:
                System.out.println("Quantos pontos deseja colocar em vida:");
                pontos = sc.nextInt();
                setHp(getHp() + pontos * 5);
                break;
            case 3:
                System.out.println("Quantos pontos deseja colocar em defesa:");
                pontos = sc.nextInt();
                System.out.println("Defesa ainda não implementada.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPontosLevel() {
        return pontosLevel;
    }

    public void setPontosLevel(int pontosLevel) {
        this.pontosLevel = pontosLevel;
    }

    public int getPontosStatus() {
        return pontosStatus;
    }

    public void setPontosStatus(int pontosStatus) {
        this.pontosStatus = pontosStatus;
    }
}
