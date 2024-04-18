
package com.mycompany.eva2_15_clases_anonimas;

/**
 *
 * @author oviel
 */
public class EVA2_15_CLASES_ANONIMAS {

    public static void main(String[] args) {
        
        //Prueba prueba = new Prueba(); no se puede instanciar
        //USANDO POLIMORFISMO:
        //Estamos creando una clase sin nombre que implementa los metodos de la interfaz
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo!!");
            }
        };
        prueba.mostrarMensaje();
        
        
        ClaseAbstracta prueba2 = new ClaseAbstracta() {
            @Override
            public void otroMensaje() {
                System.out.println("Ahora con clase abstracta");
            }
        };
        prueba2.otroMensaje();
        
        
    }
    interface Prueba{
        public void mostrarMensaje();
        
    }
}
abstract class ClaseAbstracta{
    public abstract void otroMensaje();
    
    
    public void mensaje(){
        System.out.println("Hola mundo!!!");
    }
}