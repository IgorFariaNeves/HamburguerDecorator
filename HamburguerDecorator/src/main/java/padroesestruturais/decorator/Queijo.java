package padroesestruturais.decorator;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeIngrediente() {
        return "Queijo";
    }
}
