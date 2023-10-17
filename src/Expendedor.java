class Expendedor {
    public enum PRODUCTOS {
        PreCoca(800),
        PreSprite(700),
        PreSniker(500),
        PreSuper8(300);
        private final int precio;
        PRODUCTOS(int precio){
            this.precio=precio;
        }
    }
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNICKERS = 3;
    public static final int SUPER8 = 4;
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
        for (int i = 0; i < n; i++) {
            Bebida cocacola = new CocaCola(100 + i);
            coca.addProducto(cocacola);
            Bebida sprites = new Sprite(200 + i);
            sprite.addProducto(sprites);
            Dulce snickers = new Snickers(100 + i);
            snicker.addProducto(snickers);
            Dulce super8 = new Super8(200 + i);
            supe8.addProducto(super8);


        }

    }

    public Producto comprarBebida(Moneda moneda, int tipo) {
        int cobro = 0;
        int precio;
        if (moneda == null) {
            return null;
        }
        Producto pro=null;
        if (1 == tipo) {
            precio = PRODUCTOS.PreCoca.precio;
            if (moneda.getValor() >= precio){
                pro = coca.getProducto();
                if (pro != null) {
                    cobro = precio;
            }
          }
        }
        if (2 == tipo) {
            precio=PRODUCTOS.PreSprite.precio;
            if (moneda.getValor() >= precio) {
                pro = sprite.getProducto();
                if (pro != null) {
                    cobro = precio;
                } else {
                    pro = null;
                }
            }
        }
        if (3 == tipo) {
            precio=PRODUCTOS.PreSniker.precio;
            if (moneda.getValor() >= precio) {
                pro = snicker.getProducto();
                if (pro != null) {
                    cobro = precio;
                } else {
                    pro = null;
                }
            }
        }
        if (4 == tipo) {
            precio=PRODUCTOS.PreSuper8.precio;
            if (moneda.getValor() >= precio) {
                pro = supe8.getProducto();
                if (pro != null) {
                    cobro = precio;
                } else {
                    pro = null;
                }
            }
        }
        int vuelto = moneda.getValor() - cobro;
        for (int i = 0; i < vuelto; i = i + 100) {
            monVu.addMoneda();
        }
        return pro;

    }

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

}
