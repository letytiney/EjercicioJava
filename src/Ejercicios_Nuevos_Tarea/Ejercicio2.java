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
public class Ejercicio2 {
        public static void main (String arg []){
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Ingrese el primer numero: ");
             int num1 = sc.nextInt();
             
          System.out.print("Ingrese el segundo numero: ");
             int num2 = sc.nextInt();
             
           int suma = num1 + num2;
           
          System.out.print("La suma es " + suma + "\n ");
        }
}
