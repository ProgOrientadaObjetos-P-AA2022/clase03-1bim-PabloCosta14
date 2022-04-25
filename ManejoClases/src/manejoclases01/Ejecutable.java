/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;

public class Ejecutable {

    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        H4 h4 = new H4();

        // Se asigna valores particulares al objeto
        hospital.nombre = "San Agustin";
        hospital.numeroCamas = 50;
        hospital.presupuesto = 85740.43;

        h4.nombre = " Hospital Utpl";
        h4.numeroPacientes = 40;
        h4.presupuesto = 4058.25;

        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        System.out.printf("%s - %d - %.2f\n", h4.nombre, h4.numeroPacientes,
                h4.presupuesto);

        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
