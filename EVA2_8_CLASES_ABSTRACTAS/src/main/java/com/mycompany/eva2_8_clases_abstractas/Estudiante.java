
package com.mycompany.eva2_8_clases_abstractas;

/**
 *
 * @author oviel
 */
public class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //Al ser protected, podemos ver los atributos
    // de Persona por estar vinculados por herencia
    
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Num de control: " + noControl);
    }
    
}
