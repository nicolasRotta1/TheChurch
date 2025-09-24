import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("=================================");
        System.out.println(" THE CHURCH: The last battle ");
        System.out.println("=================================");
        System.out.println("Pressione ENTER para começar...");
        sc.nextLine(); // espera ENTER

        return exibirSubmenu();
    }

    private int exibirSubmenu() {
        int opcao = -1;
        while (opcao < 1 || opcao > 2) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n===== MENU INICIAL =====");
            System.out.println("1 - Nova Campanha");
            System.out.println("2 - Carregar Campanha");
            System.out.println("3 - Mostrar Status");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            if (opcao < 1 || opcao > 2) {
                System.out.println("*** Opcao invalida, tente novamente! ***");
            }
        }
        return opcao;
    }
}