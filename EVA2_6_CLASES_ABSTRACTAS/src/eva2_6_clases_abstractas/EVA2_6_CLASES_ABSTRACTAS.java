
package eva2_6_clases_abstractas;

/**
 *
 * @author Oviel
 */
public class EVA2_6_CLASES_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo triangulo = new Triangulo();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        //Figura figura = new Figura(); error, no podemos crear objetos de clases abstractas
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPeri());
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPeri());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPeri());
    }
    
}
