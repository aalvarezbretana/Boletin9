/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calculos9_4 {

    private int num;
    private int cont;
    private int tabla;
    Scanner sc = new Scanner(System.in);

    public void calcular() {
        System.out.println("De que numero quieres saber su tabla de multiplicar?");
        num = sc.nextInt();
        while (num != 0) {
            System.out.println("La tabla de " + num + " es:\n");
            for (cont = 0; cont <= 10; cont++) {
                tabla = cont * num;
                System.out.println(tabla);
            }
            System.out.println("De que numero quieres saber su tabla de multiplicar?");
            num = sc.nextInt();
            System.out.println("Fin de la cita!");
        }
    }
}
