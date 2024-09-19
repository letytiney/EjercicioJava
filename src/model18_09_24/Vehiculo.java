/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model18_09_24;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    String tipo;
    String marca;
    String color;
    float velocidad;
    static double Pi = Math.PI;
    public void mostrarVelocidad(){
        System.out.println("El vehiculo viaja a una velocidad " + velocidad);
    }
    public String descripcion(){
        return "Hola mundo";
    }
}
