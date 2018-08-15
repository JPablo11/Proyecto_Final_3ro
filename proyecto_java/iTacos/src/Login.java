
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Mysql mysql = new Mysql();
    Connection con = mysql.getConnection();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_login = new javax.swing.JPanel();
        jtf_user_name = new javax.swing.JTextField();
        jb_login = new javax.swing.JButton();
        jb_registrarse = new javax.swing.JButton();
        jl_nombre_log = new javax.swing.JLabel();
        jl_passwd = new javax.swing.JLabel();
        jpf_passwd = new javax.swing.JPasswordField();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp_login.add(jtf_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 138, -1));

        jb_login.setBackground(new java.awt.Color(0, 204, 0));
        jb_login.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jb_login.setText("Iniciar Sesión");
        jb_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_loginActionPerformed(evt);
            }
        });
        jp_login.add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jb_registrarse.setBackground(new java.awt.Color(102, 102, 255));
        jb_registrarse.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jb_registrarse.setText("Registrarse");
        jb_registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarseActionPerformed(evt);
            }
        });
        jp_login.add(jb_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jl_nombre_log.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jl_nombre_log.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre_log.setText("Nombre de Usuario");
        jp_login.add(jl_nombre_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jl_passwd.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jl_passwd.setForeground(new java.awt.Color(255, 255, 255));
        jl_passwd.setText("Contraseña");
        jp_login.add(jl_passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        jp_login.add(jpf_passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 138, -1));

        jButton13.setBackground(new java.awt.Color(255, 0, 0));
        jButton13.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("X");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 102, 255), new java.awt.Color(153, 0, 153)));
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jp_login.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 29, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_top_img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jp_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_loginActionPerformed
        
        String user = jtf_user_name.getText();
        String pass = jpf_passwd.getText();
        if(pass.isEmpty() && user.isEmpty()){
            JOptionPane.showMessageDialog(null, "No se pueden dejar campos vacíos");
        }else {
        int conta=0;
        try{
            String sql = "SELECT * FROM usuarios";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt(1);
                String usuario = rs.getString(2);
                String contra = rs.getString(3);
                if(user.equals(usuario) && pass.equals(contra)){
                    JOptionPane.showMessageDialog(null, "Bienvenido: " +user );
                    Interface inf = new Interface();
                    inf.setVisible(true);
                    this.dispose();
                }else{
                    conta++;
                }     
            }
            if (conta >= 100){
                JOptionPane.showMessageDialog(this, "Administrador y/o contraseña incorrectas");
            }
            
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error al iniciar");
        }
    }//GEN-LAST:event_jb_loginActionPerformed
    }
    private void jb_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarseActionPerformed
        Registrarse rgs = new Registrarse();
        rgs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_registrarseActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_registrarse;
    private javax.swing.JLabel jl_nombre_log;
    private javax.swing.JLabel jl_passwd;
    private javax.swing.JPanel jp_login;
    private javax.swing.JPasswordField jpf_passwd;
    private javax.swing.JTextField jtf_user_name;
    // End of variables declaration//GEN-END:variables



}
