
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jp_interface = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jp_interface_nav = new javax.swing.JPanel();
        jb_ventas = new javax.swing.JButton();
        jb_proveedores = new javax.swing.JButton();
        jb_empleados = new javax.swing.JButton();
        jb_productos = new javax.swing.JButton();
        jb_cerrar_sesion = new javax.swing.JButton();
        jb_usuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jp_paneles = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jl_area = new javax.swing.JLabel();

        jButton5.setText("jButton2");

        jButton6.setText("jButton2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp_interface.setBackground(new java.awt.Color(255, 0, 0));
        jp_interface.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\VICTOR MANUEL ARANDA\\Documents\\PicsArt_08-16-05.35.25.jpg")); // NOI18N
        jp_interface.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 290, 260));

        jp_interface_nav.setBackground(new java.awt.Color(255, 102, 0));
        jp_interface_nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_ventas.setBackground(new java.awt.Color(153, 153, 153));
        jb_ventas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jb_ventas.setText("Pedidos");
        jb_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ventasActionPerformed(evt);
            }
        });
        jp_interface_nav.add(jb_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, -1));

        jb_proveedores.setBackground(new java.awt.Color(153, 153, 153));
        jb_proveedores.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jb_proveedores.setText("Proveedores");
        jb_proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_proveedoresActionPerformed(evt);
            }
        });
        jp_interface_nav.add(jb_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jb_empleados.setBackground(new java.awt.Color(153, 153, 153));
        jb_empleados.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jb_empleados.setText("Empleados");
        jb_empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_empleadosActionPerformed(evt);
            }
        });
        jp_interface_nav.add(jb_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        jb_productos.setBackground(new java.awt.Color(153, 153, 153));
        jb_productos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jb_productos.setText("Productos");
        jb_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_productosActionPerformed(evt);
            }
        });
        jp_interface_nav.add(jb_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        jb_cerrar_sesion.setBackground(new java.awt.Color(255, 0, 0));
        jb_cerrar_sesion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jb_cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        jb_cerrar_sesion.setText("Cerrar Sesión");
        jb_cerrar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cerrar_sesionActionPerformed(evt);
            }
        });
        jp_interface_nav.add(jb_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 38));

        jb_usuarios.setBackground(new java.awt.Color(153, 153, 153));
        jb_usuarios.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jb_usuarios.setText("Usuarios");
        jb_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_usuariosActionPerformed(evt);
            }
        });
        jp_interface_nav.add(jb_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\VICTOR MANUEL ARANDA\\Desktop\\iTacos_fondo\\bg_top_img.jpg")); // NOI18N
        jp_interface_nav.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 430));

        jp_interface.add(jp_interface_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 396));

        jp_paneles.setBackground(new java.awt.Color(255, 153, 0));
        jp_paneles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setBackground(new java.awt.Color(255, 0, 0));
        jButton13.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("X");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 102, 255), new java.awt.Color(153, 0, 153)));
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jp_paneles.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 30));

        jl_area.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_slider.jpg"))); // NOI18N
        jp_paneles.add(jl_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 490, 490));

        jp_interface.add(jp_paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 0, 471, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_interface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_interface, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ventasActionPerformed

        jp_ventas vnt = new jp_ventas();
        vnt.setSize(481,450);
        vnt.setLocation(2,60);
        
        jl_area.removeAll();        
        jl_area.add(vnt,BorderLayout.CENTER);
        jl_area.revalidate();
        jl_area.repaint();
    }//GEN-LAST:event_jb_ventasActionPerformed

    private void jb_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_productosActionPerformed
        jp_productos pro = new jp_productos();
        pro.setSize(481,450);
        pro.setLocation(2,60);
        
        jl_area.removeAll();
        jl_area.add(pro,BorderLayout.CENTER);
        jl_area.revalidate();
        jl_area.repaint();
    }//GEN-LAST:event_jb_productosActionPerformed

    private void jb_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_proveedoresActionPerformed
        jp_proveedores prv = new jp_proveedores();
        prv.setSize(481,450);
        prv.setLocation(2,60);
        
        jl_area.removeAll();
        jl_area.add(prv,BorderLayout.CENTER);
        jl_area.revalidate();
        jl_area.repaint();
        prv.jtf_id_prove.setEnabled(false);
    }//GEN-LAST:event_jb_proveedoresActionPerformed

    private void jb_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_empleadosActionPerformed
        jp_empleados emp = new jp_empleados();
        emp.setSize(481,450);
        emp.setLocation(2,60);
             
        jl_area.removeAll();
        jl_area.add(emp,BorderLayout.CENTER);
        jl_area.revalidate();
        jl_area.repaint();
        emp.jtf_id_emp.setEnabled(false);
    }//GEN-LAST:event_jb_empleadosActionPerformed

    private void jb_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_usuariosActionPerformed
        jp_usuarios usr = new jp_usuarios();
        usr.setSize(481,450);
        usr.setLocation(2,60);
        
        jl_area.removeAll();
        jl_area.add(usr,BorderLayout.CENTER);
        jl_area.revalidate();
        jl_area.repaint();
        usr.jtf_id_user.setEnabled(false);
    }//GEN-LAST:event_jb_usuariosActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){
                System.exit(0);
            }else{
                
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jb_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cerrar_sesionActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(null, "Desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){
                Login log = new Login();
                log.setVisible(true);
                this.dispose();
            }else{
                
            }
    }//GEN-LAST:event_jb_cerrar_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jb_cerrar_sesion;
    private javax.swing.JButton jb_empleados;
    private javax.swing.JButton jb_productos;
    private javax.swing.JButton jb_proveedores;
    private javax.swing.JButton jb_usuarios;
    private javax.swing.JButton jb_ventas;
    private javax.swing.JLabel jl_area;
    private javax.swing.JPanel jp_interface;
    private javax.swing.JPanel jp_interface_nav;
    private javax.swing.JPanel jp_paneles;
    // End of variables declaration//GEN-END:variables
}
