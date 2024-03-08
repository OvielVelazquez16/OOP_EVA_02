
package com.mycompany.eva2_practica_5_super;

/**
 *
 * @author oviel
 */
public class Estudiante extends Persona {
    private String noControl;
    private String carrera;
  
    public Estudiante(){
        super(); //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        noControl = "-----";
        carrera = "-----";
        
        
    }
    //REGLA DE HERENCIA: SIEMPRE HAY QUE LLAMAR AL CONSTRUCTOR DE LA SUPERCLASE
    //SIEMPRE TIENE QUE SER LA PRIMERA INSTRUCCION DEL CONSTRUCTOR.
    public Estudiante(String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String carrera){
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.noControl = noControl;
        this.carrera = carrera;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("No. de control: " + noControl );
    System.out.println("Carrera: " + carrera);
    
}
    
    
    
}
