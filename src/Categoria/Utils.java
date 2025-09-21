package Categoria;
import java.util.List;
public class Utils {

    public static double calcularMultiplicador(CategoriaGeral atacante, CategoriaGeral defensor) {
        double mult = 1.0;
        if (atacante == null || defensor == null) return mult;

        List<Efeito> a = atacante.getEfeitos();
        List<Efeito> d = defensor.getEfeitos();
        if (a != null && d != null) {
            for (Efeito ea: a) {
                for (Efeito ed: d) {
                    if (ea.getTag() != null && ea.getTag().equals(ed.getTag())) {
                        mult *= ea.getMultiplicador();
                        mult *= ed.getMultiplicador();
                    }
                }
            }
        }

        // 2. Checa vantagens/fraquezas
        for (String v : atacante.getVantagens()) {
            if (defensor.getNome().equalsIgnoreCase(v)) {
                mult *= 1.5; // vantagem
            }
        }

        for (String f : atacante.getFraquezas()) {
            if (defensor.getNome().equalsIgnoreCase(f)) {
                mult *= 0.5; // fraqueza
            }
        }

        return mult;
    }

}
