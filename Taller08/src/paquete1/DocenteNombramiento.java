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

    public void establecerSueldo() {
        sueldo = valorSueldo + (numHorasExtra * valorHoraExtra);
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

    @Override
    public String toString() {
        String mensaje = String.format("Nombre: %s\n"
                + "Cédula: %s\n"
                + "Valor del Sueldo: %.2f\n"
                + "Valor Hora Extra: %.2f\n"
                + "Número de Horas Extra: %d\n"
                + "Sueldo Total: %.2f",
                nombre,
                cedula,
                valorSueldo,
                valorHoraExtra,
                numHorasExtra,
                sueldo);

        return mensaje;
    }

}
