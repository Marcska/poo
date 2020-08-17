/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_17_agosto_2020;

import ico.fes.libros.autor;
import ico.fes.libros.editorial;
import mx.libros.Libros;

/**
 *
 * @author marcska
 */
public class Tarea_17_agosto_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libro1 = new Libros();
        System.out.println(libro1);
        Libros l2 = new Libros("Como programar en Java", "Séptima edición", "978-970-26-1190-5", 
                "Computación", 2008, 1152, 
                new autor("Harvey M", "Deitel"), 
                new editorial("PEARSON EDUCACIÓN"));
        System.out.println(l2);
    }
    
}
