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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para mostrar su tabla de multiplicacion");
        int numero = sc.nextInt();
        for (int i=1; i<=10; i++){
           int resultado = i*numero;
                System.out.println(i  + " * " + numero +" = " +  resultado);
        }
          sc.close();
    }
}
