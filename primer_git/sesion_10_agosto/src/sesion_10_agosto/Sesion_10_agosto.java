/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_10_agosto;

import ico.fes.poo.Smartphone;

/**
 *
 * @author marcska
 */
public class Sesion_10_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Smartphone tel1=new Smartphone();
        System.out.println(tel1);
        Smartphone tel2=new Smartphone("Samsung", "Galaxy", "Smart dragon", 2, "Android 7.0", 23.4f);
        System.out.println(tel2);
    }
    
}
