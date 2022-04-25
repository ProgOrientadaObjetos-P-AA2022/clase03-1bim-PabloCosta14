/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author PabloCosta14
 */
public class Ejecutable04 {

    public static void main(String[] args) {

        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        double valor1 = 10000;
        double valor2 = 20000;
        double valor3 = 30000;

        int c1 = 50;
        int c2 = 45;
        int c3 = 25;

        h1.establecerPresupuesto(valor1);
        h2.establecerPresupuesto(valor2);
        h3.establecerPresupuesto(valor3);
        
        h1.establecerNumeroCamas(c1);
        h2.establecerNumeroCamas(c2);
        h3.establecerNumeroCamas(c3);

        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto()
                + h3.obtenerPresupuesto();

        int sum = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas()
                + h3.obtenerNumeroCamas();

        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.println("---------------------------------------------");
        System.out.printf("La suma de las camas es %s\n", sum);

    }
}
