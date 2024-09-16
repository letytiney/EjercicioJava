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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros ");
         int maxNumero = Integer.MIN_VALUE;
        for (int i=1; i<=6; i++){
            System.out.println("Ingrese el numero " + i);
              int numeroIngresado = sc.nextInt();
               if (numeroIngresado > maxNumero) {
                maxNumero = numeroIngresado; 
            }

        }
         System.out.println("El número más grande ingresado es: " + maxNumero);
           sc.close();
    }
}
