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
public class VehiculoAereo extends Vehiculo{
    private int numeroMotores;
    private String tipoMotor;
    private float millasPorHora;

    public VehiculoAereo() {
    }

    public VehiculoAereo(int numeroMotores, String tipoMotor, float millasPorHora) {
        this.numeroMotores = numeroMotores;
        this.tipoMotor = tipoMotor;
        this.millasPorHora = millasPorHora;
    }

    public VehiculoAereo(int numeroMotores, String tipoMotor, float millasPorHora, String descripcion, String fabricante, String material) {
        super(descripcion, fabricante, material);
        this.numeroMotores = numeroMotores;
        this.tipoMotor = tipoMotor;
        this.millasPorHora = millasPorHora;
    }

    public float getMillasPorHora() {
        return millasPorHora;
    }

    public void setMillasPorHora(float millasPorHora) {
        this.millasPorHora = millasPorHora;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "VehiculoAereo{" + "numeroMotores=" + numeroMotores + ", tipoMotor=" + tipoMotor + ", millasPorHora=" + millasPorHora + '}' + super.toString();
    }

    @Override
    public void usar() {
        System.out.println("Volando a 10 mil KM de altura ....");; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
