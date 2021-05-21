/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author 50234
 */
public class NodoDobleEnlace<T> extends NodoSimple{   
    NodoDobleEnlace<T> anterior;
    
    public NodoDobleEnlace(T data, String identificador) {
        super(data, identificador);
        anterior = null;
    }

    public NodoDobleEnlace<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleEnlace<T> anterior) {
        this.anterior = anterior;
    }   
    
}
