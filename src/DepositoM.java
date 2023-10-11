import java.util.ArrayList;

class DepositoM {
    private ArrayList<Moneda> ver;

    public DepositoM() {
        ver = new ArrayList();
    }

    public void addMoneda() {
        Moneda mon = new Moneda100();
        ver.add(mon);
    }

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
