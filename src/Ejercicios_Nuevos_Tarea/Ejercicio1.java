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
public class Ejercicio1 {
       public static void main (String arg []){
          Scanner sc = new Scanner(System.in);
          System.out.print("Ingrese su edad: ");
        int edadIngresada = sc.nextInt();
           if(edadIngresada>18){
                System.out.println("Es mayor de edad");
           } else{
                 System.out.println("Es menor de edad");
           }
             sc.close();
    } 
}
