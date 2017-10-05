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
import java.util.ArrayList;


/**
 *
 * @author Gonzalez
 */
public class ABMComida {

    // public int modificarComida(Comida C) throws ClassNotFoundException, SQLException {
    public boolean modificarComida(Comida C) throws ClassNotFoundException, SQLException {
        ResultSet NC;
        NC = C.consultaComida(C.getDescripcion());

        if (NC.first()) {
            if (NC.getBoolean("estado")) {
                if (C.getIdComida() == NC.getInt("idComida")) {
                    C.modificar();
                    System.out.println("\nEXISTE + ACTIVO + ID\n");
                    return true;
                } else {
                    System.out.println("\nEXISTE + ACTIVO\n");
                    return false;
                }
            } else {
                C.modificar();
                System.out.println("\nEXISTE\n");
                return true;
            }
        }
        System.out.println("\nNADA\n");
        C.agregarNuevaComida();
        return true;
    }
//    }

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
            miComida.setDescripcion(datosComida.getString("descripcion"));
            miComida.setPrecio(datosComida.getFloat("precio"));
            miComida.setTipo(datosComida.getInt("tipo"));
            miComida.setEstado(datosComida.getBoolean("estado"));
            //System.out.println(miComida.getIdComida());
            if (miComida.isEstado()) {
                return miComida;
            } else {
                return null;
            }
        }
        return null;
    }

    public Comida buscarComidaId(int idComida) throws ClassNotFoundException, SQLException {
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
    
    public ArrayList<Comida> recuperarComidas()throws ClassNotFoundException, SQLException{
        ResultSet datosComida;
        Comida miComida = new Comida();
        ArrayList<Comida> listaComidas = new ArrayList<Comida>();
        datosComida = miComida.consultarTodasLasComidas();
        while (datosComida.next()) {
            Comida miComidaLista = new Comida();
            miComidaLista.setDescripcion(datosComida.getString("descripcion"));
            listaComidas.add(miComidaLista);
        }
        return listaComidas;
    }

//    public static int obtenerSiguienteId(){
//    return 1;
//}
}
