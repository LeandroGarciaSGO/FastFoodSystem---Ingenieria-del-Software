/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Comida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Gonzalez
 */
public class ABMComida {
    public Comida buscarComida(String desc) throws ClassNotFoundException, SQLException {
        ResultSet datosComida;
        Comida miComida = new Comida();
        datosComida = miComida.consultaComida(desc);
        
        try {
            boolean primeraComida = datosComida.first();
        } catch (SQLException ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datosComida.first()) {
            miComida.setIdComida(datosComida.getInt("idComida"));
            miComida.setDescripcion(datosComida.getString("Descripcion"));
            miComida.setPrecio(datosComida.getFloat("Precio"));
            miComida.setTipo(datosComida.getString("Tipo"));
            miComida.setEstado(datosComida.getBoolean("Estado"));
            //System.out.println(miComida.getIdComida());
            if (miComida.isEstado()) {
                return miComida;
            }
            else
            {
                return null;
            }
        }
        return null;
    }
    
    public Comida buscarComidaId(int idComida) throws ClassNotFoundException, SQLException{
        ResultSet datosComida;
        Comida miComida = new Comida();
        datosComida = miComida.consultaComidaId(idComida);
        
        try {
            boolean primeraComida = datosComida.first();
        } catch (SQLException ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datosComida.first()) {
            //miComida.setIdComida(datosComida.getInt("idComida"));
            miComida.setDescripcion(datosComida.getString("Descripcion"));
            miComida.setPrecio(datosComida.getFloat("Precio"));
            //miComida.setTipo(datosComida.getString("Tipo"));
            //miComida.setEstado(datosComida.getBoolean("Estado"));
            //System.out.println(miComida.getIdComida());
            return miComida;
        }
        return null;
    }
    
    public static int obtenerSiguienteId(){
    return 1;
}

public int nuevaComida(Comida C) throws ClassNotFoundException, SQLException{
    ResultSet NC;
    NC = C.consultaComida(C.getDescripcion());
    
    if(NC.first()){
        return 1;
    }else{
        C.agregarNuevaComida();
        return 0;
    }
}
    
}
