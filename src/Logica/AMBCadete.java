/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import Datos.Cadete;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luji
 */
public class AMBCadete {
    public Cadete buscarCadete(int numDocumento) throws ClassNotFoundException, SQLException {
        ResultSet datosCadete;
        Cadete miCadete = new Cadete();
        datosCadete = miCadete.consultaCadete(numDocumento);
        
        try {
            boolean primercadete = datosCadete.first();
        } catch (SQLException ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datosCadete.first()) {
            miCadete.setIdCadete(datosCadete.getInt("idCadete"));
            miCadete.setNombre(datosCadete.getString("nombre"));
            miCadete.setApellido(datosCadete.getString("apellido"));
            miCadete.setDomicilio(datosCadete.getString("domicilio"));
            miCadete.setTelefono(datosCadete.getInt("telefono"));
            miCadete.setTipoDocumento(datosCadete.getString("TipoDocumento"));
            miCadete.setNumDocumento(datosCadete.getInt("numDocumento"));
            miCadete.setEstado(datosCadete.getBoolean("estado"));
            System.out.print(miCadete.getApellido());
            if (miCadete.isEstado()) {
                return miCadete;
            }
            else
            {
                return null;
            }
        }
        return null;
    }
        public static int obtenerSiguienteId(){
    return 1;
}
 public int nuevoCadete(Cadete C) throws ClassNotFoundException, SQLException{
    ResultSet NC;
    NC = C.consultaCadete(C.getNumDocumento());
    
    if(NC.first()){
        return 1;
    }else{
        C.agregarNuevoCadete();
        return 0;
    }
}  
}
