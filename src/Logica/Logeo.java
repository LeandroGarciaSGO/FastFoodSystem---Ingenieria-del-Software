/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Usuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class Logeo {

    public int autenticar(String nom, String cont) throws ClassNotFoundException, SQLException {
        ResultSet datosUsuario;
        Usuario miUsuario = new Usuario();
        datosUsuario = miUsuario.buscarUsuario(nom, "12345");
        int resultado = 0;
        try {
            boolean aa = datosUsuario.first();
        } catch (SQLException ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datosUsuario.first()) {
            String clave = datosUsuario.getString("contraseña");
            String paswd = datosUsuario.getString("pass");
            boolean estado = datosUsuario.getBoolean("estado");
            int tipoUsuario = datosUsuario.getInt("tipoUsuario");
            System.out.print(estado);
            MessageDigest msgd;
            
            if (estado) {
                //String c = miUsuario.buscarUsuarioMD5(cont);
                if (clave.equals(paswd)) {
                    resultado = tipoUsuario;
                }
            }
        }
        return resultado;
    }

}
