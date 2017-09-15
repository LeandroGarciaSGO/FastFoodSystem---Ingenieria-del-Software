/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Cliente;

/**
 *
 * @author Leandro
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    private Cliente datosCliente;
    private int condatos_vacio;
    
    public Clientes() {
        initComponents();
       
    }

    public Cliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(Cliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public int getCondatos_vacio() {
        return condatos_vacio;
    }

    public void setCondatos_vacio(int condatos_vacio) {
        this.condatos_vacio = condatos_vacio;
    }
    
     void LlenarCampos() {
        if(condatos_vacio == 1){
            jLabelNumeroCliente.setText(String.valueOf(datosCliente.getIdCliente()));
            jTextFieldTelefono.setText(String.valueOf(datosCliente.getTelefono()));
            jTextFieldNombre.setText(datosCliente.getNombre());
            jTextFieldApellido.setText(datosCliente.getApellido());
            jTextFieldDomicilio.setText(datosCliente.getDomicilio());
        }
        else
        {
            jLabelNumeroCliente.setText(String.valueOf(Cliente.obtenerSiguienteId()));
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
        jLabelClienteNro = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDomicilio = new javax.swing.JLabel();
        jLabelNumeroCliente = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jPanelImagen = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastFoodSystem - Clientes");
        setMaximumSize(new java.awt.Dimension(640, 410));
        setMinimumSize(new java.awt.Dimension(640, 410));
        setPreferredSize(new java.awt.Dimension(640, 410));

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        jLabelClienteNro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelClienteNro.setText("Cliente Nro:");

        jLabelTelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelTelefono.setText("Telefono:");

        jLabelNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelApellido.setText("Apellido");

        jLabelDomicilio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDomicilio.setText("Domicilio:");

        jLabelNumeroCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNumeroCliente.setText("9999999999");

        jTextFieldTelefono.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldTelefono.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldTelefono.setPreferredSize(new java.awt.Dimension(210, 20));

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(210, 20));

        jTextFieldApellido.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldApellido.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldApellido.setPreferredSize(new java.awt.Dimension(210, 20));

        jTextFieldDomicilio.setMaximumSize(new java.awt.Dimension(210, 20));
        jTextFieldDomicilio.setMinimumSize(new java.awt.Dimension(210, 20));
        jTextFieldDomicilio.setPreferredSize(new java.awt.Dimension(210, 20));

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelClienteNro)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelApellido)
                    .addComponent(jLabelDomicilio))
                .addGap(46, 46, 46)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroCliente)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClienteNro)
                            .addComponent(jLabelNumeroCliente))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTelefono))
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDomicilio))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanelImagen.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(180, 50));

        jButtonEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(180, 50));

        jButtonGuardar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setMaximumSize(new java.awt.Dimension(180, 50));
        jButtonGuardar.setMinimumSize(new java.awt.Dimension(180, 50));
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelClienteNro;
    private javax.swing.JLabel jLabelDomicilio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroCliente;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

   
}