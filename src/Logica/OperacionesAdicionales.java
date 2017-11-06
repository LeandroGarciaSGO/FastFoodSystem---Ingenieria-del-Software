/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Cliente;
import Datos.Facturacion;
import Datos.InformeActividad;
import Datos.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class OperacionesAdicionales {
    
    public ArrayList<InformeActividad> obtenerActividades() throws ClassNotFoundException, SQLException {
        ResultSet informe;
        InformeActividad I = new InformeActividad();

        //Facturacion factura = new Facturacion();
        ArrayList<InformeActividad> inf = new ArrayList<InformeActividad>();
        informe = I.obtenerTodasActividades();
        while (informe.next()) {
            I = new InformeActividad();
            I.setIdTransaccion(informe.getInt("idTransaccion"));
            I.setFecha(String.valueOf(informe.getDate("fecha")));
            I.setHora(String.valueOf(informe.getTime("hora")));
            I.setIdUsuario(informe.getInt("idUsuario"));
            I.setDescripcion(informe.getString("descripcion"));
            I.setIdEntidad(informe.getInt("idEntidad"));
            I.setTabla(informe.getString("tabla"));
            inf.add(I);
            System.out.println(informe.getInt("idTransaccion"));
            System.out.println(String.valueOf(informe.getDate("fecha")));
            System.out.println(String.valueOf(informe.getTime("hora")));
            System.out.println(informe.getInt("idUsuario"));
            System.out.println(informe.getString("descripcion"));
            System.out.println(informe.getInt("idEntidad"));
            System.out.println(informe.getString("tabla"));
        }
        return inf;
    }
    
}
