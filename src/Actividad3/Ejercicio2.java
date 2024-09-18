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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num= sc.nextInt();
         String tipoNumero = (num>0) ? "positivo" : "negativo";
         
         switch(tipoNumero){
             case "positivo":
                 System.out.println("El numero ingresado es postivo");
                 break;
             case "negativo":
                 System.out.println("El numero ingresado es negativo");
         }
        
    }
}
