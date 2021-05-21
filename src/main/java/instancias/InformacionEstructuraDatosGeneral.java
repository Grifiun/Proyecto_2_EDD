/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 50234
 */
public class InformacionEstructuraDatosGeneral {
    public ArrayList<String> getTitulos(String tipo){
        ArrayList<String> titulosAuxiliares = new ArrayList();
        switch(tipo){
            case "usuario":
                    titulosAuxiliares = InstanciaEstructuraUsuarios.getTitulos();
                break;
            case "catedraticos":
                    titulosAuxiliares = instancias.InstanciaEstructuraCatedraticos.getTitulos();
                break;
            case "edificios":
                    titulosAuxiliares = instancias.InstanciaEstructuraEdificios.getTitulos();
                break;
        }
    
        return titulosAuxiliares;
    };
    
    public List<ArrayList<String>> getInfoTable(String tipo){
        List<ArrayList<String>> dataTable;
        switch(tipo){
            case "usuario":
                    dataTable = instancias.InstanciaEstructuraUsuarios.getInfo();
                break;
            case "catedraticos":
                    dataTable = instancias.InstanciaEstructuraCatedraticos.getInfo();
                break;
            case "edificios":
                    dataTable = instancias.InstanciaEstructuraEdificios.getInfo();
                break;
            default:
                dataTable = new ArrayList();
        }
        
        return dataTable;
    }
}
