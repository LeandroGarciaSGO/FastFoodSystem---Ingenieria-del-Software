/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Usuario;
import Datos.Zona;
import Logica.ABMUsuario;
import Logica.OperacionesAdicionales;
import Logica.OperacionesTransacciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalez
 */
public class VentanaZonas extends javax.swing.JFrame {

    private Usuario datosUsuario;
    private int condatos_vacio;
    private String nombreUsu;
    ResultSet R;
    Usuario usuarioSistema;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Creates new form Usuarios
     */
    public VentanaZonas() {
        initComponents();
        setLocationRelativeTo(null);
//        cargarTipoDocu();
//        cargarTipoUsuario();
        usuarioSistema = new Usuario();
    }

    public Usuario getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(Usuario usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    public Usuario getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(Usuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public int getCondatos_vacio() {
        return condatos_vacio;
    }

    public void setCondatos_vacio(int condatos_vacio) {
        this.condatos_vacio = condatos_vacio;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombUsu) {
        this.nombreUsu = nombUsu;
    }

    void LlenarCampos(int boton,int id, String des,float pre) throws SQLException, ClassNotFoundException {

        switch (boton) {
            //nuevo usuario
            case 1:
                jButtonEliminar.setEnabled(false);
                jButtonGuardar.setEnabled(true);
                break;
            //eliminar usuario
            case 2:
                jButtonEliminar.setEnabled(true);
                jButtonGuardar.setEnabled(false);
                jTextFieldDes.setEditable(false);
                jTextFieldPre.setEditable(false);
                
                break;
            //modificar usuario
            case 3:
                jButtonEliminar.setEnabled(false);
                jButtonGuardar.setEnabled(true);
                break;
        }

        if (condatos_vacio == 1) {
            jLabelIdZona.setText(String.valueOf(id));
            jTextFieldDes.setText(des);
            jTextFieldPre.setText(String.valueOf(pre));
            //jPasswordContra.setText(datosUsuario.getContraseña());
           
        } else {
            Zona Z = new Zona();
            jLabelIdZona.setText(String.valueOf(Z.obtenerSiguienteId()));
            //jTextFieldDes.setText(getNombreUsu());
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
        jLabelIdUsuario = new javax.swing.JLabel();
        jLabelNombUsu = new javax.swing.JLabel();
        jLabelNombApe = new javax.swing.JLabel();
        jLabelIdZona = new javax.swing.JLabel();
        jTextFieldDes = new javax.swing.JTextField();
        jTextFieldPre = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastFoodSystem - Zona");

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Zona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        jLabelIdUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelIdUsuario.setText("Id Zona:");

        jLabelNombUsu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNombUsu.setText("Descripcion:");

        jLabelNombApe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNombApe.setText("Precio:");

        jLabelIdZona.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelIdZona.setText("9999999999");

        jTextFieldDes.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldDes.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldDes.setPreferredSize(new java.awt.Dimension(210, 20));

        jTextFieldPre.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldPre.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldPre.setPreferredSize(new java.awt.Dimension(210, 20));

        jLabelError.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelError)
                .addGap(107, 107, 107))
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombUsu)
                    .addComponent(jLabelIdUsuario)
                    .addComponent(jLabelNombApe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelIdZona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdUsuario)
                    .addComponent(jLabelIdZona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombUsu)
                    .addComponent(jTextFieldDes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombApe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelError)
                .addContainerGap())
        );

        jButtonEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-delete.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-ubicacion.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        VentanaGestionarZonas volverGestionar = null;
        try {
            volverGestionar = new VentanaGestionarZonas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
        }
        volverGestionar.setUsuarioSistema(usuarioSistema);
        volverGestionar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        OperacionesTransacciones OT = new OperacionesTransacciones();
        int accion = 24;
        int entidad = 7;
        Zona U = new Zona();
        try {
            U.eliminar(Integer.parseInt(jLabelIdZona.getText()));
            OT.registrarTransaccion(accion, entidad, Integer.parseInt(jLabelIdZona.getText()), usuarioSistema);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "La Zona Se Elimino Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
        VentanaGestionarZonas VGZ = null;
        try {
            VGZ = new VentanaGestionarZonas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
        }
        VGZ.setUsuarioSistema(usuarioSistema);
        VGZ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        OperacionesTransacciones OT = new OperacionesTransacciones();
        int accion;
        int entidad = 7;
        if (validarDescripcion() && validarPrecio()) {
            Zona U = new Zona();
            U.setIdZona(Integer.parseInt(jLabelIdZona.getText()));
            U.setDescripcion(jTextFieldDes.getText());
            U.setPrecio(Float.parseFloat(jTextFieldPre.getText()));
            
            //System.out.print(jComboBoxTipoDocu.getSelectedItem());
            
            OperacionesAdicionales OpeA = new OperacionesAdicionales();
            if (condatos_vacio == 1) {
                try {
                    if (OpeA.modificarZona(U)) {
                        accion = 23;
                        OT.registrarTransaccion(accion, entidad, Integer.parseInt(jLabelIdZona.getText()), usuarioSistema);
                        JOptionPane.showMessageDialog(this, "La Zona Se Modifico Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
                        VentanaGestionarZonas volverGestionar = new VentanaGestionarZonas();
                        volverGestionar.setUsuarioSistema(usuarioSistema);
                        volverGestionar.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "ERROR: La Zona Ya Existe", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);

                } catch (SQLException ex) {
                    Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    if (OpeA.nuevaZona(U)) {
                        JOptionPane.showMessageDialog(this, "ERROR: El Nombre De Zona Ya Existe", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "La Zona Se Cargo Correctamente", "FastFoodSystem", JOptionPane.INFORMATION_MESSAGE);
                        accion = 22;
                        OT.registrarTransaccion(accion, entidad, Integer.parseInt(jLabelIdZona.getText()), usuarioSistema);
                        VentanaGestionarZonas volverGestionar = new VentanaGestionarZonas();
                        volverGestionar.setUsuarioSistema(usuarioSistema);
                        volverGestionar.setVisible(true);
                        this.dispose();
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaZonas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    private boolean validarDescripcion() {
        if (jTextFieldDes.getText().length() > 0) {
            return true;
        }
        else{
            JOptionPane.showMessageDialog(this, "ERROR: La Descripcion No Debe Ser Vacia", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private boolean validarPrecio() {
        try{
        Float.parseFloat(jTextFieldPre.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ERROR: El Precio Debe Ser Numerico", "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
                

return true;
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
            java.util.logging.Logger.getLogger(VentanaZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaZonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaZonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelIdUsuario;
    private javax.swing.JLabel jLabelIdZona;
    private javax.swing.JLabel jLabelNombApe;
    private javax.swing.JLabel jLabelNombUsu;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JTextField jTextFieldDes;
    private javax.swing.JTextField jTextFieldPre;
    // End of variables declaration//GEN-END:variables
}
