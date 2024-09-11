package padroesestruturais.decorator;

public class HamburguerSimples implements Hamburguer {

    public float preco;

    public HamburguerSimples() {
    }

    public HamburguerSimples(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return "Pão, Carne";
    }

}
