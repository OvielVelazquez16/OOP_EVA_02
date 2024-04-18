
package eva2_7_libreria;

/**
 *
 * @author Oviel
 */
public class Libros extends Publicaciones {
    private String autor;
    
    public void ordenarCopias(int cant){
        int existencias = getCopias();
        setCopias(existencias + cant);
 
}
     //regla: siempre se llama al constructor de la superclase
    public Libros() {
        super();
        this.autor = "--";
    }


    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Autor: " + autor);
    }
    
    
    
}
