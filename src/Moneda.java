abstract class Moneda{
    public Moneda() {
    }
    public Moneda getSerie(){
        return this;
    }
    //@return el valor de la Moneda
    public abstract int getValor();
}
//Se crea un tipo de Moneda que devuelva un valor de 100
class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }
     //@return la de Moneda100 vale 100 
    public int getValor() {
        return 100;
    }
}
//Se crea un tipo de Moneda que devuelva un valor de 500
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
     //@return la de Moneda100 vale 100 
    public int getValor() {
        return 500;
    }
}
//Se crea un tipo de Moneda que devuelva un valor de 1000
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
     //@return la de Moneda100 vale 100 
    public int getValor() {
        return 1000;
    }
}
//Se crea un tipo de Moneda que devuelva un valor de 1500
class Moneda1500 extends Moneda{
    public Moneda1500(){
        super();
    }
     //@return la de Moneda100 vale 100 
    public int getValor() {
        return 1500;
    }
}
