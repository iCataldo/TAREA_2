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
    //Metodo para comprar bebidas
    public Producto comprarBebida(Moneda moneda, int tipo) {
        //Se guardda el valor que le combra por producto
        int cobro = 0;
        Producto pro=null;
        // la moneda no existe no regresa nada
        if (moneda == null) {
            return null;
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (1 == tipo) {
            if (moneda.getValor() >= PRODUCTOS.PreCoca.precio){
                pro = coca.getProducto();
                if (pro != null) {
                    cobro = PRODUCTOS.PreCoca.precio;
                }
            }
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (2 == tipo) {
            if (moneda.getValor() >= PRODUCTOS.PreSprite.precio) {
                pro = sprite.getProducto();
                if (pro != null) {
                    cobro = PRODUCTOS.PreSprite.precio;
                } else {
                    pro = null;
                }
            }
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (3 == tipo) {
            if (moneda.getValor() >= PRODUCTOS.PreSniker.precio) {
                pro = snicker.getProducto();
                if (pro != null) {
                    cobro = PRODUCTOS.PreSniker.precio;
                } else {
                    pro = null;
                }
            }
        }
        /*
        Si el Producto pedido existe la maquina lo entrega y cobra el pedido
        En caso de que no entrege nada no cobra nada
         */
        if (4 == tipo) {
            if (moneda.getValor() >= PRODUCTOS.PreSuper8.precio) {
                pro = supe8.getProducto();
                if (pro != null) {
                    cobro = PRODUCTOS.PreSuper8.precio;
                } else {
                    pro = null;
                }
            }
        }
        //Se calcula el vuelto con el valor de la moneda y el cobro
        int vuelto = moneda.getValor() - cobro;
        for (int i = 0; i < vuelto; i = i + 100) {
            monVu.addMoneda();
        }
        return pro;

    }
    //El vuelto se obtiene sacando de a una Moneda
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

}
