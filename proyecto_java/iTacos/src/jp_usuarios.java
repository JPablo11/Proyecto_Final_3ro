    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.PreparedStatement;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
    
public class jp_usuarios extends javax.swing.JPanel {
    private Connection conexion;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    public void Conectar() {
        try {
            Mysql mysql = new Mysql();
            Connection con = mysql.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from usuarios;");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error 000" + err.getMessage());
        }
    }
    
    public void llenarDatos() {
        try {
            this.jtf_id_user.setText(rs.getString("ID_usuario"));
            this.jtf_user_name.setText(rs.getString("nombre_usuario"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001: " + ex.getMessage());
        }
    }
    DefaultTableModel model;
    public jp_usuarios() {
        initComponents();
        cargar();
    }

    void cargar(){
        String [] titulos={"ID","Nombre"};
        String [] registros = new String[3];
        String sql ="SELECT * FROM usuarios";
        
        model = new DefaultTableModel(null, titulos);
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();                
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString("ID_usuario");
                registros[1]=rs.getString("nombre_usuario");
                model.addRow(registros);
                
            }
            jt_datos_usr.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo importar la tabla");
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jp_usuarios = new javax.swing.JPanel();
        jl_id_user = new javax.swing.JLabel();
        jtf_id_user = new javax.swing.JTextField();
        jl_user_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_datos_usr = new javax.swing.JTable();
        jtf_user_name = new javax.swing.JTextField();
        jp_button_prov = new javax.swing.JPanel();
        jb_actualizar_user = new javax.swing.JButton();
        jb_borrar_user = new javax.swing.JButton();
        jb_cancelar_user = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jp_usuarios.setBackground(new java.awt.Color(0, 102, 102));
        jp_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_id_user.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_id_user.setText("ID del Usuario");
        jp_usuarios.add(jl_id_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 144, -1, 30));
        jp_usuarios.add(jtf_id_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 150, 90, -1));

        jl_user_name.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_user_name.setText("Nombre de Usuario:");
        jp_usuarios.add(jl_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 20));

        jt_datos_usr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_datos_usr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_datos_usrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_datos_usr);

        jp_usuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 100));
        jp_usuarios.add(jtf_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 87, -1));

        jp_button_prov.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_actualizar_user.setBackground(new java.awt.Color(153, 153, 153));
        jb_actualizar_user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_actualizar_user.setForeground(new java.awt.Color(51, 51, 51));
        jb_actualizar_user.setText("Actualizar");
        jb_actualizar_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_actualizar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_userActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_actualizar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jb_borrar_user.setBackground(new java.awt.Color(153, 153, 153));
        jb_borrar_user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_borrar_user.setForeground(new java.awt.Color(51, 51, 51));
        jb_borrar_user.setText("Borrar");
        jb_borrar_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_borrar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_userActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_borrar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 90, -1));

        jb_cancelar_user.setBackground(new java.awt.Color(255, 0, 0));
        jb_cancelar_user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_cancelar_user.setForeground(new java.awt.Color(51, 51, 51));
        jb_cancelar_user.setText("Cancelar");
        jb_cancelar_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cancelar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_userActionPerformed(evt);
            }
        });
        jp_button_prov.add(jb_cancelar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jp_button_prov.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 290, 110));

        jp_usuarios.add(jp_button_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 250, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_slider.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_usuarios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_datos_usrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_datos_usrMouseClicked
        int i = jt_datos_usr.getSelectedRow();
        TableModel model = jt_datos_usr.getModel();
        jtf_id_user.setText(model.getValueAt(i, 0).toString());
        jtf_user_name.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_jt_datos_usrMouseClicked

    private void jb_actualizar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_userActionPerformed
        String update = ("UPDATE usuarios SET nombre_usuario=? WHERE ID_usuario=?");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        try {
            pst = (PreparedStatement) con.prepareStatement(update);            
            pst.setString(1, jtf_user_name.getText());
            pst.setString(2, jtf_id_user.getText());
            if (jtf_user_name.getText().isEmpty() || jtf_id_user.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se actualizó el registro");
                jtf_id_user.setText("");
                jtf_user_name.setText("");
            }
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo actualizar");
        }
    }//GEN-LAST:event_jb_actualizar_userActionPerformed

    private void jb_borrar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrar_userActionPerformed
        
        try { 
            String id = this.jtf_id_user.getText();
            int eliminar = JOptionPane.showConfirmDialog(null, "Quieres eliminar este registro?", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){  
                String delete = ("DELETE FROM usuarios WHERE ID_usuario=?");
                Mysql mysql = new Mysql();
                Connection con = mysql.getConnection();
                if("1".equals(id)){
                    JOptionPane.showMessageDialog(null, "No se puede eliminar el registro");
                }else{                                   
                    pst = (PreparedStatement) con.prepareStatement(delete);
                    pst.setString(1, jtf_id_user.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se eliminó el registro");
                }
            } else {
                
            }           
        } catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }//GEN-LAST:event_jb_borrar_userActionPerformed

    private void jb_cancelar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_userActionPerformed
        jtf_id_user.setText("");
        jtf_user_name.setText("");  
        jb_actualizar_user.setEnabled(true);
        jb_borrar_user.setEnabled(true);
    }//GEN-LAST:event_jb_cancelar_userActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_actualizar_user;
    private javax.swing.JButton jb_borrar_user;
    private javax.swing.JButton jb_cancelar_user;
    private javax.swing.JLabel jl_id_user;
    private javax.swing.JLabel jl_user_name;
    private javax.swing.JPanel jp_button_prov;
    private javax.swing.JPanel jp_usuarios;
    private javax.swing.JTable jt_datos_usr;
    public javax.swing.JTextField jtf_id_user;
    private javax.swing.JTextField jtf_user_name;
    // End of variables declaration//GEN-END:variables
}
