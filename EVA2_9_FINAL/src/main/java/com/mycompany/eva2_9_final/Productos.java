
package com.mycompany.eva2_9_final;

/**
 *
 * @author oviel
 */
public class Productos {
    private String nombre;
    private double precio;

    public Productos() {
        this.nombre = "Sin nombre";
        this.precio = 0;
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        String cade;
        cade = "Nombre: " + nombre + "\n" + 
               "Precio: " + precio;
                return cade;
    }
}
