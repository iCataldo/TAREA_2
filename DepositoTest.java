import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
class DepositoTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void getProucto() {
        Deposito dep = new Deposito();
        Producto n1 = new CocaCola(1),n2=new Sprite(2),n3=new Snickers(3),n4=new Super8(4);
        dep.addProducto(n1);
        dep.addProducto(n2);
        dep.addProducto(n3);
        dep.addProducto(n4);
        assertAll(()->assertEquals(dep.getProducto(),n1),
                ()-> assertEquals(dep.getProducto(),n2),
                ()-> assertEquals(dep.getProducto(),n3),
                ()-> assertEquals(dep.getProducto(),n4));
    }
}