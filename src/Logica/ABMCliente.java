/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class ABMCliente {
    
    public Cliente buscarCliente(int telefono) throws ClassNotFoundException, SQLException {
        ResultSet datosCliente;
        Cliente miCliente = new Cliente();
        datosCliente = miCliente.consultaCliente(telefono);
        
        try {
            boolean primercliente = datosCliente.first();
        } catch (SQLException ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datosCliente.first()) {
            miCliente.setIdCliente(datosCliente.getInt("idCliente"));
            miCliente.setNombre(datosCliente.getString("nombre"));
            miCliente.setApellido(datosCliente.getString("apellido"));
            miCliente.setDomicilio(datosCliente.getString("domicilio"));
            miCliente.setTelefono(datosCliente.getInt("telefono"));
            miCliente.setEstado(datosCliente.getBoolean("estado"));
            System.out.print(miCliente.getApellido());
            if (miCliente.isEstado()) {
                return miCliente;
            }
            else
            {
                return null;
            }
        }
        return null;
    }
    
}
