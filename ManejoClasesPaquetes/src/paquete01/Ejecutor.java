/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PabloCosta14
 */
public class Ejecutor {

    public static void main(String[] args) {
        //agregar valores atributos de h1 y h2 por 

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        Hospital h1 = new Hospital();
        h1.establecerNumeroCamas(10);

        Hospital h2 = new Hospital();
        h2.establecerNumeroCamas(10);
        System.out.println("Escriba el nombre del hospital");
        String e1 = entrada.nextLine();
        System.out.println("Escriba el numero de camas");
        int e2 = entrada.nextInt();
        System.out.println("Escriba el presupuesto");
        double e3 = entrada.nextDouble();

        h1.establecerNombre(e1);
        h1.establecerNumeroCamas(e2);
        h1.establecerPresupuesto(e3);
        
        entrada.nextLine(); //Limpieza de buffer

        System.out.println("Escriba el nombre del hospital(2)");
        String e4 = entrada.nextLine();
        System.out.println("Escriba el numero de camas(2)");
        int e5 = entrada.nextInt();
        System.out.println("Escriba el presupuesto(2)");
        double e6 = entrada.nextDouble();

        h2.establecerNombre(e4);
        h2.establecerNumeroCamas(e5);
        h2.establecerPresupuesto(e6);

        System.out.println("---------------------------------------");
        System.out.printf("%s \n", "Hola desde el main");
        System.out.println("---------------------------------------");

        System.out.printf("Nombre del primer hospital: %s --- Numero de camas: "
                + "%d --- "
                + "Presupuesto: %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.println("-----------------------------------------------");
        System.out.printf("Nombre del segundo hospital: %s --- Numero de camas: "
                + "%d --- "
                + "Presupuesto: %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());

    }
}
