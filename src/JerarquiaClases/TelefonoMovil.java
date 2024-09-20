/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JerarquiaClases;

/**
 *
 * @author Usuario
 */
public class TelefonoMovil extends  ProductoElectronico{
    
    int capacidadAlmacenamiento;
    int duracionBateria;

     public TelefonoMovil() {
        
    }
    public TelefonoMovil(int capacidadAlmacenamiento, int duracionBateria) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }
    
    public int getCapacidadAlmacenamiento(){
    return capacidadAlmacenamiento;
}
    public int getDuracionBateria(){
        return duracionBateria;
    }
    
    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
    
}

