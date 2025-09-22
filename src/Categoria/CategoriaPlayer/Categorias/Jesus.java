package Categoria.CategoriaPlayer.Categorias;

import Categoria.*;
import Categoria.CategoriaPlayer.CategoriaPlayer;
import Categoria.CategoriaPlayer.Vantagem;
import Habilidades.*;
import java.util.List;
import java.util.ArrayList;

public class Jesus extends CategoriaPlayer {

    public Jesus() {
        super(
                "Jesus",
                "O salvador poderoso, capaz de enfrentar o Anticristo com habilidades divinas",
                List.of(
                        Vantagem.CONTRA_ANTICRISTO
                ),
                List.of(

                ),
                criarHabilidades(),
                List.of(
                        EfeitoPlayer.AUMENTO_ATQ,
                        EfeitoPlayer.AUMENTO_DEF,
                        EfeitoPlayer.AUMENTO_MAG,
                        EfeitoPlayer.BUFF_CURA
                )
        );
    }

    @Override
    public void configurarEvolucoes() {
        // Jesus não evolui
    }

    private static List<Habilidade> criarHabilidades() {
        List<Habilidade> habilidades = new ArrayList<>();

        // =======================
        // DANO FÍSICO
        // =======================
        habilidades.add(new HabilidadeDeDanoFisico("Cajado Divino", TipoHabilidade.PRIMARIA, 2.0, "Golpe físico sagrado que causa grande dano"));
        habilidades.add(new HabilidadeDeDanoFisico("Punho da Justiça", TipoHabilidade.ESPECIAL, 2.5, "Ataque físico poderoso com aura divina"));

        // =======================
        // DANO MÁGICO
        // =======================
        habilidades.add(new HabilidadeDeDanoMagico("Raio Celestial", TipoHabilidade.PRIMARIA, 2.2, "Dano mágico sagrado em inimigos"));
        habilidades.add(new HabilidadeDeDanoMagico("Chama Purificadora", TipoHabilidade.ESPECIAL, 3.0, "Dano mágico massivo que purifica o mal"));

        // =======================
        // DEBUFFS
        // =======================
        habilidades.add(new HabilidadeDeDebuff("Maldição de Redenção", List.of("ataque","magia"), 5, "Reduz ataque e magia de inimigos do mal"));
        habilidades.add(new HabilidadeDeDebuff("Medo Divino", List.of("velocidade","defesa"), 5, "Reduz velocidade e defesa de inimigos demoníacos"));

        // =======================
        // BUFFS
        // =======================
        habilidades.add(new HabilidadeDeBuff("Aura de Proteção", List.of("defesa","magia"), 5, "Aumenta defesa e magia de aliados próximos"));
        habilidades.add(new HabilidadeDeBuff("Força Divina", List.of("ataque","velocidade"), 5, "Aumenta ataque e velocidade de aliados"));

        // =======================
        // CURA
        // =======================
        habilidades.add(new HabilidadeDeCura("Cura Sagrada", TipoHabilidade.CURA, 2.5, "Restaura HP de aliados próximos"));
        habilidades.add(new HabilidadeDeCura("Purificação", TipoHabilidade.CURA, 3.0, "Restaura HP e remove debuffs"));

        return habilidades;
    }
}
