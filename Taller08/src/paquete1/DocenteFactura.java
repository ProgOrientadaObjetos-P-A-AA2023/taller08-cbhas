package paquete1;

public class DocenteFactura extends Docente {

    protected double valorFactura;
    protected double valorIVADescuento;
    protected double valorCancelar;

    public void establecerValorFactura(double vF) {
        valorFactura = vF;
    }

    public void establecerValorIVADescuento(double vID) {
        valorIVADescuento = vID;
    }

    public void establecerValorCancelar(double vC) {
        valorCancelar = vC;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIVADescuento() {
        return valorIVADescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

}
