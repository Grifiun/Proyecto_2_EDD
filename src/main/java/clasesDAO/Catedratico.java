/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesDAO;

import java.util.ArrayList;

/**
 * Catedrático(identificador, nombre, dirección);
 * identificador = numérico
 * nombre = alfanumérico
 * dirección = alfanumérico    
 * @author 50234
 */
public class Catedratico {
    private String identificador;
    private String nombre;
    private String dirección;

    public Catedratico(String identificador, String nombre, String dirección) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.dirección = dirección;
    }
    
    public ArrayList<String> getInfoCatedratico(){
        ArrayList<String> infoUsuario = new ArrayList();
        
        infoUsuario.add(identificador);
        infoUsuario.add(nombre);
        infoUsuario.add(dirección);
        
        return infoUsuario;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
}
