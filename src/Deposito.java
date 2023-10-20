import java.util.ArrayList;

class Deposito {
    //Se crea una lista que almacena productos
    private ArrayList<Producto> var;

    public Deposito() {
        var = new ArrayList();
    }
    //metodo para agregar Productos al arreglo
    public void addProducto(Producto producto) {
        var.add(producto);
    }
    //metodo para obtenera la informacio del primer Productos y sacarlo de arreglo
    //@return Producto en la primera posicion 
    public Producto getProducto() {
        if (var.size() == 0) {
            return null;
        }
        Producto producto = var.get(0);
        var.remove(0);
        return producto;
    }
}
