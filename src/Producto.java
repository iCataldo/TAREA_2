abstract class Producto{
    private int serie;

    public Producto(int n) {
        serie = n;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();
}
//Los tipos de Productos se dibiden entre los que son Bebidas y los Dulces
abstract class Bebida extends Producto{

    public Bebida(int n) {
        super(n);
    }
}
abstract class Dulce extends Producto{
    public Dulce(int n) {
        super(n);
    }
}
//los tipos de Dulce se dividen entre Super8 y Snicker
class Snickers extends Dulce{

    public Snickers(int n) {
        super(n);
    }
    public String beber(){
        return "snickers";
    }
}
class Super8 extends Dulce{

    public Super8(int n) {
        super(n);
    }
    public String beber(){
        return "super8";
    }
}

//los tipos de Bebida se dividen entre Coca y Sprite
class CocaCola extends Bebida{

    public CocaCola(int n) {
        super(n);
    }
    public String beber(){
        return "cocacola";
    }
}
class Sprite extends Bebida{
    public Sprite(int n) {
        super(n);
    }
    public String beber(){
        return "sprite";
    }
}
