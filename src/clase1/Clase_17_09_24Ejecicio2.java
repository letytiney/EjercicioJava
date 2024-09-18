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
public class Clase_17_09_24Ejecicio2 {
    public static void main(String[] args) {
        
   
       // crear un Menu principal
        Scanner sp = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("| 1. Iniciar Juego        |");
        System.out.println("| 2. Continuar Juego      |");
        System.out.println("| 3. Partidas             |");
        System.out.println("| 4. Salir                |");
        System.out.println("---------------------------");
        int opcion = sp.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Iniciamos el juego");
                break;
            case 2:
                System.out.println("Continuar el juego");
                break;
            case 3:
                System.out.println("Partidas");
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
