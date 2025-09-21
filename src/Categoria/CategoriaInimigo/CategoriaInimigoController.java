package Categoria.CategoriaInimigo;

public class CategoriaInimigoController {

    private CategoriaInimigo inimigo;

    public CategoriaInimigoController(CategoriaInimigo inimigo) {
        this.inimigo = inimigo;
    }

    public CategoriaInimigo getInimigo() { return inimigo; }
    public void setInimigo(CategoriaInimigo inimigo) { this.inimigo = inimigo; }
}
