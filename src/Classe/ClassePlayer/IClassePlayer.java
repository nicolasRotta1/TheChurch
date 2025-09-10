package Classe.ClassePlayer;

import java.util.List;


public interface IClassePlayer {
    void configurarEvolucoes();

    List<Class<? extends ClassePlayer>> getEvolucoes(ClassePlayer classeAtual);

    ClassePlayer evoluir(ClassePlayer classeAtual, int escolha) throws Exception;
}
