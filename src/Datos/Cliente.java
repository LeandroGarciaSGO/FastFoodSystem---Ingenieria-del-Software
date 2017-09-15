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
 * @author Leandro
 */
public class Cliente {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int telefono;
    private boolean estado;

    public Cliente() {
        this.idCliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.domicilio = "";
        this.telefono = 0;
        this.estado = false;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
public ResultSet consultaCliente(int telef) throws ClassNotFoundException{
        try {
            Connection conex = Conexion.Cadena();            
            String ConsultaSQL = "SELECT * FROM cliente WHERE telefono = '" + telef + "'"; 
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rsDatos;       
    } 

public static int obtenerSiguienteId(){
    return 1;
}

    public void agregarNuevoCliente() throws ClassNotFoundException, SQLException {
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("INSERT INTO cliente(nombre,apellido,domicilio,telefono,estado) values (?, ?, ?, ?,?)",
                                                          PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setString(1, nombre);
            psPrepSencencias.setString(2, apellido);
            psPrepSencencias.setString(3, domicilio);
            psPrepSencencias.setInt(4, telefono);
            psPrepSencencias.setBoolean(4, true);
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idCliente = rsDatos.getInt(1);
    }



    
}
