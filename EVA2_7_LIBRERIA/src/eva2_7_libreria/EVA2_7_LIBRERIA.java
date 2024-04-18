
package eva2_7_libreria;

/**
 *
 * @author Oviel
 */
public class EVA2_7_LIBRERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libros = new Libros("Juan Rulfo", "El llano en llamas", 500, 10);
        libros.imprimirDatos();
        libros.venderCopias(5);
        libros.imprimirDatos();
        libros.ordenarCopias(100);
        libros.imprimirDatos();
        libros.venderCopias(200);
        libros.imprimirDatos();
    }
    
}
