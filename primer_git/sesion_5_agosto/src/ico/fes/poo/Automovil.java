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
public class Automovil {
    private String marca;
    private String subMarca;
    private int modelo;
    private String color;
    
    //Metodos de acceso
    public void setModelo(int mod){
        if(mod>=1914 && mod<=2020){
            this.modelo=mod;
        }
        else{
            System.out.println("Ese modelo esta fuera de rango");
        }
            
    }
    
    public int getModelo(){
        return this.modelo;
    }
    
    public void setMarca(String marc){
        this.marca=marc;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setSubMarca(String sub){
        this.subMarca=sub;
    }
    public String getSubMarca(){
        return this.subMarca;
    }
    public void setColor(String Color){
        this.color=Color;
    }
    public String getColor(){
        return this.color;
    }
    
    public void encender(){
        System.out.println("Enciende el auto");
    }
    public void acelerar(){
        System.out.println("Acelerando ...");
    }
    public float avanzar(int metros){
        float reales=0.0f;
        reales=(float)Math.random()*(float)metros; 
        System.out.println("Avanzando el auto "+ this.marca);
        return reales;
    }

    @Override
    public String toString() {
        return  this.marca + "," + this.subMarca + "," + this.modelo + ","
                + this.color;
    }
    
}
