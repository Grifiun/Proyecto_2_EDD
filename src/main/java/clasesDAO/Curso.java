/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesDAO;

/**
 * Curso(código, nombre, semestre, créditos);
 * código = numérico
 * nombre = alfanumérico
 * semestre = número
 * créditos = número
 * @author 50234
 */
public class Curso {
    private String codigo;
    private String nombre;
    private int semestre;
    private int creditos;

    public Curso(String codigo, String nombre, int semestre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
        
}
