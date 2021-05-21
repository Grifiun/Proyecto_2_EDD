/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import clasesDAO.Edificio;
import clasesDAO.Usuario;
import estructuras_datos.ListaDoblementeEnlazada;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nodos.NodoDobleEnlace;

/**
 *
 * @author 50234
 */
public class InstanciaEstructuraEdificios {
    public static ArrayList<String> titulos = new ArrayList<>(Arrays.asList("Nombre", "Acciones"));
    public static ArrayList<String> titulosSalones = new ArrayList<>(Arrays.asList("numero", "Nombre edificio", "Capacidad", "Acciones"));
    public static ListaDoblementeEnlazada listadoEdificios;
          
    public static void agregarEdificio(Edificio edificio){
        revisar();
        listadoEdificios.insertarNodo(edificio, edificio.getNombre());
    }
    
    public static void borrarEdificio(String nombre){
        listadoEdificios.eliminarNodo(nombre);
    }
    
    public static Edificio buscarEdificio(String identificador){
        NodoDobleEnlace nodoAux = listadoEdificios.buscarNodo(identificador);
        if(nodoAux != null)
            return (Edificio)nodoAux.getData();
        else
            return null;
    }
    
    public static List<ArrayList<String>> getInfo(){
        List<ArrayList<String>> datosAuxiliar = new ArrayList();
        
        NodoDobleEnlace aux = listadoEdificios.getRaiz();
        while(aux != null){//mientras exista
            datosAuxiliar.add(((Edificio)aux.getData()).getInfoEdificio());
            
            if(aux.getSiguiente() != null && aux.getSiguiente() != listadoEdificios.getRaiz()){//asi evitamos bucles infinitos
                aux = (NodoDobleEnlace) aux.getSiguiente();
                System.out.println("A");
            }else{
                break;
            }
        }
        
        return datosAuxiliar;
    }
    
    public static void imprimirEdificios(){
        listadoEdificios.imprimirDatos("Edificios");
    }
    
    public static void revisar(){
        if(listadoEdificios == null){
            listadoEdificios = new ListaDoblementeEnlazada();//instanciamos si no esta hecho
        }
    }

    public static ArrayList<String> getTitulos() {
        return titulos;
    }

    public static void setTitulos(ArrayList<String> titulos) {
        InstanciaEstructuraUsuarios.titulos = titulos;
    }

    public static ArrayList<String> getTitulosSalones() {
        return titulosSalones;
    }

    public static void setTitulosSalones(ArrayList<String> titulosSalones) {
        InstanciaEstructuraEdificios.titulosSalones = titulosSalones;
    }

    public static ListaDoblementeEnlazada getListadoEdificios() {
        return listadoEdificios;
    }

    public static void setListadoEdificios(ListaDoblementeEnlazada listadoEdificios) {
        InstanciaEstructuraEdificios.listadoEdificios = listadoEdificios;
    }
    
}
