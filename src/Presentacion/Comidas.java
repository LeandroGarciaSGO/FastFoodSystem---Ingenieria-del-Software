/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Comida;
import Logica.ABMComida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalez
 */
public class Comidas extends javax.swing.JFrame {

    /**
     * Creates new form Comidas
     */
    private Comida datosComida;
    private int condatos_vacio;
    private String descripcion;
    ResultSet R;

    public Comidas() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTipoComida();
    }

    public Comida getDatosComida() {
        return datosComida;
    }

    public void setDatosComida(Comida datosComida) {
        this.datosComida = datosComida;
    }

    public int getCondatos_vacio() {
        return condatos_vacio;
    }

    public void setCondatos_vacio(int condatos_vacio) {
        this.condatos_vacio = condatos_vacio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String desc) {
        this.descripcion = desc;
    }

    void LlenarCampos(int boton) throws SQLException {

        switch (boton) {
            //nueva comida
            case 1:
                jButtonEliminar.setEnabled(false);
                jButtonGuardar.setEnabled(true);
                break;
            //eliminar comida
            case 2:
                jButtonEliminar.setEnabled(true);
                jButtonGuardar.setEnabled(false);
                break;
            //modificar comida
            case 3:
                jButtonEliminar.setEnabled(false);
                jButtonGuardar.setEnabled(true);
                break;
        }

        if (condatos_vacio == 1) {
            jLabelCodigoComida.setText(String.valueOf(datosComida.getIdComida()));
            jTextFieldDescripComida.setText(datosComida.getDescripcion());
            jTextFieldPrecioComida.setText(String.valueOf(datosComida.getPrecio()));
            //jComboBoxTipoComida.setSelectedItem(String.valueOf(datosComida.getTipo()));
            //jComboBoxTipoComida.setSelectedIndex(datosComida.getTipo() - 1);
            jComboBoxTipoComida.setSelectedIndex(datosComida.getTipo());
        } else {
            Comida C = new Comida();
            try {
                jLabelCodigoComida.setText(String.valueOf(C.obtenerSiguienteId()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextFieldDescripComida.setText(getDescripcion());
            //jTextFieldDescripComida.setEditable(false);

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

        jPanelDatos = new javax.swing.JPanel();
        jLabelCodComida = new javax.swing.JLabel();
        jLabelDescComida = new javax.swing.JLabel();
        jLabelPrecioComida = new javax.swing.JLabel();
        jLabelTipoComida = new javax.swing.JLabel();
        jLabelCodigoComida = new javax.swing.JLabel();
        jTextFieldDescripComida = new javax.swing.JTextField();
        jTextFieldPrecioComida = new javax.swing.JTextField();
        jComboBoxTipoComida = new javax.swing.JComboBox();
        jLabelError = new javax.swing.JLabel();
        jPanelImagen = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comidas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(640, 380));
        setMinimumSize(new java.awt.Dimension(640, 380));

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Comida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        jLabelCodComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCodComida.setText("Código:");

        jLabelDescComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDescComida.setText("Descripción:");

        jLabelPrecioComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPrecioComida.setText("Precio:");

        jLabelTipoComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelTipoComida.setText("Tipo:");

        jLabelCodigoComida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCodigoComida.setText("9999999999");

        jTextFieldDescripComida.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldDescripComida.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldDescripComida.setPreferredSize(new java.awt.Dimension(210, 20));

        jTextFieldPrecioComida.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldPrecioComida.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldPrecioComida.setPreferredSize(new java.awt.Dimension(210, 20));

        jComboBoxTipoComida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un tipo..." }));
        jComboBoxTipoComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoComidaActionPerformed(evt);
            }
        });

        jLabelError.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescComida)
                    .addComponent(jLabelCodComida)
                    .addComponent(jLabelPrecioComida)
                    .addComponent(jLabelTipoComida))
                .addGap(46, 46, 46)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCodigoComida)
                    .addComponent(jTextFieldDescripComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPrecioComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTipoComida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelError)
                .addGap(107, 107, 107))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodComida)
                    .addComponent(jLabelCodigoComida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescComida)
                    .addComponent(jTextFieldDescripComida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioComida)
                    .addComponent(jTextFieldPrecioComida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoComida)
                    .addComponent(jComboBoxTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabelError)
                .addContainerGap())
        );

        jComboBoxTipoComida.getAccessibleContext().setAccessibleDescription("");

        jPanelImagen.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

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

        jButtonGuardar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonGuardar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-eliminar-comida.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if ((validarCampoDescripcion() && validarCampoPrecio()) && validarTipo()) {
            Comida C = new Comida();
            ABMComida ABMC = new ABMComida();
            C.setIdComida(Integer.parseInt(jLabelCodigoComida.getText()));
            C.setDescripcion(jTextFieldDescripComida.getText());
            C.setPrecio(Float.parseFloat(jTextFieldPrecioComida.getText()));
            //C.setTipo(Integer.parseInt(String.valueOf(jComboBoxTipoComida.getSelectedIndex() + 1)));
            C.setTipo(Integer.parseInt(String.valueOf(jComboBoxTipoComida.getSelectedIndex())));
            C.setEstado(true);

            if (condatos_vacio != 1) {
                try {
                    if (ABMC.modificarComida(C) == 1) {
                        JOptionPane.showMessageDialog(this, "ERROR: La comida ya existe", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "La comida se cargo correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);

                } catch (SQLException ex) {
                    Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    if (ABMC.modificarComida(C) == 0) {
                        JOptionPane.showMessageDialog(this, "ERROR: La descripcion pertenece a otra comida", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "La comida se Modifico Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Comida C = new Comida();
        try {
            C.eliminar(Integer.parseInt(jLabelCodigoComida.getText()));

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comidas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "La comida se Elimino Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void cargarTipoComida() {
        try {
            Comida C = new Comida();
            R = C.consultaTipoComida();
            //jComboBoxTipoComida.removeAllItems();
            try {
                while (R.next()) {
                    jComboBoxTipoComida.addItem(R.getObject("descripcion"));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comidas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validarTipo() {
        if (jComboBoxTipoComida.getSelectedIndex() != 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Debe seleccionar un tipo de comida", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean validarCampoDescripcion() {
        if (jTextFieldDescripComida.getText().length() > 0) {
            if (jTextFieldDescripComida.getText().matches("[a-zA-Z\\s]+")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: La descripcion debe contener solo letras", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: El campo \"descripcion\" no debe estar vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean validarCampoPrecio() {
        if (jTextFieldPrecioComida.getText().length() > 0) {
            try {
                Float.parseFloat(jTextFieldPrecioComida.getText());
                return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ERROR: El precio debe ser numerico", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(this, "ERROR: El campo \"Precio\" no debe estar vacio", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void jComboBoxTipoComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoComidaActionPerformed

    }//GEN-LAST:event_jComboBoxTipoComidaActionPerformed

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
            java.util.logging.Logger.getLogger(Comidas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comidas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comidas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comidas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxTipoComida;
    private javax.swing.JLabel jLabelCodComida;
    private javax.swing.JLabel jLabelCodigoComida;
    private javax.swing.JLabel jLabelDescComida;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelPrecioComida;
    private javax.swing.JLabel jLabelTipoComida;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JTextField jTextFieldDescripComida;
    private javax.swing.JTextField jTextFieldPrecioComida;
    // End of variables declaration//GEN-END:variables
}
