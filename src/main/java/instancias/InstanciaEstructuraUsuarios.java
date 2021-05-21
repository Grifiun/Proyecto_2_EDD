/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

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
public class InstanciaEstructuraUsuarios {
    
    public static ArrayList<String> titulos = new ArrayList<>(Arrays.asList("ID", "Nombre", "Password", "Tipo", "Acciones"));
    public static ListaDoblementeEnlazada listadoUsuarios;
          
    public static void agregarUsuario(Usuario usuario){
        revisar();
        listadoUsuarios.insertarNodo(usuario, usuario.getId());
    }
    
    public static void borrarUsuario(String id){
        listadoUsuarios.eliminarNodo(id);
    }
    
    public static Usuario buscarUsuario(String identificador){
        return (Usuario) listadoUsuarios.buscarNodo(identificador).getData();
    }
    
    public static List<ArrayList<String>> getInfo(){
        List<ArrayList<String>> datosAuxiliar = new ArrayList();
        
        NodoDobleEnlace aux = listadoUsuarios.getRaiz();
        while(aux != null){//mientras exista
            datosAuxiliar.add(((Usuario)aux.getData()).getInfoUsuario());
            
            if(aux.getSiguiente() != null && aux.getSiguiente() != listadoUsuarios.getRaiz()){//asi evitamos bucles infinitos
                aux = (NodoDobleEnlace) aux.getSiguiente();
                System.out.println("A");
            }else{
                break;
            }
        }
        
        return datosAuxiliar;
    }
    
    public static void imprimirUsuarios(){
        listadoUsuarios.imprimirDatos("Usuarios");
    }
    
    public static void revisar(){
        if(listadoUsuarios == null){
            listadoUsuarios = new ListaDoblementeEnlazada();//instanciamos si no esta hecho
        }
    }

    public static ArrayList<String> getTitulos() {
        return titulos;
    }

    public static void setTitulos(ArrayList<String> titulos) {
        InstanciaEstructuraUsuarios.titulos = titulos;
    }
    
    
}
