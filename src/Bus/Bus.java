/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Registration.java
 *
 * Created on Dec 4, 2010, 2:13:37 PM
 */
package Bus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Bus extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    Statement st = null;
    String a1 = null;
    String a2 = null;
    String a3 = null;
    String a4 = null;
    String a5 = null;
    String a6 = null;
    String a7 = null;
    String a8 = null;
    String a9 = null;
    String a10 = null;
    String a11 = null;
    String a12 = null;
    String a13 = null;
    String a14 = null;
    String a15 = null;
    String a16 = null;
    String a17 = null;
    String a18 = null;
    String a19 = null;
    String a20 = null;
    String a21 = null;
    String a22 = null;
    String a23 = null;
    String a24 = null;
    String a25 = null;
    String a26 = null;
    String a27 = null;

    public Bus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnsearch = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        q8 = new javax.swing.JTextField();
        Arrival_time_depot = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        q7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        q6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        q9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        q10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        q11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        q12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        q13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        q15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        q14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        q17 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        q16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        q18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        q19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        q20 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        q21 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        q22 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        q24 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        q25 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        q26 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        q27 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        q23 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registraion Form");
        setBackground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1179, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 12));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Bus Form");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Bus Id");

        q1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Route");

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 12));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 12));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 12));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 12));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 12));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnclear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btnsearch)
                    .addComponent(btndelete)
                    .addComponent(btnclear)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("stand1");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("stand4");

        Arrival_time_depot.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Arrival_time_depot.setText("Arrival_time_depot");

        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("intial_stand");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("stand3");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("stand2");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("stand5");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("stand6");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("stand7");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("stand8");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("stand9");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("stand11");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("stand10");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("stand13");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("stand12");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel20.setText("stand14");

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel21.setText("stand15");

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel22.setText("stand16");

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel23.setText("final_stand");

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel24.setText("driver");

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("conductor");

        q24.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setText("departure_time_depot");

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel27.setText("route_fare_in_rupees");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel28.setText("employee_id");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Contact_Info");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(Arrival_time_depot)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel23))
                                        .addGap(110, 110, 110)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(q23)
                                            .addComponent(q21)
                                            .addComponent(q19)
                                            .addComponent(q13)
                                            .addComponent(q11)
                                            .addComponent(q9)
                                            .addComponent(q7)
                                            .addComponent(q3)
                                            .addComponent(q5)
                                            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(q15)
                                            .addComponent(q17)
                                            .addComponent(q26)
                                            .addComponent(q24))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addGap(391, 391, 391)))
                            .addGap(57, 57, 57)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel16))
                                    .addGap(158, 158, 158)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(q22)
                                        .addComponent(q20)
                                        .addComponent(q18)
                                        .addComponent(q16)
                                        .addComponent(q14)
                                        .addComponent(q8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(q2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(q4)
                                        .addComponent(q6)
                                        .addComponent(q10)
                                        .addComponent(q12)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel26))
                                    .addGap(89, 89, 89)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(q25, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(q27, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                            .addGap(177, 177, 177)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Arrival_time_depot)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(q10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(q13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(q15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel20)
                                .addComponent(q17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(q14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(q19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(q20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel23))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(q21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(q23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(q22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(q24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(q25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(q26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(q27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:

        a1 = q1.getText();
        if (!a1.equals("")) {
            try {
                con = connection.connect.makeConnection();
                st = con.createStatement();
                String query = "delete from bus where bus_no ='" + a1 + "'";
                int res = st.executeUpdate(query);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Delete Successfully !!");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "Not Deleted !!");
                    return;
                }

                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Product ID Cannot be  Left Blank !!");
            return;
        }
}//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
}//GEN-LAST:event_btnclearActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:

        a1 = q1.getText();
        a2 = q2.getText();
        a3 = q3.getText();
        a4 = q4.getText();
        a5 = q5.getText();
        a6 = q6.getText();
        a7 = q7.getText();
        a8 = q8.getText();
        a9 = q9.getText();
        a10 = q10.getText();

        a11 = q11.getText();
        a12 = q12.getText();
        a13 = q13.getText();
        a14 = q14.getText();
        a15 = q15.getText();
        a16 = q16.getText();
        a17 = q17.getText();
        a18 = q18.getText();
        a19 = q19.getText();
        a20 = q20.getText();

        a21 = q21.getText();
        a22 = q22.getText();
        a23 = q23.getText();
        a24 = q24.getText();
        a25 = q25.getText();
        a26 = q26.getText();
        a27 = q27.getText();

        if (!a1.equals("")) {
            try {
                con = connection.connect.makeConnection();
                String Query = "update bus set bus_no=?,route=?,Arrival_time_depot=?,intial_stand=?,stand1=?,stand2=?,stand3=?,stand4=?,stand5=?,stand6=?,stand7=?,stand8=?,stand9=?,stand10=?,stand11=?,stand12=?,stand13=?,stand14=?,stand15=?,stand16=?,final_stand=?,driver=?,contact_info=?,conductor=?,departure_time_depot=?,route_fare_in_rupees=?,employee_id=? where bus_no ='" + a1 + "'";


                ps = con.prepareStatement(Query);
                ps.setString(1, a1);
                ps.setString(2, a2);
                ps.setString(3, a3);
                ps.setString(4, a4);
                ps.setString(5, a5);
                ps.setString(6, a6);
                ps.setString(7, a7);
                ps.setString(8, a8);
                ps.setString(9, a9);
                ps.setString(10, a10);

                ps.setString(11, a11);
                ps.setString(12, a12);
                ps.setString(13, a13);
                ps.setString(14, a14);
                ps.setString(15, a15);
                ps.setString(16, a16);
                ps.setString(17, a17);
                ps.setString(18, a18);
                ps.setString(19, a19);
                ps.setString(20, a20);

                ps.setString(21, a21);
                ps.setString(22, a22);
                ps.setString(23, a23);
                ps.setString(24, a24);
                ps.setString(25, a25);
                ps.setString(26, a26);
                ps.setString(27, a27);
                int j = ps.executeUpdate();
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "Updated");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Updated !!");
                }
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bus No. Cannot be  Left Blank !!");
            return;
        }
}//GEN-LAST:event_btnupdateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed



        a1 = q1.getText();
        a2 = q2.getText();
        a3 = q3.getText();
        a4 = q4.getText();
        a5 = q5.getText();
        a6 = q6.getText();
        a7 = q7.getText();
        a8 = q8.getText();
        a9 = q9.getText();
        a10 = q10.getText();
        a11 = q11.getText();
        a12 = q12.getText();

        a13 = q13.getText();
        a14 = q14.getText();
        a15 = q15.getText();
        a16 = q16.getText();
        a17 = q17.getText();
        a18 = q18.getText();
        a19 = q19.getText();
        a20 = q20.getText();
        a21 = q21.getText();
        a22 = q22.getText();
        a23 = q23.getText();
        a24 = q24.getText();
        a25 = q25.getText();
        a26 = q26.getText();
        a27 = q27.getText();


        if (!a1.equals("") && !a2.equals("")) {
            try {
                con = connection.connect.makeConnection();
                String Query = "insert into bus(`bus_no`,`route`,`Arrival_time_depot`,`intial_stand`,`stand1`,`stand2`,`stand3`,`stand4`,`stand5`,`stand6`,`stand7`,`stand8`,`stand9`,`stand10`,`stand11`,`stand12`,`stand13`,`stand14`,`stand15`,`stand16`,`final_stand`,`driver`,`contact_info`,`conductor`,`departure_time_depot`,`route_fare_in_rupees`,`employee_id`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(Query);
                ps.setString(1, a1);
                ps.setString(2, a2);

                ps.setString(3, a3);
                ps.setString(4, a4);
                ps.setString(5, a5);
                ps.setString(6, a6);
                ps.setString(7, a7);
                ps.setString(8, a8);
                ps.setString(9, a9);
                ps.setString(10, a10);

                ps.setString(11, a11);
                ps.setString(12, a12);

                ps.setString(13, a13);
                ps.setString(14, a14);
                ps.setString(15, a15);
                ps.setString(16, a16);
                ps.setString(17, a17);
                ps.setString(18, a18);
                ps.setString(19, a19);
                ps.setString(20, a20);

                ps.setString(21, a21);
                ps.setString(22, a22);

                ps.setString(23, a23);
                ps.setString(24, a24);
                ps.setString(25, a25);
                ps.setString(26, a26);
                ps.setString(27, a27);

                int j = ps.executeUpdate();
                if (j > 0) {

                    JOptionPane.showMessageDialog(null, "New Bus  is Registered");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "New Bus Not Registered");
                }
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bus ID And Bus name  Cannot be  Left Blank !!");
            return;
        }
}//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        a1 = q1.getText();
        if (!a1.equals("")) {
            try {
                con = connection.connect.makeConnection();
                st = con.createStatement();
                String query = "select * from bus where bus_no ='" + a1 + "'";
                rs = st.executeQuery(query);
                if (rs.next()) {
                    q1.setText(rs.getString(1));
                    q2.setText(rs.getString(2));
                    q3.setText(rs.getString(3));
                    q4.setText(rs.getString(4));
                    q5.setText(rs.getString(5));
                    q6.setText(rs.getString(6));
                    q7.setText(rs.getString(7));
                    q8.setText(rs.getString(8));
                    q9.setText(rs.getString(9));
                    q10.setText(rs.getString(10));

                    q11.setText(rs.getString(11));
                    q12.setText(rs.getString(12));
                    q13.setText(rs.getString(13));
                    q14.setText(rs.getString(14));
                    q15.setText(rs.getString(15));
                    q16.setText(rs.getString(16));
                    q17.setText(rs.getString(17));
                    q18.setText(rs.getString(18));
                    q19.setText(rs.getString(19));
                    q20.setText(rs.getString(20));

                    q21.setText(rs.getString(21));
                    q22.setText(rs.getString(22));
                    q23.setText(rs.getString(23));
                    q24.setText(rs.getString(24));
                    q25.setText(rs.getString(25));
                    q26.setText(rs.getString(26));
                    q27.setText(rs.getString(27));

                } else {
                    JOptionPane.showMessageDialog(null, "Bus ID Does Not Exist!!");
                    return;
                }

                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bus ID Does Not Exist!!");
            return;
        }
}//GEN-LAST:event_btnsearchActionPerformed

    private void q1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q1MouseClicked
//        try {
//            con = connection.connect.makeConnection();
//            Statement st = con.createStatement();
//
//            ResultSet ra = st.executeQuery("select pid from autogen");
//            while (ra.next()) {
//                q1.setText(ra.getString(1));
//            }
//        } catch (Exception e) {
//            System.out.println(e + "");
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_q1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu uimg = new MainMenu();
        dispose();
        uimg.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Bus().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrival_time_depot;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q10;
    private javax.swing.JTextField q11;
    private javax.swing.JTextField q12;
    private javax.swing.JTextField q13;
    private javax.swing.JTextField q14;
    private javax.swing.JTextField q15;
    private javax.swing.JTextField q16;
    private javax.swing.JTextField q17;
    private javax.swing.JTextField q18;
    private javax.swing.JTextField q19;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q20;
    private javax.swing.JTextField q21;
    private javax.swing.JTextField q22;
    private javax.swing.JTextField q23;
    private javax.swing.JTextField q24;
    private javax.swing.JTextField q25;
    private javax.swing.JTextField q26;
    private javax.swing.JTextField q27;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField q7;
    private javax.swing.JTextField q8;
    private javax.swing.JTextField q9;
    // End of variables declaration//GEN-END:variables

    public void clear() {

        q1.setText("");
        q2.setText("");
        q3.setText("");
        q4.setText("");
        q5.setText("");
        q6.setText("");
        q7.setText("");
        q8.setText("");
        q9.setText("");
        q10.setText("");

        q11.setText("");
        q12.setText("");
        q13.setText("");
        q14.setText("");
        q15.setText("");
        q16.setText("");
        q17.setText("");
        q18.setText("");
        q19.setText("");
        q20.setText("");

        q21.setText("");
        q22.setText("");
        q23.setText("");
        q24.setText("");
        q25.setText("");
        q26.setText("");
        q27.setText("");

    }
}
