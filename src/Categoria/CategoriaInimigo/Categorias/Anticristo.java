package Categoria.CategoriaInimigo.Categorias;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.TipoCriatura;
import Categoria.Efeito;
import java.util.List;

public class Anticristo extends CategoriaInimigo {
    public Anticristo() {
        super(
                "Anticristo",
                "Boss final que domina todos os demônios e corrompe tudo",
                List.of(
                        new Efeito() {
                            @Override
                            public String getTag() { return "ATQ"; }
                            @Override
                            public double getMultiplicador() { return 3.0; }
                            @Override
                            public String getDescricao() { return "Ataque destruidor em área"; }
                        },
                        new Efeito() {
                            @Override
                            public String getTag() { return "MAG"; }
                            @Override
                            public double getMultiplicador() { return 3.0; }
                            @Override
                            public String getDescricao() { return "Dano mágico massivo em todos os inimigos"; }
                        },
                        new Efeito() {
                            @Override
                            public String getTag() { return "DEF"; }
                            @Override
                            public double getMultiplicador() { return 2.0; }
                            @Override
                            public String getDescricao() { return "Resiste a ataques físicos"; }
                        },
                        new Efeito() {
                            @Override
                            public String getTag() { return "MAG_DEF"; }
                            @Override
                            public double getMultiplicador() { return 2.0; }
                            @Override
                            public String getDescricao() { return "Resiste a ataques mágicos"; }
                        }
                ),
                TipoCriatura.ANTI_CRISTO
        );
    }
}
