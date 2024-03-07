
package com.mycompany.eva2_practica3_vehiculo;

/**
 *
 * @author oviel
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int annio;
    private String color;

    public Vehiculo() {
        this.marca = "sin marca";
        this.modelo = "sin modelo";
        this.annio = 0;
        this.color = "sin color";
        
    }

    public Vehiculo(String marca, String modelo, int annio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void imprimirDatos(){
      System.out.println("Marca: " + marca);
      System.out.println("Modelo: " + modelo);
      System.out.println("Año: " + annio);
      System.out.println("Color: " + color); 
}
}