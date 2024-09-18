/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1= sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2= sc.nextInt();
        
         String numMayor = (num1>num2) ? "mayor" : "menor";
         
         switch(numMayor){
             case "mayor":
                 System.out.println("El orden de mayor a menor es "+ num1 +", "+ num2);
                 break;
             case "menor":
                 System.out.println("El orden de mayor a menor es "+ num2 +", "+ num1);
                 break;
             default:
                 System.out.println("Ingrese el dato correctamente");
         }
        
    }   
}
