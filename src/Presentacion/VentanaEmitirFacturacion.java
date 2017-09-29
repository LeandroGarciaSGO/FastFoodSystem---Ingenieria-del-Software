/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Cadete;
import Datos.DetallePedido;
import Datos.Facturacion;
import Datos.Pedido;
import Datos.Zona;
import Logica.AMBCadete;
import Logica.OperacionesFacturacion;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Leandro
 */
public class VentanaEmitirFacturacion extends javax.swing.JFrame implements Printable{
        private ArrayList<DetallePedido> listaDetalles = new ArrayList<DetallePedido>();
        private Facturacion Factura;
        private float importeFactura;
        private float importeTotal;
        private Zona z;
        private OperacionesFacturacion OF;
    /**
     * Creates new form VentanaFacturacion
     */
    public VentanaEmitirFacturacion() {
        initComponents();
        setLocationRelativeTo(null); //Centra la Ventana en la Pantalla
        Factura = new Facturacion();
        importeFactura = 0;
        importeTotal = 0;
        z = new Zona();
        OF = new OperacionesFacturacion();
    }

    public Facturacion getFactura() {
        return Factura;
    }

    public void setFactura(Facturacion Factura) {
        this.Factura = Factura;
    }
    
    
    
    
    public void cargarDatosFactura() throws ClassNotFoundException, SQLException {
        // CARGO LOS DATOS EN LA FACTURA
        int numF = Factura.obtenerSiguienteId();
        jLabelValorNroFactura.setText(String.valueOf(numF));
        jLabelValorFecha.setText(Factura.obtenerFechaActual());
        // CARGO LOS DATOS DE CLIENTE
        jLabelValorNombreCliente.setText(Factura.getDatoscliente().getNombre() + " " + Factura.getDatoscliente().getApellido());
        jLabelValorDomicilio.setText(Factura.getDatospedido().getLugarDeEnvio());
        jLabelValorTelefono.setText(String.valueOf(Factura.getDatoscliente().getTelefono()));
        z = OF.obtenerZona(Factura.getDatospedido().getZona());
        jLabelValorZona.setText(z.getDescripcion());
        // CARGA LA TABLA CON LOS DETALLES
        llenarTablaConDetalleYcalcularTotal(Factura);
        // CALCULO LOS IMPORTES
        importeFactura = obtenerTotalFactura();
        importeTotal = importeFactura + z.getPrecio();
        jLabelValorImporte.setText(String.valueOf(importeFactura));
        jLabelValorTotalGeneral.setText(String.valueOf(importeTotal));
        jLabelValorTotalEnvio.setText(String.valueOf(z.getPrecio()));
        // CARGO LOS DATOS EN EL COMPROBANTE
        jLabelValoClienteNombreComprobante.setText(Factura.getDatoscliente().getNombre() + " " + Factura.getDatoscliente().getApellido());
        jLabelValorDomicilioClienteComprobante.setText(Factura.getDatospedido().getLugarDeEnvio());
        jLabelValorNumFacturaComprobante.setText(String.valueOf(Factura.getNumFactura()));
        jLabelValorZonaComprobante.setText(z.getDescripcion());
        jLabelValorTotalEnvioComprobante.setText(String.valueOf(z.getPrecio()));
        jLabelValorTotalFacturaComprobante.setText(String.valueOf(importeFactura));
        jLabelValorTotalGeneralComprobante.setText(String.valueOf(importeTotal));
        // CARGO DATOS CADETE
        AMBCadete C = new AMBCadete();
        Cadete Cad = new Cadete();
        Cad = C.buscarCadeteConId(Factura.getDatospedido().getIdCadete());
        jLabelValorIdCadete.setText(String.valueOf(Cad.getIdCadete()));
        jLabelValorNombreCadete.setText(Cad.getNombre() + " " +Cad.getApellido());
    }
    
    public float obtenerTotalFactura() {
        float total = 0;
        for (int i = 0; i < jTableDetalle.getRowCount(); i++) {
            total =  total + Float.parseFloat((String) jTableDetalle.getValueAt(i, 4));
        }
        return total;
    }
    
    
    public void llenarTablaConDetalleYcalcularTotal(Facturacion factura) throws ClassNotFoundException, SQLException {
        String datos[] = new String[5];
        DefaultTableModel tablaP = (DefaultTableModel) jTableDetalle.getModel();       
        OperacionesFacturacion facturacion = new OperacionesFacturacion();
        listaDetalles = facturacion.obtenerDetallesDePedidos(factura);
        float total = 0;
       
            for (int i = 0; i < listaDetalles.size(); i++) {
                datos[0] = String.valueOf(listaDetalles.get(i).getNumLinea());
                datos[1] = String.valueOf(listaDetalles.get(i).getDatoscomida().getDescripcion());
                datos[2] = String.valueOf(listaDetalles.get(i).getCantidad());
                datos[3] = String.valueOf(listaDetalles.get(i).getDatoscomida().getPrecio());
                float totlinea = listaDetalles.get(i).getDatoscomida().getPrecio() * listaDetalles.get(i).getCantidad();
                datos[4] = String.valueOf(totlinea);
                tablaP.addRow(datos);
                total = total + totlinea;
            }
            jLabelValorImporte.setText(String.valueOf(total));     
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneContenedor = new javax.swing.JScrollPane();
        jPanelContenedorFactura = new javax.swing.JPanel();
        jPanelLogo = new javax.swing.JPanel();
        jPanelTipoFactura = new javax.swing.JPanel();
        jLabelFechaFactura = new javax.swing.JLabel();
        jLabelNroFacturaFactura = new javax.swing.JLabel();
        jLabelTituloFactura = new javax.swing.JLabel();
        jLabelResponsableFactura = new javax.swing.JLabel();
        jPanelDatosCliente = new javax.swing.JPanel();
        jLabelNomApeClienteFactura = new javax.swing.JLabel();
        jLabelDomicilioFactura = new javax.swing.JLabel();
        jLabelTelefonoFactura = new javax.swing.JLabel();
        jLabelZonaFactura = new javax.swing.JLabel();
        jLabelValorNombreCliente = new javax.swing.JLabel();
        jLabelValorDomicilio = new javax.swing.JLabel();
        jLabelValorTelefono = new javax.swing.JLabel();
        jLabelValorZona = new javax.swing.JLabel();
        jPanelDetalle = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jLabelTotal = new javax.swing.JLabel();
        jLabelPeso1 = new javax.swing.JLabel();
        jLabelValorImporte = new javax.swing.JLabel();
        jLabelImporteEnvioFactura = new javax.swing.JLabel();
        jLabelTotalFactura = new javax.swing.JLabel();
        jLabelPeso2 = new javax.swing.JLabel();
        jLabelPeso3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelResponsableFactura1 = new javax.swing.JLabel();
        jLabelCUIT = new javax.swing.JLabel();
        jLabelIVA = new javax.swing.JLabel();
        jLabelDomicilioLocal = new javax.swing.JLabel();
        jLabelTelefonoLocal = new javax.swing.JLabel();
        jLabelTituloComprobante = new javax.swing.JLabel();
        jLabelNombreApeCadete = new javax.swing.JLabel();
        jLabelNroCadete = new javax.swing.JLabel();
        jPanelDatosClienteComprobante = new javax.swing.JPanel();
        jLabelNombreYApellidoComprobante = new javax.swing.JLabel();
        jLabelDomicilioComprobante = new javax.swing.JLabel();
        jLabelNumFacturaComprobante = new javax.swing.JLabel();
        jLabelZonaComprobante = new javax.swing.JLabel();
        jLabelImporteEnvioComprobante = new javax.swing.JLabel();
        jLabelImporteFacturaComprobante = new javax.swing.JLabel();
        jLabelImporteTotalComprobante = new javax.swing.JLabel();
        jLabelPeso4 = new javax.swing.JLabel();
        jLabelValorNumFacturaComprobante = new javax.swing.JLabel();
        jLabelValorDomicilioClienteComprobante = new javax.swing.JLabel();
        jLabelValoClienteNombreComprobante = new javax.swing.JLabel();
        jLabelValorZonaComprobante = new javax.swing.JLabel();
        jLabelValorTotalFacturaComprobante = new javax.swing.JLabel();
        jLabelValorTotalEnvioComprobante = new javax.swing.JLabel();
        jLabelValorTotalGeneralComprobante = new javax.swing.JLabel();
        jLabelValorFecha = new javax.swing.JLabel();
        jLabelValorNroFactura = new javax.swing.JLabel();
        jLabelValorTotalGeneral = new javax.swing.JLabel();
        jLabelValorTotalEnvio = new javax.swing.JLabel();
        jLabelValorIdCadete = new javax.swing.JLabel();
        jLabelValorNombreCadete = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastFoodSystem - Emitir Factura");
        setMinimumSize(new java.awt.Dimension(800, 700));

        jScrollPaneContenedor.setMaximumSize(new java.awt.Dimension(740, 500));
        jScrollPaneContenedor.setMinimumSize(new java.awt.Dimension(740, 500));
        jScrollPaneContenedor.setPreferredSize(new java.awt.Dimension(740, 500));

        jPanelContenedorFactura.setMaximumSize(new java.awt.Dimension(720, 950));
        jPanelContenedorFactura.setMinimumSize(new java.awt.Dimension(720, 950));
        jPanelContenedorFactura.setPreferredSize(new java.awt.Dimension(720, 950));

        jPanelLogo.setBackground(new java.awt.Color(255, 0, 0));
        jPanelLogo.setMaximumSize(new java.awt.Dimension(280, 80));
        jPanelLogo.setMinimumSize(new java.awt.Dimension(280, 80));

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelTipoFactura.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanelTipoFacturaLayout = new javax.swing.GroupLayout(jPanelTipoFactura);
        jPanelTipoFactura.setLayout(jPanelTipoFacturaLayout);
        jPanelTipoFacturaLayout.setHorizontalGroup(
            jPanelTipoFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jPanelTipoFacturaLayout.setVerticalGroup(
            jPanelTipoFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jLabelFechaFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelFechaFactura.setText("Fecha:");

        jLabelNroFacturaFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNroFacturaFactura.setText("Nro de Factura:");

        jLabelTituloFactura.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelTituloFactura.setText("Factura");

        jLabelResponsableFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelResponsableFactura.setText("Nombre del Responsable");

        jPanelDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N
        jPanelDatosCliente.setMaximumSize(new java.awt.Dimension(700, 80));
        jPanelDatosCliente.setMinimumSize(new java.awt.Dimension(700, 80));
        jPanelDatosCliente.setPreferredSize(new java.awt.Dimension(700, 80));

        jLabelNomApeClienteFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNomApeClienteFactura.setText("Nombre y Apellido:");

        jLabelDomicilioFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDomicilioFactura.setText("Domicilio:");

        jLabelTelefonoFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelTelefonoFactura.setText("Telefono:");

        jLabelZonaFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelZonaFactura.setText("Zona:");

        jLabelValorTelefono.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorZona.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelDatosClienteLayout = new javax.swing.GroupLayout(jPanelDatosCliente);
        jPanelDatosCliente.setLayout(jPanelDatosClienteLayout);
        jPanelDatosClienteLayout.setHorizontalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelDomicilioFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNomApeClienteFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelZonaFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorZona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelTelefonoFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelDatosClienteLayout.setVerticalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefonoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelZonaFactura)
                            .addComponent(jLabelValorZona)))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomApeClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorNombreCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDomicilioFactura)
                            .addComponent(jLabelValorDomicilio))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N
        jPanelDetalle.setMaximumSize(new java.awt.Dimension(700, 300));
        jPanelDetalle.setMinimumSize(new java.awt.Dimension(700, 300));
        jPanelDetalle.setPreferredSize(new java.awt.Dimension(700, 300));

        jTableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Cantidad", "Precio Unitario", "Total Linea"
            }
        ));
        jTableDetalle.setMaximumSize(new java.awt.Dimension(680, 285));
        jTableDetalle.setMinimumSize(new java.awt.Dimension(680, 285));
        jTableDetalle.setPreferredSize(new java.awt.Dimension(680, 285));
        jScrollPane3.setViewportView(jTableDetalle);

        jLabelTotal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelTotal.setText("IMPORTE TOTAL DE FACTURA:");

        jLabelPeso1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelPeso1.setText("$");

        jLabelValorImporte.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanelDetalleLayout = new javax.swing.GroupLayout(jPanelDetalle);
        jPanelDetalle.setLayout(jPanelDetalleLayout);
        jPanelDetalleLayout.setHorizontalGroup(
            jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPeso1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanelDetalleLayout.setVerticalGroup(
            jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeso1)
                    .addComponent(jLabelValorImporte))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabelImporteEnvioFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImporteEnvioFactura.setText("Tarifa de Envio:");

        jLabelTotalFactura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelTotalFactura.setText("IMPORTE TOTAL:");

        jLabelPeso2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelPeso2.setText("$");

        jLabelPeso3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelPeso3.setText("$");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator1.setMaximumSize(new java.awt.Dimension(700, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(700, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(700, 10));

        jLabelResponsableFactura1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelResponsableFactura1.setText("Casa de Comidas EL PRINCIPITO");

        jLabelCUIT.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCUIT.setText("CUIT: 9999999999");

        jLabelIVA.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelIVA.setText("IVA Responsable Inscripto");

        jLabelDomicilioLocal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDomicilioLocal.setText("Domicilio: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        jLabelTelefonoLocal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelTelefonoLocal.setText("Telefono: (9999) 999-9999");

        jLabelTituloComprobante.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelTituloComprobante.setText("Comprobante de Envio para el Cadete");

        jLabelNombreApeCadete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNombreApeCadete.setText("Nombre Y Apellido:");

        jLabelNroCadete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNroCadete.setText("Cadete Nro:");

        jPanelDatosClienteComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N
        jPanelDatosClienteComprobante.setMaximumSize(new java.awt.Dimension(700, 150));
        jPanelDatosClienteComprobante.setMinimumSize(new java.awt.Dimension(700, 150));
        jPanelDatosClienteComprobante.setPreferredSize(new java.awt.Dimension(700, 150));

        jLabelNombreYApellidoComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNombreYApellidoComprobante.setText("Nombre y Apellido:");

        jLabelDomicilioComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDomicilioComprobante.setText("Domicilio:");

        jLabelNumFacturaComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNumFacturaComprobante.setText("Nro de Factura:");

        jLabelZonaComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelZonaComprobante.setText("Zona:");

        jLabelImporteEnvioComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImporteEnvioComprobante.setText("Importe de Envio:");

        jLabelImporteFacturaComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImporteFacturaComprobante.setText("Importe de Factura:");

        jLabelImporteTotalComprobante.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImporteTotalComprobante.setText("IMPORTE TOTAL:");

        jLabelPeso4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelPeso4.setText("$");

        jLabelValorNumFacturaComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorDomicilioClienteComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValoClienteNombreComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorZonaComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorTotalFacturaComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorTotalEnvioComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorTotalGeneralComprobante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelDatosClienteComprobanteLayout = new javax.swing.GroupLayout(jPanelDatosClienteComprobante);
        jPanelDatosClienteComprobante.setLayout(jPanelDatosClienteComprobanteLayout);
        jPanelDatosClienteComprobanteLayout.setHorizontalGroup(
            jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addComponent(jLabelDomicilioComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorDomicilioClienteComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addComponent(jLabelNombreYApellidoComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValoClienteNombreComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addComponent(jLabelZonaComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorZonaComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addComponent(jLabelNumFacturaComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorNumFacturaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addComponent(jLabelImporteEnvioComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorTotalEnvioComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addComponent(jLabelImporteFacturaComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorTotalFacturaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImporteTotalComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPeso4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorTotalGeneralComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanelDatosClienteComprobanteLayout.setVerticalGroup(
            jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumFacturaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorNumFacturaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelZonaComprobante)
                            .addComponent(jLabelValorZonaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosClienteComprobanteLayout.createSequentialGroup()
                        .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreYApellidoComprobante)
                            .addComponent(jLabelValoClienteNombreComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDomicilioComprobante)
                            .addComponent(jLabelValorDomicilioClienteComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImporteEnvioComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorTotalEnvioComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImporteFacturaComprobante)
                    .addComponent(jLabelValorTotalFacturaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelValorTotalGeneralComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelDatosClienteComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelImporteTotalComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPeso4))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabelValorFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorNroFactura.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorTotalGeneral.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorTotalEnvio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorIdCadete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabelValorNombreCadete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelContenedorFacturaLayout = new javax.swing.GroupLayout(jPanelContenedorFactura);
        jPanelContenedorFactura.setLayout(jPanelContenedorFacturaLayout);
        jPanelContenedorFacturaLayout.setHorizontalGroup(
            jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelTipoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTituloFactura)
                                .addGap(103, 103, 103))
                            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabelFechaFactura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelValorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabelNroFacturaFactura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelValorNroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE))
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorFacturaLayout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(jLabelTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPeso3)
                .addGap(18, 18, 18)
                .addComponent(jLabelValorTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                .addComponent(jLabelResponsableFactura1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelIVA))
                            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCUIT)
                                    .addComponent(jLabelResponsableFactura))
                                .addGap(141, 141, 141)
                                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelefonoLocal)
                                    .addComponent(jLabelDomicilioLocal)))))
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabelImporteEnvioFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabelTituloComprobante))
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabelNroCadete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorIdCadete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNombreApeCadete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorNombreCadete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosClienteComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorFacturaLayout.createSequentialGroup()
                    .addContainerGap(432, Short.MAX_VALUE)
                    .addComponent(jLabelValorTotalEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(222, 222, 222)))
        );
        jPanelContenedorFacturaLayout.setVerticalGroup(
            jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addComponent(jLabelTituloFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaFactura)
                            .addComponent(jLabelValorFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNroFacturaFactura)
                            .addComponent(jLabelValorNroFactura)))
                    .addComponent(jPanelTipoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsableFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIVA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDomicilioLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsableFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefonoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso2)
                    .addComponent(jLabelImporteEnvioFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPeso3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTituloComprobante)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorFacturaLayout.createSequentialGroup()
                                .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNroCadete)
                                        .addComponent(jLabelNombreApeCadete, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelValorNombreCadete, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelDatosClienteComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelValorIdCadete, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelValorTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanelContenedorFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorFacturaLayout.createSequentialGroup()
                    .addContainerGap(651, Short.MAX_VALUE)
                    .addComponent(jLabelValorTotalEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(283, 283, 283)))
        );

        jScrollPaneContenedor.setViewportView(jPanelContenedorFactura);

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonImprimir.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-Imprimir.png"))); // NOI18N
        jButtonImprimir.setText("Imprimir Factura");
        jButtonImprimir.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonImprimir.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonImprimir.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPaneContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        // TODO add your handling code here:
        //try {
            //PrinterJob job = PrinterJob.getPrinterJob();
            //job.setPrintable(this);
            //job.printDialog();
            //job.print();
        //} catch (PrinterException ex) { } 
        
     try {
         Factura.setImporte(importeFactura);
         Factura.setTarifaDeEnvio(z.getPrecio());
         //DATOS PEDIDO YA ASIGNADO
         //DATOS CLIENTE YA ASIGNADO
         Factura.insertar();
         //CARGAR DETALLE
         Pedido p = new Pedido();
         p = Factura.getDatospedido();
         p.modificarEstado(4);
         OF.guardarDetalle(Factura,listaDetalles);
         JOptionPane.showMessageDialog(this, "La Factura se Genero Correctamente", "FastFoodSystem",JOptionPane.INFORMATION_MESSAGE);
         VentanaGenerarFactura VGF = new VentanaGenerarFactura();
         VGF.setVisible(true);
         this.dispose();
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(VentanaEmitirFacturacion.class.getName()).log(Level.SEVERE, null, ex);
     }      catch (SQLException ex) {
                Logger.getLogger(VentanaEmitirFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEmitirFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmitirFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmitirFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmitirFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmitirFacturacion().setVisible(true);
            }
        });
    }
    
    
     public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) return NO_SUCH_PAGE;
        Graphics2D g2d = (Graphics2D)graphics;
        //Punto donde empezará a imprimir dentro la pagina (100, 50)
        //g2d.translate(  pageFormat.getImageableX()+100, 
        //                pageFormat.getImageableY()+50);
        //g2d.scale(0.50,0.50); //Reducción de la impresión al 50%
        g2d.translate(  pageFormat.getImageableX()+10, 
                        pageFormat.getImageableY()+10);
        g2d.scale(0.80,0.80); //Reducción de la impresión al 50%
        jPanelContenedorFactura.printAll(graphics);
        return PAGE_EXISTS;                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JLabel jLabelCUIT;
    private javax.swing.JLabel jLabelDomicilioComprobante;
    private javax.swing.JLabel jLabelDomicilioFactura;
    private javax.swing.JLabel jLabelDomicilioLocal;
    private javax.swing.JLabel jLabelFechaFactura;
    private javax.swing.JLabel jLabelIVA;
    private javax.swing.JLabel jLabelImporteEnvioComprobante;
    private javax.swing.JLabel jLabelImporteEnvioFactura;
    private javax.swing.JLabel jLabelImporteFacturaComprobante;
    private javax.swing.JLabel jLabelImporteTotalComprobante;
    private javax.swing.JLabel jLabelNomApeClienteFactura;
    private javax.swing.JLabel jLabelNombreApeCadete;
    private javax.swing.JLabel jLabelNombreYApellidoComprobante;
    private javax.swing.JLabel jLabelNroCadete;
    private javax.swing.JLabel jLabelNroFacturaFactura;
    private javax.swing.JLabel jLabelNumFacturaComprobante;
    private javax.swing.JLabel jLabelPeso1;
    private javax.swing.JLabel jLabelPeso2;
    private javax.swing.JLabel jLabelPeso3;
    private javax.swing.JLabel jLabelPeso4;
    private javax.swing.JLabel jLabelResponsableFactura;
    private javax.swing.JLabel jLabelResponsableFactura1;
    private javax.swing.JLabel jLabelTelefonoFactura;
    private javax.swing.JLabel jLabelTelefonoLocal;
    private javax.swing.JLabel jLabelTituloComprobante;
    private javax.swing.JLabel jLabelTituloFactura;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalFactura;
    private javax.swing.JLabel jLabelValoClienteNombreComprobante;
    private javax.swing.JLabel jLabelValorDomicilio;
    private javax.swing.JLabel jLabelValorDomicilioClienteComprobante;
    private javax.swing.JLabel jLabelValorFecha;
    private javax.swing.JLabel jLabelValorIdCadete;
    private javax.swing.JLabel jLabelValorImporte;
    private javax.swing.JLabel jLabelValorNombreCadete;
    private javax.swing.JLabel jLabelValorNombreCliente;
    private javax.swing.JLabel jLabelValorNroFactura;
    private javax.swing.JLabel jLabelValorNumFacturaComprobante;
    private javax.swing.JLabel jLabelValorTelefono;
    private javax.swing.JLabel jLabelValorTotalEnvio;
    private javax.swing.JLabel jLabelValorTotalEnvioComprobante;
    private javax.swing.JLabel jLabelValorTotalFacturaComprobante;
    private javax.swing.JLabel jLabelValorTotalGeneral;
    private javax.swing.JLabel jLabelValorTotalGeneralComprobante;
    private javax.swing.JLabel jLabelValorZona;
    private javax.swing.JLabel jLabelValorZonaComprobante;
    private javax.swing.JLabel jLabelZonaComprobante;
    private javax.swing.JLabel jLabelZonaFactura;
    private javax.swing.JPanel jPanelContenedorFactura;
    private javax.swing.JPanel jPanelDatosCliente;
    private javax.swing.JPanel jPanelDatosClienteComprobante;
    private javax.swing.JPanel jPanelDetalle;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelTipoFactura;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneContenedor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDetalle;
    // End of variables declaration//GEN-END:variables
}
