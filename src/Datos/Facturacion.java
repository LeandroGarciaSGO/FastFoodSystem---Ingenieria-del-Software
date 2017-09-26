package Datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Leandro
 */
public class Facturacion {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    private Pedido datospedido;
    private Cliente datoscliente;
    
    public Facturacion(){
        this.datoscliente = null;
        this.datoscliente = null;        
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public ResultSet getRsDatos() {
        return rsDatos;
    }

    public void setRsDatos(ResultSet rsDatos) {
        this.rsDatos = rsDatos;
    }

    public PreparedStatement getPsPrepSencencias() {
        return psPrepSencencias;
    }

    public void setPsPrepSencencias(PreparedStatement psPrepSencencias) {
        this.psPrepSencencias = psPrepSencencias;
    }

    public Pedido getDatospedido() {
        return datospedido;
    }

    public void setDatospedido(Pedido datospedido) {
        this.datospedido = datospedido;
    }

    public Cliente getDatoscliente() {
        return datoscliente;
    }

    public void setDatoscliente(Cliente datoscliente) {
        this.datoscliente = datoscliente;
    }
    
    public int obtenerSiguienteId() throws ClassNotFoundException, SQLException {        
        Connection conex = Conexion.Cadena();
        String ConsultaSQL = "SELECT (MAX(numFactura) )AS 'ID' FROM factura";
        sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rsDatos = sentencia.executeQuery(ConsultaSQL);
        if (rsDatos.first()) {
            int id = rsDatos.getInt("ID") + 1;
            return id;
        } else {
            return 1;
        }
    }
 
    public String obtenerFechaActual() throws ClassNotFoundException, SQLException {
        String fecha = new String();
        Connection conex = Conexion.Cadena();
        String ConsultaSQL = "SELECT CURDATE() AS 'fechaActual'";
        sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rsDatos = sentencia.executeQuery(ConsultaSQL);
        Date fe = new Date(0);
        if (rsDatos.first()) {
            fe = rsDatos.getDate("fechaActual");
            fecha = String.valueOf(fe);
        }
        return fecha;
    }
}
