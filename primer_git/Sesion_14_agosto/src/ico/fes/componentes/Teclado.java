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
public class Teclado {
    private String marca;
    private int numeroTeclas;
    private boolean multimedia;

    public Teclado() {
    }

    public Teclado(String marca, int numeroTeclas, boolean multimedia) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + ", multimedia=" + multimedia + '}';
    }
    
}
