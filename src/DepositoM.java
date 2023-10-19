import java.util.ArrayList;

class DepositoM {

    //Se crea una lista que almacena Moneda
    private ArrayList<Moneda> ver;

    public DepositoM() {
        ver = new ArrayList();
    }

    //metodo para agregar  Moneda al arreglo
    public void addMoneda() {
        Moneda mon = new Moneda100();
        ver.add(mon);
    }
    //metodo para obtenera la informacio del primera Monedas y sacarlo de arreglo
    public Moneda getMoneda() {
        if (ver.size() == 0) {
            return null;
        } else {
            Moneda moneda = ver.get(0);
            ver.remove(0);
            return moneda;
        }
    }
}
