package Batalha;

import Categoria.CategoriaPlayer.CategoriaPlayer;
import Personagens.Player;
import Personagens.Inimigo;
import Habilidades.Habilidade;
import Igreja.Igreja; // Importe a classe Igreja

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random; // Importe a classe Random

public class Batalha {

    private List<Player> jogadores;
    private Inimigo inimigo;
    private Igreja igreja; // Adicione o atributo da Igreja
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random(); // Adicione o objeto Random

    // Atualize o construtor para receber a Igreja
    public Batalha(List<Player> jogadores, Inimigo inimigo, Igreja igreja) {
        this.jogadores = jogadores;
        this.inimigo = inimigo;
        this.igreja = igreja;
    }

    public void iniciar() {
        escreverDevagar("=== Batalha Iniciada ===");

        // Adicione a condição da igreja no loop principal
        while (inimigo.estaVivo() && jogadores.stream().anyMatch(Player::estaVivo) && !igreja.estaDestruida()) {
//            mostrarStatus();

            // ---- Turno dos jogadores ----
            List<Player> jogadoresVivos = jogadores.stream().filter(Player::estaVivo).collect(Collectors.toList());
            for (Player player : jogadoresVivos) {
                if (!inimigo.estaVivo()) { // Checa a vitória após o turno de cada jogador
                    escreverDevagar("\n" + inimigo.getNome() + " foi derrotado!");
                    player.ganharExperiencia(inimigo.getXp());
                    encerrar(true); // Fim de jogo por vitória
                    return;
                }

                escreverDevagar("\n--- Turno de " + player.getNome() + " ---");
                turnoPlayer(player);

                player.limparEfeitosTemporarios();


                if (inimigo.estaVivo() && player.estaVivo()) {
                    turnoInimigo(player);
                    inimigo.limparEfeitosTemporarios();
                }

                if (!player.estaVivo()) {
                    escreverDevagar(player.getNome() + " foi derrotado!");
                    // Aplica dano à igreja
                    int danoIgreja = random.nextInt(71) + 50; // Dano entre 50 e 120
                    igreja.receberDano(danoIgreja);
                    escreverDevagar("A Igreja sofreu " + danoIgreja + " de dano! HP restante: " + igreja.getHp());
                }

                // Checa se a igreja foi destruída
                if(igreja.estaDestruida()){
                    escreverDevagar("A Igreja foi destruída! O jogo termina aqui.");
                    encerrar(false); // Fim de jogo por derrota
                    return;
                }
            }
        }

        encerrar(inimigo.estaVivo() && !igreja.estaDestruida()); // Encerrar ao final do loop
    }

//    private void mostrarStatus() {
//        System.out.println("\n--- Status ---");
//        for (Player player : jogadores) {
//            player.mostrarStatus();
//        }
//        inimigo.mostrarStatus();
//        System.out.println("HP da Igreja: " + igreja.getHp()); // Exibe o HP da igreja
//        System.out.println("---------------\n");
//    }

    private void turnoPlayer(Player player) {
        escreverDevagar("Escolha uma ação:");
        escreverDevagar("1) Ataque");
        escreverDevagar("2) Usar habilidade");

        int escolha = -1;
        try {
            escolha = scanner.nextInt();
            scanner.nextLine();
        } catch (java.util.InputMismatchException e) {
            escreverDevagar("Entrada inválida. Usando ataque básico.");
            scanner.nextLine();
            escolha = 1;
        }

        switch (escolha) {
            case 1:
                player.atacar(inimigo);
                break;

            case 2:
                Habilidade hab = null;

                if (player.getCategoria() instanceof CategoriaPlayer catPlayer) {
                    List<Habilidade> habilidades = catPlayer.getHabilidades();

                    if (habilidades != null && !habilidades.isEmpty()) {
                        escreverDevagar("\n=== Escolha uma Habilidade ===");
                        for (int i = 0; i < habilidades.size(); i++) {
                            escreverDevagar((i + 1) + ") " + habilidades.get(i).getNome() + " - " + habilidades.get(i).getDescricao());
                        }
                        escreverDevagar("0) Voltar para ataque padrão");

                        int escolhaHab = -1;
                        try {
                            escolhaHab = scanner.nextInt();
                            scanner.nextLine();
                        } catch (java.util.InputMismatchException e) {
                            escreverDevagar("Entrada inválida.");
                            scanner.nextLine();
                            escolhaHab = -1;
                        }

                        if (escolhaHab > 0 && escolhaHab <= habilidades.size()) {
                            hab = habilidades.get(escolhaHab - 1);
                        } else {
                            escreverDevagar("Opção inválida ou escolhida para voltar. Usando ataque básico.");
                        }
                    } else {
                        escreverDevagar("Nenhuma habilidade disponível para " + player.getNome() + ".");
                    }
                }

                if (hab != null) {
                    player.usarHabilidade(hab, inimigo);
                } else {
                    player.atacar(inimigo);
                }
                break;

            default:
                escreverDevagar("Opção inválida! Usando ataque básico.");
                player.atacar(inimigo);
                break;
        }
    }

    private void turnoInimigo(Player alvo) {
        if (!inimigo.estaVivo()) return;

        List<Habilidade> habs = inimigo.getHabilidades();
        if (habs != null && !habs.isEmpty() && Math.random() > 0.5) {
            Habilidade hab = habs.get((int) (Math.random() * habs.size()));
            inimigo.usarHabilidade(hab, alvo);
        } else {
            inimigo.atacar(alvo);
        }

        if (alvo.estaVivo()) {
            inimigo.ameacar();
        }
    }

    // Adapte o método encerrar para exibir a mensagem de vitória ou derrota
    private void encerrar(boolean vitoria) {
        escreverDevagar("=== Batalha Encerrada ===");
        if (vitoria) {
            escreverDevagar("VITÓRIA! Todos os inimigos foram derrotados.");
        } else {
            escreverDevagar("DERROTA! A Igreja foi destruída ou todos os jogadores foram derrotados.");
        }
    }

    private void encerrar() {
        encerrar(false);
    }

    // --- NOVO MÉTODO: Digita uma string caractere por caractere
    private void escreverDevagar(String mensagem) {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // Pula para a próxima linha
    }
}