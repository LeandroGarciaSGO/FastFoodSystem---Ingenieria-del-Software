/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//HACER: NO ME VERIFICA EL CADETE CUANDO LO MODIFICO;me AGREGA OTRO DNI IGUAL-CORREGIR
//hacer: FILTRADO EN GESTIONAR CADETES
//HACER : LA VALIDACION DEL COMBOBOX
package Presentacion;

import Datos.Cadete;
import Presentacion.Cadetes;
import Datos.Cliente;
import Datos.Comida;
import Datos.Conexion;
import Datos.Usuario;
import Logica.ABMComida;

import Logica.AMBCadete;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luji
 */
public class GestionarCadete extends javax.swing.JFrame {

    private Statement sentencia;
    private ResultSet rsDatos;
    private DefaultTableModel modelo;
    private TableRowSorter trsFiltro;
    //AGREGO
    private PreparedStatement psPrepSencencias;

    //AGREGO ESTO PARA LA TABLA
    //Connection cn = Conexion.Cadena();
    /**
     * Creates new form GestionarCadete
     */
    public GestionarCadete() {
        try {
            initComponents();
            cargarTablaCadetes();
            setLocationRelativeTo(null);
           // validarCampos();
            jButtonNuevoCadete.setEnabled(false);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2Mensaje = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroDocumento = new javax.swing.JTextField();
        jLabelMensajeError = new javax.swing.JLabel();
        jButtonNuevoCadete = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadetes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastFoodSystem - Gestionar Cadete");
        setMaximumSize(new java.awt.Dimension(600, 440));
        setMinimumSize(new java.awt.Dimension(600, 440));
        setPreferredSize(new java.awt.Dimension(600, 440));
        setResizable(false);

        jLabel2Mensaje.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cadete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N
        jLabel2Mensaje.setMaximumSize(new java.awt.Dimension(370, 77));
        jLabel2Mensaje.setMinimumSize(new java.awt.Dimension(370, 77));
        jLabel2Mensaje.setPreferredSize(new java.awt.Dimension(370, 77));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Documento:");

        jTextFieldNumeroDocumento.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldNumeroDocumento.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldNumeroDocumento.setPreferredSize(new java.awt.Dimension(210, 20));
        jTextFieldNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDocumentoActionPerformed(evt);
            }
        });
        jTextFieldNumeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroDocumentoKeyTyped(evt);
            }
        });

        jLabelMensajeError.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMensajeError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jLabel2MensajeLayout = new javax.swing.GroupLayout(jLabel2Mensaje);
        jLabel2Mensaje.setLayout(jLabel2MensajeLayout);
        jLabel2MensajeLayout.setHorizontalGroup(
            jLabel2MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabel2MensajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jLabelMensajeError))
        );
        jLabel2MensajeLayout.setVerticalGroup(
            jLabel2MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabel2MensajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLabel2MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonNuevoCadete.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonNuevoCadete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/Añadir.png"))); // NOI18N
        jButtonNuevoCadete.setText("Nuevo");
        jButtonNuevoCadete.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonNuevoCadete.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonNuevoCadete.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonNuevoCadete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoCadeteActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/modificar1.png"))); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonModificar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonModificar.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/eliminar.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTableCadetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Documento", "Nombre", "Apellido", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCadetes.setMaximumSize(new java.awt.Dimension(60, 800));
        jTableCadetes.setMinimumSize(new java.awt.Dimension(60, 800));
        jTableCadetes.setPreferredSize(new java.awt.Dimension(60, 800));
        jScrollPane1.setViewportView(jTableCadetes);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cancelar.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setMaximumSize(new java.awt.Dimension(180, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(180, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(180, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2Mensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonNuevoCadete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoCadete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("FastFoodSystem- Gestionar Cadete");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void cargarTablaCadetes() throws ClassNotFoundException {
        String datos[] = new String[5];
        DefaultTableModel dtm = (DefaultTableModel) jTableCadetes.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        try {
            Connection conex = Conexion.Cadena();
            String ConsultaSQL = "SELECT * FROM Cadete WHERE estado = '"+1+"' ";
            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(ConsultaSQL);
            while (rsDatos.next()) {
                datos[0] = rsDatos.getString(1);
                datos[1] = rsDatos.getString(7);
                datos[2] = rsDatos.getString(2);
                datos[3] = rsDatos.getString(3);
                datos[4] = rsDatos.getString(5);
                dtm.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int validarCampos() {
       
          if (jTextFieldNumeroDocumento.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, " ERROR: El Documento no debe Ser Vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                ;
            }else{
          
          }
        return 0;

        }
    
    private void jTextFieldNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDocumentoActionPerformed
        // TODO add your handling code here:
        
        AMBCadete CD = new AMBCadete();
        Cadete CA = new Cadete();
        String cabecera[] = {"Codigo", "Documento", "Nombre", "Apellido", "Telefono"};
        String datos[][] = {};
        DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);

        jTableCadetes.setModel(modelo);
        try {
            validarCampos();
            cargarTablaCadetes();
            CA = CD.buscarCadete(Integer.parseInt(jTextFieldNumeroDocumento.getText()));
            if (CA != null) {
                jButtonNuevoCadete.setEnabled(false);
                int cod = CA.getIdCadete();
                int doc = CA.getNumDocumento();
                String nombre = CA.getNombre();
                String apellido = CA.getApellido();
                long tel = CA.getTelefono();
                Object fila[] = {cod, doc, nombre, apellido, tel};
                modelo.addRow(fila);
                jButtonEliminar.setEnabled(true);
                jButtonModificar.setEnabled(true);

            } else {
               
                jButtonEliminar.setEnabled(false);
                jButtonModificar.setEnabled(false);
                jButtonNuevoCadete.setEnabled(true);
                JOptionPane.showMessageDialog(this, " ERROR: Cadete Inexistente", "Fast Food System", JOptionPane.ERROR_MESSAGE);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VentanaBuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldNumeroDocumentoActionPerformed

    private void jButtonNuevoCadeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoCadeteActionPerformed
        Cadetes C = new Cadetes();

        try {
           
            C.LlenarCampos();
           
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
        }

        C.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoCadeteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel modelo = (DefaultTableModel) jTableCadetes.getModel();
        //int numFilas = modelo.getRowCount();
        int fila = jTableCadetes.getSelectedRow();
        if( fila >= 0){
        //if (numFilas > 0) {
            //int fila = jTableCadetes.getSelectedRow();
           // JOptionPane.showMessageDialog(null, "FILA SELECT: " + fila);
            int docCadete = Integer.parseInt(String.valueOf(modelo.getValueAt(fila, 1)));

            AMBCadete BC = new AMBCadete();
            Cadete C = new Cadete();
            
            try {
                C = BC.buscarCadete(docCadete);
                if (C != null) {
                    Cadetes VC = new Cadetes();
                    VC.setDatosCadete(C);
                    VC.setCondatos_vacio(1); // 1 por que va con datos 
                    VC.LlenarCampos();
                    VC.setVisible(true);
                    this.dispose();
                } else {
                    //jLabelError.setText("Comida Inexistente!");
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, " -. ERROR: No Selecciono Ningun Cadete", "Fast Food System", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonModificarActionPerformed


    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

       DefaultTableModel modelo = (DefaultTableModel) jTableCadetes.getModel();
        int fila = jTableCadetes.getSelectedRow();
        if (fila >= 0) {
            int docCadete = Integer.parseInt(String.valueOf(modelo.getValueAt(fila, 1))); 
       
            Cadete CA = new Cadete();
            try {
                
                CA.eliminardni(docCadete);
                //le agrego esto para que me cargue de nuevo la tabla
                try {
                    cargarTablaCadetes();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "El Cliente se Elimino Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, " -. ERROR:  No Selecciono Ningun Cadete", "Fast Food System", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldNumeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDocumentoKeyTyped
        char c =evt.getKeyChar();
        if(c < '0'|| c> '9') evt.consume();
        
    }//GEN-LAST:event_jTextFieldNumeroDocumentoKeyTyped

    
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
            java.util.logging.Logger.getLogger(GestionarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarCadete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarCadete().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevoCadete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jLabel2Mensaje;
    private javax.swing.JLabel jLabelMensajeError;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableCadetes;
    private javax.swing.JTextField jTextFieldNumeroDocumento;
    // End of variables declaration//GEN-END:variables
}
