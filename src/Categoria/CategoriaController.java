package Categoria;

import Categoria.CategoriaPlayer.Fraqueza;
import Categoria.CategoriaPlayer.Vantagem;
import Personagens.Inimigos.Inimigo;
import Personagens.Personagem;

public class CategoriaController implements ICategoria {

    private CategoriaGeral categoria;

    public CategoriaController(CategoriaGeral categoria) {
        this.categoria = categoria;
    }

    public CategoriaGeral getCategoria() {
        return categoria;
    }

    @Override
    public void subirStatus(Personagem personagem) {
        // Aplica efeitos da categoria no personagem
        for (Efeito efeito : categoria.getEfeitos()) {
            switch (efeito.getTag()) {
                case "ATQ" -> personagem.setAtaque((int) (personagem.getAtaque() * efeito.getMultiplicador()));
                case "DEF" -> personagem.setDefesa((int) (personagem.getDefesa() * efeito.getMultiplicador()));
                case "MAG" -> personagem.setMagia((int) (personagem.getMagia() * efeito.getMultiplicador()));
                case "VEL" -> personagem.setVelocidade((int) (personagem.getVelocidade() * efeito.getMultiplicador()));
                case "HP"  -> personagem.setHp((int) (personagem.getHp() * efeito.getMultiplicador()));
            }
        }
    }

    @Override
    public void verificarFraqueza(Inimigo alvo) {
        double mult = 1.0;

        TipoCriatura tipoAlvo = alvo.getCategoria().getTipoCriatura(); // assume que CategoriaGeral ou CategoriaPlayer/ Inimigo tenha método getTipoCriatura()

        // Vantagens
        for (Vantagem v : getCategoria().getVantagensEnum()) {
            if (v.getTipo() == tipoAlvo) {
                mult *= 1.5; // dano extra
            }
        }

        // Fraquezas
        for (Fraqueza f : categoria.getFraquezasEnum()) { // método retorna List<Fraqueza>
            if (f.getTipo() == tipoAlvo) {
                mult *= 0.5; // dano reduzido
            }
        }

        // Aplica multiplicador no HP do alvo
        alvo.setHp((int)(alvo.getHp() * mult));
    }
}
