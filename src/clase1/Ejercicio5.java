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
public class Ejercicio5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el radio de una circunferencia: ");
        int radio = sc.nextInt();
        double pi = 3.14;
        double longitudCircunferencia = (2*pi*radio);
                double areaCircunferencia = (pi*(radio*radio));

        System.out.println("La longitud de la Circunferencia es: " + longitudCircunferencia);
         System.out.println("El area de la Circunferencia es: " + areaCircunferencia);

        sc.close();
    }
}
