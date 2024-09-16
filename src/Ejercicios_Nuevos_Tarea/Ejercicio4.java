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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el Primer numero");
        int num1 = sc.nextInt();
           System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
           System.out.println("Ingrese el tercer numero");
        int num3 = sc.nextInt();
        
        if(num1 > num2 & num1>num3){
             System.out.println("El numero " + num1 + " es mayor");
        }else if(num2 > num1 & num2 > num3) {
             System.out.println("El numero " + num2 + " es mayor");
        }
        else if(num3>num1 & num3>num2){
              System.out.println("El numero " + num3 + " es mayor");
        }
        else {
              System.out.println("Hay un empate entre los números ingresados");
        }
          sc.close();
    }
}
