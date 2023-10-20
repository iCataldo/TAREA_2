import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoMTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void getMoneda() {
        DepositoM dep = new DepositoM();
        dep.addMoneda();
        dep.addMoneda();
        dep.addMoneda();
        assertAll(()->assertEquals(dep.getMoneda().getValor(),new Moneda100().getValor()),
                ()-> assertEquals(dep.getMoneda().getValor(),new Moneda100().getValor()),
                ()-> assertEquals(dep.getMoneda().getValor(),new Moneda100().getValor()),
                ()-> assertEquals(dep.getMoneda(),null));
    }
}