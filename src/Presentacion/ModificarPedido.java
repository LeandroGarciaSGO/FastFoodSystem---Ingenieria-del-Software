/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Mariano
 */
import Datos.Cliente;
import Datos.Pedido;
import Logica.OperacionesCliente;
import Logica.ABMPedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModificarPedido extends javax.swing.JFrame {

    /**
     * Creates new form ModificarPedido
     */
    private java.sql.Statement sentencia, sentencia2;
    private ResultSet rsDatos, rsDatos2;
    
    public ModificarPedido() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscarPedido = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelMensajeAyuda = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrarPedidos = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastFoodSystem - Modificar Pedido");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        jPanelBuscarPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setMaximumSize(new java.awt.Dimension(150, 20));
        jTextFieldCodigo.setPreferredSize(new java.awt.Dimension(150, 20));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelTelefono.setText("Teléfono:");

        jTextFieldTelefono.setPreferredSize(new java.awt.Dimension(150, 20));
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabelMensajeAyuda.setText("(*) Para buscar el pedido ingrese el código del pedido o el teléfono del cliente");

        javax.swing.GroupLayout jPanelBuscarPedidoLayout = new javax.swing.GroupLayout(jPanelBuscarPedido);
        jPanelBuscarPedido.setLayout(jPanelBuscarPedidoLayout);
        jPanelBuscarPedidoLayout.setHorizontalGroup(
            jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelTelefono))
                        .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabelMensajeAyuda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBuscarPedidoLayout.setVerticalGroup(
            jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelMensajeAyuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTableMostrarPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Teléfono del Cliente", "Nombre Cliente", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMostrarPedidos.setMaximumSize(new java.awt.Dimension(480, 150));
        jTableMostrarPedidos.setMinimumSize(new java.awt.Dimension(480, 150));
        jTableMostrarPedidos.setPreferredSize(new java.awt.Dimension(480, 150));
        jScrollPane1.setViewportView(jTableMostrarPedidos);
        if (jTableMostrarPedidos.getColumnModel().getColumnCount() > 0) {
            jTableMostrarPedidos.getColumnModel().getColumn(0).setResizable(false);
            jTableMostrarPedidos.getColumnModel().getColumn(1).setResizable(false);
            jTableMostrarPedidos.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTableMostrarPedidos.getColumnModel().getColumn(2).setResizable(false);
            jTableMostrarPedidos.getColumnModel().getColumn(3).setResizable(false);
            jTableMostrarPedidos.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelBuscarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonSalir)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButtonModificar)
                        .addGap(85, 85, 85)
                        .addComponent(jButtonEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed

        OperacionesCliente ABMC = new OperacionesCliente();
        Cliente C = new Cliente();
        ABMPedido ABMP = new ABMPedido();
        Pedido P = new Pedido();
        String[] datos = new String[5];
        DefaultTableModel dtm = (DefaultTableModel)jTableMostrarPedidos.getModel();
        try {
            P = ABMP.buscarPedido(Integer.parseInt(jTextFieldCodigo.getText()));
            datos[0] = String.valueOf(P.getIdPedido());
            datos[3] = String.valueOf(P.getFecha());
            datos[4] = String.valueOf(P.getHora());
            
            C = ABMC.buscarCliente(Long.parseLong(jTextFieldTelefono.getText()));
            datos[1] = String.valueOf(C.getTelefono());
            datos[2] = C.getNombre();
            dtm.addRow(datos);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatosPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTableMostrarPedidos.getModel();
        try {
            DatosPedido DP = new DatosPedido();
            int fila = jTableMostrarPedidos.getSelectedRow();
            int cod = 0;
            long telefono = 0;
            if (fila >= 0) {
                int filasselec[]  = jTableMostrarPedidos.getSelectedRows();
                for (int i=0; i<filasselec.length;i++){
                    cod = Integer.parseInt(String.valueOf(modelo.getValueAt(filasselec[i], 0)));
                    telefono = Long.parseLong(String.valueOf(modelo.getValueAt(filasselec[i], 1)));
                    DP.mostrarTablaModificar(cod, telefono);
                }
                DP.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "No Selecciono Ninguna Fila", "Fast Food System", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        Pedido P = new Pedido();
        DefaultTableModel modelo = (DefaultTableModel) jTableMostrarPedidos.getModel();
        int fila = jTableMostrarPedidos.getSelectedRow();
        try {
            P.eliminarPedido(Integer.parseInt(jTextFieldCodigo.getText()));
            if (fila >= 0) {
            int filasselec[]  = jTableMostrarPedidos.getSelectedRows();
            for (int i=0; i<filasselec.length;i++){
                modelo.removeRow(filasselec[i]-i);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Selecciono Ninguna Fila", "Fast Food System", JOptionPane.ERROR_MESSAGE);
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "El pedido se elimino correctamente", "Fast Food System", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new ModificarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelMensajeAyuda;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelBuscarPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMostrarPedidos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}