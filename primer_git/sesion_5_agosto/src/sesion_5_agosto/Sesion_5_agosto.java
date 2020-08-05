/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5_agosto;

import ico.fes.poo.Automovil;


/**
 *
 * @author marcska
 */
public class Sesion_5_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miCarro = new Automovil();
        miCarro.marca="VW";
        miCarro.subMarca="Golf";
        miCarro.modelo=1990;
        miCarro.color="Gris";
        float x = miCarro.avanzar(100);
        System.out.println("Avanzando=" + x);
    }
    
}
