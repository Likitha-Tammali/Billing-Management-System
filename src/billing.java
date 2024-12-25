import Project.ConnectionProvider;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.awt.print.*;
public class billing extends javax.swing.JFrame {
    public int finalTotal=0;

    
    public billing() {
        initComponents();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel5.setText(dFormat.format(date));
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        jLabel6.setText(dtf.format(now));
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 6, 300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 19, 98, 75));

        jLabel3.setText("DATE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 21, 37, -1));

        jLabel4.setText("TIME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 55, 37, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 21, 62, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 55, 51, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 122, 1109, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("BUYER DETAILS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 138, -1, -1));

        jLabel8.setText("NAME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 179, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 176, 140, -1));

        jLabel9.setText("CONTACT NO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 179, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 176, 140, -1));

        jLabel10.setText("EMAIL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 179, 43, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 176, 140, -1));

        jLabel11.setText("ADDRESS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 179, 65, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 176, 161, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 210, 1109, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("PRODUCT DETAILS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 225, -1, -1));

        jLabel13.setText("PRODUCT ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 103, -1));

        jLabel14.setText("PRODUCT NAME");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 110, -1));

        jLabel15.setText("RATE");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 37, 20));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 74, -1));

        jLabel16.setText("QUANTITY");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 90, -1));

        jLabel17.setText("DESCRIPTION");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, 20));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 189, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 292, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 325, 1082, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESCRIPTION", "RATE", "QUANTITY", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 341, 563, 159));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("CALCULATION DETAILS:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 341, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("TOTAL");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 380, 43, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("PAID AMOUNT");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 427, 90, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("RETURN AMOUNT");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 481, -1, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 377, 187, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 424, 187, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 478, 187, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 375, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 422, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton4.setText("CLOSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 476, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing background.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
        String paidAmount=jTextField11.getText();
        int z=Integer.parseInt(paidAmount);
        finalTotal=z-finalTotal;
        String finalTotal1=String.valueOf(finalTotal);
        jTextField12.setText(finalTotal1);
        jTextField12.setEditable(false);
        
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where name like '"+name+"%'");
            if(rs.next())
            {
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                
              
                
            }
            else
            {
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                
            }
                
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String contactNo=jTextField2.getText();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where contactNo like '"+contactNo+"% '");
            if(rs.next())
            {
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
  
            }
            else
            {
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                
            }
                
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String pid=jTextField5.getText();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from product where pId='"+pid+"'");
            if(rs.next())
            {
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
  
            }
            else
            {
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                
                
            }
                
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int price=Integer.parseInt(jTextField7.getText());
        int quantity=Integer.parseInt(jTextField8.getText());
        int total=price*quantity;
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{jTextField6.getText(),jTextField9.getText(),price,quantity,total});
        finalTotal=finalTotal+total;
        String finalTotal1=String.valueOf(finalTotal);
        jTextField10.setText(finalTotal1);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       String name = jTextField1.getText();
String contactNo = jTextField2.getText();
String email = jTextField3.getText();
String address = jTextField4.getText();
String path = "C:\\Users\\Likitha\\Bills";

File directory = new File(path);
if (!directory.exists()) {
    directory.mkdirs();
}

String fileName = path + "\\" + name.replaceAll("[^a-zA-Z0-9 ]", "") + "_" + jLabel5.getText().replaceAll("[^a-zA-Z0-9 ]", "") + ".pdf";
com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

try {
    PdfWriter.getInstance(doc, new FileOutputStream(fileName));
    doc.open();

    Paragraph paragraph1 = new Paragraph("             BTech Days(Billing Management System)\n                Contact Number:(+91)7201059632\n\n");
    doc.add(paragraph1);

    Paragraph paragraph2 = new Paragraph("Date & Time: " + jLabel5.getText() + " " + jLabel6.getText() +
            "\nBuyer Details:\nName: " + name + "\nContact No: " + contactNo +
            "\nEmail: " + email + "\nAddress: " + address + "\n\n");
    doc.add(paragraph2);

    PdfPTable tb1 = new PdfPTable(5);
    tb1.addCell("Name");
    tb1.addCell("Description");
    tb1.addCell("Rate");
    tb1.addCell("Quantity");
    tb1.addCell("Subtotal");

    for (int i = 0; i < jTable1.getRowCount(); i++) {
        String n = jTable1.getValueAt(i, 0) != null ? jTable1.getValueAt(i, 0).toString() : "";
        String d = jTable1.getValueAt(i, 1) != null ? jTable1.getValueAt(i, 1).toString() : "";
        String r = jTable1.getValueAt(i, 2) != null ? jTable1.getValueAt(i, 2).toString() : "";
        String q = jTable1.getValueAt(i, 3) != null ? jTable1.getValueAt(i, 3).toString() : "";
        String s = jTable1.getValueAt(i, 4) != null ? jTable1.getValueAt(i, 4).toString() : "";
        tb1.addCell(n);
        tb1.addCell(d);
        tb1.addCell(r);
        tb1.addCell(q);
        tb1.addCell(s);
    }
    doc.add(tb1);

    Paragraph paragraph3 = new Paragraph("\nTotal: " + jTextField10.getText() +
            "\nPaid Amount: " + jTextField11.getText() +
            "\nReturn Amount: " + jTextField12.getText() +
            "\n\nThank you for visiting!");
    doc.add(paragraph3);

    JOptionPane.showMessageDialog(null, "Bill Generated");
    setVisible(true);
    new billing().setVisible(true);

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, e.getMessage());
} finally {
    if (doc.isOpen()) {
        doc.close();
    }
}

        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
