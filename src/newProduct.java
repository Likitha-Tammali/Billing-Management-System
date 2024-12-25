import java.awt.Color;
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.*;

public class newProduct extends javax.swing.JFrame {

    public newProduct() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Product ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new product.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 40, 66, -1));

        jLabel3.setText("PRODUCT ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 137, 106, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("100");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 137, 51, -1));

        jLabel5.setText("PRODUCT NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 196, 157, -1));

        jLabel6.setText("RATE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 252, 157, -1));

        jLabel7.setText("DESCRIPTION");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 301, 157, -1));

        jLabel8.setText("ACTIVATE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 344, 157, -1));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("ENTER PRODUCT NAME");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 193, 187, -1));

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("ENTER RATE");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 249, 187, -1));

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("ENTER DESCRIPTION");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 298, 187, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 403, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 403, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 403, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 106, 482, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 165, 482, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 381, 482, 10));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 341, 187, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("ENTER PRODUCT NAME"))
        {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        }

    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText().equals(""))
        {
            jTextField1.setText("ENTER PRODUCT NAME");
            jTextField1.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if(jTextField2.getText().equals("ENTER RATE"))
        {
            jTextField2.setText("");
            jTextField2.setForeground(new Color(0,0,0));
        }

    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        if(jTextField2.getText().equals(""))
        {
            jTextField2.setText("ENTER RATE");
            jTextField2.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        if(jTextField3.getText().equals("ENTER DESCRIPTION"))
        {
            jTextField3.setText("");
            jTextField3.setForeground(new Color(0,0,0));
        }

    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        if(jTextField3.getText().equals(""))
        {
            jTextField3.setText("ENTER DESCRIPTION");
            jTextField3.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_jTextField3FocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(pId) from product");
            
            if(rs.next())
            {
                int id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                jLabel4.setText(str);
            }
            else
                jLabel4.setText("1");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pId=jLabel4.getText();
        String pName=jTextField1.getText();
        String rate=jTextField2.getText();
        String description=jTextField3.getText();
        String activate=(String)jComboBox1.getSelectedItem();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into product values('"+pId+"','"+pName+"','"+rate+"','"+description+"','"+activate+"')");
            JOptionPane.showMessageDialog(null,"update success");
            setVisible(false);
            new newProduct().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new newProduct().setVisible(true);
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
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
