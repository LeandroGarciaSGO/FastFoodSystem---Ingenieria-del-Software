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

import Datos.Cadete;
import Datos.DetallePedido;
import Datos.Pedido;
import Datos.Usuario;
import Logica.AMBCadete;
import Logica.OperacionesPedido;
import Logica.OperacionesTransacciones;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConfirmarPedido extends javax.swing.JFrame {
    Usuario usuarioSistema;
    Pedido P;
    ArrayList<DetallePedido> DP;
    ArrayList<DetallePedido> DPMod;
    int b;
    int cod;

    /**
     * Creates new form ConfirmarPedido
     */
    public ConfirmarPedido() throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        b = 0;
        cod = 0;
        P = new Pedido();
        DP = new ArrayList<DetallePedido>();
        DPMod = new ArrayList<DetallePedido>();
        cargarJComboBoxCadeteDisponible();
        usuarioSistema = new Usuario();
    }

    public Pedido getP() {
        return P;
    }

    public void setP(Pedido P) {
        this.P = P;
    }

    public ArrayList<DetallePedido> getDP() {
        return DP;
    }

    public void setDP(ArrayList<DetallePedido> DP) {
        this.DP = DP;
    }

    public ArrayList<DetallePedido> getDPMod() {
        return DPMod;
    }

    public void setDPMod(ArrayList<DetallePedido> DPMod) {
        this.DPMod = DPMod;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

        jLabelCadetes = new javax.swing.JLabel();
        jComboBoxSeleccionarCadete = new javax.swing.JComboBox<>();
        jLabelPedidoNum = new javax.swing.JLabel();
        jLabelMostrarPedidoNum = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastFoodSystem - Confirmar Pedido");
        setMaximumSize(new java.awt.Dimension(331, 200));
        setMinimumSize(new java.awt.Dimension(331, 200));
        setResizable(false);

        jLabelCadetes.setText("Cadetes:");

        jComboBoxSeleccionarCadete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Cadete" }));

        jLabelPedidoNum.setText("Pedido Número:");

        jLabelMostrarPedidoNum.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabelMostrarPedidoNum.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabelMostrarPedidoNum.setPreferredSize(new java.awt.Dimension(100, 14));

        jButtonConfirmar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Botones/icono-confirmar-pedido.png"))); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setMaximumSize(new java.awt.Dimension(210, 57));
        jButtonConfirmar.setMinimumSize(new java.awt.Dimension(210, 57));
        jButtonConfirmar.setPreferredSize(new java.awt.Dimension(210, 57));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPedidoNum)
                            .addComponent(jLabelCadetes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSeleccionarCadete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMostrarPedidoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadetes)
                    .addComponent(jComboBoxSeleccionarCadete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPedidoNum)
                    .addComponent(jLabelMostrarPedidoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        OperacionesPedido ABMP = new OperacionesPedido();
        OperacionesTransacciones OT = new OperacionesTransacciones();
        AMBCadete ABMC = new AMBCadete();
        Cadete C = new Cadete();
        int numLinea = 0;
        int entidad = 5;
        if(jComboBoxSeleccionarCadete.getSelectedIndex()>0){
            try {
                P.setIdCadete(Integer.parseInt(String.valueOf(jComboBoxSeleccionarCadete.getSelectedItem()).substring(0,1)));
                if (b==0){
                    int accion = 14;
                    int x = ABMP.nuevoPedido(P);
                    if(x > 0){
                        for(int i = 0; i<DP.size(); i++){
                            numLinea = numLinea + 1;
                            DP.get(i).setIdPedido(x);
                            DP.get(i).setNumLinea(numLinea);
                        }
                        ABMP.nuevoDetallePedido(DP);
                        OT.registrarTransaccion(accion, entidad, P.getIdPedido(), usuarioSistema);
                        JOptionPane.showMessageDialog(this, "El pedido se registro correctamente y su Número de Pedido es: "+ x, "Fast Food System", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "El pedido no puede registrarse", "Fast Food System", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else if (JOptionPane.showConfirmDialog(null, "¿Desea modificar el pedido?","Fast Food System",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    int accion = 16;
                    ABMP.modificarPedido(P);
                    ABMP.eliminarDetallePedido(P.getIdPedido());
                    for(int i = 0; i<DPMod.size(); i++){
                        numLinea = numLinea + 1;
                        DPMod.get(i).setIdPedido(P.getIdPedido());
                        DPMod.get(i).setNumLinea(numLinea);
                    }
                    ABMP.nuevoDetallePedido(DPMod);
                    OT.registrarTransaccion(accion, entidad, P.getIdPedido(), usuarioSistema);
                    JOptionPane.showMessageDialog(this, "El pedido se modifico correctamente y su Número de Pedido es: "+ P.getIdPedido(), "Fast Food System", JOptionPane.INFORMATION_MESSAGE);
                }
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ConfirmarPedido.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConfirmarPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Un Cadete","FastFoodSystem",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public void mostrarNumPedido(int p) throws ClassNotFoundException, SQLException{
        if(p==0)
            jLabelMostrarPedidoNum.setText(String.valueOf(P.obtenerSiguienteIdPedido()));
        else
            jLabelMostrarPedidoNum.setText(String.valueOf(cod));
    }
    
    public void cargarJComboBoxCadeteDisponible() throws ClassNotFoundException, SQLException{
        AMBCadete ABMC = new AMBCadete();
        ArrayList<Cadete> listaCadete = new ArrayList<Cadete>();
        listaCadete = ABMC.listaCadetes();
        for(int i = 0; i<listaCadete.size(); i++){
            jComboBoxSeleccionarCadete.addItem(String.valueOf(listaCadete.get(i).getIdCadete()) + " - " +listaCadete.get(i).getNombre());
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
            java.util.logging.Logger.getLogger(ConfirmarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConfirmarPedido().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConfirmarPedido.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConfirmarPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxSeleccionarCadete;
    private javax.swing.JLabel jLabelCadetes;
    private javax.swing.JLabel jLabelMostrarPedidoNum;
    private javax.swing.JLabel jLabelPedidoNum;
    // End of variables declaration//GEN-END:variables
}
