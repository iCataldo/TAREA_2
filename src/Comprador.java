class Comprador {

    private String sonido;
    private int vuelto = 0;

    public Comprador(Moneda m, int cual, Expendedor exp) {
        Producto bebida = exp.comprarBebida(m, cual);
        if (bebida == null) {
            this.sonido = "null";
            if (m != null) {
                for (int i = 0; i < m.getValor(); i = i + 100) {
                    exp.getVuelto();
                }
                vuelto = m.getValor();
            }
        } else {
            this.sonido = bebida.beber();
            for (int i = 0; i < m.getValor(); i = i + 100) {
                if (exp.getVuelto() != null) {
                    vuelto = vuelto + 100;
                }
            }
        }

    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;

    }
}
