/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.libros;

/**
 *
 * @author marcska
 */
public class editorial {
    private String nombre_editorial;

    public editorial() {
    }

    public editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    @Override
    public String toString() {
        return "editorial{" + "nombre_editorial=" + nombre_editorial + '}';
    }
    
    
}
