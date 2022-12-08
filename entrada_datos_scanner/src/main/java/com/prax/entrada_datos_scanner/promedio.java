/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.prax.entrada_datos_scanner;
import java.util.Scanner;

/**
 *
 * @author PRAXEDES
 */
public class promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner prom = new Scanner(System.in);
        System.out.print("introduce 3 numeros decimales separados por un espacio");
        double n1=prom.nextDouble();
        double n2=prom.nextDouble();
        double n3=prom.nextDouble();
        double promedio = (n1+n2+n3)/3;
        System.out.println("PROMEDIO =" + promedio);
    }
    
}
