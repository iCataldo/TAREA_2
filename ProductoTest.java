import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSerie() {
        assertAll(()->assertEquals(1, new Snickers(1).getSerie()),
                ()->assertEquals(2, new CocaCola(2).getSerie()),
                ()->assertEquals(3, new Super8(3).getSerie()),
                ()->assertEquals(4, new Sprite(4).getSerie()));
    }
    @Test
    void beber() {
        assertAll(()->assertEquals("snickers", new Snickers(1).beber()),
                ()->assertEquals("cocacola", new CocaCola(2).beber()),
                ()->assertEquals("sprite", new Sprite(3).beber()),
                ()-> assertEquals("super8", new Super8(4).beber()));
    }
}