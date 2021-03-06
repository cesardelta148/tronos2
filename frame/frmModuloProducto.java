/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author sistems
 */
public class frmModuloProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmModuloProducto
     */
    public frmModuloProducto() {
         this.setUndecorated(true);
        //inicializar componentes
        initComponents();
        this.setLocationRelativeTo(null); //centrar formulario
        //redondear bordes
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoBarra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtProducto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtDescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spinnerCosto = new javax.swing.JSpinner();
        rbId = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtId = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 102, 0));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("PRODUCTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 950, 10));

        jLabel4.setBackground(new java.awt.Color(255, 102, 0));
        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setText("Cod Barra");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 30));

        txtCodigoBarra.setBorder(null);
        jPanel1.add(txtCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 350, 20));

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setText("Producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, 30));

        jLabel6.setBackground(new java.awt.Color(255, 102, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 80, 30));

        jLabel8.setBackground(new java.awt.Color(240, 86, 52));
        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel8.setText("Estado");
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 30));

        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 350, 10));

        txtProducto.setBorder(null);
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 350, 20));

        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 350, 10));

        txtDescripcion.setBorder(null);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 350, 20));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(255, 102, 0));
        btnCerrar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 102, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 30));

        btnMinimizar.setBackground(new java.awt.Color(255, 102, 0));
        btnMinimizar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 102, 0));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setVerifyInputWhenFocusTarget(false);
        btnMinimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 35));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setForeground(new java.awt.Color(51, 153, 255));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1060, 35));

        tableProducto.setBackground(new java.awt.Color(204, 204, 204));
        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5"
            }
        ));
        jScrollPane1.setViewportView(tableProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 960, 90));

        jSeparator8.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 220, 10));

        txtBuscar.setToolTipText("Buscar");
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 230, 20));

        jLabel12.setBackground(new java.awt.Color(240, 86, 52));
        jLabel12.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel12.setText("Proveedor");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, 30));

        comboCategoria.setEditable(true);
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Carnes" }));
        comboCategoria.setBorder(null);
        jPanel1.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 350, 20));

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 102, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda24.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerifyInputWhenFocusTarget(false);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 30, 30));

        comboEstado.setEditable(true);
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        comboEstado.setBorder(null);
        jPanel1.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 350, 20));

        jLabel9.setBackground(new java.awt.Color(255, 102, 0));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel9.setText("Categoria");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 30));

        comboProveedor.setEditable(true);
        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diana", "Pepsi" }));
        comboProveedor.setBorder(null);
        jPanel1.add(comboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 350, 20));

        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 350, 10));

        jLabel10.setBackground(new java.awt.Color(255, 102, 0));
        jLabel10.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel10.setText("Cantidad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 60, 20));
        jPanel1.add(spinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 350, -1));

        jLabel11.setBackground(new java.awt.Color(255, 102, 0));
        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel11.setText("Costo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 60, 20));
        jPanel1.add(spinnerCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 350, -1));

        rbId.setBackground(new java.awt.Color(255, 255, 255));
        rbId.setSelected(true);
        rbId.setText("ID");
        rbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIdActionPerformed(evt);
            }
        });
        jPanel1.add(rbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        rbNombre.setBackground(new java.awt.Color(255, 255, 255));
        rbNombre.setText("Nombre");
        jPanel1.add(rbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 102, 0));
        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel13.setText("Id");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 40, 30));

        jSeparator9.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 350, 10));

        txtId.setBorder(null);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 350, 20));

        btnAgregar.setBackground(new java.awt.Color(0, 255, 0));
        btnAgregar.setForeground(new java.awt.Color(0, 51, 204));
        btnAgregar.setText("GUARDAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(0, 255, 0));
        btnActualizar.setForeground(new java.awt.Color(0, 204, 51));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 51)));
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 130, 40));

        btnEliminar.setBackground(new java.awt.Color(0, 255, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 130, 40));

        btnReporte.setBackground(new java.awt.Color(0, 255, 0));
        btnReporte.setText("GENERAR REPORTE");
        btnReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReporte.setContentAreaFilled(false);
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //pasar de una pestaña a otra
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        //pasar de una pestaña a otra

        inicio verformulario2 =new inicio();
        //línea 2-hacemos visible el formulario que queremos llamar
        verformulario2.setVisible(true);

        this.setVisible(false);//oculta el jFrame que estes usando
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void rbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIdActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(frmModuloProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModuloProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModuloProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModuloProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModuloProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerCosto;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
