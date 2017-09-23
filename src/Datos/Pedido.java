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
import java.sql.Time;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariano
 */
public class Pedido {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    private int idPedido;
    private int idCliente;
    private int estado;
    private Date fecha;
    private Time hora;
    private String lugarDeEnvio;
    private String zona;
    private int idCadete;

    public Pedido() {
        this.idPedido = 0;
        this.idCliente = 0;
        this.estado = 0;
        this.fecha = null;
        this.hora = null;
        this.lugarDeEnvio = "";
        this.zona = "";
        this.idCadete = 0;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugarDeEnvio() {
        return lugarDeEnvio;
    }

    public void setLugarDeEnvio(String lugarDeEnvio) {
        this.lugarDeEnvio = lugarDeEnvio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getIdCadete() {
        return idCadete;
    }

    public void setIdCadete(int idCadete) {
        this.idCadete = idCadete;
    }
    
    public ResultSet consultaPedido(int idPedido) throws ClassNotFoundException{
        try {
            Connection conex = Conexion.Cadena();         
            String ConsultaSQL = "SELECT idPedido, fecha, hora, estado FROM pedido WHERE idPedido = '" + idPedido + "' AND estado = '" + 1 + "'";
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rsDatos;       
    }
    
    public int insertarPedido() throws ClassNotFoundException{
        try{
            Connection conec = Conexion.Cadena();
            psPrepSencencias = conec.prepareStatement("INSERT INTO pedido (idCliente,estado,fecha,hora,lugarDeEnvio,zona,idCadete) VALUES (?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            psPrepSencencias.setInt(1, idCliente);
            psPrepSencencias.setInt(2, estado);
            psPrepSencencias.setDate(3, fecha);
            psPrepSencencias.setTime(4, hora);
            psPrepSencencias.setString(5, lugarDeEnvio);
            psPrepSencencias.setString(6, zona);
            psPrepSencencias.setInt(7, idCadete);
            psPrepSencencias.executeUpdate();
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idPedido = rsDatos.getInt(1);
        } catch (SQLException ex){
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPedido;
    }
    
    public void eliminarPedido(int idPedido) throws ClassNotFoundException{
        try {      
            Connection cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("UPDATE pedido SET estado = ? WHERE idPedido = ?",PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, 4);
            psPrepSencencias.setInt(2, idPedido);
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
           
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
