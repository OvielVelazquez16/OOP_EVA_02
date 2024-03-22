
package eva2_6_clases_abstractas;

/**
 *
 * @author Oviel
 */
public class Rectangulo extends Figura {
     public double base;
    public double altura;
    
    
    public Rectangulo() {
        this.base = 3;
        this.altura = 2;
                
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPeri() {
        return (base * 2) + (altura * 2);
    }
    
    
    
    
}
