# Lendas Urbanas - O Jogo

Um RPG em Java baseado no folclore brasileiro, onde você enfrenta criaturas místicas como Saci-Pererê, Curupira e Mula Sem Cabeça.

## Como Rodar o Jogo

### Opção 1: Scripts de Execução (Recomendado)
1. **Interface Melhorada**: Execute `run.bat`
2. **Versão Original**: Execute `run-original.bat`

### Opção 2: Linha de Comando
```bash
# Compilar
javac -d out -sourcepath src src\MainGUI.java

# Executar
java -cp out MainGUI
```

### Opção 3: VS Code
1. Abra o projeto no VS Code
2. Pressione `Ctrl+Shift+P`
3. Digite "Tasks: Run Task"
4. Selecione "Executar Jogo (Interface Melhorada)"

## Características do Jogo

### Classes de Personagem
- **Padre**: Especialista em combater o mal, resistente à magia negra
- **Caçador**: Conhece as criaturas da floresta, especialista em rastreamento
- **Guerreiro**: Combatente corajoso, especializado em combate físico

### Inimigos (Lendas Brasileiras)
- **Saci-Pererê**: Travesso das matas, usa redemoinho
- **Curupira**: Protetor da floresta, confunde com seus pés virados
- **Mula Sem Cabeça**: Criatura amaldiçoada, respira chamas infernais

### Sistema de Batalha
- Batalhas em turnos
- Sistema de HP e experiência
- Habilidades especiais
- Progressão de personagem

## Estrutura do Projeto

```
src/
├── Main.java                    # Versão original
├── MainGUI.java                 # Versão com interface melhorada
├── Menu.java                    # Menu do jogo
├── gui/
│   ├── JogoGUI.java            # Interface gráfica (Swing - não funcional)
│   └── JogoConsole.java        # Interface de console melhorada
├── Jogo/
│   └── Jogo.java               # Lógica principal do jogo
├── Batalha/
│   ├── Batalha.java            # Sistema de batalha
│   └── IBatalha.java           # Interface da batalha
├── Personagens/
│   ├── Player.java             # Classe do jogador
│   ├── Personagem.java         # Classe base
│   ├── IPersonagem.java        # Interface base
│   └── Inimigos/               # Inimigos do jogo
├── Categoria/                  # Sistema de categorias/classes
├── Habilidades/               # Sistema de habilidades
└── database/                  # Simulação de banco de dados
```

## Funcionalidades Implementadas

✅ Sistema de menu interativo
✅ Criação automática de personagens
✅ Sistema de batalha funcional
✅ Múltiplos inimigos baseados no folclore brasileiro
✅ Sistema de experiência e progressão
✅ Interface de console melhorada
✅ Logs de batalha
✅ Sistema de habilidades e armas

## Requisitos

- Java JDK 8 ou superior
- Sistema operacional Windows (scripts .bat)

## Como Jogar

1. Execute o jogo usando uma das opções acima
2. Escolha "Nova Campanha" no menu
3. O jogo criará automaticamente 3 personagens com classes diferentes
4. Enfrente os inimigos em batalhas por turnos
5. Use as opções de combate: Atacar, Subir Status, ou Fugir
6. Ganhe experiência e evolua seus personagens
7. Derrote todos os inimigos para vencer a campanha!

## Desenvolvido por

Este projeto foi criado como um exemplo de jogo RPG em Java, demonstrando conceitos de POO, herança, interfaces e design patterns.
