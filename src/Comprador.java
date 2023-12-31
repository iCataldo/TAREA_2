class Comprador {
    /*variables que guarda el nombre de la bebida
      y el vuelto del cliente
    * */
    private String sonido= "null";
    private int vuelto = 0;

    public Comprador(Moneda m, int cual, Expendedor exp) throws NoHayProductoException,PagoInsuficienteException,PagoIncorrectoException {

        Producto bebida = exp.comprarBebida(m, cual);
        //verifica si hay una bebida que comprar
        if (bebida != null) {
            this.sonido = bebida.beber();
        }
        //verifica si la moneda existe y saca el vuelto
        if (m!=null) {
            for (int i = 0; i < m.getValor(); i = i + 100) {
                if (exp.getVuelto() != null) {
                    vuelto = vuelto + 100;
                }
            }
        }
    }
    //@return cuanto dinero te devuelve despues de la compra
    public int cuantoVuelto() {
        //retorna cuanto vuelto obtuviste
        return vuelto;
    }
    //@return el Nombre del producto
    public String queBebiste() {
        return sonido;
    }
}
