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
public class autor {
    private String nombre;
    private String apellido;

    public autor() {
    }

    public autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "autor{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
