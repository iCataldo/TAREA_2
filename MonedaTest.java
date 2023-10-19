import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getValor() {
        assertAll(()->assertEquals(500,new Moneda500().getValor()),
                ()-> assertEquals(100,new Moneda100().getValor()),
                ()-> assertEquals(1000, new Moneda1000().getValor()),
                ()-> assertEquals(1500, new Moneda1500().getValor()));
    }
}