package Personagens;

import Categoria.CategoriaController;
import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Categoria.TipoCriatura;
import Habilidades.Habilidade;
import Habilidades.TipoHabilidade;

import java.util.List;
import java.util.Scanner;

public class Player extends Personagem {

    private int experiencia;
    private int pontosStatus;
    private int pontosFe;

    public Player(String nome, CategoriaPlayer categoria,
                  int hp, int ataque, int defesa, int magia,
                  double esquiva, double critico, int energia,
                  int level, int pontosStatus, int experiencia, int pontosFe) {

        super(nome, categoria, hp, ataque, defesa, magia, esquiva, critico, energia);
        this.level = level;
        this.pontosStatus = pontosStatus;
        this.experiencia = experiencia;
        this.pontosFe = pontosFe;
    }

    // =======================
    // Level e XP
    // =======================
    public void subirLevel() {
        level++;
        pontosStatus += 5;
        System.out.println(nome + " subiu para o nível " + level + "! (+5 pontos de status)");
    }

    @Override
    public void atacar(Personagem alvo) {
        if (!alvo.estaVivo()) {
            System.out.println(alvo.getNome() + " já está derrotado!");
            return;
        }

        TipoCriatura tipoAlvo = null;
        if (alvo.getCategoria() instanceof CategoriaInimigo) {
            tipoAlvo = ((CategoriaInimigo) alvo.getCategoria()).getTipoCriatura();
        }

        if (alvo.tentarEsquiva()) {
            System.out.println(alvo.getNome() + " esquivou do ataque!");
            return;
        }

        double mult = 1.0;

        if (this.getCategoria() instanceof CategoriaPlayer) {
            CategoriaPlayer catPlayer = (CategoriaPlayer) this.getCategoria();

            // Vantagens
            for (Vantagem v : catPlayer.getVantagensEnum()) {
                if (v.getTipo() == tipoAlvo) {
                    mult *= 1.5;
                    System.out.println("Vantagem aplicada! Dano aumentado.");
                }
            }

            // Fraquezas
            for (Fraqueza f : catPlayer.getFraquezasEnum()) {
                if (f.getTipo() == tipoAlvo) {
                    mult *= 0.5;
                    System.out.println("Fraqueza aplicada! Dano reduzido.");
                }
            }
        }

        int danoBase = this.getAtaque();
        if (this.atacarCritico()) {
            danoBase *= 2;
            System.out.println("ACERTO CRÍTICO!");
        }

        int danoFinal = (int) (danoBase * mult - alvo.getDefesa());
        if (danoFinal < 0) danoFinal = 0;

        alvo.receberDano(danoFinal);

        System.out.println(this.getNome() + " atacou " + alvo.getNome() + " causando " + danoFinal + " de dano! (HP restante: " + alvo.getHp() + ")");
    }

    public void evoluir(int opcao) {
        CategoriaPlayer catAtual;

        try {
            catAtual = (CategoriaPlayer) getCategoria();
        } catch (ClassCastException e) {
            System.out.println("Essa categoria não pode evoluir!");
            return;
        }

        catAtual.configurarEvolucoes();
        List<Class<? extends CategoriaPlayer>> evolucoes = catAtual.getEvolucoes();

        if (evolucoes.isEmpty()) {
            System.out.println(getNome() + " não pode evoluir mais!");
            return;
        }

        if (opcao < 0 || opcao >= evolucoes.size()) {
            System.out.println("Opção inválida! Escolha entre 0 e " + (evolucoes.size() - 1));
            return;
        }

        int custoFe = catAtual.getCustoEvolucao(); // supondo que cada categoria tenha um custo de evolução
        if (pontosFe < custoFe) {
            System.out.println("Você não tem fé suficiente para evoluir! Custo: " + custoFe + " | Fé atual: " + pontosFe);
            return;
        }

        try {
            CategoriaPlayer novaCategoria = evolucoes.get(opcao).getDeclaredConstructor().newInstance();
            setCategoria(novaCategoria);
            pontosFe -= custoFe; // desconta a fé usada na evolução
            System.out.println(getNome() + " evoluiu para " + novaCategoria.getNome() + "! Fé restante: " + pontosFe);
        } catch (Exception e) {
            System.out.println("Erro ao evoluir: " + e.getMessage());
            e.printStackTrace();
        }
    }





    public void ganharExperiencia(int xp) {
        experiencia += xp;
        System.out.println(nome + " ganhou " + xp + " de XP! (Total: " + experiencia + ")");
        while (experiencia >= level * 100) {
            experiencia -= level * 100;
            subirLevel();
        }


    }

    // =======================
    // Ataque e habilidades
    // =======================


    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {
        if (!alvo.estaVivo()) {
            System.out.println(alvo.getNome() + " já está derrotado!");
            return;
        }

        if (habilidade == null) {
            atacar(alvo); // fallback para ataque básico
            return;
        }

        TipoCriatura tipoAlvo = null;
        if (alvo.getCategoria() instanceof CategoriaInimigo) {
            tipoAlvo = ((CategoriaInimigo) alvo.getCategoria()).getTipoCriatura();
        }

        // Checa esquiva
        if (alvo.tentarEsquiva()) {
            System.out.println(alvo.getNome() + " esquivou da habilidade!");
            return;
        }

        double mult = 1.0;

        if (this.getCategoria() instanceof CategoriaPlayer) {
            CategoriaPlayer catPlayer = (CategoriaPlayer) this.getCategoria();

            // Vantagens
            for (Vantagem v : catPlayer.getVantagensEnum()) {
                if (v.getTipo() == tipoAlvo) {
                    mult *= 1.5;
                    System.out.println("Vantagem aplicada! Dano aumentado.");
                }
            }

            // Fraquezas
            for (Fraqueza f : catPlayer.getFraquezasEnum()) {
                if (f.getTipo() == tipoAlvo) {
                    mult *= 0.5;
                    System.out.println("Fraqueza aplicada! Dano reduzido.");
                }
            }
        }

        // Calcula efeito base da habilidade
        double efeitoBase = habilidade.calcularEfeitoBase(this); // base da habilidade
        int efeitoFinal = (int) (efeitoBase * mult);

        // Se for dano, aplica defesa; se for cura, não aplica
        if (habilidade.getTipo() == TipoHabilidade.PRIMARIA || habilidade.getTipo() == TipoHabilidade.SECUNDARIA) {
            efeitoFinal -= alvo.getDefesa();
            if (efeitoFinal < 0) efeitoFinal = 0;
        }

        // Crítico
        if (this.atacarCritico()) {
            efeitoFinal *= 2;
            System.out.println("ACERTO CRÍTICO!");
        }

        // Aplica o efeito
        if (habilidade.getTipo() == TipoHabilidade.CURA) {
            alvo.receberCura(efeitoFinal);
            System.out.println(nome + " usou " + habilidade.getNome() + " e curou " + efeitoFinal + " HP de " + alvo.getNome() + "!");
        } else {
            alvo.receberDano(efeitoFinal);
            System.out.println(nome + " usou " + habilidade.getNome() + " em " + alvo.getNome() + " causando " + efeitoFinal + " de dano! (HP restante: " + alvo.getHp() + ")");
        }
    }



    // =======================
    // Distribuição de pontos
    // =======================
    public void distribuirPonto(String atributo, int quantidade) {
        if (pontosStatus <= 0) {
            System.out.println("Você não tem pontos para distribuir.");
            return;
        }
        if (pontosStatus < quantidade){
            System.out.println("Você não tem pontos o suficiente para distribuir");
            return;
        }

        switch (atributo.toLowerCase()) {
            case "vida" -> {
                hp += quantidade * 10;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou HP! HP atual: " + hp);
            }
            case "ataque" -> {
                ataque += quantidade * 2;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou ATQ! ATQ atual: " + ataque);
            }
            case "defesa" -> {
                defesa += quantidade * 1;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou DEF! DEF atual: " + defesa);
            }
            case "magia" -> {
                magia += quantidade * 1;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou MAG! MAG atual: " + magia);
            }
            case "energia" -> {
                energia += quantidade * 5;
                pontosStatus -= quantidade;
                System.out.println(nome + " aumentou ENE! ENE atual: " + energia);
            }
            default -> System.out.println("Atributo inválido.");
        }
    }

    public void subirStatus() {
        if (pontosStatus > 0) {
            while (true) {
                System.out.println("Você tem " + pontosStatus + " pontos para distribuir:");
                System.out.println("(1) Vida (+10 HP)");
                System.out.println("(2) Ataque (+2 ATQ)");
                System.out.println("(3) Defesa (+1 DEF)");
                System.out.println("(4) Magia (+1 MAG)");
                System.out.println("(5) Energia (+5 ENE)");
                System.out.println("(6) Sair");


                Scanner scanner = new Scanner(System.in);
                int escolha = scanner.nextInt();


                if (escolha == 6) break;
                switch (escolha) {
                    case 1:
                        distribuirPonto("vida", 1);
                        break;
                    case 2:
                        distribuirPonto("ataque", 1);
                        break;
                    case 3:
                        distribuirPonto("defesa", 1);
                        break;
                    case 4:
                        distribuirPonto("magia", 1);
                        break;
                    case 5:
                        distribuirPonto("energia", 1);
                        break;
                    default:
                        System.out.println("Escolha inválida! Tente novamente.");
                        break;
                }
            }

        } else {
            System.out.println(nome + " não tem pontos para distribuir!");
        }
    }


    // =======================
    // Status do Player
    // =======================
    @Override
    public void mostrarStatus() {
        System.out.println("[" + getClass().getSimpleName() + "] " + nome +
                " | HP: " + hp +
                " | ATQ: " + ataque +
                " | DEF: " + defesa +
                " | MAG: " + magia +
                " | ENE: " + energia +
                " | LVL: " + level +
                " | Categoria: " + categoria.getNome() +
                " | XP: " + experiencia +
                " | Fé: " + pontosFe);
    }

    // =======================
    // Getters e setters
    // =======================
    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public int getPontosStatus() { return pontosStatus; }
    public void setPontosStatus(int pontosStatus) { this.pontosStatus = pontosStatus; }

    public int getPontosFe() { return pontosFe; }
    public void setPontosFe(int pontosFe) { this.pontosFe = pontosFe; }
}
