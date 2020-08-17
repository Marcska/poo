/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.libros;

import ico.fes.libros.autor;
import ico.fes.libros.editorial;

/**
 *
 * @author marcska
 */
public class Libros {
    
    private String nombre_libro;
    private String edicion;
    private String isbn;
    private String area;
    private int anio_publicacion;
    private int num_paginas;
    private autor nombre;
    private editorial dato;

    public Libros() {
    }

    public Libros(String nombre_libro, String edicion, String isbn, String area, int anio_publicacion, int num_paginas, autor nombre, editorial dato) {
        this.nombre_libro = nombre_libro;
        this.edicion = edicion;
        this.isbn = isbn;
        this.area = area;
        this.anio_publicacion = anio_publicacion;
        this.num_paginas = num_paginas;
        this.nombre = nombre;
        this.dato = dato;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public autor getNombre() {
        return nombre;
    }

    public void setNombre(autor nombre) {
        this.nombre = nombre;
    }

    public editorial getDato() {
        return dato;
    }

    public void setDato(editorial dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre_libro=" + nombre_libro + ", edicion=" + edicion + ", isbn=" + isbn + ", area=" + area + ", anio_publicacion=" + anio_publicacion + ", num_paginas=" + num_paginas + ", nombre=" + nombre + ", dato=" + dato + '}';
    }
    
    
}
