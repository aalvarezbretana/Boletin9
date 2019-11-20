/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calculos9_3 {

    private float base;
    private float altura;
    private float valor;
    Scanner sc = new Scanner(System.in);

    public float validar() {
        do {
            valor = sc.nextFloat();
        } while (valor <= 0);
        return valor;
    }

    public void calcular() {
        System.out.println("Altura?");
        altura = validar();
        System.out.println("Base?");
        base = validar();
        System.out.println(base * altura);
    }
}
