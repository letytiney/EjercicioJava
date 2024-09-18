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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1= sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2= sc.nextInt();
        
        System.out.println("Ingrese el terncer numero");
        int num3= sc.nextInt();
        
        String orden;
        
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                orden = "num1,num2,num3";
            } else {
                orden = "num1,num3,num2";
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                orden = "num2,num1,num3";
            } else {
                orden = "num2,num3,num1";
            }
        } else {
            if (num1 >= num2) {
                orden = "num3,num1,num2";
            } else {
                orden = "num3,num2,num1";
            }
        }
        
             switch (orden) {
            case "num1,num2,num3":
                System.out.println("El orden de mayor a menor es: " + num1 + ", " + num2 + ", " + num3);
                break;
            case "num1,num3,num2":
                System.out.println("El orden de mayor a menor es: " + num1 + ", " + num3 + ", " + num2);
                break;
            case "num2,num1,num3":
                System.out.println("El orden de mayor a menor es: " + num2 + ", " + num1 + ", " + num3);
                break;
            case "num2,num3,num1":
                System.out.println("El orden de mayor a menor es: " + num2 + ", " + num3 + ", " + num1);
                break;
            case "num3,num1,num2":
                System.out.println("El orden de mayor a menor es: " + num3 + ", " + num1 + ", " + num2);
                break;
            case "num3,num2,num1":
                System.out.println("El orden de mayor a menor es: " + num3 + ", " + num2 + ", " + num1);
                break;
            default:
                System.out.println("Error en los datos ingresados.");
        }
    }   
}
