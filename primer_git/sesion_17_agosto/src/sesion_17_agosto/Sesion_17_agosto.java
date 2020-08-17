/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_17_agosto;

import ico.fes.poo.Vehiculo;
import ico.fes.poo.VehiculoTerrestre;

/**
 *
 * @author marcska
 */
public class Sesion_17_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1=new Vehiculo("Motorizado con una adaptación de" + 
                "bicicleta de tamalero para transportar personas", "BMX", "Metal");
        System.out.println(v1);
        Vehiculo v2= new Vehiculo("Vehiculo que vuela", "desconocido", "Madera");
        System.out.println(v2);
        VehiculoTerrestre vt1=new VehiculoTerrestre();
        System.out.println(vt1);
        vt1.usar();
        VehiculoTerrestre vt2=new VehiculoTerrestre(0, "210");//Mazda 3
        vt2.setDescripcion("Vehiculo semideportivo");
        vt2.setFabricante("Mazda Co.");
        vt2.setMaterial("Metal y fibra de vidrio");
        System.out.println(vt2);
        vt2.viajar();
    }   
        
    
}
