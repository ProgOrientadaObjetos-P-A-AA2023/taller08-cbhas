package paquete1;

public class DocenteFactura extends Docente {

    protected double valorFactura;
    protected int valorIVADescuento;
    protected double valorCancelar;

    public void establecerValorFactura(double vF) {
        valorFactura = vF;
    }

    public void establecerValorIVADescuento(int vID) {
        valorIVADescuento = vID;
    }

    public void establecerValorCancelar() {
        valorCancelar = valorFactura - ((valorIVADescuento * valorFactura) / 100);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public int obtenerValorIVADescuento() {
        return valorIVADescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Nombre: %s\n"
                + "Cédula: %s\n"
                + "Valor Factura: %.2f\n"
                + "Valor IVA: %d\n"
                + "Valor a cancelar: %.2f",
                nombre,
                cedula,
                valorFactura,
                valorIVADescuento,
                valorCancelar);

        return mensaje;
    }

}
