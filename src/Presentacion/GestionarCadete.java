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
    //private TableRowSorter trsFiltro;
    //AGREGO
    private PreparedStatement psPrepSencencias;

    private TableRowSorter trsFiltro;
    //AGREGO ESTO PARA LA TABLA
    //Connection cn = Conexion.Cadena();
    /**
     * Creates new form GestionarCadete
     */
    public GestionarCadete() {
           initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        jButtonEliminar.setEnabled(false);
        jButtonModificar.setEnabled(false);
        String cabecera[] = {"Codigo", "Documento", "Nombre", "Apellido", "Telefono", "Domicilio", "tipo"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        jTableCadetes.setModel(modelo);
        cargarTablaCadetes();
       //jButton.setBackground(java.awt.Color.red);
        //jButtonCancelarSelecc.setEnabled(false);
        jTableCadetes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = jTableCadetes.rowAtPoint(e.getPoint());
                int columna = jTableCadetes.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    jButtonEliminar.setEnabled(true);
                    jButtonModificar.setEnabled(true);
                    jButtonNuevoCadete.setEnabled(false);
                    //jButtonCancelarSelecc.setEnabled(true);
                }
            }
        });
//        try {
//            initComponents();
//            cargarTablaCadetes();
//            setLocationRelativeTo(null);
//           // validarCampos();
//           // jButtonNuevoCadete.setEnabled(false);
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
//        }

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
        jButton2 = new javax.swing.JButton();

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroDocumentoKeyReleased(evt);
            }
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Documento", "Nombre", "Apellido", "Telefono", "Domicilio", "tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/actualizar-l.png"))); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.setMaximumSize(new java.awt.Dimension(180, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(180, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(180, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2Mensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevoCadete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("FastFoodSystem- Gestionar Cadete");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    public void cargarTablaCadetes() throws ClassNotFoundException {
//        String datos[] = new String[5];
//        DefaultTableModel dtm = (DefaultTableModel) jTableCadetes.getModel();
//        while (dtm.getRowCount() > 0) {
//            dtm.removeRow(0);
//        }
//        try {
//            Connection conex = Conexion.Cadena();
//            String ConsultaSQL = "SELECT * FROM Cadete WHERE estado = '"+1+"' ";
//            sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            rsDatos = sentencia.executeQuery(ConsultaSQL);
//            while (rsDatos.next()) {
//                datos[0] = rsDatos.getString(1);
//                datos[1] = rsDatos.getString(7);
//                datos[2] = rsDatos.getString(2);
//                datos[3] = rsDatos.getString(3);
//                datos[4] = rsDatos.getString(5);
//                dtm.addRow(datos);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    private int validarCampos() {
       
          if (jTextFieldNumeroDocumento.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, " ERROR: El Documento no debe Ser Vacio, presione actualizar", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
//              try {
//                  //cargarTablaCadetes();
//              } catch (ClassNotFoundException ex) {
//                  Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
//              }
            }else{ 
          return 1;
          }
        return 0;

        }
    
    private void jTextFieldNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDocumentoActionPerformed
        // TODO add your handling code here:
       // if (validarCampoDescripcion()) {
            AMBCadete BC = new AMBCadete();
            Cadete C = new Cadete();
            try {

                C = BC.buscarCadete(Integer.parseInt(jTextFieldNumeroDocumento.getText()));
                if (C == null) {
//                jButtonEliminarComida.setEnabled(true);
//                jButtonModificarComida.setEnabled(true);
//                jButtonNuevaComida.setEnabled(false);
//                jTextFieldDescripcion.setEditable(false);
//                int cod = C.getIdComida();
//                String desc = C.getDescripcion();
//                float precio = C.getPrecio();
//                int tipo = C.getTipo();
//                Object fila[] = {cod, desc, precio, tipo};
//                modelo.addRow(fila);
//            } else {
//                //jLabelError.setText("Comida Inexistente - Para Registrar presione \"Nueva Comida\"");
                    JOptionPane.showMessageDialog(this, "El cadete No Existe\nPara registrarla presione \"Nueva Comida\"", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
//                jButtonNuevaComida.setEnabled(true);
//                jButtonModificarComida.setEnabled(false);
//                jButtonEliminarComida.setEnabled(false);
//                //jTextFieldDescripcion.setEditable(false);
                }
//
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
            }
        //}
//        
//        AMBCadete CD = new AMBCadete();
//        Cadete CA = new Cadete();
//        String cabecera[] = {"Codigo", "Documento", "Nombre", "Apellido", "Telefono"};
//        String datos[][] = {};
//        DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
//
//        jTableCadetes.setModel(modelo);
//        try {
//            if(validarCampos()==1){
//            //cargarTablaCadetes();
//            CA = CD.buscarCadete(Integer.parseInt(jTextFieldNumeroDocumento.getText()));
//            if (CA != null) {
//                jButtonNuevoCadete.setEnabled(false);
//                int cod = CA.getIdCadete();
//                int doc = CA.getNumDocumento();
//                String nombre = CA.getNombre();
//                String apellido = CA.getApellido();
//                long tel = CA.getTelefono();
//                Object fila[] = {cod, doc, nombre, apellido, tel};
//                modelo.addRow(fila);
//                jButtonEliminar.setEnabled(true);
//                jButtonModificar.setEnabled(true);
//                //cargarTablaCadetes();
//
//            } else {
//               
//                jButtonEliminar.setEnabled(false);
//                jButtonModificar.setEnabled(false);
//                jButtonNuevoCadete.setEnabled(true);
//                JOptionPane.showMessageDialog(this, " ERROR: Cadete Inexistente, Presione Nuevo para Agregarlo", "Fast Food System", JOptionPane.ERROR_MESSAGE);
//
//            }}
//
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(VentanaBuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //}
//        
//        AMBCadete CD = new AMBCadete();
//        Cadete CA = new Cadete();
//        String cabecera[] = {"Codigo", "Documento", "Nombre", "Apellido", "Telefono"};
//        String datos[][] = {};
//        DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
//
//        jTableCadetes.setModel(modelo);
//        try {
//            if(validarCampos()==1){
//            //cargarTablaCadetes();
//            CA = CD.buscarCadete(Integer.parseInt(jTextFieldNumeroDocumento.getText()));
//            if (CA != null) {
//                jButtonNuevoCadete.setEnabled(false);
//                int cod = CA.getIdCadete();
//                int doc = CA.getNumDocumento();
//                String nombre = CA.getNombre();
//                String apellido = CA.getApellido();
//                long tel = CA.getTelefono();
//                Object fila[] = {cod, doc, nombre, apellido, tel};
//                modelo.addRow(fila);
//                jButtonEliminar.setEnabled(true);
//                jButtonModificar.setEnabled(true);
//                //cargarTablaCadetes();
//
//            } else {
//               
//                jButtonEliminar.setEnabled(false);
//                jButtonModificar.setEnabled(false);
//                jButtonNuevoCadete.setEnabled(true);
//                JOptionPane.showMessageDialog(this, " ERROR: Cadete Inexistente, Presione Nuevo para Agregarlo", "Fast Food System", JOptionPane.ERROR_MESSAGE);
//
//            }}
//
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(VentanaBuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo = (DefaultTableModel) jTableCadetes.getModel();
            int fila = jTableCadetes.getSelectedRow();
            
            int cod = (int) jTableCadetes.getValueAt(fila, 0);
            //int doc =  (int) jTableCadetes.getValueAt(fila,1));
            
            int doc = Integer.parseInt(String.valueOf(jTableCadetes.getValueAt(fila,1)));
            String nombre = String.valueOf(jTableCadetes.getValueAt(fila, 2));
            String apellido = String.valueOf(jTableCadetes.getValueAt(fila, 3));
            long tel = (long) jTableCadetes.getValueAt(fila, 4);
            String dom = String.valueOf(jTableCadetes.getValueAt(fila, 5));
            String tipo =String.valueOf(jTableCadetes.getValueAt(fila, 6));
            System.out.print(cod + doc + nombre + apellido + tel + dom + tipo );
            
            
            
            Cadete C = new Cadete (cod, doc, nombre, apellido, tel, dom, tipo);
            AMBCadete BC = new AMBCadete();
            
            Cadetes VC = new Cadetes();
            //Cadete CO = new Cadete (cod, doc, nombre, apellido, tel);
            VC.setDatosCadete(C);
            VC.setCondatos_vacio(1);
            VC.LlenarCampos();
            VC.setVisible(true);
            this.dispose();
//            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonModificarActionPerformed


    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

       DefaultTableModel modelo = (DefaultTableModel) jTableCadetes.getModel();
  
       int fila = jTableCadetes.getSelectedRow();
        if (fila >= 0) {
//            int docCadete = Integer.parseInt(String.valueOf(modelo.getValueAt(fila, 1))); 
            int cod = (int) jTableCadetes.getValueAt(fila, 0);
            int doc = Integer.parseInt(String.valueOf(jTableCadetes.getValueAt(fila,1)));
            String nombre = String.valueOf(jTableCadetes.getValueAt(fila, 2));
            String apellido = String.valueOf(jTableCadetes.getValueAt(fila, 3));
            long tel = (long) jTableCadetes.getValueAt(fila, 4);
            String dom = String.valueOf(jTableCadetes.getValueAt(fila, 5));
            String tipo =String.valueOf(jTableCadetes.getValueAt(fila, 6));
            System.out.print(cod + doc + nombre + apellido + tel + dom + tipo );
       
            Cadete CA = new Cadete();
            try {
               int resp = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que Desea Elimiar un cadete?", "FastFoodSystem - ATENCION", JOptionPane.YES_NO_OPTION);
               if (JOptionPane.OK_OPTION == resp) {
                        this.dispose();
                        CA.eliminardni(doc);
                        JOptionPane.showMessageDialog(this, "El Cadete se Elimino Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
            
                     }else{
                   
                    GestionarCadete volverGestionarCadete = new GestionarCadete();
                    volverGestionarCadete.setVisible(true);
               }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(GestionarCadete.class.getName()).log(Level.SEVERE, null, ex);
            }

//            JOptionPane.showMessageDialog(this, "El Cadete se Elimino Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
            //cargarTablaCadetes();
            GestionarCadete volverGestionarCadete = new GestionarCadete();
            volverGestionarCadete.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, " -. ERROR:  No Selecciono Ningun Cadete", "Fast Food System", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldNumeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDocumentoKeyTyped
        char c =evt.getKeyChar();
        if(c < '0'|| c> '9') evt.consume();
        
        //Agrego esto para filtrar. defino arriba el trsFiltro.
         jTextFieldNumeroDocumento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                //String cadena = (jTextFieldDescripcion.getText());
                //jTextFieldDescripcion.setText(cadena);
                //repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + jTextFieldNumeroDocumento.getText(), 1));
            }
        });

        trsFiltro = new TableRowSorter(jTableCadetes.getModel());
        jTableCadetes.setRowSorter(trsFiltro);
        jTableCadetes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = jTableCadetes.rowAtPoint(e.getPoint());
                int columna = jTableCadetes.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    jButtonEliminar.setEnabled(true);
                    jButtonModificar.setEnabled(true);
                    jButtonNuevoCadete.setEnabled(false);
                    //jButtonCancelarSelecc.setEnabled(true);
                }
            }
        });

        
    }//GEN-LAST:event_jTextFieldNumeroDocumentoKeyTyped

private void cargarTablaCadetes() {
        ResultSet Re;
        try {
            Cadete C = new Cadete();
            Re = C.consultarTodoLosCadetes();
            try {
                while (Re.next()) {
                    int cod = Re.getInt("idCadete");
                    String doc = Re.getString("numDocumento");
                    String nom = Re.getString("nombre");
                    String ape = Re.getString("apellido");
                    long tel = Re.getLong("telefono");
                    String dom = Re.getString("domicilio");
                    String tipDoc = Re.getString("tipoDocumento");
                    Object fila[] = {cod, doc, nom, ape, tel , dom , tipDoc};
                    modelo.addRow(fila);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cadetes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadetes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //cargarTablaCadetes();
        GestionarCadete volverGestionarCadete = new GestionarCadete();
        volverGestionarCadete.setVisible(true);
//        jButtonNuevoCadete.setEnabled(true);
//        jButtonEliminar.setEnabled(true);
//        jButtonModificar.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldNumeroDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDocumentoKeyReleased
        
            // TODO add your handling code here:
            //cargarTablaCadetes();
        
        
        
    }//GEN-LAST:event_jTextFieldNumeroDocumentoKeyReleased

    
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
    private javax.swing.JButton jButton2;
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
