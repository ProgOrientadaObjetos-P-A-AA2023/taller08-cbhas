package paquete2;

import java.util.Scanner;
import paquete1.Docente;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 1 para ingresar crear Nombramiento de Docente");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su cédula:");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su sueldo:");
            double sueldo = entrada.nextDouble();
            System.out.println("Ingrese el valor de hora extra:");
            double hExtra = entrada.nextDouble();
            System.out.println("Ingrese el número de horas extras:");
            int numHorasExtra = entrada.nextInt();

            Docente d = new Docente();

        } else if (opcion == 2) {

        } else {
            System.out.println("Opción Incorrecta!!");
        }
    }

}
