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
public class Foco {
   private String marca;
   private String material;
   private String tipo;
   private boolean led;
   private float precio;
   
   public Foco(){
       
   } 
   public Foco(String m){
       this.marca=m;
   }

    public Foco(String marca, String material, String tipo, boolean led, float precio) {
        this.marca = marca;
        this.material = material;
        this.tipo = tipo;
        this.led = led;
        this.precio = precio;
    }



    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void encender(){
        System.out.println("Encendiendo foco "+ this.marca);
    }
    public void apagar(){
        System.out.println("Apagando foco "+ this.marca);
    }

    @Override
    public String toString() {
        return "Foco{" + "marca=" + marca + ", material=" + material + ", tipo=" + tipo + ", led=" + led + ", precio=" + precio + '}';
    }
    
    
}
