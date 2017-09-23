package Logica;

import Datos.Cliente;
import Datos.Facturacion;
import Datos.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Leandro
 */
public class OperacionesFacturacion {
    
    public ArrayList<Facturacion> obtenerInformacionPedidosListos() throws ClassNotFoundException, SQLException {
        ResultSet pedidoslistos;
        Facturacion factura = new Facturacion();
        ArrayList<Facturacion> listafacturas = new ArrayList<Facturacion>();        
        pedidoslistos = factura.obtenerPedidosListos();
        while (pedidoslistos.next()) {
            Pedido ped = new Pedido();
            ped.setIdPedido(pedidoslistos.getInt("idPedido"));
            ped.setIdCliente(pedidoslistos.getInt("idCliente"));
            ped.setEstado(pedidoslistos.getInt("estado"));
            ped.setFecha(pedidoslistos.getDate("fecha"));
            ped.setHora(pedidoslistos.getTime("hora"));
            ped.setLugarDeEnvio(pedidoslistos.getString("lugarDeEnvio"));
            ped.setZona(pedidoslistos.getString("zona"));
            ped.setIdCadete(pedidoslistos.getInt("idCadete"));         
            System.out.print(pedidoslistos.getInt("idPedido"));
            System.out.print(ped.getIdPedido());
            OperacionesCliente opCli = new OperacionesCliente();
            Cliente cli = opCli.buscarClienteConId(ped.getIdCliente());
            if(cli != null){
               
            factura.setDatospedido(ped);
            factura.setDatoscliente(cli);
            
//fa.setPed((Pedido) pedidoslistos);
            //fa.setPed(pedidoslistos.get);
            //fa.algo = 10;
            listafacturas.add(factura);
            return listafacturas;}else{
                System.out.println("ERROR");
            }
        }
        //}
        return null;
        //DetallePedido DP1 = new DetallePedido();
        //ArrayList<DetallePedido> listaDetallePedido = new ArrayList<DetallePedido>();

    }


    
}
