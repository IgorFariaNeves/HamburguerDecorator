package padroesestruturais.decorator;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeIngrediente() {
        return "Bacon";
    }
}
