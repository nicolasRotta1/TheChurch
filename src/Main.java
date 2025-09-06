import Jogo.Jogo;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int escolha = menu.exibirMenu();

        Jogo jogo = new Jogo();
        if (escolha == 1) {
            jogo.iniciarCampanha();
        } else if (escolha == 2) {
            System.out.println("📂 Carregar Campanha (ainda não implementado).");
            jogo.iniciarCampanha();
        }
    }
}
