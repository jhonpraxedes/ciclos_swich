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
public class si_entonces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner met = new Scanner(System.in);
         
         System.out.println("¿cual es la capital de Croacia?");
         String respuesta = met.nextLine();
         
         if(respuesta.equals("Zagreb") ){
             System.out.println("CORRECTO!!!! "+ respuesta);
         }else{
             System.out.println("incorrecto " + "Zagreb");
         }
    }
    
}
