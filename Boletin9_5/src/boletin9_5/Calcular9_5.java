/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calcular9_5 {

    Scanner sc = new Scanner(System.in);
    private int contador;
    private int elementos;
    private int aux_1 = 1;
    private int numero;

    public void calcular() {
        System.out.println("Numero de elementos");
        elementos = sc.nextInt();
        for (contador = 0; contador < elementos; contador++) {
            numero += 2;
            System.out.println(numero);
        }
        for (contador = 1; contador <= elementos; contador++) {
            if (contador % 2 == 0) {
                numero = contador;
            } else {
                numero = -(contador);
            }
            System.out.println(numero);
        }
        numero = 0;
        for (contador = 0; contador < elementos; contador++) {
            System.out.println(numero);
            numero = numero + aux_1;
            aux_1 = numero - aux_1;
        }
    }
}
