/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_datos;

import clasesDAO.Salon;
import java.util.ArrayList;
import java.util.List;
import nodos.NodoDobleEnlace;
import nodos.NodoSimple;

/**
 *
 * @author 50234
 */
public class ListaSimplementeEnlazada<E>{
    private NodoSimple<E> raiz;
    private int longitud;
    
    public ListaSimplementeEnlazada() {
        this.raiz = null;
        this.longitud = 0;
    }           
        
   public List<ArrayList<String>> getInfo(){
        List<ArrayList<String>> datosAuxiliar = new ArrayList();
        
        NodoSimple aux = (NodoSimple) getRaiz();
        while(aux != null){//mientras exista
            datosAuxiliar.add(((Salon)aux.getData()).getInfoSalon());
            
            if(aux.getSiguiente() != null && aux.getSiguiente() != raiz){//asi evitamos bucles infinitos
                aux = (NodoSimple) aux.getSiguiente();
                System.out.println("A");
            }else{
                break;
            }
        }
        
        return datosAuxiliar;
    } 
    
    /**
     * Insertamos un nuevoNodo
     * @param nuevoNodo 
     */
    public void insertarNodo(E nuevoNodo, String identificador){
        NodoSimple nodoAux = new NodoSimple(nuevoNodo, identificador);//Agregamos un identificador
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
    private void insertarNodo(NodoSimple nodoAux, NodoSimple nuevoNodo){       
        if(this.raiz == null){//si no existe una el nodoAuxiliar, en este caso seria el primer ingreso, se crea una nueva raiz
            this.raiz = nuevoNodo;
        }else{//si hay nodos, recorremos hasta el ultimo
            //insertamos a la derecha            
            if(nodoAux.getSiguiente() != null){
                //insertamos el siguiente
                //insertarNodo(nodoAux.getSiguiente(), nuevoNodo);
                insertarNodo(nodoAux.getSiguiente(), nuevoNodo);//parseamos
            }else{
                //llegamos al final
                //Agregamos puntero de ultimo nodo de la fila, hacia el nuevo nodo
                //System.out.println("Agregamos el nodo: "+nodoAux.getId());
                if(nodoAux.getSiguiente() != this.raiz){
                    nodoAux.setSiguiente(nuevoNodo);
                    longitud++;
                }                
            }
        }
    }    
    
    /**
     * Buscamos un nodo por el id
     * @param nuevoNodo 
     */
    public NodoSimple<E> buscarNodo(String identificador){
        return buscarNodo(raiz, identificador);//buscamos
    }
    
    /** 
     * Metodo recursivo para buscar un nodo por el id
     * @param nodoAux
     * @param nuevoNodo 
     */
    private NodoSimple<E> buscarNodo(NodoSimple nodoAux, String identificador){
        if(nodoAux == null){//si no existe una el nodoAuxiliar, en este caso seria el primer nodo, e indica que la lista esta vacia
            System.out.println("No hay nodos en la lista");
        }else{//si hay nodos, recorremos hasta encontrar al nodo requerrido ultimo
            
            if(nodoAux.getIdentificador().equals(identificador)){//enontramos el nodo                
                return nodoAux;//retornamos el nodo
            }else{
                if(nodoAux.getSiguiente() != null && nodoAux.getSiguiente() != this.raiz){//verificamos que no sea la raiz, sino nunca termina el ciclo
                //recorremos el siguiente nodo
                    return buscarNodo(nodoAux.getSiguiente(), identificador);
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
        NodoSimple nodoAux = buscarNodo(identificador);
        if(nodoAux != null){
            NodoSimple temp = raiz;
            while(temp.getSiguiente() != nodoAux && temp.getSiguiente() != null){//el temp será el anterior al nodo a eliminar
                temp = temp.getSiguiente();//avanzamos si no es el anterior
            }
             //punteros
            NodoSimple nodoAnterior = temp;
            NodoSimple nodoSiguiente = nodoAux.getSiguiente();
            if(nodoAnterior != null)
                System.out.println("anterior = "+nodoAnterior.getIdentificador());
            if(nodoSiguiente != null)
                System.out.println("siguiente = "+nodoSiguiente.getIdentificador());
            //areglampos los punteros
            if(nodoAnterior != null){
                nodoAnterior.setSiguiente(nodoSiguiente);
            }
            //anulamos valores
            nodoAux.setSiguiente(null);
            nodoAux = null;        
        }else{
            System.out.println("Nodo inexistente con el id dado: "+identificador);
        }     
    }
    
    /**
     * Metodo principal para imprimir
     */
    public void imprimirDatos() {
        imprimirDatos(this.raiz);
    }
    
    /**
     * Metodo recursivo para imprimir
     * @param nodoAux 
     */
    public void imprimirDatos(NodoSimple nodoAux) {
        if(nodoAux != null){
            System.out.println(nodoAux.getIdentificador());
            imprimirDatos(nodoAux.getSiguiente());
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
    public NodoSimple<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoSimple<E> raiz) {
        this.raiz = raiz;
    } 
    
     public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }   
    
}
