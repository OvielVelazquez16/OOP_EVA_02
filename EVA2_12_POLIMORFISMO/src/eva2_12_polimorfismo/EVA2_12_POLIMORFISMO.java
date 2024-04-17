
package eva2_12_polimorfismo;

/**
 *
 * @author Oviel
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("0011", "Oviel", "Velazquez");
        System.out.println(estudiante);
        //PODEMOS CONVERTIR UN OBJETO DE UNA SUBCLASE A UNO DE UNA SUPERCLASE
        Persona persona = estudiante;
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        //----------------------------------
        Persona perso = new Persona("Oviel","Velazquez");
        System.out.println(perso);
        //Estudiante estu = perso; //NO SE PUEDE CONVERTIR UNA PERSONA EN UN ESTUDIANTE
    }
    
}

class Persona{
    private String nombre;
    private String apellido;

    public Persona() {
        this.nombre = "   ";
        this.apellido = "     ";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString(){
        return nombre + " " + apellido;
    }
    
}

class Estudiante extends Persona{
    private String noControl;
    
    public Estudiante(){
        super();
    noControl = "";
        
    }

    public Estudiante(String noControl, String nombre, String apellido) {
        super(nombre, apellido);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + noControl;
    }
    
}