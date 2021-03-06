
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbookair
 */
class Patient{
    String name;
    int age;
    String DOReporting;
    Date Report;
    String Recover;
    Date recover;
    Patient(String name , int age, String DOReporting) throws ParseException{
        this.name = name ;
        this.age= age;
        this.DOReporting = DOReporting;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Report = sdf.parse(DOReporting);
        Calendar cal = Calendar.getInstance();
        cal.setTime(Report);
        cal.add(Calendar.DAY_OF_MONTH, 21);
        Recover = sdf.format(cal.getTime());
        recover = sdf.parse(Recover);
    }
}
public class covid19 extends javax.swing.JFrame {

    /**
     * Creates new form covid19
     */
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public covid19() {
        initComponents();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter Date");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 190));

        jLabel2.setText("Select Tower");

        jCheckBox1.setText("A");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("B");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("C");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("D");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 710, 400));

        jLabel3.setText("Results");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code 
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
            String start =  "TOWER " + "NAME   " + "          " + "AGE" + "         " + "STATUS   " + "         " + "Reporting Date" + "    " + "Recovery Date";
              jTextArea1.append(start+"\n");
              
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String theDate = dateFormat.format(jDateChooser1.getDate());
            Date TheDate = null;
        try {
            TheDate = sdf.parse(theDate);
        } catch (ParseException ex) {
            Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(!jCheckBox4.isSelected() && !jCheckBox3.isSelected() && !jCheckBox2.isSelected() && !jCheckBox1.isSelected()){
            String warning = "Please Select a Checkbox";
            jLabel3.setText(warning + "\n");
        }
            
            
            if(jCheckBox4.isSelected()){
                String[] name4 = {"Hazel   ", "Kevim   " , "Tom     " , "Mary    " , "Johnson " , "Edith   " , "John    "};
                int[] age4 = {87 , 37 , 67 , 17 , 10 , 42 , 95};
                String[] date4 = {"23/06/2020" , "05/06/2020" , "20/06/2020" , "21/06/2020" , "01/08/2020" , "07/06/2020" , "01/06/2020"};
                Patient tower4[] = new Patient[7];
                try {
                    tower4[0]=new Patient("Hazel",87,"23/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower4[1]=new Patient("Kevim",37,"05/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower4[2]=new Patient("Tom",67,"20/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower4[3]=new Patient("Mary",17,"21/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower4[4]=new Patient("Johnson",10,"01/08/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower4[5]=new Patient("Edith",42,"07/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower4[6]=new Patient("John",95,"01/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                String status4 = "";
                int active4 = 0 ;
                int recovered4 = 0;
                for(int i = 0 ; i <  7; i++){
                    String result4 = "";
                    if((tower4[i].recover.getTime() - TheDate.getTime())<0){
                        status4 = "Recovered";
                        recovered4++;
                    }
                    else{
                        status4 = "Active   ";
                        active4++;
                    }
                    
                    //jTable2.insert(jTable2.getRowCount(),new Object[]{name[i],age[i],status,date[i]});
                    
                    String strage4 = Integer.toString(age4[i]);
                    
                    result4 = "D       " + name4[i] + "          " + strage4 + "         " + status4 + "          " + date4[i] + "         "+ tower4[i].Recover;
                    jTextArea1.append(result4 + "\n");
                }
                jTextArea1.append("Active Cases for Tower D = " + active4 + "\n");
                        jTextArea1.append("Recovered Cases for Tower D = " + recovered4 + "\n");
                                        
            }
                
                
            
            if(jCheckBox3.isSelected()){
                jTextArea1.append(start + "\n" );
                String[] name3 = {"Jim     " , "Rachel  " , "Thomas  " };
                int[] age3 = { 42 , 48 , 21 };
                String[] date3 = {"18/05/2020" , "24/07/2020" , "11/06/2020"};
                Patient tower3[] = new Patient[3];
                try {
                    tower3[0]=new Patient("Jim",42,"18/05/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower3[1]=new Patient("Rachel",48,"23/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tower3[2]=new Patient("Thomas",21,"11/06/2020");
                } catch (ParseException ex) {
                    Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                String status3 = "";
                    int active3 = 0 ;
                    int recovered3 = 0;
                    for(int i = 0 ; i <  3; i++){
                        String result3 = "";
                        if((tower3[i].recover.getTime() - TheDate.getTime())<0){
                            status3 = "Recovered";
                            recovered3++;
                        }
                        else{
                            status3= "Active   ";
                            active3++;
                        }
                        String strage3 = Integer.toString(age3[i]);
                        result3 = "C       " + name3[i] + "          " + strage3 + "         " + status3 + "          " + date3[i] + "         "+ tower3[i].Recover;
                        jTextArea1.append(result3 + "\n" );
                        
                        
            }
                        jTextArea1.append("Active Cases for Tower C = " + active3 + "\n" );
                        jTextArea1.append("Recovered Cases for Tower C = " + recovered3 + "\n" );
                       
            if(jCheckBox2.isSelected()){
                jTextArea1.append(start + "\n" );
                String[] name2 = {"Denys   " , "David   " , "Pearson " , "Anderson" , "Julie   "};
                int[] age2 = { 24 , 7 , 47 , 62 , 85};
                String[] date2 = { "01/04/2020" , "14/06/2020" , "04/06/2020" , "27/07/2020" , "02/05/2020"};
                Patient tower2[] = new Patient[5];
                    try {
                        tower2[0]=new Patient("Denys",24,"01/04/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower2[1]=new Patient("David",7,"14/06/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower2[2]=new Patient("Pearson",47,"04/06/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower2[3]=new Patient("Anderson",62,"27/07/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower2[4]=new Patient("Julie",85,"02/05/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                String status2 = "";
                    int active2 = 0 ;
                    int recovered2 = 0;
                    for(int i = 0 ; i <  5; i++){
                        String result2 = "";
                        if((tower2[i].recover.getTime() - TheDate.getTime())<0){
                            status2 = "Recovered";
                            recovered2++;
                        }
                        else{
                            status2 = "Active   ";
                            active2++;
                        }
                        String strage2 = Integer.toString(age2[i]);
                        result2 = "B       " + name2[i] + "          " + strage2 + "         " + status2 + "          " + date2[i] + "         "+ tower2[i].Recover;
                        
                        jTextArea1.append(result2 + "\n");
                        
                        
            }
                    jTextArea1.append("Active Cases for Tower B = " + active2 + "\n");
                        jTextArea1.append("Recovered Cases for Tower B = " + recovered2 + "\n");
                        
            if(jCheckBox1.isSelected()){
                jTextArea1.append(start + "\n");
                String[] name1 = { "Flora   " , "Caery   " ,"Bob     " , "Smith   " , "Robertz " };
                int[] age1 = { 6 , 72 , 74 , 89 , 50};
                String[] date1 = {"01/04/2020" , "01/06/2020" , "04/07/2020" , "07/08/2020" , "09/08/2020"};
                Patient tower1[] = new Patient[5];
                    try {
                        tower1[0]=new Patient("Flora",6,"01/04/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower1[1]=new Patient("Caery",72,"01/06/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower1[2]=new Patient("Bob",74,"04/07/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower1[3]=new Patient("Smith",89,"07/08/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        tower1[4]=new Patient("Robertz",50,"09/08/2020");
                    } catch (ParseException ex) {
                        Logger.getLogger(covid19.class.getName()).log(Level.SEVERE, null, ex);
                    }
                String status1 = "";
                    int active1 = 0 ;
                    int recovered1 = 0;
                    for(int i = 0 ; i <  5; i++){
                        String result1 = "";
                        if((tower1[i].recover.getTime() - TheDate.getTime())<0){
                            status1 = "Recovered";
                            recovered1++;
                        }
                        else{
                            status1 = "Active   ";
                            active1++;
                        }
                        String strage1 = Integer.toString(age2[i]);
                        result1 = "A       " + name1[i] + "          " + strage1 + "         " + status1 + "          " + date1[i] + "         "+ tower1[i].Recover;
                        jTextArea1.append(result1 + "\n");

                        
            }
                    
                    jTextArea1.append("Active Cases for Tower A = " + active1 + "\n");
                    jTextArea1.append("Recovered Cases for Tower A = " + recovered1  + "\n");
                        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
            }
            }
    }
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
            java.util.logging.Logger.getLogger(covid19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(covid19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(covid19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(covid19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new covid19().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
