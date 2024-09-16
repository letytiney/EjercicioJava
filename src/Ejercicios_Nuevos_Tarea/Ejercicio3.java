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
public class Ejercicio3 {
     public static void main (String arg [])
     {
          Scanner sc = new Scanner(System.in);   
          System.out.print("Ingrese un numero distinto a 0: ");
             int numero = sc.nextInt();
             
       if(numero>0){
          System.out.print("El numero ingresado es POSITIVO");
       }
            else
       {
             System.out.print("El numero ingresado es Negativo");
       }
         sc.close();
     }
}
