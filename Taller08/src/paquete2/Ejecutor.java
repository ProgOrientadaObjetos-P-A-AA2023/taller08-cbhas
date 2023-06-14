package paquete2;

import java.util.Scanner;
import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su cédula:");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese 1 para crear Nombramiento de Docente\n"
                    + "Ingrese 2 para crear una Factura");
            String opcion = entrada.nextLine();

            if ("1".equals(opcion)) {
                System.out.println("Ingrese su sueldo:");
                double sueldo = entrada.nextDouble();
                System.out.println("Ingrese el valor de hora extra:");
                double hExtra = entrada.nextDouble();
                System.out.println("Ingrese el número de horas extra:");
                int numHorasExtra = entrada.nextInt();
                entrada.nextLine();

                DocenteNombramiento dN = new DocenteNombramiento();

                dN.establecerNombre(nombre);
                dN.establecerCedula(cedula);
                dN.establecerValorSueldo(sueldo);
                dN.establecerValorHoraExtra(hExtra);
                dN.establecerNumHorasExtra(numHorasExtra);
                dN.establecerSueldo();
                System.out.printf("%s\n", dN);

                System.out.println("Ingrese 'si' para salir del programa:");
                opcion = entrada.nextLine();

                if ("si".equals(opcion)) {
                    bandera = false;
                }

            } else if ("2".equals(opcion)) {
                System.out.println("Ingrese el valor de la Factura:");
                double valorFactura = entrada.nextDouble();
                System.out.println("Ingrese el valor del IVA:");
                int IVA = entrada.nextInt();
                entrada.nextLine();

                DocenteFactura dF = new DocenteFactura();

                dF.establecerNombre(nombre);
                dF.establecerCedula(cedula);
                dF.establecerValorFactura(valorFactura);
                dF.establecerValorIVADescuento(IVA);
                dF.establecerValorCancelar();

                System.out.printf("%s\n", dF);

                System.out.println("Ingrese 'si' para salir del programa:");
                opcion = entrada.nextLine();

                if ("si".equals(opcion)) {
                    bandera = false;
                }

            } else {
                System.out.println("Opción Incorrecta!!");
                return;
            }
        }

    }
}
