/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5_agosto;

import ico.fes.poo.Automovil;
import ico.fes.poo.smartphone;


/**
 *
 * @author marcska
 */
public class Sesion_5_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miCarro = new Automovil();
        //miCarro.marca="VW";
        //miCarro.subMarca="Golf";
        //miCarro.modelo=1990;
        //miCarro.color="Gris";
        miCarro.setMarca("VW");
        miCarro.setSubMarca("Golf");
        miCarro.setColor("Gris");
        miCarro.setModelo(1990);
        float x = miCarro.avanzar(100);
        System.out.println("Avanzandos=" + x);
        Automovil miCarroDos = new Automovil();
        //miCarroDos.marca="Ford";
        //miCarroDos.subMarca="Mustang";
        //miCarroDos.color="amarillo";
        //miCarroDos.modelo=2010;
        miCarroDos.setMarca("Ford");
        miCarroDos.setSubMarca("Mustang");
        miCarroDos.setColor("Amarillo");
        miCarroDos.setModelo(2010);
        System.out.println("Avanzados="+miCarroDos.avanzar(500));
        Automovil miCarroTres = new Automovil();
        //miCarroTres.marca="Acura";
        //miCarroTres.subMarca="NSX";
        //miCarroTres.modelo=2013;
        //miCarroTres.color="Gris";
        System.out.println("Avanzados="+miCarroTres.avanzar(100));
        System.out.println(miCarro);
        System.out.println(miCarroDos);
        // 
        smartphone miSmartphone = new smartphone();
        miSmartphone.setMarca("Xiaomi");
        miSmartphone.setModelo("Mi play");
        miSmartphone.setAlmacenamiento(64);
        miSmartphone.setCamara(13);
        miSmartphone.encender();
        miSmartphone.tomar_foto();
        System.out.println("El almacenamiento restante es de: "+miSmartphone.tamanioapp(2));;
        System.out.println("Las caracteristicas del smartphone son: "+miSmartphone);
    }
    
}
