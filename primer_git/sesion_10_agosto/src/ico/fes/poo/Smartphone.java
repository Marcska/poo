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
public class Smartphone {
    private String marca;
    private String modelo;
    private String procesador;
    private int ram;
    private String so;
    private float camara;
    public Smartphone(){ //metodo constructor por defecto        
    }

    public Smartphone(String marca, String modelo, String procesador, int ram, String so, float camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.so = so;
        this.camara = camara;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public float getCamara() {
        return camara;
    }

    public void setCamara(float camara) {
        this.camara = camara;
    }
    public void llamar(){
        System.out.println("Llamando");
    }
    public void reproducirMusica(String cancion){
        System.out.println("Reproduciendo la cancion: "+ cancion);
    }
    public void tomarFoto(){
        System.out.println("Tomar foto");
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram + ", so=" + so + ", camara=" + camara + '}';
    }
    
}
