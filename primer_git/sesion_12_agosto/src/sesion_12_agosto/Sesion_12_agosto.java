/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_12_agosto;

import ico.fes.poo.Foco;

/**
 *
 * @author marcska
 */
public class Sesion_12_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Foco f1=new Foco();
        System.out.println(f1);
        Foco f2=new Foco("Philips");
        System.out.println(f2);
        Foco f3=new Foco("Boch","Cristal", "led", true, 60.0f);
        System.out.println(f3);
    }
    
}
