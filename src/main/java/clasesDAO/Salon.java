/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesDAO;

import java.util.ArrayList;

/**
 * Salón(nombre, número, capacidad);
 * nombre = alfanumérico, donde nombre es el nombre del edificio al que se asigna el salón
 * número = numérico
 * capacidad = numérico
 * @author 50234
 */
public class Salon {
    private String nombreEdificio;
    private int numero;
    private int capacidad;

    public Salon(String nombre, int numero, int capacidad) {
        this.nombreEdificio = nombre;
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public Salon(String nombre, String numero, String capacidad) {
        this.nombreEdificio = nombre;
        this.numero = Integer.parseInt(numero);
        this.capacidad = Integer.parseInt(capacidad);
    }
    
    public ArrayList<String> getInfoSalon(){
        ArrayList<String> infoUsuario = new ArrayList();
        
        infoUsuario.add(""+numero);
        infoUsuario.add(nombreEdificio);
        infoUsuario.add(""+capacidad);
        
        return infoUsuario;
    }


    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombre) {
        this.nombreEdificio = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
