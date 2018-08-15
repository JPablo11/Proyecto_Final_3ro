
    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.PreparedStatement;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
    
public class jp_empleados extends javax.swing.JPanel {
    private Connection conexion;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public void Conectar() {
        try {
            Mysql mysql = new Mysql();
            Connection con = mysql.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from empleados;");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error 000" + err.getMessage());
        }
    }
    
    public void llenarDatos() {
        try {
            this.jtf_id_emp.setText(rs.getString("ID_emp"));
            this.jtf_nombre_emp.setText(rs.getString("nombre_emp"));
            this.jtf_ape_pat_emp.setText(rs.getString("ape_pat_emp"));
            this.jtf_ape_mat_emp.setText(rs.getString("ape_mat_emp"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001: " + ex.getMessage());
        }
    }
    DefaultTableModel model;
    public jp_empleados() {
        initComponents();
        cargar();
    }
    void cargar(){
        String [] titulos={"ID","Nombre","Apellido Paterno","Apellido Materno"};
        String [] registros = new String[5];
        String sql ="SELECT * FROM empleados";
        
        model = new DefaultTableModel(null, titulos);
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();                
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString("ID_emp");
                registros[1]=rs.getString("nombre_emp");
                registros[2]=rs.getString("ape_pat_emp");
                registros[3]=rs.getString("ape_mat_emp");
                model.addRow(registros);
                
            }
            jt_datos_emp.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo importar la tabla");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_empleados = new javax.swing.JPanel();
        jl_nombre_emp = new javax.swing.JLabel();
        jl_ape_pat_emp = new javax.swing.JLabel();
        jl_ape_mat_emp = new javax.swing.JLabel();
        jtf_nombre_emp = new javax.swing.JTextField();
        jtf_ape_pat_emp = new javax.swing.JTextField();
        jl_id_emp = new javax.swing.JLabel();
        jtf_id_emp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_datos_emp = new javax.swing.JTable();
        jtf_ape_mat_emp = new javax.swing.JTextField();
        jp_button_emp = new javax.swing.JPanel();
        jb_nuevo_emp = new javax.swing.JButton();
        jb_actualizar_emp = new javax.swing.JButton();
        jb_borrar_emp = new javax.swing.JButton();
        jb_guardar_emp = new javax.swing.JButton();
        jb_cancelar_emp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jp_empleados.setBackground(new java.awt.Color(255, 102, 102));
        jp_empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nombre_emp.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_nombre_emp.setText("Nombre");
        jp_empleados.add(jl_nombre_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        jl_ape_pat_emp.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_ape_pat_emp.setText("Apellido Paterno");
        jp_empleados.add(jl_ape_pat_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 30));

        jl_ape_mat_emp.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_ape_mat_emp.setText("Apellido Materno");
        jp_empleados.add(jl_ape_mat_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 30));
        jp_empleados.add(jtf_nombre_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 111, -1));
        jp_empleados.add(jtf_ape_pat_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 111, -1));

        jl_id_emp.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_id_emp.setText("ID del Empleado");
        jp_empleados.add(jl_id_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 30));
        jp_empleados.add(jtf_id_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 110, -1));

        jt_datos_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_datos_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_datos_empMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_datos_emp);

        jp_empleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 100));
        jp_empleados.add(jtf_ape_mat_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 111, -1));

        jp_button_emp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_nuevo_emp.setBackground(new java.awt.Color(153, 153, 153));
        jb_nuevo_emp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_nuevo_emp.setForeground(new java.awt.Color(51, 51, 51));
        jb_nuevo_emp.setText("Nuevo");
        jb_nuevo_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_nuevo_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevo_empActionPerformed(evt);
            }
        });
        jp_button_emp.add(jb_nuevo_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jb_actualizar_emp.setBackground(new java.awt.Color(153, 153, 153));
        jb_actualizar_emp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_actualizar_emp.setForeground(new java.awt.Color(51, 51, 51));
        jb_actualizar_emp.setText("Actualizar");
        jb_actualizar_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_actualizar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_empActionPerformed(evt);
            }
        });
        jp_button_emp.add(jb_actualizar_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jb_borrar_emp.setBackground(new java.awt.Color(153, 153, 153));
        jb_borrar_emp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_borrar_emp.setForeground(new java.awt.Color(51, 51, 51));
        jb_borrar_emp.setText("Borrar");
        jb_borrar_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_borrar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_empActionPerformed(evt);
            }
        });
        jp_button_emp.add(jb_borrar_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jb_guardar_emp.setBackground(new java.awt.Color(153, 153, 153));
        jb_guardar_emp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_guardar_emp.setForeground(new java.awt.Color(51, 51, 51));
        jb_guardar_emp.setText("Guardar");
        jb_guardar_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_guardar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardar_empActionPerformed(evt);
            }
        });
        jp_button_emp.add(jb_guardar_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jb_cancelar_emp.setBackground(new java.awt.Color(255, 0, 0));
        jb_cancelar_emp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_cancelar_emp.setForeground(new java.awt.Color(51, 51, 51));
        jb_cancelar_emp.setText("Cancelar");
        jb_cancelar_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cancelar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_empActionPerformed(evt);
            }
        });
        jp_button_emp.add(jb_cancelar_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jp_button_emp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 90));

        jp_empleados.add(jp_button_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 250, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_slider.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_empleados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_nuevo_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevo_empActionPerformed
        
        jtf_id_emp.setEnabled(false);
        jtf_id_emp.setText("");
        jtf_nombre_emp.setText("");
        jtf_ape_pat_emp.setText("");
        jtf_ape_mat_emp.setText("");
        jb_nuevo_emp.setEnabled(false);
        jb_actualizar_emp.setEnabled(false);
        jb_borrar_emp.setEnabled(false);
        
    }//GEN-LAST:event_jb_nuevo_empActionPerformed

    private void jb_guardar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardar_empActionPerformed

        String insert = ("INSERT INTO empleados (nombre_emp, ape_pat_emp, ape_mat_emp) VALUES (?,?,?);");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        
        try {
            pst = (PreparedStatement) con.prepareStatement(insert); 
            pst.setString(1, jtf_nombre_emp.getText());
            pst.setString(2, jtf_ape_pat_emp.getText());
            pst.setString(3, jtf_ape_mat_emp.getText());
            if (jtf_nombre_emp.getText().isEmpty() || jtf_ape_pat_emp.getText().isEmpty() || jtf_ape_mat_emp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se insertó el registro");
                jtf_id_emp.setText("");
                jtf_nombre_emp.setText("");
                jtf_ape_pat_emp.setText("");
                jtf_ape_mat_emp.setText("");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");
        }
    }//GEN-LAST:event_jb_guardar_empActionPerformed

    private void jb_actualizar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_empActionPerformed
       
        String update = ("UPDATE empleados SET nombre_emp=?, ape_pat_emp=?, ape_mat_emp=? WHERE ID_emp=?");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        try {
            pst = (PreparedStatement) con.prepareStatement(update);
            pst.setString(1, jtf_nombre_emp.getText());
            pst.setString(2, jtf_ape_pat_emp.getText());
            pst.setString(3, jtf_ape_mat_emp.getText());
            pst.setString(4, jtf_id_emp.getText());
            if(jtf_nombre_emp.getText().isEmpty() || jtf_ape_pat_emp.getText().isEmpty() || jtf_ape_mat_emp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se actualizó el registro");
                jtf_id_emp.setText("");
                jtf_nombre_emp.setText("");
                jtf_ape_pat_emp.setText("");
                jtf_ape_mat_emp.setText("");
            }
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo actualizar");
        }
        
    }//GEN-LAST:event_jb_actualizar_empActionPerformed

    private void jb_borrar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrar_empActionPerformed
         
        try {            
            int eliminar = JOptionPane.showConfirmDialog(null, "Quieres eliminar este registro?", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){  
                String delete = ("DELETE FROM empleados WHERE ID_emp=?");
                Mysql mysql = new Mysql();
                Connection con = mysql.getConnection();
                pst = (PreparedStatement) con.prepareStatement(delete);
                pst.setString(1, jtf_id_emp.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se eliminó el registro");
                
            } else {
                
            }           
        } catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }//GEN-LAST:event_jb_borrar_empActionPerformed

    private void jb_cancelar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_empActionPerformed
        jtf_id_emp.setText("");
        jtf_nombre_emp.setText("");
        jtf_ape_pat_emp.setText("");
        jtf_ape_mat_emp.setText("");       
        jb_nuevo_emp.setEnabled(true);
        jb_actualizar_emp.setEnabled(true);
        jb_borrar_emp.setEnabled(true);
        jb_guardar_emp.setEnabled(true);
        
    }//GEN-LAST:event_jb_cancelar_empActionPerformed

    private void jt_datos_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_datos_empMouseClicked
        int i = jt_datos_emp.getSelectedRow();
        TableModel model = jt_datos_emp.getModel();
        jtf_id_emp.setText(model.getValueAt(i, 0).toString());
        jtf_nombre_emp.setText(model.getValueAt(i, 1).toString());
        jtf_ape_pat_emp.setText(model.getValueAt(i, 2).toString());
        jtf_ape_mat_emp.setText(model.getValueAt(i, 3).toString());
        
        
    }//GEN-LAST:event_jt_datos_empMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_actualizar_emp;
    private javax.swing.JButton jb_borrar_emp;
    private javax.swing.JButton jb_cancelar_emp;
    private javax.swing.JButton jb_guardar_emp;
    private javax.swing.JButton jb_nuevo_emp;
    private javax.swing.JLabel jl_ape_mat_emp;
    private javax.swing.JLabel jl_ape_pat_emp;
    private javax.swing.JLabel jl_id_emp;
    private javax.swing.JLabel jl_nombre_emp;
    private javax.swing.JPanel jp_button_emp;
    private javax.swing.JPanel jp_empleados;
    private javax.swing.JTable jt_datos_emp;
    private javax.swing.JTextField jtf_ape_mat_emp;
    private javax.swing.JTextField jtf_ape_pat_emp;
    private javax.swing.JTextField jtf_id_emp;
    private javax.swing.JTextField jtf_nombre_emp;
    // End of variables declaration//GEN-END:variables
}
