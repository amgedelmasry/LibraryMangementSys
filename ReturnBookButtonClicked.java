/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static library.AddLibrarian.isNumeric;

/**
 *
 * @author Elmasry
 */
public class ReturnBookButtonClicked extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBookButton
     */
    public ReturnBookButtonClicked() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Return Book");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Book call number:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Student id: ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Return Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 44, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jTextField2))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must fill all the blanks");
        } else if (!isNumeric(jTextField2.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid input of the Student iD");
        } else {
            boolean flag1 = false, flag2 = false;
            for (int i = 0; !flag2 && i < Book.books.size(); i++) {
                if (Book.books.get(i).issued != 0) {
                    for (int j = 0; !flag1 && j < Student.students.size(); j++) {
                        if (Integer.parseInt(jTextField2.getText()) == Student.students.get(j).iD) {
                            flag1 = true;
                            for (int x = 0; !flag2 && x < Student.students.get(j).issuedbooks.size(); x++) {
                                if (jTextField1.getText().equals(Student.students.get(j).issuedbooks.get(x).callNo)) {
                                    flag2 = true;
                                    Date currentTime = Calendar.getInstance().getTime();
                                    if (currentTime.after(Student.students.get(j).issuedbooks.get(x).returnDate)) {
                                        JOptionPane.showMessageDialog(null, "You are penalized for late returning!!\nThe book is returned successfully");
                                        jLabel4.setText("The book is returned successfully");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "The book is returned successfully");
                                        jLabel4.setText("The book is returned successfully");
                                    }

                                    Student.students.get(j).issuedbooks.remove(x);
                                    Book.books.get(i).issued--;
                                    Book.books.get(i).quantity++;
                                    FileWriter f6;
                                    try {
                                        f6 = new FileWriter("Students.txt");
                                        try (BufferedWriter bw = new BufferedWriter(f6)) {
                                            for (int m = 0; m < Student.students.size(); m++) {
                                                switch (Student.students.get(m).issuedbooks.size()) {
                                                    case (0):
                                                        bw.write(Student.students.get(m).iD + "/" + Student.students.get(m).name + "/" + Student.students.get(m).password + "/" + Student.students.get(m).email + "/" + Student.students.get(m).address + "/" + Student.students.get(m).city + "/" + Student.students.get(m).contactNumber + "\n");
                                                        break;
                                                    case (1):
                                                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                                        String issueDate1 = dateFormat.format(Student.students.get(m).issuedbooks.get(0).issueDate);
                                                        String returnDate1 = dateFormat.format(Student.students.get(m).issuedbooks.get(0).returnDate);
                                                        bw.write(Student.students.get(m).iD + "/" + Student.students.get(m).name + "/" + Student.students.get(m).password + "/" + Student.students.get(m).email + "/" + Student.students.get(m).address + "/" + Student.students.get(m).city + "/" + Student.students.get(m).contactNumber + "/" + Student.students.get(m).issuedbooks.get(0).iD + "/" + Student.students.get(m).issuedbooks.get(0).callNo + "/" + issueDate1 + "/" + returnDate1 + "\n");
                                                        break;
                                                    case (2):
                                                        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                                        issueDate1 = dateFormat.format(Student.students.get(m).issuedbooks.get(0).issueDate);
                                                        returnDate1 = dateFormat.format(Student.students.get(m).issuedbooks.get(0).returnDate);
                                                        String issueDate2 = dateFormat.format(Student.students.get(m).issuedbooks.get(1).issueDate);
                                                        String returnDate2 = dateFormat.format(Student.students.get(m).issuedbooks.get(1).returnDate);
                                                        bw.write(Student.students.get(m).iD + "/" + Student.students.get(m).name + "/" + Student.students.get(m).password + "/" + Student.students.get(m).email + "/" + Student.students.get(m).address + "/" + Student.students.get(m).city + "/" + Student.students.get(m).contactNumber + "/" + Student.students.get(m).issuedbooks.get(0).iD + "/" + Student.students.get(m).issuedbooks.get(0).callNo + "/" + issueDate1 + "/" + returnDate1 + "/" + Student.students.get(m).issuedbooks.get(1).iD + "/" + Student.students.get(m).issuedbooks.get(1).callNo + "/" + issueDate2 + "/" + returnDate2 + "\n");
                                                        break;
                                                    case (3):
                                                        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                                        issueDate1 = dateFormat.format(Student.students.get(m).issuedbooks.get(0).issueDate);
                                                        returnDate1 = dateFormat.format(Student.students.get(m).issuedbooks.get(0).returnDate);
                                                        issueDate2 = dateFormat.format(Student.students.get(m).issuedbooks.get(1).issueDate);
                                                        returnDate2 = dateFormat.format(Student.students.get(m).issuedbooks.get(1).returnDate);
                                                        String issueDate3 = dateFormat.format(Student.students.get(m).issuedbooks.get(2).issueDate);
                                                        String returnDate3 = dateFormat.format(Student.students.get(m).issuedbooks.get(2).returnDate);
                                                        bw.write(Student.students.get(m).iD + "/" + Student.students.get(m).name + "/" + Student.students.get(m).password + "/" + Student.students.get(m).email + "/" + Student.students.get(m).address + "/" + Student.students.get(m).city + "/" + Student.students.get(m).contactNumber + "/" + Student.students.get(m).issuedbooks.get(0).iD + "/" + Student.students.get(m).issuedbooks.get(0).callNo + "/" + issueDate1 + "/" + returnDate1 + "/" + Student.students.get(m).issuedbooks.get(1).iD + "/" + Student.students.get(m).issuedbooks.get(1).callNo + "/" + issueDate2 + "/" + returnDate2 + "/" + Student.students.get(m).issuedbooks.get(2).iD + "/" + Student.students.get(m).issuedbooks.get(2).callNo + "/" + issueDate3 + "/" + returnDate3 + "\n");
                                                        break;
                                                }
                                            }
                                            bw.close();
                                        }
                                    } catch (IOException ex) {
                                        Logger.getLogger(AddLibrarian.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    FileWriter f9;
                                    try {
                                        f9 = new FileWriter("Books.txt");
                                        try (BufferedWriter bw = new BufferedWriter(f9)) {
                                            for (int n = 0; n < Book.books.size(); n++) {
                                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                                String dateAdded = dateFormat.format(Book.books.get(n).addedDate);
                                                bw.write(Book.books.get(n).iD + "/" + Book.books.get(n).callNo + "/" + Book.books.get(n).name + "/" + Book.books.get(n).author + "/" + Book.books.get(n).publisher + "/" + Book.books.get(n).quantity + "/" + Book.books.get(n).issued + "/" + dateAdded + "\n");
                                            }
                                            bw.close();
                                        }
                                    } catch (IOException ex) {
                                        Logger.getLogger(AddLibrarian.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!flag1) {
                JOptionPane.showMessageDialog(null, "Couldnt find this Student!");
            }
            if (flag1 && !flag2) {
                JOptionPane.showMessageDialog(null, "This student didnt issue that book!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new LibrarianSectionButton().setVisible(true);// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ReturnBookButtonClicked.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookButtonClicked.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookButtonClicked.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookButtonClicked.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookButtonClicked().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
