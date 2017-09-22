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
public class PrincipalEncargado extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalEncargado
     */
    public PrincipalEncargado() {
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

        jButtonNuevoPedido = new javax.swing.JButton();
        jButtonCancelarPedido = new javax.swing.JButton();
        jButtonModificarPedido = new javax.swing.JButton();
        jButtonNuevoCliente = new javax.swing.JButton();
        jButtonGenerarFactura = new javax.swing.JButton();
        jButtonModificarCliente = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelUsuarioNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemNuevoCliente = new javax.swing.JMenuItem();
        jMenuItemModificarCliente = new javax.swing.JMenuItem();
        jMenuItemBorrarCliente = new javax.swing.JMenuItem();
        jMenuComidas = new javax.swing.JMenu();
        jMenuItemNuevaComida = new javax.swing.JMenuItem();
        jMenuItemModificarComida = new javax.swing.JMenuItem();
        jMenuItemBorrarComida = new javax.swing.JMenuItem();
        jMenuPedidos = new javax.swing.JMenu();
        jMenuItemNuevoPedido = new javax.swing.JMenuItem();
        jMenuItemModificarPedido = new javax.swing.JMenuItem();
        jMenuItemCancelarPedido = new javax.swing.JMenuItem();
        jMenuCadetes = new javax.swing.JMenu();
        jMenuItemNuevoCadete = new javax.swing.JMenuItem();
        jMenuItemModificarCadete = new javax.swing.JMenuItem();
        jMenuItemBorrarCadete = new javax.swing.JMenuItem();
        jMenuFacturacion = new javax.swing.JMenu();
        jMenuItemGenerarFactura = new javax.swing.JMenuItem();
        jMenuItemAnularFactura = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemInformacion = new javax.swing.JMenuItem();
        jMenuItemManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FastFoodSystem - Principal");
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(740, 520));
        setMinimumSize(new java.awt.Dimension(740, 520));
        setResizable(false);

        jButtonNuevoPedido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonNuevoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-pedido.png"))); // NOI18N
        jButtonNuevoPedido.setText("Nuevo Pedido");
        jButtonNuevoPedido.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoPedido.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoPedido.setPreferredSize(new java.awt.Dimension(210, 80));

        jButtonCancelarPedido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cancelar-pedido.png"))); // NOI18N
        jButtonCancelarPedido.setText("Cancelar Pedido");
        jButtonCancelarPedido.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonCancelarPedido.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonCancelarPedido.setPreferredSize(new java.awt.Dimension(210, 80));

        jButtonModificarPedido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonModificarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-modificar-pedido.png"))); // NOI18N
        jButtonModificarPedido.setText("Modificar Pedido");
        jButtonModificarPedido.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonModificarPedido.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonModificarPedido.setPreferredSize(new java.awt.Dimension(210, 80));

        jButtonNuevoCliente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cliente.png"))); // NOI18N
        jButtonNuevoCliente.setText("Nuevo Cliente");
        jButtonNuevoCliente.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoCliente.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoCliente.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoClienteActionPerformed(evt);
            }
        });

        jButtonGenerarFactura.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonGenerarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-factura.png"))); // NOI18N
        jButtonGenerarFactura.setText("Generar Factura");
        jButtonGenerarFactura.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonGenerarFactura.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonGenerarFactura.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarFacturaActionPerformed(evt);
            }
        });

        jButtonModificarCliente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-modificar-cliente.png"))); // NOI18N
        jButtonModificarCliente.setText("Modificar Cliente");
        jButtonModificarCliente.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonModificarCliente.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonModificarCliente.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarClienteActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cerrar-seccion.png"))); // NOI18N
        jButtonSalir.setText("Salir del Programa");
        jButtonSalir.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonSalir.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonSalir.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.jpg"))); // NOI18N

        jLabelUsuario.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelUsuario.setText("Usuario:");

        jLabelUsuarioNombre.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelUsuarioNombre.setText("...");
        jLabelUsuarioNombre.setToolTipText("");

        jMenuClientes.setText("Clientes");

        jMenuItemNuevoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevoCliente.setText("Nuevo Cliente");
        jMenuItemNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemNuevoCliente);

        jMenuItemModificarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemModificarCliente.setText("Modificar Cliente");
        jMenuItemModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemModificarCliente);

        jMenuItemBorrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBorrarCliente.setText("Borrar Cliente");
        jMenuItemBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemBorrarCliente);

        jMenuBar1.add(jMenuClientes);

        jMenuComidas.setText("Comidas");

        jMenuItemNuevaComida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevaComida.setText("Nueva Comida");
        jMenuItemNuevaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaComidaActionPerformed(evt);
            }
        });
        jMenuComidas.add(jMenuItemNuevaComida);

        jMenuItemModificarComida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemModificarComida.setText("Modificar Comida");
        jMenuItemModificarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarComidaActionPerformed(evt);
            }
        });
        jMenuComidas.add(jMenuItemModificarComida);

        jMenuItemBorrarComida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBorrarComida.setText("Borrar Comida");
        jMenuItemBorrarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarComidaActionPerformed(evt);
            }
        });
        jMenuComidas.add(jMenuItemBorrarComida);

        jMenuBar1.add(jMenuComidas);

        jMenuPedidos.setText("Pedidos");

        jMenuItemNuevoPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevoPedido.setText("Nuevo Pedido");
        jMenuPedidos.add(jMenuItemNuevoPedido);

        jMenuItemModificarPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemModificarPedido.setText("Modificar Pedido");
        jMenuPedidos.add(jMenuItemModificarPedido);

        jMenuItemCancelarPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCancelarPedido.setText("Cancelar Pedido");
        jMenuPedidos.add(jMenuItemCancelarPedido);

        jMenuBar1.add(jMenuPedidos);

        jMenuCadetes.setText("Cadetes");

        jMenuItemNuevoCadete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevoCadete.setText("Nuevo Cadete");
        jMenuItemNuevoCadete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoCadeteActionPerformed(evt);
            }
        });
        jMenuCadetes.add(jMenuItemNuevoCadete);

        jMenuItemModificarCadete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemModificarCadete.setText("Modificar Cadete");
        jMenuCadetes.add(jMenuItemModificarCadete);

        jMenuItemBorrarCadete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBorrarCadete.setText("Borrar Cadete");
        jMenuCadetes.add(jMenuItemBorrarCadete);

        jMenuBar1.add(jMenuCadetes);

        jMenuFacturacion.setText("Facturacion");

        jMenuItemGenerarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGenerarFactura.setText("Generar Factura");
        jMenuItemGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerarFacturaActionPerformed(evt);
            }
        });
        jMenuFacturacion.add(jMenuItemGenerarFactura);

        jMenuItemAnularFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAnularFactura.setText("Anular Factura");
        jMenuFacturacion.add(jMenuItemAnularFactura);

        jMenuBar1.add(jMenuFacturacion);

        jMenuAyuda.setText("Ayuda");

        jMenuItemInformacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInformacion.setText("Informacion");
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelUsuarioNombre)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonModificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente BC = new BuscarCliente();
        BC.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoClienteActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenerarFacturaActionPerformed
        // TODO add your handling code here:
        VentanaGenerarFactura VGF = new VentanaGenerarFactura();
        VGF.setVisible(true);
    }//GEN-LAST:event_jMenuItemGenerarFacturaActionPerformed

    private void jMenuItemNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente BC = new BuscarCliente();
        BC.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoClienteActionPerformed

    private void jMenuItemNuevoCadeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoCadeteActionPerformed
        // TODO add your handling code here:
        GestionarCadete DC = new GestionarCadete();
        DC.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItemNuevoCadeteActionPerformed
    private void jMenuItemNuevaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaComidaActionPerformed
        GestionarComida GC = new GestionarComida();
        GC.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevaComidaActionPerformed

    private void jMenuItemModificarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarComidaActionPerformed
        GestionarComida GC = new GestionarComida();
        GC.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarComidaActionPerformed

    private void jMenuItemBorrarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarComidaActionPerformed
        GestionarComida GC = new GestionarComida();
        GC.setVisible(true);
    }//GEN-LAST:event_jMenuItemBorrarComidaActionPerformed

    private void jButtonGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarFacturaActionPerformed
        // TODO add your handling code here:
        VentanaGenerarFactura VGF = new VentanaGenerarFactura();
        VGF.setVisible(true);
    }//GEN-LAST:event_jButtonGenerarFacturaActionPerformed

    private void jMenuItemModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente BC = new BuscarCliente();
        BC.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarClienteActionPerformed

    private void jMenuItemBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente BC = new BuscarCliente();
        BC.setVisible(true);
    }//GEN-LAST:event_jMenuItemBorrarClienteActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente BC = new BuscarCliente();
        BC.setVisible(true);
    }//GEN-LAST:event_jButtonModificarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalEncargado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarPedido;
    private javax.swing.JButton jButtonGenerarFactura;
    private javax.swing.JButton jButtonModificarCliente;
    private javax.swing.JButton jButtonModificarPedido;
    private javax.swing.JButton jButtonNuevoCliente;
    private javax.swing.JButton jButtonNuevoPedido;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuarioNombre;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadetes;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuComidas;
    private javax.swing.JMenu jMenuFacturacion;
    private javax.swing.JMenuItem jMenuItemAnularFactura;
    private javax.swing.JMenuItem jMenuItemBorrarCadete;
    private javax.swing.JMenuItem jMenuItemBorrarCliente;
    private javax.swing.JMenuItem jMenuItemBorrarComida;
    private javax.swing.JMenuItem jMenuItemCancelarPedido;
    private javax.swing.JMenuItem jMenuItemGenerarFactura;
    private javax.swing.JMenuItem jMenuItemInformacion;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenuItem jMenuItemModificarCadete;
    private javax.swing.JMenuItem jMenuItemModificarCliente;
    private javax.swing.JMenuItem jMenuItemModificarComida;
    private javax.swing.JMenuItem jMenuItemModificarPedido;
    private javax.swing.JMenuItem jMenuItemNuevaComida;
    private javax.swing.JMenuItem jMenuItemNuevoCadete;
    private javax.swing.JMenuItem jMenuItemNuevoCliente;
    private javax.swing.JMenuItem jMenuItemNuevoPedido;
    private javax.swing.JMenu jMenuPedidos;
    // End of variables declaration//GEN-END:variables
}
