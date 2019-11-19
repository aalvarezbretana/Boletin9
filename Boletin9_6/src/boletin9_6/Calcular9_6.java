/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calcular9_6 {

    Scanner sc = new Scanner(System.in);
    float n_empleados;
    float soldo;
    float porcentaxe;
    int contador;
    float aux;
    int aux2;

    public void calculo() {
        System.out.println("Cal é o soldo de cada un dos empleados?");
        soldo = sc.nextFloat();
        while (soldo != 0) {
            if (soldo < 1000) {
                aux++;
            } else if (soldo <= 1750) {
                aux2++;
            }
            n_empleados++;
            soldo = sc.nextFloat();
        }
        if (n_empleados != 0) {
            System.out.println("Porcentaxe de empleados que cobra menos de 1000€: "
                    + (porcentaxe = aux / n_empleados * 100) + "%.");
            System.out.println("Número de empleados con soldos entre 1000€ e 1750€: "
                    + aux2 + ".");
        }
        System.out.println("FIN DE LA CITA!");
    }
}
