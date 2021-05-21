/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesDAO;

import java.util.ArrayList;

/**
 * Usuario(nombre, contraseña, tipo);
 * nombre = alfanumérico
 * contraseña = alfanumérico
 * tipo = alfanumérico (super, colaborador, estudiante)
 * @author 50234
 */
public class Usuario {
    private String id;
    private String nombre;
    private String password;
    private String tipo;

    public Usuario(String id, String nombre, String password, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }
    
    public ArrayList<String> getInfoUsuario(){
        ArrayList<String> infoUsuario = new ArrayList();
        
        infoUsuario.add(id);
        infoUsuario.add(nombre);
        infoUsuario.add(password);
        infoUsuario.add(tipo);
        
        return infoUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
