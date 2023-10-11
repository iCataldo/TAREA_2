class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNICKERS = 3;
    public static final int SUPER8 = 4;
    private Deposito coca;
    private Deposito sprite;
    private Deposito snicker;
    private Deposito supe8;
    private DepositoM monVu;
    private int precio;

    public Expendedor(int n, int precio) {
        this.precio = precio;
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
        if (moneda == null) {
            return null;
        }
        if (precio <= moneda.getValor()) {
            if (1 == tipo) {
                Producto beb = coca.getProducto();
                if (beb != null) {
                    cobro = precio;
                }
                int vuelto = moneda.getValor() - cobro;
                for (int i = 0; i < vuelto; i = i + 100) {
                    monVu.addMoneda();
                }
                return beb;
            }
            if (2 == tipo) {
                Producto beb = sprite.getProducto();
                if (beb != null) {
                    cobro = precio;
                }
                int vuelto = moneda.getValor() - cobro;
                for (int i = 0; i < vuelto; i = i + 100) {
                    monVu.addMoneda();
                }
                return beb;
            }
            if (3 == tipo) {
                Producto dulce = snicker.getProducto();
                if (dulce != null) {
                    cobro = precio;
                }
                int vuelto = moneda.getValor() - cobro;
                for (int i = 0; i < vuelto; i = i + 100) {
                    monVu.addMoneda();
                }
                return dulce;
            }
            if (4 == tipo) {
                Producto dulce = supe8.getProducto();
                if (dulce != null) {
                    cobro = precio;
                }
                int vuelto = moneda.getValor() - cobro;
                for (int i = 0; i < vuelto; i = i + 100) {
                    monVu.addMoneda();
                }
                return dulce;
            }
        }
        int vuelto = moneda.getValor() - cobro;
        for (int i = 0; i < vuelto; i = i + 100) {
            monVu.addMoneda();
        }
        return null;
    }

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

}
