/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Nuevos_Tarea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese una cadena de texto");
        String cadena = sc.nextLine();
        
        int contadorVocales = 0;
        
          cadena = cadena.toLowerCase();
  
            for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
               if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
           }           
                System.out.println("La cadena de texto tiene " + contadorVocales + " vocales.");
    sc.close();
    }
}
