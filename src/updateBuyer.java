import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.*;
public class updateBuyer extends javax.swing.JFrame {

    
    public updateBuyer() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 180));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update buyer ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 269, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update buyer.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 81, -1));

        jLabel3.setText("CONTACT NO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 105, 17));

        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 101, -1));

        jLabel5.setText("CONTACT NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 101, -1));

        jLabel6.setText("EMAIL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 101, -1));

        jLabel7.setText("ADDRESS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 101, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 171, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 171, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 171, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 171, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 171, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton4.setText("CLOSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 555, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 555, 10));

        jLabel9.setText("GENDER");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 172, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 555, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateBuyer().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String contactNo=jTextField1.getText();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where contactNo='"+contactNo+"'");
            if(rs.next())
            {
                jTextField2.setText(rs.getString(1));
                jTextField3.setText(rs.getString(2));
                jTextField4.setText(rs.getString(3));
                jTextField5.setText(rs.getString(4));
                jTextField6.setText(rs.getString(5));
                jTextField1.setEditable(false);
                
            }
            else
                JOptionPane.showMessageDialog(null,"NO SUCH CONTACT ");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String contactNo1=jTextField1.getText();
        String name=jTextField2.getText();
        String contactNo=jTextField3.getText();
        String email=jTextField4.getText();
        String address=jTextField5.getText();
        String gender=jTextField6.getText();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update buyer set name='"+name+"',contactNo='"+contactNo+"',email='"+email+"',address='"+address+"',gender='"+gender+"' where contactNo='"+contactNo1+"'");
            JOptionPane.showMessageDialog(null,"update success");
            setVisible(false);
            new updateBuyer().setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
      
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
