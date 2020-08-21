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
public class electrodomesticos {
    private String fabricante;
    private String material;
    private String descripcion;
    private String pais_fabricante;

    public electrodomesticos() {
    }

    public electrodomesticos(String fabricante, String material, String descripcion, String pais_fabricante) {
        this.fabricante = fabricante;
        this.material = material;
        this.descripcion = descripcion;
        this.pais_fabricante = pais_fabricante;
    }

    


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais_fabricante() {
        return pais_fabricante;
    }

    public void setPais_fabricante(String pais_fabricante) {
        this.pais_fabricante = pais_fabricante;
    }

    @Override
    public String toString() {
        return "electrodomesticos{" + "fabricante=" + fabricante + ", material=" + material + ", descripcion=" + descripcion + ", pais_fabricante=" + pais_fabricante + '}';
    }
    
    public void usar(){
        System.out.println("El dispositivo electrodomestico es de la marca " + fabricante + " y de material "+ material);
    }
}

