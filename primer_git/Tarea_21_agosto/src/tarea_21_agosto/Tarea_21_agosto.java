/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_21_agosto;

import ico.fes.poo.electrodomesticos;
import ico.fes.poo.licuadora;
import ico.fes.poo.refrigerador;

/**
 *
 * @author marcska
 */
public class Tarea_21_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        electrodomesticos elc1 = new electrodomesticos("Mabe", "acero", "Es un refrigerador industrial ", "CHINA");
        System.out.println(elc1);
        elc1.usar();
        refrigerador rfg1 = new refrigerador("14", "RF221NCTASL/IBACCI", "Acero", 3, "SAMSUNG", "METAL", 
                "Con el refrigerador Samsung 22 pies cúbicos acero RF221NCTASL/IBACCI tendrás 3 puertas para que sea más fácil y práctica su utilización", "TAIWAN");
        System.out.println(rfg1);
        rfg1.ingresar_productos(13.14f);
        licuadora lc1 = new licuadora(1.25f, 550, 14, "negro", "t-fal", "cristal templado y metal", 
                "Licuadora Infinyforce 14 negra: ¡3 veces más eficiente para resultados perfectos!", "CHINA");
        lc1.licuar(13);
        lc1.perfil_licuar(0);
    }
    
}
