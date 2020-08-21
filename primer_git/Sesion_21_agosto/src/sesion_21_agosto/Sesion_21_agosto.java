/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_21_agosto;

import ico.fes.poo.CIRCULO;
import ico.fes.poo.Cuadrado;
import ico.fes.poo.Figura;

/**
 *
 * @author marcska
 */
public class Sesion_21_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CIRCULO c1 = new CIRCULO();
        c1.calcularArea();
        Cuadrado d1 = new Cuadrado(5,10);
        d1.calcularArea();
        int res=d1.calcularArea();
        System.out.println("Area cuadrado ="+res);
        int opcion=0;
        switch(opcion){
            case Figura.CIRCULO:
                System.out.println("Circulo");
                break;
            case Figura.CUADRADO:
                System.out.println("Cuandrado");
                break;
            case Figura.TRIANGULO:
                System.out.println("Triangulo");
                break;
            default:
                throw new AssertionError();
        } 
        // TODO code application logic here
    }
    
}
