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
public class menu17_09_24 {
        public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int opcion;
        do {
            // crear un Menu principal
            System.out.println("---------------------------");
            System.out.println("| 1. Iniciar Juego        |");
            System.out.println("| 2. Continuar Juego      |");
            System.out.println("| 3. Partidas             |");
            System.out.println("| 4. Salir                |");
            System.out.println("---------------------------");
            opcion = sp.nextInt();

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
                    System.out.println("Finaliza el juego");
                    break;
            }
        } while (opcion != 4);

    }
}
