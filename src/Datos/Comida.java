
package Datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class Comida {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    private int idComida;
    private String descripcion;
    private float precio;
    private String tipo;
    private boolean estado;

    public Comida() {
        this.idComida = 0;
        this.descripcion = "";
        this.precio = 0;
        this.tipo = "";
        this.estado = false;
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public ResultSet getRsDatos() {
        return rsDatos;
    }

    public PreparedStatement getPsPrepSencencias() {
        return psPrepSencencias;
    }

    public int getIdComida() {
        return idComida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public void setRsDatos(ResultSet rsDatos) {
        this.rsDatos = rsDatos;
    }

    public void setPsPrepSencencias(PreparedStatement psPrepSencencias) {
        this.psPrepSencencias = psPrepSencencias;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
public ResultSet consultaComida(String desc) throws ClassNotFoundException{
        try {
            Connection conex = Conexion.Cadena();            
            String ConsultaSQL = "SELECT * FROM comida WHERE descripcion = '" + desc + "'"; 
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rsDatos;       
    }

public ResultSet consultaComidaId(int idComida) throws ClassNotFoundException{
        try {
            Connection conex = Conexion.Cadena();            
            String ConsultaSQL = "SELECT descripcion,precio FROM comida WHERE idComida = '" + idComida + "'"; 
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rsDatos;       
    }


public void agregarNuevaComida() throws ClassNotFoundException{
    try {
            Connection conex = Conexion.Cadena();            
            psPrepSencencias = conex.prepareStatement("insert into comida (descripcion, precio, tipo, estado) values (?, ?, ?, ?)",PreparedStatement.RETURN_GENERATED_KEYS); 
            psPrepSencencias.setString(1, descripcion);
            psPrepSencencias.setFloat(2, precio);
            psPrepSencencias.setString(3, tipo);
            psPrepSencencias.setBoolean(4, true);
            
            psPrepSencencias.executeUpdate();
            
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            idComida = rsDatos.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }
}