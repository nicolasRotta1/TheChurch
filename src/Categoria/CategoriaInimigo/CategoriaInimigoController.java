package Categoria.CategoriaInimigo;

public class CategoriaInimigoController {

    private CategoriaInimigo classeInimigo;

    public CategoriaInimigoController(CategoriaInimigo classeInimigo) {
        this.classeInimigo = classeInimigo;
    }


    public CategoriaInimigo getClasseInimigo() {
        return classeInimigo;
    }

    public void setClasseInimigo(CategoriaInimigo classeInimigo) {
        this.classeInimigo = classeInimigo;
    }
}
