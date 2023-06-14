package paquete1;

public class Docente {

    protected String nombre;
    protected String cedula;

    public Docente(String n, String c, double vS, double hE, int nHE) {
        nombre = n;
        cedula = c;
        valorSueldo = vS;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String mensaje = String.format("");

        return mensaje;
    }

}
