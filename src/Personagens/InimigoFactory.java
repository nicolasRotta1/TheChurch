package Personagens;

import Categoria.CategoriaInimigo.CategoriaInimigo;
import Categoria.CategoriaInimigo.Categorias.*;
import Habilidades.Habilidade;
import Habilidades.HabilidadesFactoryInimigo;

public class InimigoFactory {

    // =======================
    // Fantasminha (Fraco)
    // =======================
    public static Inimigo criarFantasminha() {
        return new Inimigo(
                "Fantasminha",
                new FantasmaComum(),
                50,    // HP
                8,     // Ataque
                2,     // Defesa
                5,     // Magia
                0.1,   // Esquiva
                0.05,  // Crítico
                10,    // Energia
                1,     // Level
                20     // XP
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.TOQUE_ESPECTRAL);
                habilidades.add(HabilidadesFactoryInimigo.DESORIENTACAO_FANTASMAL);
            }
        };
    }

    // =======================
    // Poltergeist Menor
    // =======================
    public static Inimigo criarPoltergeistMenor() {
        return new Inimigo(
                "Poltergeist Menor",
                new Poltergeist(),
                80,
                12,
                4,
                8,
                0.12,
                0.08,
                15,
                3,
                50
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.ARREMESSO_OBS);
                habilidades.add(HabilidadesFactoryInimigo.TERROR_POLTERGEIST);
            }
        };
    }

    // =======================
    // Vampiro Nefesfato (Chegando no forte)
    // =======================
    public static Inimigo criarVampiroNefesfato() {
        return new Inimigo(
                "Vampiro Nefesfato",
                new Vampiro(),
                180,
                25,
                12,
                20,
                0.15,
                0.2,
                40,
                7,
                120
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.MORDIDA_VAMPIRICA);
                habilidades.add(HabilidadesFactoryInimigo.CORRUPCAO_SANGUINARIA);
                habilidades.add(HabilidadesFactoryInimigo.SANGUE_SOMBRIO);
            }
        };
    }

    // =======================
    // Bruxo Corrupto
    // =======================
    public static Inimigo criarBruxoCorrupto() {
        return new Inimigo(
                "Bruxo Corrupto",
                new Bruxo(),
                250,
                30,
                18,
                35,
                0.1,
                0.15,
                50,
                9,
                180
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.RAIO_ARCANICO);
                habilidades.add(HabilidadesFactoryInimigo.HEX_ARCANICO);
                habilidades.add(HabilidadesFactoryInimigo.ENERGIA_ARCANICA);
            }
        };
    }

    // =======================
    // Demônio Infernal
    // =======================
    public static Inimigo criarDemonioInfernal() {
        return new Inimigo(
                "Demônio Infernal",
                new Demonio(),
                400,
                45,
                25,
                40,
                0.12,
                0.2,
                70,
                12,
                250
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.CHAMA_DO_INFERNO);
                habilidades.add(HabilidadesFactoryInimigo.FURIA_DEMONIACA);
                habilidades.add(HabilidadesFactoryInimigo.INTIMIDACAO_DEMONIACA);
            }
        };
    }

    // =======================
    // Anjo Caído Supremo
    // =======================
    public static Inimigo criarAnjoCaidoSupremo() {
        return new Inimigo(
                "Anjo Caído Supremo",
                new AnjoCaido(),
                550,
                50,
                35,
                60,
                0.18,
                0.25,
                80,
                15,
                400
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.LUZ_CORRUPTA);
                habilidades.add(HabilidadesFactoryInimigo.BENCAO_MALDITA);
                habilidades.add(HabilidadesFactoryInimigo.DESOLACAO);
            }
        };
    }

    // =======================
    // Anticristo (BOSS FINAL)
    // =======================
    public static Inimigo criarAnticristo() {
        return new Inimigo(
                "Anticristo",
                new Anticristo(),
                1200,
                80,
                50,
                100,
                0.25,
                0.3,
                150,
                20,
                1000
        ) {
            {
                habilidades.add(HabilidadesFactoryInimigo.GOLPE_DO_CAOS);
                habilidades.add(HabilidadesFactoryInimigo.RAIO_APOCALIPTICO);
                habilidades.add(HabilidadesFactoryInimigo.MALDICAO_DO_APOCALIPSE);
                habilidades.add(HabilidadesFactoryInimigo.REGENERACAO_ABSOLUTA);
            }
        };
    }
}
