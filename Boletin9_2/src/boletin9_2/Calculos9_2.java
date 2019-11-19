/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author aalvarezbretana
 */
public class Calculos9_2 {

    private int acumulador_suma;
    private double acumulador_producto = 1;
    private int contador = 10;

    public void calcular() {
        while (contador <= 90) {
            acumulador_suma = contador + acumulador_suma;
            acumulador_producto = contador * acumulador_producto;
            contador++;
        }
        System.out.println("La suma es " + acumulador_suma + " y el producto es " + acumulador_producto);
        /*for (contador = 10; contador <= 90; contador++) {
            suma = contador + suma;
            producto = contador * producto;
        }
        System.out.println(suma + "\n" + producto);*/
    }
}
