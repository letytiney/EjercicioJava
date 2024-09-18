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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el día: ");
        int dia = sc.nextInt();
        
        System.out.print("Ingresa el mes: ");
        int mes = sc.nextInt();
        
        System.out.print("Ingresa el año: ");
        int año = sc.nextInt();
        
        boolean fechaValida = false;
        
        switch(mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                if (dia >= 1 && dia <= 31) {
                    fechaValida = true;
                }
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                if (dia >= 1 && dia <= 30) {
                    fechaValida = true;
                }
                break;
            case 2:  // Febrero (sin considerar años bisiestos)
                if (dia >= 1 && dia <= 28) {
                    fechaValida = true;
                }
                break;
            default:
                fechaValida = false;
        }
        
        if (fechaValida) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
        
        sc.close();
    }
}
