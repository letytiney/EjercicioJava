/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    public static void main (String arg []){
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        
        double restutadoDoble = Math.pow(num, 2);
         double restutadoTriple = Math.pow(num, 3);
     
    
        System.out.println("Resutlado doble del numero ingresado: " + restutadoDoble);
         System.out.println("Resutlado triple del numero ingresado: " + restutadoTriple);
    } 
}
