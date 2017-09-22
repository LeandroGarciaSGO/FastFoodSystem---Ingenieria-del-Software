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

    public boolean modificarCliente(Cliente C) throws ClassNotFoundException, SQLException {
        ResultSet NC;
        NC = C.obtenerCliente(C.getTelefono());
        if(NC.first()){
            if(NC.getBoolean("estado"))
            {
                return false;
            }
            else
            {
                C.modificar();
                return true;
            }
        }
        else
        {
            C.insertar();
            return false;
        }
    }
    
    public Cliente buscarCliente(int telefono) throws ClassNotFoundException, SQLException {
        ResultSet datosCliente;
        Cliente miCliente = new Cliente();
        datosCliente = miCliente.obtenerCliente(telefono);
        if (datosCliente.first()) {
            miCliente.setIdCliente(datosCliente.getInt("idCliente"));
            miCliente.setNombre(datosCliente.getString("nombre"));
            miCliente.setApellido(datosCliente.getString("apellido"));
            miCliente.setDomicilio(datosCliente.getString("domicilio"));
            miCliente.setTelefono(datosCliente.getInt("telefono"));
            miCliente.setEstado(datosCliente.getBoolean("estado"));
            return miCliente;            
        }
        return null;
    }

  
    
}
