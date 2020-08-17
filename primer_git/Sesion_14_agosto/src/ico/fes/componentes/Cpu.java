/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author marcska
 */
public class Cpu {
    private String marca;
    private float velocidad;
    private int numeroNucleos;

    public Cpu() {
    }

    public Cpu(String marca, float velocidad, int numeroNucleos) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.numeroNucleos = numeroNucleos;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", velocidad=" + velocidad + ", numeroNucleos=" + numeroNucleos + '}';
    }
    
    
    
}
