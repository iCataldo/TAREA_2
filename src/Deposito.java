import java.util.ArrayList;

class Deposito {
    private ArrayList<Producto> var;

    public Deposito() {
        var = new ArrayList();
    }

    public void addProducto(Producto producto) {
        var.add(producto);
    }

    public Producto getProducto() {
        if (var.size() == 0) {
            return null;
        }
        Producto producto = var.get(0);
        var.remove(0);
        return producto;
    }
}
