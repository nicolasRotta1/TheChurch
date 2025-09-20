package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Jogo.Jogo;
import Personagens.Player;
import Personagens.Inimigos.Inimigo;

public class JogoGUI extends JFrame {
    
    private Jogo jogo;
    private JTextArea logArea;
    private JPanel jogadoresPanel;
    private JPanel inimigoPanel;
    private JButton btnIniciarBatalha;
    
    public JogoGUI() {
        this.jogo = new Jogo();
        inicializarInterface();
    }
    
    private void inicializarInterface() {
        setTitle("Lendas Urbanas - O Jogo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        
        // Mostra o menu principal
        mostrarMenuPrincipal();
    }
    
    private void mostrarMenuPrincipal() {
        getContentPane().removeAll();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(44, 62, 80));
        
        // Título
        JPanel tituloPanel = new JPanel();
        tituloPanel.setBackground(new Color(44, 62, 80));
        JLabel titulo = new JLabel("LENDAS URBANAS", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        titulo.setForeground(Color.WHITE);
        
        JLabel subtitulo = new JLabel("O Jogo", JLabel.CENTER);
        subtitulo.setFont(new Font("Arial", Font.PLAIN, 18));
        subtitulo.setForeground(new Color(189, 195, 199));
        
        tituloPanel.setLayout(new BoxLayout(tituloPanel, BoxLayout.Y_AXIS));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        tituloPanel.add(Box.createVerticalGlue());
        tituloPanel.add(titulo);
        tituloPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        tituloPanel.add(subtitulo);
        tituloPanel.add(Box.createVerticalGlue());
        
        // Botões
        JPanel botoesPanel = new JPanel();
        botoesPanel.setBackground(new Color(44, 62, 80));
        botoesPanel.setLayout(new BoxLayout(botoesPanel, BoxLayout.Y_AXIS));
        
        JButton btnNovoCampanha = criarBotao("Nova Campanha");
        JButton btnCarregarCampanha = criarBotao("Carregar Campanha");
        JButton btnSair = criarBotao("Sair");
        
        btnNovoCampanha.addActionListener(e -> iniciarNovaPartida());
        btnCarregarCampanha.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidade ainda não implementada!"));
        btnSair.addActionListener(e -> System.exit(0));
        
        botoesPanel.add(Box.createVerticalGlue());
        botoesPanel.add(btnNovoCampanha);
        botoesPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        botoesPanel.add(btnCarregarCampanha);
        botoesPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        botoesPanel.add(btnSair);
        botoesPanel.add(Box.createVerticalGlue());
        
        panel.add(tituloPanel, BorderLayout.CENTER);
        panel.add(botoesPanel, BorderLayout.SOUTH);
        
        add(panel);
        revalidate();
        repaint();
    }
    
    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("Arial", Font.BOLD, 16));
        botao.setBackground(new Color(52, 152, 219));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        botao.setPreferredSize(new Dimension(200, 40));
        botao.setMaximumSize(new Dimension(200, 40));
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        return botao;
    }
    
    private void iniciarNovaPartida() {
        mostrarTelaJogo();
    }
    
    private void mostrarTelaJogo() {
        getContentPane().removeAll();
        
        setLayout(new BorderLayout());
        
        // Título superior
        JLabel titulo = new JLabel("BATALHA DAS LENDAS", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setOpaque(true);
        titulo.setBackground(new Color(44, 62, 80));
        titulo.setForeground(Color.WHITE);
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(titulo, BorderLayout.NORTH);
        
        // Painel central
        JPanel centroPanel = new JPanel(new BorderLayout());
        centroPanel.setBackground(new Color(52, 73, 94));
        
        // Painel de personagens (esquerda e direita)
        JPanel personagensPanel = new JPanel(new BorderLayout());
        personagensPanel.setBackground(new Color(52, 73, 94));
        personagensPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Jogadores (esquerda)
        jogadoresPanel = new JPanel();
        jogadoresPanel.setLayout(new BoxLayout(jogadoresPanel, BoxLayout.Y_AXIS));
        jogadoresPanel.setBackground(new Color(44, 62, 80));
        jogadoresPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.WHITE), "JOGADORES", 
            0, 0, new Font("Arial", Font.BOLD, 14), Color.WHITE));
        
        // Inimigo (direita)
        inimigoPanel = new JPanel();
        inimigoPanel.setLayout(new BoxLayout(inimigoPanel, BoxLayout.Y_AXIS));
        inimigoPanel.setBackground(new Color(142, 68, 173));
        inimigoPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.WHITE), "INIMIGO", 
            0, 0, new Font("Arial", Font.BOLD, 14), Color.WHITE));
        
        personagensPanel.add(jogadoresPanel, BorderLayout.WEST);
        personagensPanel.add(Box.createHorizontalStrut(50), BorderLayout.CENTER);
        personagensPanel.add(inimigoPanel, BorderLayout.EAST);
        
        centroPanel.add(personagensPanel, BorderLayout.CENTER);
        add(centroPanel, BorderLayout.CENTER);
        
        // Painel inferior - Log e controles
        JPanel inferiorPanel = new JPanel(new BorderLayout());
        inferiorPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inferiorPanel.setBackground(new Color(52, 73, 94));
        
        // Log de eventos
        JLabel lblLog = new JLabel("Log de Eventos:");
        lblLog.setForeground(Color.WHITE);
        lblLog.setFont(new Font("Arial", Font.BOLD, 12));
        
        logArea = new JTextArea(6, 50);
        logArea.setEditable(false);
        logArea.setBackground(new Color(26, 26, 26));
        logArea.setForeground(Color.WHITE);
        logArea.setFont(new Font("Courier New", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(logArea);
        
        // Controles
        JPanel controlesPanel = new JPanel(new FlowLayout());
        controlesPanel.setBackground(new Color(52, 73, 94));
        
        btnIniciarBatalha = criarBotaoSecundario("Iniciar Batalha");
        JButton btnVoltarMenu = criarBotaoSecundario("Voltar ao Menu");
        
        btnIniciarBatalha.setBackground(new Color(231, 76, 60));
        btnVoltarMenu.setBackground(new Color(149, 165, 166));
        
        btnIniciarBatalha.addActionListener(e -> iniciarBatalhaGUI());
        btnVoltarMenu.addActionListener(e -> mostrarMenuPrincipal());
        
        controlesPanel.add(btnIniciarBatalha);
        controlesPanel.add(btnVoltarMenu);
        
        inferiorPanel.add(lblLog, BorderLayout.NORTH);
        inferiorPanel.add(scrollPane, BorderLayout.CENTER);
        inferiorPanel.add(controlesPanel, BorderLayout.SOUTH);
        
        add(inferiorPanel, BorderLayout.SOUTH);
        
        // Carregar dados do jogo
        carregarJogadoresGUI();
        
        revalidate();
        repaint();
    }
    
    private JButton criarBotaoSecundario(String texto) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        botao.setPreferredSize(new Dimension(150, 30));
        return botao;
    }
    
    private void carregarJogadoresGUI() {
        adicionarLog("*** Carregando jogadores...");
        
        // Carrega jogadores na lógica do jogo
        jogo.carregarJogadores();
        
        // Adiciona cards dos jogadores na interface
        String[] nomes = {"João - O Padre", "Maria - A Caçadora", "Pedro - O Guerreiro"};
        for (int i = 0; i < 3; i++) {
            JPanel cardJogador = criarCardJogador(nomes[i], 100, 20, 1);
            jogadoresPanel.add(cardJogador);
            jogadoresPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        }
        
        // Adiciona card do inimigo
        JPanel cardInimigo = criarCardInimigo("Saci-Pererê", 80, 30, "Lenda Urbana");
        inimigoPanel.add(cardInimigo);
        
        adicionarLog(">>> 3 jogadores carregados!");
        adicionarLog(">>> 1 inimigo apareceu!");
    }
    
    private JPanel criarCardJogador(String nome, int hp, int ataque, int level) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(new Color(39, 174, 96));
        card.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        card.setPreferredSize(new Dimension(200, 120));
        card.setMaximumSize(new Dimension(200, 120));
        
        JLabel lblNome = new JLabel(nome);
        lblNome.setForeground(Color.WHITE);
        lblNome.setFont(new Font("Arial", Font.BOLD, 12));
        lblNome.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel lblHP = new JLabel("HP: " + hp);
        JLabel lblAtaque = new JLabel("ATK: " + ataque);
        JLabel lblLevel = new JLabel("LVL: " + level);
        
        lblHP.setForeground(Color.WHITE);
        lblAtaque.setForeground(Color.WHITE);
        lblLevel.setForeground(Color.WHITE);
        
        lblHP.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblAtaque.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblLevel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JProgressBar barraHP = new JProgressBar(0, 100);
        barraHP.setValue(hp);
        barraHP.setForeground(new Color(231, 76, 60));
        barraHP.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        card.add(lblNome);
        card.add(Box.createRigidArea(new Dimension(0, 5)));
        card.add(lblHP);
        card.add(lblAtaque);
        card.add(lblLevel);
        card.add(Box.createRigidArea(new Dimension(0, 5)));
        card.add(barraHP);
        
        return card;
    }
    
    private JPanel criarCardInimigo(String nome, int hp, int ataque, String tipo) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(new Color(231, 76, 60));
        card.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        card.setPreferredSize(new Dimension(200, 120));
        card.setMaximumSize(new Dimension(200, 120));
        
        JLabel lblNome = new JLabel(nome);
        lblNome.setForeground(Color.WHITE);
        lblNome.setFont(new Font("Arial", Font.BOLD, 12));
        lblNome.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel lblTipo = new JLabel("Tipo: " + tipo);
        JLabel lblHP = new JLabel("HP: " + hp);
        JLabel lblAtaque = new JLabel("ATK: " + ataque);
        
        lblTipo.setForeground(Color.WHITE);
        lblHP.setForeground(Color.WHITE);
        lblAtaque.setForeground(Color.WHITE);
        
        lblTipo.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblHP.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblAtaque.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JProgressBar barraHP = new JProgressBar(0, 120);
        barraHP.setValue(hp);
        barraHP.setForeground(new Color(39, 174, 96));
        barraHP.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        card.add(lblNome);
        card.add(Box.createRigidArea(new Dimension(0, 5)));
        card.add(lblTipo);
        card.add(lblHP);
        card.add(lblAtaque);
        card.add(Box.createRigidArea(new Dimension(0, 5)));
        card.add(barraHP);
        
        return card;
    }
    
    private void iniciarBatalhaGUI() {
        adicionarLog("");
        adicionarLog("*** BATALHA INICIADA! ***");
        adicionarLog("Escolha suas ações usando os botões dos jogadores!");
        
        // Aqui você pode implementar a lógica de batalha GUI
        // Por enquanto, vamos simular
        JOptionPane.showMessageDialog(this, "Batalha simulada! Implementação completa em desenvolvimento.");
    }
    
    private void adicionarLog(String mensagem) {
        logArea.append(mensagem + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            new JogoGUI().setVisible(true);
        });
    }
}
