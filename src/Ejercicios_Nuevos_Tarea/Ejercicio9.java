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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cuantos numero desea sacar el promedio");
          int cantidad = sc.nextInt();
           double suma = 0;
      
          for(int i = 1; i<=cantidad; i++){
              System.out.println("Ingrese el numero " + i);
              int numIngresado = sc.nextInt();
               suma += numIngresado;
          }
          
           double promedio = suma / cantidad;
       
        
          System.out.println("El promedio es: " + promedio);
            sc.close();
    }
    
}
