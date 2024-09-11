package padroesestruturais.decorator;

public class IngredientesExtras extends HamburguerDecorator {

    public IngredientesExtras(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeIngrediente() {
        return "Extras";
    }
}
