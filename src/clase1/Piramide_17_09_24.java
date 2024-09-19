/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

/**
 *
 * @author Usuario
 */
public class Piramide_17_09_24 {
    public static void main(String[] args) {
        String piramide ="********";
        int valor = piramide.length();
        for(int i = 0; i < valor; i++)
        {
           System.out.println(piramide);
           piramide=  piramide.substring(0, piramide.length()-1);
        }
    }
}
