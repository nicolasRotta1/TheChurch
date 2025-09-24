package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.Efeito;
import Categoria.EfeitoInimigo;
import java.util.List;

public class CriaturaDaPeste extends CategoriaInimigo {
    public CriaturaDaPeste() {
        super(
                "Criatura da Peste",
                "Monstro que espalha doença e veneno",
                List.of(EfeitoInimigo.TOXINA, EfeitoInimigo.EPIDEMIA),
                TipoCriatura.CRIATURA_DA_PESTE
        );
    }
}
