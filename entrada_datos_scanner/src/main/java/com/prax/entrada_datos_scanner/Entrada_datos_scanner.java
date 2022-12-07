/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prax.entrada_datos_scanner;
import java.util.Scanner; //IMPORTAR METODO SCANNER
/**
 *
 * @author PRAXEDES
 */
public class Entrada_datos_scanner {

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        System.out.println("ESCRIBE TU NOMBRE");
        String nombre = dato.nextLine();
        System.out.println("fuck you "+nombre);
        
        
    }
}
