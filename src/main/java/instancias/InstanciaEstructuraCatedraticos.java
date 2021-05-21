/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import arboles.ArbolAVL;
import clasesDAO.Catedratico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nodos.Nodo;

/**
 *
 * @author 50234
 */
public class InstanciaEstructuraCatedraticos {
    public static ArrayList<String> titulos = new ArrayList<>(Arrays.asList("ID", "Nombre", "Direccion", "Acciones"));
    public static ArbolAVL arbolCatedraticos;
    
    public static void agregarCatedratico(Catedratico catedratico){
        revisar();
        arbolCatedraticos.insertar(catedratico.getIdentificador(), catedratico);
    }
    
    public static void borrarCatedratico(String id){
        arbolCatedraticos.borrar(Integer.parseInt(id));
    }
    
    public static Catedratico buscarCatedratico(String identificador){
        return ((Nodo) arbolCatedraticos.buscar(Integer.parseInt(identificador))).getCatedratico();
    }
    
   
    public static List<ArrayList<String>> getInfo(){
        List<ArrayList<String>> datosAuxiliar = new ArrayList();
        Nodo aux = arbolCatedraticos.getRaiz();
        datosAuxiliar = inOrden(arbolCatedraticos.getRaiz(), datosAuxiliar);
        
        return datosAuxiliar;
    }
    
    /**
     * Recorremos el nodo inOrden (izq, padre, der)
     * @param nodoAux 
     */
    public static List<ArrayList<String>> inOrden(Nodo nodoAux, List<ArrayList<String>> info){
        if(nodoAux != null){
            info = inOrden(nodoAux.getHijoIzquierdo(), info);//llamanos primero al izq
            info.add(nodoAux.getCatedratico().getInfoCatedratico());//Agregamos la info            
            info = inOrden(nodoAux.getHijoDerecho(), info);//llamamos al final el der
        }
        return info;
    }
    
    public static void revisar(){
        if(arbolCatedraticos == null){
            arbolCatedraticos = new ArbolAVL();//instanciamos si no esta hecho
        }
    }

    public static ArrayList<String> getTitulos() {
        return titulos;
    }

    public static void setTitulos(ArrayList<String> titulos) {
        InstanciaEstructuraUsuarios.titulos = titulos;
    }
    
}
