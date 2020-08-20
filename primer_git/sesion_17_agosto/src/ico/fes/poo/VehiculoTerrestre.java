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
public class VehiculoTerrestre extends Vehiculo {
    private int tipo; //0: neumaticos,  1: vias ferreas, 2:Magnetico
    private String kmPorHora;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int tipo, String kmPorHora) {
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;
    }

    public VehiculoTerrestre(int tipo, String kmPorHora, String descripcion, String fabricante, String material) {
        super(descripcion, fabricante, material);
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;
    }

    public String getKmPorHora() {
        return kmPorHora;
    }

    public void setKmPorHora(String kmPorHora) {
        this.kmPorHora = kmPorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" + "tipo=" + tipo + ", kmPorHora=" + kmPorHora + '}' + super.toString();
    }
    public int viajar(){
        System.out.print("El vehiculo terrestre está viajando por ");
        switch(this.tipo){
            case 0:
                System.out.println("Carretera");
                break;
            case 1:
                System.out.println("Vias ferrias");
                break;
            case 2:
                System.out.println("Vias magneticas");
                break;
            default:
                System.out.println("No reconocible ....");
                
        }
        return 100;
        
    }
    @Override
    public void usar(){
        System.out.println("Utilizando el ferrocarril que viaja en vias ferrias de la marca "+ this.getFabricante() );
    }
    
}
