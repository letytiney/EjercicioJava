/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model18_09_24;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoCuentaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cuenta1 = 500;
        float cuenta2 = 300;
        int opcion;
        
        do{
         System.out.println("---------------------------");
         System.out.println("1. Abonar saldo");
         System.out.println("2. Debilitar saldo");
         System.out.println("3. Mostrar saldo");
         System.out.println("4. Salir");
         System.out.println("---------------------------");
      
         System.out.println("Que accion desea realizar");
         opcion = sc.nextInt();
         switch (opcion) {
            case 1:
         System.out.println("---------------------------");
         System.out.println("1. Cuenta No.1");
         System.out.println("2. Cuenta No.2");
         System.out.println("3. Salir");
         System.out.println("----------ABONAR-----------------");
          System.out.println("Seleccione la cuenta");
          int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1:
                        
                    System.out.println("Cuanto desea abonar a la Cuenta1");
                     float abonar= sc.nextInt();
                     cuenta1+=abonar;
                     System.out.println("Saldo de la cuenta No.1: " + cuenta1);
                        break;
                    case 2:
                      System.out.println("Cuanto desea abonar a la Cuenta2");
                     float abonar2= sc.nextInt();
                     cuenta2+=abonar2;
                     System.out.println("Saldo de la cuenta No.2: " + cuenta2);
                       break;
                       case 3:
                           continue;
                    default:
                         System.out.println("Opción no válida.");
                }
                break;
            case 2:
         System.out.println("-----------DEBILITAR----------------");
         System.out.println("1. Cuenta No.1");
         System.out.println("2. Cuenta No.2");
         System.out.println("3. Salir");
         System.out.println("---------------------------");
          System.out.println("Seleccione la cuenta");
          int opcion3 = sc.nextInt();
                switch (opcion3) {
                    case 1:
                         System.out.println("Cuanto desea debilitar a la Cuenta1");
                         float debitar= sc.nextInt();
                         cuenta1-=debitar;
                         System.out.println("Saldo de la cuenta No.1: " + cuenta1);
                        break;
                    case 2:
                      System.out.println("Cuanto desea debilitar a la Cuenta2");
                     float debitar2= sc.nextInt();
                         cuenta2-=debitar2;
                         System.out.println("Saldo de la cuenta No.1: " + cuenta2);
                       break;
                    case 3:
                         continue;
                    default:
                       System.out.println("Opción no válida.");
                }
                break;
                            case 3:  
                 System.out.println("Saldo de la cuenta No.1: " + cuenta1);
                 System.out.println("Saldo de la cuenta No.2: " + cuenta2);
                    break;
            case 4:  
                System.out.println("Saliendo del programa...");
                    break;
            default:
                System.out.println("Opción no válida.");
        }
      }while (opcion != 3); 
          sc.close();
    }
}
