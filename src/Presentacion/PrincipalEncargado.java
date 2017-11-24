/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Usuario;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class PrincipalEncargado extends javax.swing.JFrame {
    
    Usuario usuarioSistema;

    /**
     * Creates new form PrincipalEncargado
     */
    public PrincipalEncargado() {
        initComponents();
        setLocationRelativeTo(null);
        usuarioSistema = new Usuario();
    }

    public Usuario getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(Usuario usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
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
        jButtonCerrarSesion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemNuevoCliente = new javax.swing.JMenuItem();
        jMenuComidas = new javax.swing.JMenu();
        jMenuGestionarComida = new javax.swing.JMenuItem();
        jMenuPedidos = new javax.swing.JMenu();
        jMenuItemNuevoPedido = new javax.swing.JMenuItem();
        jMenuItemGestionarPedido = new javax.swing.JMenuItem();
        jMenuCadetes = new javax.swing.JMenu();
        jMenuItemNuevoCadete = new javax.swing.JMenuItem();
        jMenuFacturacion = new javax.swing.JMenu();
        jMenuItemGenerarFactura = new javax.swing.JMenuItem();
        jMenuItemAnularFactura = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemInformacion = new javax.swing.JMenuItem();
        jMenuItemManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FastFoodSystem - Principal");
        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(740, 520));
        setResizable(false);

        jButtonNuevoPedido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonNuevoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-pedido.png"))); // NOI18N
        jButtonNuevoPedido.setText("Nuevo Pedido");
        jButtonNuevoPedido.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoPedido.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonNuevoPedido.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoPedidoActionPerformed(evt);
            }
        });

        jButtonCancelarPedido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cancelar-pedido.png"))); // NOI18N
        jButtonCancelarPedido.setText("Cancelar Pedido");
        jButtonCancelarPedido.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonCancelarPedido.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonCancelarPedido.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPedidoActionPerformed(evt);
            }
        });

        jButtonModificarPedido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonModificarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-modificar-pedido.png"))); // NOI18N
        jButtonModificarPedido.setText("Modificar Pedido");
        jButtonModificarPedido.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonModificarPedido.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonModificarPedido.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonModificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPedidoActionPerformed(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal-iloveimg-resized.png"))); // NOI18N

        jButtonCerrarSesion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-cerrar-sesion.png"))); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesion");
        jButtonCerrarSesion.setMaximumSize(new java.awt.Dimension(210, 80));
        jButtonCerrarSesion.setMinimumSize(new java.awt.Dimension(210, 80));
        jButtonCerrarSesion.setPreferredSize(new java.awt.Dimension(210, 80));
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jMenuClientes.setText("Clientes");

        jMenuItemNuevoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevoCliente.setText("Gestionar Clientes");
        jMenuItemNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemNuevoCliente);

        jMenuBar1.add(jMenuClientes);

        jMenuComidas.setText("Comidas");

        jMenuGestionarComida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuGestionarComida.setText("Gestionar Comida");
        jMenuGestionarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionarComidaActionPerformed(evt);
            }
        });
        jMenuComidas.add(jMenuGestionarComida);

        jMenuBar1.add(jMenuComidas);

        jMenuPedidos.setText("Pedidos");

        jMenuItemNuevoPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevoPedido.setText("Nuevo Pedido");
        jMenuItemNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoPedidoActionPerformed(evt);
            }
        });
        jMenuPedidos.add(jMenuItemNuevoPedido);

        jMenuItemGestionarPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGestionarPedido.setText("Gestionar Pedidos");
        jMenuItemGestionarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionarPedidoActionPerformed(evt);
            }
        });
        jMenuPedidos.add(jMenuItemGestionarPedido);

        jMenuBar1.add(jMenuPedidos);

        jMenuCadetes.setText("Cadetes");

        jMenuItemNuevoCadete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevoCadete.setText("Gestionar Cadetes");
        jMenuItemNuevoCadete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoCadeteActionPerformed(evt);
            }
        });
        jMenuCadetes.add(jMenuItemNuevoCadete);

        jMenuBar1.add(jMenuCadetes);

        jMenuFacturacion.setText("Facturacion");

        jMenuItemGenerarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGenerarFactura.setText("Generar Factura");
        jMenuItemGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerarFacturaActionPerformed(evt);
            }
        });
        jMenuFacturacion.add(jMenuItemGenerarFactura);

        jMenuItemAnularFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAnularFactura.setText("Anular Factura");
        jMenuItemAnularFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnularFacturaActionPerformed(evt);
            }
        });
        jMenuFacturacion.add(jMenuItemAnularFactura);

        jMenuBar1.add(jMenuFacturacion);

        jMenuAyuda.setText("Ayuda");

        jMenuItemInformacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInformacion.setText("Informacion");
        jMenuItemInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInformacionActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemInformacion);

        jMenuItemManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemManual.setText("Manual de Usuario");
        jMenuItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManualActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemManual);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoClienteActionPerformed
        // TODO add your handling code here:
        VentanaBuscarCliente BC = new VentanaBuscarCliente();
        BC.setUsuarioSistema(usuarioSistema);
        BC.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoClienteActionPerformed

    private void jMenuGestionarComidaActionPerformed(java.awt.event.ActionEvent evt) {
        GestionarComida GC = new GestionarComida();
        GC.setUsuarioSistema(usuarioSistema);
        GC.setVisible(true);
    }

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que Desea Salir del Programa?", "FastFoodSystem - ATENCION", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenerarFacturaActionPerformed
        // TODO add your handling code here:
        VentanaGenerarFactura VGF = new VentanaGenerarFactura();
        VGF.setUsuarioSistema(usuarioSistema);
        VGF.setVisible(true);
    }//GEN-LAST:event_jMenuItemGenerarFacturaActionPerformed

    private void jMenuItemNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoClienteActionPerformed
        // TODO add your handling code here:
        VentanaBuscarCliente BC = new VentanaBuscarCliente();
        BC.setUsuarioSistema(usuarioSistema);
        BC.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoClienteActionPerformed

    private void jButtonGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarFacturaActionPerformed
        // TODO add your handling code here:
        VentanaGenerarFactura VGF = new VentanaGenerarFactura();
        VGF.setUsuarioSistema(usuarioSistema);
        VGF.setVisible(true);
    }//GEN-LAST:event_jButtonGenerarFacturaActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        // TODO add your handling code here:
        VentanaBuscarCliente BC = new VentanaBuscarCliente();
        BC.setUsuarioSistema(usuarioSistema);
        BC.setVisible(true);
    }//GEN-LAST:event_jButtonModificarClienteActionPerformed
    private void jButtonNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoPedidoActionPerformed
        // TODO add your handling code here:
        DatosPedido DP = null;
        try {
            DP = new DatosPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        }
        DP.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoPedidoActionPerformed

    private void jButtonModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarPedidoActionPerformed
        // TODO add your handling code here:
        ModificarPedido MP;
        try {
            MP = new ModificarPedido();
            MP.setUsuarioSistema(usuarioSistema);
            MP.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModificarPedidoActionPerformed

    private void jButtonCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPedidoActionPerformed
        try {
            // TODO add your handling code here:
            ModificarPedido MP = new ModificarPedido();
            MP.setUsuarioSistema(usuarioSistema);
            MP.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCancelarPedidoActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que Desea Cerrar Sesion?", "FastFoodSystem - ATENCION", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
            Login L = new Login();
            L.setVisible(true);
        }
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jMenuItemNuevoCadeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoCadeteActionPerformed
        // TODO add your handling code here:
        GestionarCadete DC = new GestionarCadete();
        DC.setUsuarioSistema(usuarioSistema);
        DC.setVisible(true);

    }//GEN-LAST:event_jMenuItemNuevoCadeteActionPerformed

    private void jMenuItemInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInformacionActionPerformed
        // TODO add your handling code here:
        VentanaInformacion f = new VentanaInformacion();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItemInformacionActionPerformed

    private void jMenuItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManualActionPerformed
         //ANDA PERO NO EMPAQUETADO
        File f = new File("Manuales\\ManualUsuario.pdf"); // Creamos un objeto file
        System.out.println("RUTA" + f.getAbsolutePath()); // Llamamos al método que devuelve la ruta absoluta
        //JOptionPane.showMessageDialog(this, "RUTA" + f.getAbsolutePath(), "FastFoodSystem", JOptionPane.ERROR_MESSAGE);
        abrirManual(f.getAbsolutePath());

        
        
    }//GEN-LAST:event_jMenuItemManualActionPerformed

    private void jMenuItemAnularFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnularFacturaActionPerformed
        // TODO add your handling code here:
        VentanaAnularFactura VAF = new VentanaAnularFactura();
        VAF.setDatosUsuario(usuarioSistema);
        VAF.setVisible(true);
    }//GEN-LAST:event_jMenuItemAnularFacturaActionPerformed

    private void jMenuItemGestionarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionarPedidoActionPerformed
        // TODO add your handling code here:
        ModificarPedido MP;
        try {
            MP = new ModificarPedido();
            MP.setUsuarioSistema(usuarioSistema);
            MP.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemGestionarPedidoActionPerformed

    private void jMenuItemNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoPedidoActionPerformed
        // TODO add your handling code here:
        DatosPedido DP = null;
        try {
            DP = new DatosPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalEncargado.class.getName()).log(Level.SEVERE, null, ex);
        }
        DP.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoPedidoActionPerformed

    public void abrirManual(String archivo) {

        System.out.println(archivo);
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);

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
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonGenerarFactura;
    private javax.swing.JButton jButtonModificarCliente;
    private javax.swing.JButton jButtonModificarPedido;
    private javax.swing.JButton jButtonNuevoCliente;
    private javax.swing.JButton jButtonNuevoPedido;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadetes;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuComidas;
    private javax.swing.JMenu jMenuFacturacion;
    private javax.swing.JMenuItem jMenuGestionarComida;
    private javax.swing.JMenuItem jMenuItemAnularFactura;
    private javax.swing.JMenuItem jMenuItemGenerarFactura;
    private javax.swing.JMenuItem jMenuItemGestionarPedido;
    private javax.swing.JMenuItem jMenuItemInformacion;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenuItem jMenuItemNuevoCadete;
    private javax.swing.JMenuItem jMenuItemNuevoCliente;
    private javax.swing.JMenuItem jMenuItemNuevoPedido;
    private javax.swing.JMenu jMenuPedidos;
    // End of variables declaration//GEN-END:variables
}
