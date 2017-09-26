/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariano
 */
public class DetallePedido {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    private int idPedido;
    private int numLinea;
    private int idComida;
    private int cantidad;
    private Comida datoscomida;

    public Comida getDatoscomida() {
        return datoscomida;
    }

    public void setDatoscomida(Comida datoscomida) {
        this.datoscomida = datoscomida;
    }
    
    

    public DetallePedido() {
        this.idPedido = 0;
        this.numLinea = 0;
        this.idComida = 0;
        this.cantidad = 0;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public ResultSet consultaDetallePedido(int idPedido) throws ClassNotFoundException{
        try {
            Connection conex = Conexion.Cadena();         
            String ConsultaSQL = "SELECT idComida, cantidad FROM detallePedido WHERE idPedido = '" + idPedido + "'";
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rsDatos;
    }
    
    public void insertarDetallePedido() throws ClassNotFoundException{
        try{
            Connection conec = Conexion.Cadena();
            psPrepSencencias = conec.prepareStatement("INSERT INTO detallePedido (idPedido,numLinea,idComida,cantidad) VALUES (?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            psPrepSencencias.setInt(1, idPedido);
            psPrepSencencias.setInt(2, numLinea);
            psPrepSencencias.setInt(3, idComida);
            psPrepSencencias.setInt(4, cantidad);
            psPrepSencencias.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
