
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author AlphaCoders
 */
public class Welcome_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Stark_Industries_ADMIN
     */
    public Welcome_Screen() {
        initComponents();
        showDate();
        showTime();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        txtCon = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        btn_Remove = new javax.swing.JButton();
        btn_Details = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Record Insertion Form");

        jPanel2.setLayout(null);

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtName.setText("Name");
        jPanel2.add(txtName);
        txtName.setBounds(10, 70, 160, 30);

        txtname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtname);
        txtname.setBounds(190, 70, 250, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField3.setText("Location");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(10, 130, 160, 30);

        txtLocation.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtLocation);
        txtLocation.setBounds(190, 130, 250, 30);

        ds.setEditable(false);
        ds.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ds.setText("Date");
        jPanel2.add(ds);
        ds.setBounds(10, 200, 160, 30);

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtDate);
        txtDate.setBounds(190, 200, 250, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField4.setText("Time");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(10, 270, 160, 30);

        txtTime.setEditable(false);
        txtTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtTime);
        txtTime.setBounds(190, 270, 250, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField5.setText("Contact");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(10, 340, 160, 30);

        txtCon.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtCon);
        txtCon.setBounds(190, 340, 250, 30);

        btn_Add.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Add);
        btn_Add.setBounds(280, 420, 170, 40);

        btn_Remove.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_Remove.setText("Remove");
        btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Remove);
        btn_Remove.setBounds(510, 420, 160, 40);

        btn_Details.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_Details.setText("Details");
        btn_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DetailsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Details);
        btn_Details.setBounds(90, 420, 130, 40);

        btn_Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Clear.setText("CLEAR ");
        btn_Clear.setBorder(null);
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Clear);
        btn_Clear.setBounds(720, 420, 120, 40);

        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Exit.setText("EXIT");
        btn_Exit.setBorder(null);
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Exit);
        btn_Exit.setBounds(720, 480, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stark/industries/Background.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     Statement stmt = null;
     ResultSet rs = null;
     
     public static Connection getConnection(){
         Connection con=null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","stid");
         }
         catch (Exception ex){
             JOptionPane.showMessageDialog(null, "Connection Failure");
         }
         
         return con;
     }
    
    void showDate(){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM--dd");
         txtDate.setText(f.format(d));
    
    }
    
    void showTime(){
            new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm a");
         txtTime.setText(f.format(d));
            }
        }).start();
    }
    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
        // TODO add your handling code here:
        
       Record_Details obj = new Record_DEtails();
       obj.setVisible(true);
       Close();
    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String location = txtLocation.getText();
        String Date = txtDate.getText();
        String time = txtTime.getText();
        int cont = Integer.parseInt(txtCon.getText());
        
        
        try{
            Connection con = getConnection();
            stmt=con.createStatement();
            
            String command="insert into Customers values('"+name+"','"+location+"','"+Date+"','"+time+"','"+cont+"');";
            stmt.executeUpdate(command);
            JOptionPane.showMessageDialog(null, "New Entry Added");
            stmt.close();
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        finally{}
        
        txtname.setText("");
        txtLocation.setText("");
        txtDate.setText("");
        txtTime.setText("");
        txtCon.setText("");
        
        
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Opening Terminate Window...");
        Remove_Record tr = new Remove_Record();
        tr.setVisible(true);
        Close();
        
    }//GEN-LAST:event_btn_RemoveActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtLocation.setText("");
        txtCon.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Exiting Register...");
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    public void Close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
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
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Remove;
    private javax.swing.JTextField ds;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}