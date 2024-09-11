package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestHamburguer {

    @Test
    void deveRetornarPrecoHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples(10.0f);

        assertEquals(10.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerSimples(10.0f));

        assertEquals(11.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerSimples(10.0f));

        assertEquals(12.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoMaisBacon() {
        Hamburguer hamburguer = new Queijo(new Bacon(new HamburguerSimples(10.0f)));

        assertEquals(13.2f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarIngredientesHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples();

        assertEquals("Pão, Carne", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerSimples());

        assertEquals("Pão, Carne/Queijo", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComBaconMaisQueijo() {
        Hamburguer hamburguer = new Queijo(new Bacon(new HamburguerSimples()));

        assertEquals("Pão, Carne/Bacon/Queijo", hamburguer.getIngredientes());
    }
}
