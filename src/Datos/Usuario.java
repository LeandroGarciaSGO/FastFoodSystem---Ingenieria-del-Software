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
public class Usuario {
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private String tipoDocumento;
    private int numDocumento;
    private int tipoUsuario;
    private boolean estado;

    public Usuario() {
        this.sentencia = null;
        this.rsDatos = null;
        this.psPrepSencencias = null;
        this.idUsuario = 0;
        this.nombreUsuario = "";
        this.contraseña = "";
        this.tipoDocumento = "";
        this.numDocumento = 0;
        this.tipoUsuario = 0;
        this.estado = false;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
 
   
   public ResultSet buscarUsuario(String nomb) throws ClassNotFoundException{
        try {
            Connection conex = Conexion.Cadena();            
            String ConsultaSQL = "SELECT * FROM usuario WHERE nombreUsuario = '" + nomb + "'"; 
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rsDatos;       
    } 
   
//   public ResultSet buscarUsuario2(String nomb,String pass) throws ClassNotFoundException{
//        try {
//            Connection conex = Conexion.Cadena();            
//            String ConsultaSQL = "SELECT usuario.*, MD5('"+pass+"') as pass FROM usuario WHERE nombreUsuario = '" + nomb + "'"; 
//            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            rsDatos = sentencia.executeQuery(ConsultaSQL);
//        } catch (SQLException ex) {
//            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
//        }       
//        return rsDatos;       
//    }
   
   
   public String encriptarClave(String cont) throws ClassNotFoundException, SQLException{
       String ConsultaSQL; 
       try {
            Connection conex = Conexion.Cadena();            
            ConsultaSQL = "SELECT MD5('" + cont + "') as 'clave'"; 
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rsDatos.first()) {
            //System.out.print(rsDatos.getString(1));
            return rsDatos.getString("clave");
        } else {
            return cont;
        }
    }
    

  
}


