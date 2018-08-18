    import java.awt.event.KeyAdapter;
    import java.awt.event.KeyEvent;
    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.PreparedStatement;
    import javax.swing.JOptionPane;
    import javax.swing.JTextField;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
    
public class jp_productos extends javax.swing.JPanel {
    private Connection conexion;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public void Conectar() {
        try {
            Mysql mysql = new Mysql();
            Connection con = mysql.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from productos;");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error 000" + err.getMessage());
        }
    }
    
    public void llenarDatos() {
        try {
            this.jtf_codigo_produ.setText(rs.getString("codigo_produ"));
            this.jtf_nombre_produ.setText(rs.getString("nombre_produ"));
            this.jtf_precio_produ.setText(rs.getString("precio_produ"));
            this.jtf_existencia_produ.setText(rs.getString("existencia"));
            this.jtf_contenido_produ.setText(rs.getString("contenido"));            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001: " + ex.getMessage());
        }
    }
    DefaultTableModel model;
    public jp_productos() {
        initComponents();
        cargar();
        SLetras(jtf_nombre_produ);
        SNumeros(jtf_codigo_produ);
        SFloats(jtf_precio_produ);
        SFloats(jtf_contenido_produ);
        
        
    }
    
    void cargar(){
        String [] titulos={"Codigo","Nombre","Precio","Existencia", "Contenido"};
        String [] registros = new String[6];
        String sql ="SELECT * FROM productos";
        
        model = new DefaultTableModel(null, titulos);
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();                
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString("codigo_produ");
                registros[1]=rs.getString("nombre_produ");
                registros[2]=rs.getString("precio_produ");
                registros[3]=rs.getString("existencia");
                registros[4]=rs.getString("contenido");
                model.addRow(registros);
                
            }
            jt_datos_pro.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo importar la tabla");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_producto = new javax.swing.JPanel();
        jl_codigo_produ = new javax.swing.JLabel();
        jl_nombre_produ = new javax.swing.JLabel();
        jl_existencia_produ = new javax.swing.JLabel();
        jl_contenido_produ = new javax.swing.JLabel();
        jl_precio_produ = new javax.swing.JLabel();
        jtf_codigo_produ = new javax.swing.JTextField();
        jtf_nombre_produ = new javax.swing.JTextField();
        jtf_existencia_produ = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_datos_pro = new javax.swing.JTable();
        jtf_contenido_produ = new javax.swing.JTextField();
        jtf_precio_produ = new javax.swing.JTextField();
        jp_button_produ = new javax.swing.JPanel();
        jb_nuevo_produ = new javax.swing.JButton();
        jb_actualizar_produ = new javax.swing.JButton();
        jb_borrar_produ = new javax.swing.JButton();
        jb_guardar_produ = new javax.swing.JButton();
        jb_cancelar_produ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jp_producto.setBackground(new java.awt.Color(204, 102, 0));
        jp_producto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_codigo_produ.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_codigo_produ.setText("Código");
        jp_producto.add(jl_codigo_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 30));

        jl_nombre_produ.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_nombre_produ.setText("Nombre");
        jp_producto.add(jl_nombre_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        jl_existencia_produ.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_existencia_produ.setText("Existencia");
        jp_producto.add(jl_existencia_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 30));

        jl_contenido_produ.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_contenido_produ.setText("Contenido");
        jp_producto.add(jl_contenido_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 216, -1, 20));

        jl_precio_produ.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jl_precio_produ.setText("Precio");
        jp_producto.add(jl_precio_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 30));

        jtf_codigo_produ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_codigo_produKeyTyped(evt);
            }
        });
        jp_producto.add(jtf_codigo_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 98, -1));

        jtf_nombre_produ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombre_produKeyTyped(evt);
            }
        });
        jp_producto.add(jtf_nombre_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 98, -1));

        jtf_existencia_produ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_existencia_produKeyTyped(evt);
            }
        });
        jp_producto.add(jtf_existencia_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 98, -1));

        jt_datos_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_datos_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_datos_proMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_datos_pro);

        jp_producto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 100));
        jp_producto.add(jtf_contenido_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 98, -1));
        jp_producto.add(jtf_precio_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 98, -1));

        jp_button_produ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_nuevo_produ.setBackground(new java.awt.Color(153, 153, 153));
        jb_nuevo_produ.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_nuevo_produ.setForeground(new java.awt.Color(51, 51, 51));
        jb_nuevo_produ.setText("Nuevo");
        jb_nuevo_produ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_nuevo_produ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevo_produActionPerformed(evt);
            }
        });
        jp_button_produ.add(jb_nuevo_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jb_actualizar_produ.setBackground(new java.awt.Color(153, 153, 153));
        jb_actualizar_produ.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_actualizar_produ.setForeground(new java.awt.Color(51, 51, 51));
        jb_actualizar_produ.setText("Actualizar");
        jb_actualizar_produ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_actualizar_produ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizar_produActionPerformed(evt);
            }
        });
        jp_button_produ.add(jb_actualizar_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jb_borrar_produ.setBackground(new java.awt.Color(153, 153, 153));
        jb_borrar_produ.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_borrar_produ.setForeground(new java.awt.Color(51, 51, 51));
        jb_borrar_produ.setText("Borrar");
        jb_borrar_produ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_borrar_produ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_produActionPerformed(evt);
            }
        });
        jp_button_produ.add(jb_borrar_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jb_guardar_produ.setBackground(new java.awt.Color(153, 153, 153));
        jb_guardar_produ.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_guardar_produ.setForeground(new java.awt.Color(51, 51, 51));
        jb_guardar_produ.setText("Aceptar");
        jb_guardar_produ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_guardar_produ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardar_produActionPerformed(evt);
            }
        });
        jp_button_produ.add(jb_guardar_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jb_cancelar_produ.setBackground(new java.awt.Color(255, 0, 0));
        jb_cancelar_produ.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_cancelar_produ.setForeground(new java.awt.Color(51, 51, 51));
        jb_cancelar_produ.setText("Cancelar");
        jb_cancelar_produ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cancelar_produ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar_produActionPerformed(evt);
            }
        });
        jp_button_produ.add(jb_cancelar_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jp_button_produ.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 250, 90));

        jp_producto.add(jp_button_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 250, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_slider.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_producto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void SLetras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(!Character.isLetter(c)){
                   e.consume();
               }
           } 
        });
    }
    public void SNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(!Character.isDigit(c)){                                      
                   e.consume();                  
               }
           } 
        });
    }
    public void SFloats(JTextField a){
        a.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(Character.isDigit(c)){ 
                                   
               }else{
                   if(c == '.'){                                             
                   }else{
                       e.consume();
                   } 
               }
           } 
        });
    }
    private void jt_datos_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_datos_proMouseClicked
        int i = jt_datos_pro.getSelectedRow();
        TableModel model = jt_datos_pro.getModel();
        jtf_codigo_produ.setText(model.getValueAt(i, 0).toString());
        jtf_nombre_produ.setText(model.getValueAt(i, 1).toString());
        jtf_existencia_produ.setText(model.getValueAt(i, 2).toString());
        jtf_contenido_produ.setText(model.getValueAt(i, 3).toString());
        jtf_precio_produ.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_jt_datos_proMouseClicked

    private void jb_nuevo_produActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevo_produActionPerformed
        
        jtf_codigo_produ.setText("");
        jtf_nombre_produ.setText("");
        jtf_existencia_produ.setText("");
        jtf_contenido_produ.setText("");
        jb_nuevo_produ.setEnabled(false);
        jb_actualizar_produ.setEnabled(false);
        jb_borrar_produ.setEnabled(false);
        
    }//GEN-LAST:event_jb_nuevo_produActionPerformed

    private void jb_actualizar_produActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizar_produActionPerformed
        String update = ("UPDATE productos SET nombre_produ=?, precio_produ=?, existencia=?, contenido=? WHERE codigo_produ=?");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        try {
            pst = (PreparedStatement) con.prepareStatement(update);            
            pst.setString(1, jtf_nombre_produ.getText());
            pst.setString(2, jtf_precio_produ.getText());
            pst.setString(3, jtf_existencia_produ.getText());
            pst.setString(4, jtf_contenido_produ.getText());
            pst.setString(5, jtf_codigo_produ.getText());
            if (jtf_codigo_produ.getText().isEmpty() || jtf_nombre_produ.getText().isEmpty() || jtf_precio_produ.getText().isEmpty() || jtf_existencia_produ.getText().isEmpty() || jtf_contenido_produ.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se actualizó el registro");
                jtf_codigo_produ.setText("");
                jtf_nombre_produ.setText("");
                jtf_precio_produ.setText("");
                jtf_existencia_produ.setText("");
                jtf_contenido_produ.setText("");
            }
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo actualizar");
        }
    }//GEN-LAST:event_jb_actualizar_produActionPerformed

    private void jb_borrar_produActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrar_produActionPerformed
        try {            
            int eliminar = JOptionPane.showConfirmDialog(null, "Quieres eliminar este registro?", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){  
                String delete = ("DELETE FROM productos WHERE codigo_produ=?");
                Mysql mysql = new Mysql();
                Connection con = mysql.getConnection();
                pst = (PreparedStatement) con.prepareStatement(delete);
                pst.setString(1, jtf_codigo_produ.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se eliminó el registro");
                
            } else {
                
            }           
        } catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }//GEN-LAST:event_jb_borrar_produActionPerformed

    private void jb_guardar_produActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardar_produActionPerformed
        String insert = ("INSERT INTO productos (codigo_produ, nombre_produ, precio_produ, existencia, contenido) VALUES (?,?,?,?,?);");
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        
        try {
            pst = (PreparedStatement) con.prepareStatement(insert);
            pst.setString(1, jtf_codigo_produ.getText());
            pst.setString(2, jtf_nombre_produ.getText());
            pst.setString(3, jtf_precio_produ.getText());
            pst.setString(4, jtf_existencia_produ.getText());
            pst.setString(5, jtf_contenido_produ.getText());
            
            if (jtf_codigo_produ.getText().isEmpty() || jtf_nombre_produ.getText().isEmpty() || jtf_precio_produ.getText().isEmpty() || jtf_existencia_produ.getText().isEmpty() || jtf_contenido_produ.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");
            }else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se insertó el registro");
                jtf_codigo_produ.setText("");
                jtf_nombre_produ.setText("");
                jtf_existencia_produ.setText("");
                jtf_contenido_produ.setText("");
                jtf_precio_produ.setText("");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");
        }
    }//GEN-LAST:event_jb_guardar_produActionPerformed

    private void jb_cancelar_produActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar_produActionPerformed
        jtf_codigo_produ.setText("");
        jtf_nombre_produ.setText("");
        jtf_contenido_produ.setText("");
        jtf_existencia_produ.setText("");
        jtf_precio_produ.setText("");       
        jb_nuevo_produ.setEnabled(true);
        jb_actualizar_produ.setEnabled(true);
        jb_borrar_produ.setEnabled(true);
        jb_guardar_produ.setEnabled(true);
        
    }//GEN-LAST:event_jb_cancelar_produActionPerformed

    private void jtf_codigo_produKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_codigo_produKeyTyped
        int limit = 11;
        if(jtf_codigo_produ.getText().length()>= limit){            
            evt.consume();
        }
    }//GEN-LAST:event_jtf_codigo_produKeyTyped

    private void jtf_nombre_produKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombre_produKeyTyped
        int limit = 40;
        if(jtf_nombre_produ.getText().length()>= limit){            
            evt.consume();
        }
    }//GEN-LAST:event_jtf_nombre_produKeyTyped

    private void jtf_existencia_produKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_existencia_produKeyTyped
        int limit = 10;
        if(jtf_existencia_produ.getText().length()>= limit){            
            evt.consume();
        }
    }//GEN-LAST:event_jtf_existencia_produKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_actualizar_produ;
    private javax.swing.JButton jb_borrar_produ;
    private javax.swing.JButton jb_cancelar_produ;
    private javax.swing.JButton jb_guardar_produ;
    private javax.swing.JButton jb_nuevo_produ;
    private javax.swing.JLabel jl_codigo_produ;
    private javax.swing.JLabel jl_contenido_produ;
    private javax.swing.JLabel jl_existencia_produ;
    private javax.swing.JLabel jl_nombre_produ;
    private javax.swing.JLabel jl_precio_produ;
    private javax.swing.JPanel jp_button_produ;
    private javax.swing.JPanel jp_producto;
    private javax.swing.JTable jt_datos_pro;
    public javax.swing.JTextField jtf_codigo_produ;
    private javax.swing.JTextField jtf_contenido_produ;
    private javax.swing.JTextField jtf_existencia_produ;
    private javax.swing.JTextField jtf_nombre_produ;
    private javax.swing.JTextField jtf_precio_produ;
    // End of variables declaration//GEN-END:variables
}
