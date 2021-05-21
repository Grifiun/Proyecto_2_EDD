/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

import clasesDAO.Catedratico;

/**
 * Nodo para los catedraticos
 * @author grifiun
 */
public class Nodo {
    private String id;
    private int factorEquilibrio;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;

    //DATOS CATEDRATICOS
    private Catedratico catedratico;
    
    /**
     * Inicializamos los nodos
     * apuntadores y el factor de equilibrio
     * @param id 
     */
    public Nodo(String id, Catedratico catedratico) {
        this.id = id;
        this.factorEquilibrio = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
        this.catedratico = catedratico;
    }   
    
    
    
    public String getIdentificador() {
        return id;
    }
    
    public int getId(){
        return Integer.parseInt(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public int getFactorEquilibrio() {
        return factorEquilibrio;
    }

    public void setFactorEquilibrio(int factorEquilibrio) {
        this.factorEquilibrio = factorEquilibrio;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }
    
    
    
}