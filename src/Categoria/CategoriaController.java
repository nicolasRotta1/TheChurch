package Categoria;

import Personagens.Personagem;

public class CategoriaController implements ICategoria {

    public CategoriaController() {
    }

    @Override
    public void AplicarEfeitos(Personagem personagem) {
        if (personagem.getCategoria() == null) return;

        for (Efeito efeito : personagem.getCategoria().getEfeitos()) {
            switch (efeito.getTag()) {
                case "ATQ" -> personagem.setAtaque((int) (personagem.getAtaque() * efeito.getMultiplicador()));
                case "DEF" -> personagem.setDefesa((int) (personagem.getDefesa() * efeito.getMultiplicador()));
                case "MAG" -> personagem.setMagia((int) (personagem.getMagia() * efeito.getMultiplicador()));
                case "HP"  -> personagem.setHp((int) (personagem.getHp() * efeito.getMultiplicador()));
            }
        }
    }
}
