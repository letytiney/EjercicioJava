/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JerarquiaClases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        TelefonoMovil telefono = new TelefonoMovil();

   
        System.out.println("Ingrese el precio del teléfono:");
        telefono.setPrecio(scanner.nextDouble());
        
        System.out.println("Ingrese la marca del teléfono:");
        scanner.nextLine();
        telefono.setMarca(scanner.nextLine());

        System.out.println("Ingrese el modelo del teléfono:");
        telefono.setModelo(scanner.nextLine());

    
        System.out.println("Ingrese la capacidad de almacenamiento (en GB):");
        telefono.setCapacidadAlmacenamiento(scanner.nextInt());

        System.out.println("Ingrese la duración de la batería (en horas):");
        telefono.setDuracionBateria(scanner.nextInt());

       
        System.out.println("\nDatos del teléfono móvil ingresado:");
        System.out.println("Precio: $" + telefono.getPrecio());
        System.out.println("Marca: " + telefono.getMarca());
        System.out.println("Modelo: " + telefono.getModelo());
        System.out.println("Capacidad de almacenamiento: " + telefono.getCapacidadAlmacenamiento() + " GB");
        System.out.println("Duración de la batería: " + telefono.getDuracionBateria() + " horas");

     
        scanner.close();
    }
    
}
