/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model18_09_24;

/**
 *
 * @author Usuario
 */
public class Ejecutable {
    public static void main(String[] args) {
        Vehiculo obj1 = new Vehiculo();
        obj1.color="Rojo";
        obj1.velocidad=90;
        obj1.mostrarVelocidad();
        System.out.println(obj1.descripcion());
        double Pi = Vehiculo.Pi;
        System.out.println(Pi);
          Vehiculo obj2 = new Vehiculo();
        obj2.color="Azul";
        obj2.velocidad=120;
        obj2.mostrarVelocidad();
        
    }
}
