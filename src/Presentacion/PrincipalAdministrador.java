/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.awt.Color;

/**
 *
 * @author Leandro
 */
public class PrincipalAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalEncargado
     */
    public PrincipalAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNuevoUsuario = new javax.swing.JButton();
        jButtonInformes = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemGestionUsuario = new javax.swing.JMenuItem();
        jMenuComidas = new javax.swing.JMenu();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemInformacion = new javax.swing.JMenuItem();
        jMenuItemManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FastFoodSystem - Administrador");
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(740, 520));
        setMinimumSize(new java.awt.Dimension(740, 520));
        setPreferredSize(new java.awt.Dimension(740, 520));
        setResizable(false);

        jButtonNuevoUsuario.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-usuario.png"))); // NOI18N
        jButtonNuevoUsuario.setText("Nuevo Usuario");
        jButtonNuevoUsuario.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoUsuario.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoUsuario.setPreferredSize(new java.awt.Dimension(210, 80));

        jButtonInformes.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-informes.png"))); // NOI18N
        jButtonInformes.setText("Informes");
        jButtonInformes.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonInformes.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonInformes.setPreferredSize(new java.awt.Dimension(210, 80));

        jButtonSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-salir-programa.png"))); // NOI18N
        jButtonSalir.setText("Salir del Programa");
        jButtonSalir.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonSalir.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonSalir.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.png"))); // NOI18N

        jMenuUsuarios.setText("Usuarios");

        jMenuItemGestionUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGestionUsuario.setText("Gestion Usuarios");
        jMenuUsuarios.add(jMenuItemGestionUsuario);

        jMenuBar1.add(jMenuUsuarios);

        jMenuComidas.setText("Informes");
        jMenuBar1.add(jMenuComidas);

        jMenuAyuda.setText("Ayuda");

        jMenuItemInformacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInformacion.setText("Informacion");
        jMenuItemInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInformacionActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemInformacion);

        jMenuItemManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemManual.setText("Manual de Usuario");
        jMenuAyuda.add(jMenuItemManual);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(260, 260, 260)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInformacionActionPerformed
        // TODO add your handling code here:
        VentanaInformacion f = new VentanaInformacion();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItemInformacionActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInformes;
    private javax.swing.JButton jButtonNuevoUsuario;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuComidas;
    private javax.swing.JMenuItem jMenuItemGestionUsuario;
    private javax.swing.JMenuItem jMenuItemInformacion;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenu jMenuUsuarios;
    // End of variables declaration//GEN-END:variables
}
