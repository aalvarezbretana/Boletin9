/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calculos9_1 {
    Scanner sc = new Scanner(System.in);
    private int numero;
    private int ctd_posicion;
    private int ctd_positivo;
    private int ctd_negativo;
    private int ctd_cero;
    
    public void calcular(){
        
        while (ctd_posicion < 10){
            System.out.println("Dame numeros");
            numero = sc.nextInt();
            if(numero > 0){
                ctd_positivo++;
            }
            else if(numero < 0){
                ctd_negativo++;
            }else{
                ctd_cero++;
            }ctd_posicion++;
        }System.out.println("El número de positivos es " + ctd_positivo 
                + "\nEl número de negativos es " + ctd_negativo 
                + "\nEl número de ceros es " + ctd_cero);
    }
}
