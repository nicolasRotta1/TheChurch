package gui;

import java.util.Scanner;
import Jogo.Jogo;

public class JogoConsole {

    private Jogo jogo;
    private Scanner scanner;

    public JogoConsole() {
        this.jogo = new Jogo();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        mostrarMenuPrincipal();
    }

    private void mostrarMenuPrincipal() {
        while (true) {
            limparTela();
            mostrarTitulo();
            System.out.println("=====================================");
            System.out.println("           MENU PRINCIPAL");
            System.out.println("=====================================");
            System.out.println();
            System.out.println("1. Nova Campanha");
            System.out.println("2. Sobre o Jogo");
            System.out.println("3. Sair");
            System.out.println();
            System.out.print("Escolha uma opcao: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        iniciarNovaPartida();
                        break;
                    case 2:
                        mostrarSobre();
                        break;
                    case 3:
                        System.out.println("\nObrigado por jogar!");
                        return;
                    default:
                        System.out.println("\n*** Opcao invalida! ***");
                        pausar();
                }
            } catch (NumberFormatException e) {
                System.out.println("\n*** Por favor, digite um numero valido! ***");
                pausar();
            }
        }
    }

    private void mostrarTitulo() {
        System.out.println("=====================================");
        System.out.println("         The Church");
        System.out.println("            O JOGO");
        System.out.println("=====================================");
        System.out.println("   Um RPG baseado em Lendas Urbanas");
        System.out.println();
    }

    private void mostrarSobre() {
        limparTela();
        mostrarTitulo();
        System.out.println("=====================================");
        System.out.println("           SOBRE O JOGO");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("The Church e um jogo de RPG baseado");
        System.out.println("em mitos.");
        System.out.println();
        System.out.println("Enfrente criaturas misticas como:");
        System.out.println("- Fantasmas ");
        System.out.println("- Vampiros");
        System.out.println("- Objetos amaldiçoados");
        System.out.println("- E muitas outras!");
        System.out.println();
        System.out.println("Escolha entre diferentes classes:");
        System.out.println("- Exorcista: Especialista em combater fantasmas");
        System.out.println("- investigador: Descobre fraquezas");
        System.out.println("- Clerigo: Especializado em cura");
        System.out.println();
        System.out.println("=====================================");
        pausar();
    }

    private void iniciarNovaPartida() {
        limparTela();
        mostrarTitulo();
        System.out.println("*** INICIANDO NOVA CAMPANHA ***");
        System.out.println();

        // Inicia a campanha usando a lógica existente
        jogo.iniciar();

        System.out.println();
        System.out.println("*** CAMPANHA FINALIZADA ***");
        pausar();
    }

    private void limparTela() {
        // Limpa a tela no Windows
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            // Se não conseguir limpar, adiciona quebras de linha
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    private void pausar() {
        System.out.println();
        System.out.print("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        new JogoConsole().iniciar();

    }
}
