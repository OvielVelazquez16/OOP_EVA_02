
package com.mycompany.eva_2_14_vehiculos;

/**
 *
 * @author oviel
 */
public class Motocicleta extends Vehiculo{
    private int capacidad;

    public Motocicleta() {
        capacidad = 0;
    }

    public Motocicleta(int capacidad, int velocidad) {
        super(velocidad);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
