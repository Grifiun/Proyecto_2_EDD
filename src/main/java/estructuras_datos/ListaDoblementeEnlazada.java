/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_datos;

import nodos.NodoDobleEnlace;

/**
 *
 * @author 50234
 */
public class ListaDoblementeEnlazada<E> {
    private NodoDobleEnlace<E> raiz;
    private int longitud;
    
    public ListaDoblementeEnlazada() {
        this.raiz = null;
        this.longitud = 0;
    }     
        
    /**
     * Insertamos un nuevoNodo
     * @param nuevoNodo 
     */
    public void insertarNodo(E nuevoNodo, String identificador){
        NodoDobleEnlace nodoAux = new NodoDobleEnlace(nuevoNodo, identificador);//Agregamos un identificador
        try{
            insertarNodo(raiz, nodoAux);//insertamos
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }    
    
    /** 
     * Metodo recursivo para insertar nuevos nodos
     * @param nodoAux
     * @param nuevoNodo 
     */
    private void insertarNodo(NodoDobleEnlace nodoAux, NodoDobleEnlace nuevoNodo){       
        if(this.raiz == null){//si no existe una el nodoAuxiliar, en este caso seria el primer ingreso, se crea una nueva raiz
            this.raiz = nuevoNodo;
        }else{//si hay nodos, recorremos hasta el ultimo
            //insertamos a la derecha              
            if(nodoAux.getSiguiente() != null && nodoAux.getSiguiente() != this.raiz){
                //insertamos el siguiente
                insertarNodo((NodoDobleEnlace) nodoAux.getSiguiente(), nuevoNodo);//parseamos
            }else{
                //llegamos al final
                //Agregamos puntero de ultimo nodo de la fila, hacia el nuevo nodo
                nodoAux.setSiguiente(nuevoNodo);
                //Agregamos puntero del nodo raiz hacia el nuevo nodo (hacia atras)
                this.raiz.setAnterior(nuevoNodo);
                //Agregamos apuntadores del nuevo nodo
                nuevoNodo.setSiguiente(this.raiz);//su siguiente es el nodo raiz
                nuevoNodo.setAnterior(nodoAux);
            }
        }
    }
    
    
    /**
     * Buscamos un nodo por el id
     * @param nuevoNodo 
     */
    public NodoDobleEnlace<E> buscarNodo(String identificador){
        return buscarNodo(raiz, identificador);//buscamos
    }
    
    /** 
     * Metodo recursivo para buscar un nodo por el id
     * @param nodoAux
     * @param nuevoNodo 
     */
    private NodoDobleEnlace<E> buscarNodo(NodoDobleEnlace nodoAux, String identificador){
        if(nodoAux == null){//si no existe una el nodoAuxiliar, en este caso seria el primer nodo, e indica que la lista esta vacia
            System.out.println("No hay nodos en la lista");
        }else{//si hay nodos, recorremos hasta encontrar al nodo requerrido ultimo
            
            if(nodoAux.getIdentificador().equals(identificador)){//enontramos el nodo                
                return nodoAux;//retornamos el nodo
            }else{
                if(nodoAux.getSiguiente() != null && nodoAux.getSiguiente() != this.raiz){//verificamos que no sea la raiz, sino nunca termina el ciclo
                //recorremos el siguiente nodo
                    return buscarNodo((NodoDobleEnlace) nodoAux.getSiguiente(), identificador);
                }else{
                    //llegamos al final sin exito
                    System.out.println("No existe ese nodo dentro de la lista");
                }
            }  
        }
        return null;//retornamos null si no se encuentra ningun nodo que coincida con el id dado
    }
    
    /**
     * Eliminamos un nuevoNodo por id
     * @param nuevoNodo 
     */
    public void eliminarNodo(String identificador){     
        NodoDobleEnlace nodoAux = buscarNodo(identificador);
        if(nodoAux != null){
             //punteros
            NodoDobleEnlace nodoAnterior = nodoAux.getAnterior();
            NodoDobleEnlace nodoSiguiente = (NodoDobleEnlace) nodoAux.getSiguiente();

            //areglampos los punteros
            if(nodoSiguiente != null){
                
                    nodoSiguiente.setAnterior(nodoAnterior);
            }
 
            if(nodoAnterior != null){
                nodoAnterior.setSiguiente(nodoSiguiente);
            }
            //anulamos valores
            nodoAux.setSiguiente(null);
            nodoAux.setAnterior(null);
            nodoAux = null;                
            
            if(nodoAux == raiz){
                raiz = null;
                raiz.setSiguiente(null);
                raiz.setAnterior(null);
            }
                
            
        }else{
            System.out.println("Nodo inexistente con el id dado: "+identificador);
        }     
    }
    
    public void imprimirDatos(String tipoDatos){
        imprimirDatos(raiz, tipoDatos);
    }
    
    private void imprimirDatos(NodoDobleEnlace nodoAux, String tipoDatos){
        if(nodoAux != null){
            System.out.println(tipoDatos + ". " + nodoAux.getIdentificador());
            if(nodoAux.getSiguiente() != raiz){
                imprimirDatos((NodoDobleEnlace) nodoAux.getSiguiente(), tipoDatos);
            }
        }
    }
    /*
    public NodoDobleEnlace getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDobleEnlace raiz) {
        this.raiz = raiz;
    }
    */
    public NodoDobleEnlace<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDobleEnlace<E> raiz) {
        this.raiz = raiz;
    } 
    
     public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
}
