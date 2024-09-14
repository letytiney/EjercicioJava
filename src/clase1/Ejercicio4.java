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
public class Ejercicio4 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un grado centígrado: ");
        int gradoCentigrado = sc.nextInt();
        
        double formula = (gradoCentigrado * 9.0 / 5.0) + 32;

        System.out.println("Resultado de C a Fahrenheit es: " + formula);

        sc.close();
    }
}
