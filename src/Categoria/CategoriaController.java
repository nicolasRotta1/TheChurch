package Categoria;

import Personagens.Personagem;

public class CategoriaController implements ICategoria {

    private CategoriaGeral categoria;

    public CategoriaController(CategoriaGeral categoria) {
        this.categoria = categoria;
    }


    public CategoriaGeral getcategoria() {
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
    public void verificarFraqueza(Personagem alvo) {
        double mult = 1.0;

        // Vantagens
        for (String v : categoria.getVantagens()) {
            if (alvo.getCategoria().getNome().equalsIgnoreCase(v)) {
                mult *= 1.5; // dano extra
            }
        }

        // Fraquezas
        for (String f : categoria.getFraquezas()) {
            if (alvo.getCategoria().getNome().equalsIgnoreCase(f)) {
                mult *= 0.5; // dano reduzido
            }
        }


        alvo.setHp((int)(alvo.getHp() * mult));
    }


}
