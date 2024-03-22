
package eva2_6_clases_abstractas;

/**
 *
 * @author Oviel
 */
public class Triangulo extends Figura {
    public double base;
    public double altura;
    
    
    public Triangulo() {
        this.base = 4;
        this.altura = 2;
                
    }

    public Triangulo(double base, double altura) {
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
        return (base * altura) / 2;
    }
    
    private double calcularHip(){
        //TEOREMA DE PITAGORAS
        return Math.pow(base, 2) + Math.pow(altura, (2));
    }

    @Override
    public double calcularPeri() {
        return base + altura + calcularHip();
    }


  
    
    
}
