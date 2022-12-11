/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prax.ejemplo_si_entonces;
import java.util.Scanner;

/**
 *
 * @author PRAXEDES
 */
public class Ejemplo_si_entonces {

    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        String Linea;
        System.out.println("INGRESAR NUMERO ENTERO");
        System.out.println("PARA QUE EL PROGRAMA DETERMINE SI ES POSIVO O NEGATIVO");
        Linea = mm.nextLine();
        
        int x = Integer.parseInt(Linea);
        
        if (x<0){
            System.out.println("NUMERO NEGATIVO");
        }else{
            System.out.println("NUMERO POSITIVO");
        }
        
    }
}
