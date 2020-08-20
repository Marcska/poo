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
public class ImplementarEjemplo implements EjemploAbastractas{

    @Override
    public void saludar(int veces) {
        System.out.println("Hola");
    }

    @Override
    public void despedir() {
        System.out.println("Adios");
    }
    
}
