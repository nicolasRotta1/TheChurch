package Categoria.CategoriaPlayer;

import Categoria.TipoCriatura;
import Personagens.Player;
import Categoria.Efeito;

public class CategoriaPlayerController {

    private final CategoriaPlayer categoria;

    public CategoriaPlayerController(CategoriaPlayer categoria) {
        this.categoria = categoria;
    }

    public void aplicarEfeitos(Player player) {
        for (Efeito efeito : categoria.getEfeitos()) {
            switch (efeito.getTag()) {
                case "ATQ" -> player.setAtaque((int)(player.getAtaque() * efeito.getMultiplicador()));
                case "DEF" -> player.setDefesa((int)(player.getDefesa() * efeito.getMultiplicador()));
                case "MAG" -> player.setMagia((int)(player.getMagia() * efeito.getMultiplicador()));
                case "VEL" -> player.setVelocidade((int)(player.getVelocidade() * efeito.getMultiplicador()));
                case "HP"  -> player.setHp((int)(player.getHp() * efeito.getMultiplicador()));
            }
        }
    }

    public double calcularMultiplicadorContra(TipoCriatura tipoInimigo) {
        double mult = 1.0;

        for (Vantagem v : categoria.getVantagensEnum()) {
            if (v.getTipo() == tipoInimigo) mult *= 1.5;
            break;
        }

        for (Fraqueza f : categoria.getFraquezasEnum()) {
            if (f.getTipo() == tipoInimigo) mult *= 0.8;
            break;
        }

        return mult;
    }
}
