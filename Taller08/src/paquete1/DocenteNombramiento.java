package paquete1;

public class DocenteNombramiento extends Docente {

    protected double valorSueldo;
    protected double valorHoraExtra;
    protected int numHorasExtra;
    protected double sueldo;

    public void establecerValorSueldo(double vS) {
        valorSueldo = vS;
    }

    public void establecerValorHoraExtra(double vHE) {
        valorHoraExtra = vHE;
    }

    public void establecerNumHorasExtra(int nHE) {
        numHorasExtra = nHE;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public int obtenerNumHorasExtra() {
        return numHorasExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

}
