package com.umg.api.ui;

public class Principal extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal() {
        initComponents();

        jDesktopPane1.setLayout(null);
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1100, 720));
        pack();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMantenimientos = new javax.swing.JMenu();
        itemClientes = new javax.swing.JMenuItem();
        itemProveedores = new javax.swing.JMenuItem();
        itemProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        menuMantenimientos.setText("Opciones");

        itemClientes.setText("Clientes");
        itemClientes.addActionListener(this::itemClientesActionPerformed);
        menuMantenimientos.add(itemClientes);

        itemProveedores.setText("Proveedores");
        itemProveedores.addActionListener(this::itemProveedoresActionPerformed);
        menuMantenimientos.add(itemProveedores);

        itemProductos.setText("Productos");
        itemProductos.addActionListener(this::itemProductosActionPerformed);
        menuMantenimientos.add(itemProductos);

        jMenuBar1.add(menuMantenimientos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed

        mostrarVentana(new ClienteFrame());
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProveedoresActionPerformed

        mostrarVentana(new ProveedorFrame());
    }//GEN-LAST:event_itemProveedoresActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed

        mostrarVentana(new ProductoFrame());
    }//GEN-LAST:event_itemProductosActionPerformed

    private void mostrarVentana(javax.swing.JInternalFrame ventana) {
        jDesktopPane1.add(ventana);
        ventana.setVisible(true);

        try {
            ventana.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            logger.log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            Principal menu = new Principal();
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemProveedores;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuMantenimientos;
    // End of variables declaration//GEN-END:variables
}
