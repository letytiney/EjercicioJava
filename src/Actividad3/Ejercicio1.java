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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primero numero");
        int num1= sc.nextInt();
        System.out.println("Ingrese el Segundo numero");
        int num2= sc.nextInt();
        
        String valoresIngresados = (num1 == num2)? "Iguales" : "no iguales";
        
        switch(valoresIngresados){
            case "Iguales": 
                System.out.println("Los numeros son iguales");
                break;
            case "no iguales":
                System.out.println("Los numeros no son iguales");
                break;
            default: 
                System.out.println("Ingrese el los numeros correctamente");
        }
    }
}
