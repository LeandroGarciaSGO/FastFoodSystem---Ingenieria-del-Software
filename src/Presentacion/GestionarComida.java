/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Comida;
import Logica.ABMComida;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gonzalez
 */
public class GestionarComida extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;
    private DefaultTableModel modelo;

    /**
     * Creates new form GestionarComida
     */
    public GestionarComida() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        jButtonEliminarComida.setEnabled(false);
        jButtonModificarComida.setEnabled(false);
        String cabecera[] = {"Codigo", "Descripcion", "Precio", "Tipo"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        jTableComida.setModel(modelo);
        cargarTablaComida();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDescComida = new javax.swing.JPanel();
        jLabelDescripcionComida = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jButtonNuevaComida = new javax.swing.JButton();
        jButtonEliminarComida = new javax.swing.JButton();
        jButtonModificarComida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComida = new JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Comida");
        setMaximumSize(new java.awt.Dimension(600, 440));
        setMinimumSize(new java.awt.Dimension(600, 440));
        setPreferredSize(new java.awt.Dimension(600, 440));
        setResizable(false);

        jPanelDescComida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Comida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        jLabelDescripcionComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDescripcionComida.setText("Descripción:");

        jTextFieldDescripcion.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldDescripcion.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldDescripcion.setPreferredSize(new java.awt.Dimension(210, 20));
        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });
        jTextFieldDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDescComidaLayout = new javax.swing.GroupLayout(jPanelDescComida);
        jPanelDescComida.setLayout(jPanelDescComidaLayout);
        jPanelDescComidaLayout.setHorizontalGroup(
            jPanelDescComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescComidaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelDescripcionComida)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanelDescComidaLayout.setVerticalGroup(
            jPanelDescComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescComidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelDescComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcionComida)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonNuevaComida.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonNuevaComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-nueva-comida.png"))); // NOI18N
        jButtonNuevaComida.setText("Nueva Comida");
        jButtonNuevaComida.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonNuevaComida.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonNuevaComida.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonNuevaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaComidaActionPerformed(evt);
            }
        });

        jButtonEliminarComida.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonEliminarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-eliminar-comida.png"))); // NOI18N
        jButtonEliminarComida.setText("Eliminar Comida");
        jButtonEliminarComida.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonEliminarComida.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonEliminarComida.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonEliminarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarComidaActionPerformed(evt);
            }
        });

        jButtonModificarComida.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonModificarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-modificar-comida.png"))); // NOI18N
        jButtonModificarComida.setText("Modificar Comida");
        jButtonModificarComida.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonModificarComida.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonModificarComida.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonModificarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarComidaActionPerformed(evt);
            }
        });

        jTableComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTableComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableComida);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevaComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDescComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDescComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevaComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaComidaActionPerformed
        Comidas C = new Comidas();
        C.setDescripcion(jTextFieldDescripcion.getText());
        C.setCondatos_vacio(0);
        try {
            C.LlenarCampos(1);
        } catch (SQLException ex) {
            Logger.getLogger(GestionarComida.class.getName()).log(Level.SEVERE, null, ex);
        }
        C.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNuevaComidaActionPerformed

    private void jButtonEliminarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarComidaActionPerformed
        //DefaultTableModel modelo = (DefaultTableModel) jTableComida.getModel();
//        int cod = (int) modelo.getValueAt(jTableComida.getSelectedRow(), 0);
//        String desc = String.valueOf(modelo.getValueAt(jTableComida.getSelectedRow(), 1));
//        float precio = (float) modelo.getValueAt(jTableComida.getSelectedRow(), 2);
//        int tipo = Integer.parseInt((String)modelo.getValueAt(jTableComida.getSelectedRow(), 3));
        int fila = jTableComida.getSelectedRow();

        int cod = (int) jTableComida.getValueAt(fila, 0);
        String desc = String.valueOf(jTableComida.getValueAt(fila, 1));
        float precio = (float) jTableComida.getValueAt(fila, 2);
        int tipo = Integer.parseInt((String) jTableComida.getValueAt(fila, 3));
        System.out.print(cod + desc + precio + tipo);
//        int tipo = (int) modelo.getValueAt(jTableComida.getSelectedRow(), 3);
        //ABMComida BC = new ABMComida();
        Comidas VC = new Comidas();
        Comida C = new Comida(cod, desc, precio, tipo);
        VC.setDatosComida(C);
        VC.setCondatos_vacio(1);
        try {
            VC.LlenarCampos(2);
        } catch (SQLException ex) {
            Logger.getLogger(GestionarComida.class.getName()).log(Level.SEVERE, null, ex);
        }
        VC.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonEliminarComidaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed
        if (validarCampoDescripcion()) {
            ABMComida BC = new ABMComida();
            Comida C = new Comida();
            try {

                C = BC.buscarComida(String.valueOf(jTextFieldDescripcion.getText()));
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
                    JOptionPane.showMessageDialog(this, "La comida no existe!\nPara registrarla presione\"Nueva Comida\"", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
//                jButtonNuevaComida.setEnabled(true);
//                jButtonModificarComida.setEnabled(false);
//                jButtonEliminarComida.setEnabled(false);
//                //jTextFieldDescripcion.setEditable(false);
                }
//
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionarComida.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionarComida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jButtonModificarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarComidaActionPerformed
        //DefaultTableModel modelo = (DefaultTableModel) jTableComida.getModel();
        //int cod = (int) modelo.getValueAt(jTableComida.getSelectedRow(), 0);
        //String desc = String.valueOf(modelo.getValueAt(jTableComida.getSelectedRow(), 1));
        //float precio = (float) modelo.getValueAt(jTableComida.getSelectedRow(), 2);
        //int tipo = Integer.parseInt((String)modelo.getValueAt(jTableComida.getSelectedRow(), 3));
        int fila = jTableComida.getSelectedRow();

        int cod = (int) jTableComida.getValueAt(fila, 0);
        String desc = String.valueOf(jTableComida.getValueAt(fila, 1));
        float precio = (float) jTableComida.getValueAt(fila, 2);
        int tipo = Integer.parseInt((String) jTableComida.getValueAt(fila, 3));
        System.out.print(cod + desc + precio + tipo);

        //ABMComida BC = new ABMComida();
        Comidas VC = new Comidas();
        Comida C = new Comida(cod, desc, precio, tipo);
        VC.setDatosComida(C);
        VC.setCondatos_vacio(1);
        try {
            VC.LlenarCampos(3);
        } catch (SQLException ex) {
            Logger.getLogger(GestionarComida.class.getName()).log(Level.SEVERE, null, ex);
        }
        VC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonModificarComidaActionPerformed

    private void jTextFieldDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionKeyTyped
        jTextFieldDescripcion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                //String cadena = (jTextFieldDescripcion.getText());
                //jTextFieldDescripcion.setText(cadena);
                //repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + jTextFieldDescripcion.getText(), 1));
            }
        });

        trsFiltro = new TableRowSorter(jTableComida.getModel());
        jTableComida.setRowSorter(trsFiltro);
        jTableComida.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = jTableComida.rowAtPoint(e.getPoint());
                int columna = jTableComida.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    jButtonEliminarComida.setEnabled(true);
                    jButtonModificarComida.setEnabled(true);
                    jButtonNuevaComida.setEnabled(false);
                }
            }
        });

    }//GEN-LAST:event_jTextFieldDescripcionKeyTyped

    private void jTextFieldDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionKeyReleased

    private void cargarTablaComida() {
        ResultSet Re;
        try {
            Comida C = new Comida();
            Re = C.consultarTodasLasComidas();
            try {
                while (Re.next()) {
                    int cod = Re.getInt("idComida");
                    String desc = Re.getString("descripcion");
                    float precio = Re.getFloat("precio");
                    String tipo = Re.getString("tipo");
                    Object fila[] = {cod, desc, precio, tipo};
                    modelo.addRow(fila);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validarCampoDescripcion() {
        if (jTextFieldDescripcion.getText().matches("[^A-Za-z]+")) {
            JOptionPane.showMessageDialog(this, "ERROR: La descripcion debe contener solo letras", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

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
            java.util.logging.Logger.getLogger(GestionarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarComida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminarComida;
    private javax.swing.JButton jButtonModificarComida;
    private javax.swing.JButton jButtonNuevaComida;
    private javax.swing.JLabel jLabelDescripcionComida;
    private javax.swing.JPanel jPanelDescComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableComida;
    private javax.swing.JTextField jTextFieldDescripcion;
    // End of variables declaration//GEN-END:variables
}
