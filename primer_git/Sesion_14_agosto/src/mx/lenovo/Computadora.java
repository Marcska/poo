/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lenovo;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author marcska
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor mi_monitor;
    private Cpu mi_cpu;
    private Teclado mi_teclado;
    private Mouse mi_raton;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor mi_monitor, Cpu mi_cpu, Teclado mi_teclado, Mouse mi_raton) {
        this.marca = marca;
        this.modelo = modelo;
        this.mi_monitor = mi_monitor;
        this.mi_cpu = mi_cpu;
        this.mi_teclado = mi_teclado;
        this.mi_raton = mi_raton;
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

    public Monitor getMi_monitor() {
        return mi_monitor;
    }

    public void setMi_monitor(Monitor mi_monitor) {
        this.mi_monitor = mi_monitor;
    }

    public Cpu getMi_cpu() {
        return mi_cpu;
    }

    public void setMi_cpu(Cpu mi_cpu) {
        this.mi_cpu = mi_cpu;
    }

    public Teclado getMi_teclado() {
        return mi_teclado;
    }

    public void setMi_teclado(Teclado mi_teclado) {
        this.mi_teclado = mi_teclado;
    }

    public Mouse getMi_raton() {
        return mi_raton;
    }

    public void setMi_raton(Mouse mi_raton) {
        this.mi_raton = mi_raton;
    }
    

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", mi_monitor=" + mi_monitor + ", mi_cpu=" + mi_cpu + ", mi_teclado=" + mi_teclado + ", mi_raton=" + mi_raton + '}';
    }

    
    
    
}
