    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.PreparedStatement;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
public class jp_ventas extends javax.swing.JPanel {
    private Connection conexion;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public void Conectar() {
        try {
            Mysql mysql = new Mysql();
            Connection con = mysql.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from ventas;");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error 000" + err.getMessage());
        }
    }
    public void llenarDatos() {
        try {
            this.jtf_folio.setText(rs.getString("codigo_venta"));
            this.jtf_producto_venta.setText(rs.getString("fecha_venta"));
            this.jtf_existencia.setText(rs.getString("producto_venta"));
            this.jtf_cliente.setText(rs.getString("Cantidad"));
            this.jtf_cliente.setText(rs.getString("Con_Todo"));
            this.jtf_cliente.setText(rs.getString("Bebida"));
            this.jtf_cliente.setText(rs.getString("Cantidad_Bebida"));
            this.jtf_cliente.setText(rs.getString("Nom_Cliente"));
            this.jtf_cliente.setText(rs.getString("Total"));
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001: " + ex.getMessage());
        }
    }
    DefaultTableModel model;
  
    public jp_ventas() {
        initComponents();
        cargar();
    }
    void cargar(){
        String [] titulos={"Folio", "Fecha", "Producto", "Cantidad", "Con todo", "Bebida", "Cantidad", "Cliente", "Total"};
        String [] registros = new String[10];
        String sql ="SELECT * FROM ventas";
        
        model = new DefaultTableModel(null, titulos);
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();                
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){               
                registros[0]=rs.getString("codigo_venta");
                registros[1]=rs.getString("fecha_venta");
                registros[2]=rs.getString("producto_venta");
                registros[3]=rs.getString("Cantidad");
                registros[4]=rs.getString("Con_Todo");
                registros[5]=rs.getString("Bebida");
                registros[6]=rs.getString("Cantidad_Bebida");
                registros[7]=rs.getString("Nom_Cliente");
                registros[8]=rs.getString("Total");             
                model.addRow(registros);
                
            }
            jt_datos_vnt.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo importar la tabla");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_ventas = new javax.swing.JPanel();
        jl_folio = new javax.swing.JLabel();
        jl_producto_venta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_bebida = new javax.swing.JTextField();
        jtf_cantidad = new javax.swing.JTextField();
        jtf_total = new javax.swing.JTextField();
        jtf_folio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_fecha = new javax.swing.JTextField();
        jtf_con_todo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_datos_vnt = new javax.swing.JTable();
        jp_button_prov = new javax.swing.JPanel();
        jb_borrar_venta = new javax.swing.JButton();
        jb_cancelar_venta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtf_producto_venta = new javax.swing.JTextField();
        jl_precio = new javax.swing.JLabel();
        jl_existencia = new javax.swing.JLabel();
        jtf_existencia = new javax.swing.JTextField();
        jtf_cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jp_ventas.setBackground(new java.awt.Color(0, 102, 102));
        jp_ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_folio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_folio.setText("Folio");
        jp_ventas.add(jl_folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jl_producto_venta.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_producto_venta.setText("Producto");
        jp_ventas.add(jl_producto_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel4.setText("Bebida");
        jp_ventas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel5.setText("Cantidad de bebidas");
        jp_ventas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setText("Con Todo");
        jp_ventas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel6.setText("Cliente");
        jp_ventas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jp_ventas.add(jtf_bebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, -1));
        jp_ventas.add(jtf_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, -1));
        jp_ventas.add(jtf_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 110, -1));
        jp_ventas.add(jtf_folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel7.setText("Fecha");
        jp_ventas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jp_ventas.add(jtf_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        jtf_con_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_con_todoActionPerformed(evt);
            }
        });
        jp_ventas.add(jtf_con_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 360, 40));

        jt_datos_vnt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_datos_vnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_datos_vntMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_datos_vnt);

        jp_ventas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 80));

        jp_button_prov.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_borrar_venta.setBackground(new java.awt.Color(153, 153, 153));
        jb_borrar_venta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_borrar_venta.setForeground(new java.awt.Color(51, 51, 51));
        jb_borrar_venta.setText("Pedido Hecho");
        jb_borrar_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_borrar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_ventaActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_borrar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, -1));

        jb_cancelar_venta.setBackground(new java.awt.Color(255, 0, 0));
        jb_cancelar_venta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_cancelar_venta.setForeground(new java.awt.Color(51, 51, 51));
        jb_cancelar_venta.setText("Cancelar");
        jb_cancelar_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cancelar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_ventaActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_cancelar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jp_button_prov.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 390, 100));

        jp_ventas.add(jp_button_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 325, 390, 50));
        jp_ventas.add(jtf_producto_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 110, -1));

        jl_precio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_precio.setText("Total");
        jp_ventas.add(jl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 40));

        jl_existencia.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_existencia.setText("Cantidad");
        jp_ventas.add(jl_existencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, 40));
        jp_ventas.add(jtf_existencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 110, -1));
        jp_ventas.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_slider.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_ventas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_datos_vntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_datos_vntMouseClicked
        int i = jt_datos_vnt.getSelectedRow();
        TableModel model = jt_datos_vnt.getModel();
        jtf_folio.setText(model.getValueAt(i, 0).toString());
        jtf_fecha.setText(model.getValueAt(i, 1).toString());
        jtf_producto_venta.setText(model.getValueAt(i, 2).toString());
        jtf_existencia.setText(model.getValueAt(i, 3).toString());
        jtf_con_todo.setText(model.getValueAt(i, 4).toString());
        jtf_bebida.setText(model.getValueAt(i, 5).toString());
        jtf_cantidad.setText(model.getValueAt(i, 6).toString());
        jtf_cliente.setText(model.getValueAt(i, 7).toString());
        jtf_total.setText(model.getValueAt(i, 8).toString());        
    }//GEN-LAST:event_jt_datos_vntMouseClicked

    private void jb_borrar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrar_ventaActionPerformed
        try {            
            int eliminar = JOptionPane.showConfirmDialog(null, "El pedido está hecho?", "Pedido Hecho", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){  
                String delete = ("DELETE FROM ventas WHERE codigo_venta=?");
                Mysql mysql = new Mysql();
                Connection con = mysql.getConnection();
                pst = (PreparedStatement) con.prepareStatement(delete);
                pst.setString(1, jtf_folio.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se eliminó el registro");
                
            } else {
                
            }           
        } catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }//GEN-LAST:event_jb_borrar_ventaActionPerformed

    private void jb_cancelar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_ventaActionPerformed
        jtf_folio.setText("");
        jtf_producto_venta.setText("");
        jtf_existencia.setText("");   
        jtf_cliente.setText("");  
        jtf_bebida.setText("");
        jtf_fecha.setText("");
        jtf_cantidad.setText("");
        jtf_total.setText("");
        jtf_con_todo.setText("");
        jb_borrar_venta.setEnabled(true);
    }//GEN-LAST:event_jb_cancelar_ventaActionPerformed

    private void jtf_con_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_con_todoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_con_todoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_borrar_venta;
    private javax.swing.JButton jb_cancelar_venta;
    private javax.swing.JLabel jl_existencia;
    private javax.swing.JLabel jl_folio;
    private javax.swing.JLabel jl_precio;
    private javax.swing.JLabel jl_producto_venta;
    private javax.swing.JPanel jp_button_prov;
    private javax.swing.JPanel jp_ventas;
    private javax.swing.JTable jt_datos_vnt;
    private javax.swing.JTextField jtf_bebida;
    private javax.swing.JTextField jtf_cantidad;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_con_todo;
    private javax.swing.JTextField jtf_existencia;
    private javax.swing.JTextField jtf_fecha;
    private javax.swing.JTextField jtf_folio;
    private javax.swing.JTextField jtf_producto_venta;
    private javax.swing.JTextField jtf_total;
    // End of variables declaration//GEN-END:variables
}
