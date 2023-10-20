import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {
    
@org.junit.jupiter.api.BeforeAll
    static void setUp(){
        System.out.println("@BeforeAll executed");
    }
    
    @org.junit.jupiter.api.BeforeEach
    void setUpThis() {
        System.out.println("@BeforeEach executed");
    }
    
    @org.junit.jupiter.api.AfterEach
    void tearDownThis() {
        System.out.println("@AfterEach executed");
    }
    
    @org.junit.jupiter.api.AfterAll
    static void tearDown(){
        System.out.println("@AfterAll executed");
    }
    
    @org.junit.jupiter.api.Test
    void getValor() {
        System.out.println("=====TEST getValor() EXECUTED=====");
        assertAll(()->assertEquals(500,new Moneda500().getValor()),
                ()-> assertEquals(100,new Moneda100().getValor()),
                ()-> assertEquals(1000, new Moneda1000().getValor()),
                ()-> assertEquals(1500, new Moneda1500().getValor()));
    }
}
