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
public class licuadora extends electrodomesticos{
    private float capacidad;
    private float potencia;
    private int velocidades;
    private String color;

    public licuadora() {
    }

    public licuadora(float capacidad, float potencia, int velocidades, String color) {
        this.capacidad = capacidad;
        this.potencia = potencia;
        this.velocidades = velocidades;
        this.color = color;
    }

    public licuadora(float capacidad, float potencia, int velocidades, String color, String fabricante, String material, String descripcion, String pais_fabricante) {
        super(fabricante, material, descripcion, pais_fabricante);
        this.capacidad = capacidad;
        this.potencia = potencia;
        this.velocidades = velocidades;
        this.color = color;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
        public void licuar(int nivel){
        System.out.println("Encendiendo licuadora ... ");
        System.out.println("Se va a licuar al nivel " + nivel);
        System.out.println("Acabo de licuar");
    }
    public void perfil_licuar(int perfil){
        switch(perfil){
            case 0:
                System.out.println("Escogio el perfil normal");
                break;
            case 1:
                System.out.println("Escogio el perfil de frutas");
                break;
            case 2:
                System.out.println("Escogio el perfil de verduras");
                break;
            case 3:
                System.out.println("Escogio el perfil de bebidas");
                break;
        }
                
    }    
    
    @Override
    public void usar(){
        System.out.println("La licuadora tiene " + velocidades + " velocidades " + " y es de color " + color );
    }

    @Override
    public String toString() {
        return "licuadora{" + "capacidad=" + capacidad + ", potencia=" + potencia + ", velocidades=" + velocidades + ", color=" + color + '}';
    }
    
}
