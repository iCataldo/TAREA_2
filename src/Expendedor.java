class Expendedor {
    public enum PRODUCTOS {
        //Cada Producto obtine su precio
        PreCoca(800),
        PreSprite(700),
        PreSniker(500),
        PreSuper8(300);
        private final int precio;
        PRODUCTOS(int precio){
            this.precio=precio;
        }
    }
    //Cada producto se puede llamar con el nombre de la variable
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNICKERS = 3;
    public static final int SUPER8 = 4;
    //Se generaran varios depositos de la maquina para que guarden su respectivo Producto y Monedas
    private Deposito coca;
    private Deposito sprite;
    private Deposito snicker;
    private Deposito supe8;
    private DepositoM monVu;
    public Expendedor(int n) {

        monVu = new DepositoM();
        coca = new Deposito();
        sprite = new Deposito();
        snicker = new Deposito();
        supe8 = new Deposito();
        //Se rellenan los depositos con con una cantidad "n" de cada Producto y se le asigna un numero de serie
        for (int i = 0; i < n; i++) {
            Bebida cocacola = new CocaCola(100 + i);
            coca.addProducto(cocacola);
            Bebida sprites = new Sprite(200 + i);
            sprite.addProducto(sprites);
            Dulce snickers = new Snickers(300 + i);
            snicker.addProducto(snickers);
            Dulce super8 = new Super8(400 + i);
            supe8.addProducto(super8);


        }

    }
    //Metodo para comprar produco al ingresar una moneda y selecionar una con su numero
    //@return Prodducto
   public Producto comprarBebida(Moneda moneda, int tipo)
    throws NoHayProductoException,PagoIncorrectoException,PagoInsuficienteException{
        //Se guardda el valor del vuelto y el producto
        int vuelto = 0;
        Producto pro=null;
        // la moneda no existe no regresa nada
        if (moneda == null) {
            throw new PagoIncorrectoException("No Se Ingreso Ninguna Moneda");
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */

        if (1==tipo) {
            vuelto = moneda.getValor() - PRODUCTOS.PreCoca.precio;
            if (0<=vuelto){
                pro = coca.getProducto();
                if (pro == null)  {
                    throw new NoHayProductoException("Se Agoto La CocaCola");
                }
            }
            else {
                throw new PagoInsuficienteException("Faltan: "+-vuelto+"$");
            }
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (2==tipo) {
            vuelto = moneda.getValor() - PRODUCTOS.PreSprite.precio;
            if (0<=vuelto) {
                pro = sprite.getProducto();
                if (pro == null){
                    throw new NoHayProductoException("Se Agoto La Sprite");
                }
            }
            else {
                throw new PagoInsuficienteException("Faltan: "+-vuelto+"$");
            }
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (3==tipo) {
            vuelto = moneda.getValor() - PRODUCTOS.PreSniker.precio;
            if (0<=vuelto) {
                pro = snicker.getProducto();
                if (pro == null){
                    throw new NoHayProductoException("Se Agoto Los Snickers");
                }
            }
            else {
                throw new PagoInsuficienteException("Faltan: "+-vuelto+"$");
            }
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (4 == tipo) {
            vuelto = moneda.getValor() - PRODUCTOS.PreSuper8.precio;
            if (0<=vuelto) {
                pro = supe8.getProducto();
                if (pro == null){
                    throw new NoHayProductoException("Se Agoto Los Super8");
                }
            }
            else {
                throw new PagoInsuficienteException("Faltan: "+-vuelto+"$");
            }
        }
        //Se coloca el vuelto en el depositoM como moneda
        if (!(0<tipo&&tipo<5)){
            throw new NoHayProductoException("No Existe Tal Producto");
        }
        for (int i = 0; i < vuelto; i = i + 100) {
            monVu.addMoneda();
        }
        return pro;
    }

    //Se saca de a una Moneda del vuelto
    //@return Moneda100 
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

}
