/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DetallePedido;
import Datos.Pedido;
import Datos.Zona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mariano
 */

public class ABMPedido {
    public int nuevoPedido(Pedido P) throws ClassNotFoundException, SQLException{
        return P.insertarPedido();
        //return x;
    }
    
    public Pedido buscarPedido(int idPedido) throws ClassNotFoundException, SQLException{
        ResultSet datosPedido;
        Pedido P = new Pedido();
        datosPedido = P.consultaPedido(idPedido);
        
        try {
            boolean primerpedido = datosPedido.first();
        } catch (SQLException ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datosPedido.first()) {
            P.setIdPedido(datosPedido.getInt("idPedido"));
            P.setFecha(datosPedido.getDate("fecha"));
            P.setHora(datosPedido.getTime("hora"));
            P.setLugarDeEnvio(datosPedido.getString("lugarDeEnvio"));
            P.setZona(datosPedido.getString("zona"));
            if (P.getEstado() == 0) {
                return P;
            }
            else
            {
                return null;
            }
        }
        return null;
    }
    
    public void nuevoDetallePedido(ArrayList<DetallePedido> DP) throws ClassNotFoundException{
        for(int i = 0; i<DP.size(); i++){
            DetallePedido detP = new DetallePedido();
            detP.setIdPedido(DP.get(i).getIdPedido());
            detP.setNumLinea(DP.get(i).getNumLinea());
            detP.setIdComida(DP.get(i).getIdComida());
            detP.setCantidad(DP.get(i).getCantidad());
            detP.insertarDetallePedido();
        }
    }
    
    public ArrayList<DetallePedido> buscarDetallePedido(int idPedido) throws ClassNotFoundException, SQLException{
        ResultSet datosDetalleP;
        DetallePedido DP1 = new DetallePedido();
        ArrayList<DetallePedido> listaDetallePedido = new ArrayList<DetallePedido>();
        datosDetalleP = DP1.consultaDetallePedido(idPedido);
        while(datosDetalleP.next()) {
            DetallePedido DP2 = new DetallePedido();
            DP2.setIdComida(datosDetalleP.getInt("idComida"));
            DP2.setCantidad(datosDetalleP.getInt("cantidad"));
            listaDetallePedido.add(DP2);
        }
        return listaDetallePedido;
    }
    
    public ArrayList<Zona> buscarZona() throws ClassNotFoundException, SQLException{
        ResultSet datosZona;
        ArrayList<Zona> listaZonas = new ArrayList<Zona>();
        Zona z1 = new Zona();
        datosZona = z1.consultaZona();
        while(datosZona.next()){
            Zona z2 = new Zona();
            z2.setDescripcion(datosZona.getString("descripcion"));
            z2.setPrecio(datosZona.getFloat("precio"));
            listaZonas.add(z2);
        }
        return listaZonas;
    }
}
