
package eva2_practica2_sobrecarga_constructores;

/**
 *
 * @author oviel
 */
public class EVA2_PRACTICA2_SOBRECARGA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.imprimirDatos();
        
        Persona perso2 =new Persona("Pedro", "Paramo", 70);
        perso2.imprimirDatos();
        perso2.setNombre("Juan");
        perso2.setApellidos("Rulfo");
        perso2.setEdad(80);
        
    }
    
}
