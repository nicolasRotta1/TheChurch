package Batalha;
//gerencia a logica do combate
import Personagens.Personagem;

import java.util.List;

public class Batalha {
    private List<Personagem> personagens;
    private int turnoAtual = 0;

    public Batalha(List<Personagem> personagens) {
        this.personagens = personagens;
    }
    public void iniciar(){
        System.out.println(" Que começem os Jogos!");

        while (!batalhaTerminou()){
            Personagem atual = personagens.get(turnoAtual);
            Personagem alvo = escolherAlvo(atual);

            if (alvo!=null && atual.getHp() >0){
                System.out.println(atual.getNome()+ "está atacando"+ alvo.getNome());
                atual.atacar(alvo);
                System.out.println(alvo.getNome()+ "agora tem"+ alvo.getHp()+"de HP.");
            }
            proximoTurno();
        }
        System.out.println("A luta terminou!!");
        mostrarResultado();
    }
    private Personagem escolherAlvo(Personagem atacante){
        for(Personagem p: personagens){
            if(!p.equals(atacante)&&p.getHp()>0){
                return p;
            }
        }
        return null;
    }
    private void proximoTurno(){
        turnoAtual = (turnoAtual+1)% personagens.size();
    }
    private boolean batalhaTerminou(){
        int vivos = 0;
        for (Personagem p: personagens){
            if(p.getHp()>0) vivos++;
        }
        return vivos<=1;
    }
    private void mostrarResultado(){
        for(Personagem p:personagens){
            if(p.getHp()>0){
                System.out.println("Vitoria"+ p.getNome()+"venceu a luta!");
            }
        }
    }
}
