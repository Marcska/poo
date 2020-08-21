/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author marcska
 */
public class refrigerador extends electrodomesticos{
    private String capacidad;
    private String modelo;
    private String color;
    private int puertas;
    private float restante;
    public refrigerador() {
    }

    public refrigerador(String capacidad, String modelo, String color, int puertas, float restante) {
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.color = color;
        this.puertas = puertas;
        this.restante = restante;
    }

    public refrigerador(String capacidad, String modelo, String color, int puertas, float restante, String fabricante, String material, String descripcion, String pais_fabricante) {
        super(fabricante, material, descripcion, pais_fabricante);
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.color = color;
        this.puertas = puertas;
        this.restante = restante;
    }





    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
 
    
    
    
    public void ingresar_productos(float resta){
        restante=Float.parseFloat(capacidad)-resta;
        if(restante==0){
            System.out.println("Ya no entran mas productos en el refrigerador");
        }
        else{
            System.out.println("Aun queda espacio en el refrigerador");
        }
    }
    
    @Override
    public void usar(){
        System.out.println("El refrigerador es de color " + color + " y es el modelo "+ modelo + " con una capacidad de " + capacidad);
    }

    @Override
    public String toString() {
        return "refrigerador{" + "capacidad=" + capacidad + ", modelo=" + modelo + ", color=" + color + ", puertas=" + puertas + ", restante=" + restante + '}';
    }


    
}
