package Logica;

import Datos.Cliente;
import Datos.Comida;
import Datos.DetallePedido;
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
        Pedido ped = new Pedido();
        Facturacion factura = new Facturacion();
        ArrayList<Facturacion> listafacturas = new ArrayList<Facturacion>();
        pedidoslistos = ped.obtenerPedidosListos();
        while (pedidoslistos.next()) {
            ped = new Pedido();
            ped.setIdPedido(pedidoslistos.getInt("idPedido"));
            ped.setIdCliente(pedidoslistos.getInt("idCliente"));
            ped.setEstado(pedidoslistos.getInt("estado"));
            ped.setFecha(pedidoslistos.getDate("fecha"));
            ped.setHora(pedidoslistos.getTime("hora"));
            ped.setLugarDeEnvio(pedidoslistos.getString("lugarDeEnvio"));
            ped.setZona(pedidoslistos.getInt("zona"));
            ped.setIdCadete(pedidoslistos.getInt("idCadete"));         
            System.out.print(pedidoslistos.getInt("idPedido"));
            System.out.print(ped.getIdPedido());
            OperacionesCliente opCli = new OperacionesCliente();
            Cliente cli = opCli.buscarClienteConId(ped.getIdCliente());
            if (cli != null) {
                factura.setDatospedido(ped);
                factura.setDatoscliente(cli);
                listafacturas.add(factura);
                return listafacturas;
            }
        }
        return null;
    }

     public ArrayList<DetallePedido> obtenerDetallesDePedidos(Facturacion fac) throws SQLException, ClassNotFoundException{
        ResultSet listadetalles =  null;
        DetallePedido detalle = new DetallePedido();
        Pedido pd = new Pedido();
        ArrayList<DetallePedido> listaDetalles = new ArrayList<DetallePedido>();        
        listadetalles = pd.obtenerDetallesPedidosListos(fac.getDatospedido().getIdPedido());
        while (listadetalles.next()) {
            //ped = new Pedido2();
            detalle = new DetallePedido();
            detalle.setNumLinea(listadetalles.getInt("numLinea"));
            detalle.setCantidad(listadetalles.getInt("cantidad"));
            Comida C = new Comida();
            ResultSet comida = C.consultaComidaId(listadetalles.getInt("idComida"));
            if(comida.first()){
                C.setDescripcion(comida.getString("descripcion"));
                C.setPrecio(comida.getFloat("precio"));
                detalle.setDatoscomida(C);
            }
            listaDetalles.add(detalle);
        }
        return listaDetalles;
    }
     
     
    
   

    
}
