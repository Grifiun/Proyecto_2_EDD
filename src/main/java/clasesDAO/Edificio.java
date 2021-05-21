/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesDAO;

import estructuras_datos.ListaSimplementeEnlazada;
import java.util.ArrayList;

/**
 * Edificio(nombre);
 * nombre = alfanumérico
 * @author 50234
 */
public class Edificio {
    private String nombre;
    ListaSimplementeEnlazada<Salon> listadoSalones = new ListaSimplementeEnlazada<Salon>();
    
    public Edificio(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<String> getInfoEdificio(){
        ArrayList<String> infoUsuario = new ArrayList();
        
        infoUsuario.add(nombre);
        
        return infoUsuario;
    }

    public ListaSimplementeEnlazada<Salon> getListadoSalones() {
        return listadoSalones;
    }

    public void setListadoSalones(ListaSimplementeEnlazada<Salon> listadoSalones) {
        this.listadoSalones = listadoSalones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
