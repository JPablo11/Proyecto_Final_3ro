    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.PreparedStatement;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
    
public class jp_proveedores extends javax.swing.JPanel {
    private Connection conexion;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public void Conectar() {
        try {
            Mysql mysql = new Mysql();
            Connection con = mysql.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from proveedores;");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error 000" + err.getMessage());
        }
    }
    public void llenarDatos() {
        try {
            this.jtf_id_prove.setText(rs.getString("ID_prov"));
            this.jtf_nombre_prove.setText(rs.getString("nombre_prov"));
            this.jtf_tel_prove.setText(rs.getString("numero_tel_prov"));
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001: " + ex.getMessage());
        }
    }
    DefaultTableModel model;
    
    public jp_proveedores() {
        initComponents();
        cargar();
    }
    void cargar(){
        String [] titulos={"ID","Nombre","Numero de telefono",};
        String [] registros = new String[4];
        String sql ="SELECT * FROM proveedores";
        
        model = new DefaultTableModel(null, titulos);
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();                
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){               
                registros[0]=rs.getString("ID_prov");
                registros[1]=rs.getString("nombre_prov");
                registros[2]=rs.getString("numero_tel_prov");
                model.addRow(registros);
                
            }
            jt_datos_prove.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo importar la tabla");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_proveedores = new javax.swing.JPanel();
        jl_nombre_prove = new javax.swing.JLabel();
        jl_tel_prove = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_datos_prove = new javax.swing.JTable();
        jl_id_prov = new javax.swing.JLabel();
        jtf_id_prove = new javax.swing.JTextField();
        jtf_nombre_prove = new javax.swing.JTextField();
        jtf_tel_prove = new javax.swing.JTextField();
        jp_button_prov = new javax.swing.JPanel();
        jb_nuevo_prove = new javax.swing.JButton();
        jb_actualizar_prove = new javax.swing.JButton();
        jb_borrar_prove = new javax.swing.JButton();
        jb_guardar_prove = new javax.swing.JButton();
        jb_cancelar_prove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jp_proveedores.setBackground(new java.awt.Color(0, 102, 102));
        jp_proveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nombre_prove.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_nombre_prove.setText("Nombre");
        jp_proveedores.add(jl_nombre_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 20));

        jl_tel_prove.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_tel_prove.setText("Teléfono");
        jp_proveedores.add(jl_tel_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 20));

        jt_datos_prove.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_datos_prove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_datos_proveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_datos_prove);

        jp_proveedores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 100));

        jl_id_prov.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_id_prov.setText("ID del Proveedor");
        jp_proveedores.add(jl_id_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 30));
        jp_proveedores.add(jtf_id_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 90, -1));
        jp_proveedores.add(jtf_nombre_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 87, -1));
        jp_proveedores.add(jtf_tel_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 87, -1));

        jp_button_prov.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_nuevo_prove.setBackground(new java.awt.Color(153, 153, 153));
        jb_nuevo_prove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_nuevo_prove.setForeground(new java.awt.Color(51, 51, 51));
        jb_nuevo_prove.setText("Nuevo");
        jb_nuevo_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_nuevo_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevo_proveActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_nuevo_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jb_actualizar_prove.setBackground(new java.awt.Color(153, 153, 153));
        jb_actualizar_prove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_actualizar_prove.setForeground(new java.awt.Color(51, 51, 51));
        jb_actualizar_prove.setText("Actualizar");
        jb_actualizar_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_actualizar_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_proveActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_actualizar_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jb_borrar_prove.setBackground(new java.awt.Color(153, 153, 153));
        jb_borrar_prove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_borrar_prove.setForeground(new java.awt.Color(51, 51, 51));
        jb_borrar_prove.setText("Borrar");
        jb_borrar_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_borrar_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_proveActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_borrar_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jb_guardar_prove.setBackground(new java.awt.Color(153, 153, 153));
        jb_guardar_prove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_guardar_prove.setForeground(new java.awt.Color(51, 51, 51));
        jb_guardar_prove.setText("Guardar");
        jb_guardar_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_guardar_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardar_proveActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_guardar_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jb_cancelar_prove.setBackground(new java.awt.Color(255, 0, 0));
        jb_cancelar_prove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_cancelar_prove.setForeground(new java.awt.Color(51, 51, 51));
        jb_cancelar_prove.setText("Cancelar");
        jb_cancelar_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cancelar_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_proveActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_cancelar_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jp_button_prov.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 260, 100));

        jp_proveedores.add(jp_button_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 250, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_slider.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_proveedores.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_datos_proveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_datos_proveMouseClicked
        int i = jt_datos_prove.getSelectedRow();
        TableModel model = jt_datos_prove.getModel();
        jtf_id_prove.setText(model.getValueAt(i, 0).toString());
        jtf_nombre_prove.setText(model.getValueAt(i, 1).toString());
        jtf_tel_prove.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jt_datos_proveMouseClicked

    private void jb_nuevo_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevo_proveActionPerformed
        jtf_id_prove.setEnabled(false);
        jtf_id_prove.setText("");
        jtf_nombre_prove.setText("");
        jtf_tel_prove.setText("");
        jb_nuevo_prove.setEnabled(false);
        jb_actualizar_prove.setEnabled(false);
        jb_borrar_prove.setEnabled(false);
        
    }//GEN-LAST:event_jb_nuevo_proveActionPerformed

    private void jb_actualizar_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_proveActionPerformed
        String update = ("UPDATE proveedores SET nombre_prov=?, numero_tel_prov=? WHERE ID_prov=?");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        try {
            pst = (PreparedStatement) con.prepareStatement(update);            
            pst.setString(1, jtf_nombre_prove.getText());
            pst.setString(2, jtf_tel_prove.getText());
            pst.setString(3, jtf_id_prove.getText());
            if (jtf_nombre_prove.getText().isEmpty() || jtf_tel_prove.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se actualizó el registro");
                jtf_id_prove.setText("");
                jtf_tel_prove.setText("");
                jtf_nombre_prove.setText("");
            }
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo actualizar");
        }
    }//GEN-LAST:event_jb_actualizar_proveActionPerformed

    private void jb_borrar_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrar_proveActionPerformed
        try {            
            int eliminar = JOptionPane.showConfirmDialog(null, "Quieres eliminar este registro?", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){  
                String delete = ("DELETE FROM proveedores WHERE id_prov=?");
                Mysql mysql = new Mysql();
                Connection con = mysql.getConnection();
                pst = (PreparedStatement) con.prepareStatement(delete);
                pst.setString(1, jtf_id_prove.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se eliminó el registro");
                
            } else {
                
            }           
        } catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }//GEN-LAST:event_jb_borrar_proveActionPerformed

    private void jb_guardar_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardar_proveActionPerformed
        String insert = ("INSERT INTO proveedores (nombre_prov, numero_tel_prov) VALUES (?,?);");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        
        try {
            pst = (PreparedStatement) con.prepareStatement(insert);
            pst.setString(1, jtf_nombre_prove.getText());
            pst.setString(2, jtf_tel_prove.getText());
            
            if (jtf_nombre_prove.getText().isEmpty() || jtf_tel_prove.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se insertó el registro");
                jtf_id_prove.setText("");
                jtf_nombre_prove.setText("");
                jtf_tel_prove.setText("");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");
        }
    }//GEN-LAST:event_jb_guardar_proveActionPerformed

    private void jb_cancelar_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_proveActionPerformed
        jtf_id_prove.setText("");
        jtf_nombre_prove.setText("");
        jtf_tel_prove.setText("");   
        jb_nuevo_prove.setEnabled(true);
        jb_actualizar_prove.setEnabled(true);
        jb_borrar_prove.setEnabled(true);
        jb_guardar_prove.setEnabled(true);
        
    }//GEN-LAST:event_jb_cancelar_proveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_actualizar_prove;
    private javax.swing.JButton jb_borrar_prove;
    private javax.swing.JButton jb_cancelar_prove;
    private javax.swing.JButton jb_guardar_prove;
    private javax.swing.JButton jb_nuevo_prove;
    private javax.swing.JLabel jl_id_prov;
    private javax.swing.JLabel jl_nombre_prove;
    private javax.swing.JLabel jl_tel_prove;
    private javax.swing.JPanel jp_button_prov;
    private javax.swing.JPanel jp_proveedores;
    private javax.swing.JTable jt_datos_prove;
    private javax.swing.JTextField jtf_id_prove;
    private javax.swing.JTextField jtf_nombre_prove;
    private javax.swing.JTextField jtf_tel_prove;
    // End of variables declaration//GEN-END:variables
}
