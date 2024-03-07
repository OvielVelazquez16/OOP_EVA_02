
package com.mycompany.eva2_practica3_vehiculo;

/**
 *
 * @author oviel
 */
public class EVA2_PRACTICA3_VEHICULO {

    public static void main(String[] args) {
        Vehiculo vehi1 = new Vehiculo();
        vehi1.imprimirDatos();
        
        Vehiculo vehi2 = new Vehiculo("Chevrolet", "Camaro", 2003, "Amarillo");
        vehi2.imprimirDatos();
        vehi2.setMarca("Nissan");
        vehi2.setModelo("Tsuru");
        vehi2.setColor("Gris");
        vehi2.setAnnio(2005);
    }
}
