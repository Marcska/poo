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
public class smartphone {
    private String marca;
    private String modelo;
    private int almacenamiento;
    private int camara;
    
    //Metodo de acceso
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setAlmacenamiento(int almacenamiento){
        if(almacenamiento>=4 && almacenamiento<=512){
            this.almacenamiento=almacenamiento;
        }
        else{
            System.out.println("El almacenamiento esta fuera de rango ");
        }
    }
    public int getAlmacenamiento(){
        return this.almacenamiento;
    }
    public void setCamara(int camara){
        this.camara=camara;
    }
    public void encender(){
        System.out.println("Se esta encendiendo el dispositivo "+this.marca+" "+this.modelo);
    }
    public void tomar_foto(){
        System.out.println("Se tomara una foto con el dispositivo "+this.modelo+" con una camara a "+ this.camara +"MPX");
    }
    public float tamanioapp(int tamanio){
        float restante=0;
        restante=this.almacenamiento-tamanio;
        return restante;
    }
    @Override
    public String toString() {
        return this.marca + "," + this.modelo + "," + this.almacenamiento + "," +
                this.camara;
    }
    
}
