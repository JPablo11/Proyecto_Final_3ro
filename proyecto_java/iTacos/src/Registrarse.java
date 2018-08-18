
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registrarse extends javax.swing.JFrame {

    public Registrarse() {
        initComponents();
        this.setLocationRelativeTo(null);
        SUser(jtf_user_name);
        SUser(jpf_passwd_new);
        SUser(jpf_passwd_new_two);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_registrar = new javax.swing.JPanel();
        jl_passwd_new = new javax.swing.JLabel();
        jl_passwd_new_two = new javax.swing.JLabel();
        jtf_user_name = new javax.swing.JTextField();
        jb_register = new javax.swing.JButton();
        jb_back = new javax.swing.JButton();
        jl_user_name = new javax.swing.JLabel();
        jpf_passwd_new = new javax.swing.JPasswordField();
        jpf_passwd_new_two = new javax.swing.JPasswordField();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp_registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_passwd_new.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jl_passwd_new.setForeground(new java.awt.Color(255, 255, 255));
        jl_passwd_new.setText("Contraseña");
        jp_registrar.add(jl_passwd_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jl_passwd_new_two.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jl_passwd_new_two.setForeground(new java.awt.Color(255, 255, 255));
        jl_passwd_new_two.setText("Reingresar contraseña");
        jp_registrar.add(jl_passwd_new_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jtf_user_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_user_nameKeyTyped(evt);
            }
        });
        jp_registrar.add(jtf_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 79, 111, -1));

        jb_register.setBackground(new java.awt.Color(0, 255, 0));
        jb_register.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_register.setForeground(new java.awt.Color(255, 255, 255));
        jb_register.setText("Registrarse");
        jb_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registerActionPerformed(evt);
            }
        });
        jp_registrar.add(jb_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 110, 30));

        jb_back.setBackground(new java.awt.Color(255, 0, 0));
        jb_back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jb_back.setForeground(new java.awt.Color(255, 255, 255));
        jb_back.setText("Regresar");
        jb_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_backActionPerformed(evt);
            }
        });
        jp_registrar.add(jb_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, 30));

        jl_user_name.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jl_user_name.setForeground(new java.awt.Color(255, 255, 255));
        jl_user_name.setText("Nombre de Usuario");
        jp_registrar.add(jl_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        jp_registrar.add(jpf_passwd_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 111, -1));
        jp_registrar.add(jpf_passwd_new_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 111, -1));

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
        jp_registrar.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 29, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_registrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void SUser(JTextField a){
        a.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(Character.isLetter(c) || Character.isDigit(c)){
               }else{
                   e.consume();
               }
           } 
        });
    }
    
    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_backActionPerformed

    private void jb_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registerActionPerformed
        Mysql mysql = new Mysql();
        Connection con = mysql.getConnection();
        PreparedStatement ps = null;
        String sql = ("INSERT INTO usuarios(nombre_usuario, passwd) values (?,?);");
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, jtf_user_name.getText());
            ps.setString(2, jpf_passwd_new.getText());           
            if(jtf_user_name.getText().isEmpty() || jpf_passwd_new.getText().isEmpty() || jpf_passwd_new_two.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Los campos no deben quedar vacíos");          
            }else{
                if(Arrays.equals(jpf_passwd_new_two.getPassword(), jpf_passwd_new.getPassword())){
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Usuario Registrado.");
                    Login log = new Login();
                    log.setVisible(true);
                    this.dispose();
                    jtf_user_name.setText(null);
                    jpf_passwd_new.setText(null);
                    jpf_passwd_new_two.setText(null);
                }else {
                    JOptionPane.showMessageDialog(null, "No coinciden las contraseñas");
                } 
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");
        }
    }//GEN-LAST:event_jb_registerActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);
            if(eliminar == 0){
                System.exit(0);
            }else{
                
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jtf_user_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_user_nameKeyTyped
        
    }//GEN-LAST:event_jtf_user_nameKeyTyped

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_register;
    private javax.swing.JLabel jl_passwd_new;
    private javax.swing.JLabel jl_passwd_new_two;
    private javax.swing.JLabel jl_user_name;
    private javax.swing.JPanel jp_registrar;
    private javax.swing.JPasswordField jpf_passwd_new;
    private javax.swing.JPasswordField jpf_passwd_new_two;
    private javax.swing.JTextField jtf_user_name;
    // End of variables declaration//GEN-END:variables
}
