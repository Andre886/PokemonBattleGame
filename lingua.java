/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giocofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author andrea
 */
public class lingua extends javax.swing.JFrame {

    private boolean italianosel = true;
    private boolean inglesesel = false;
    private boolean tedescosel = false;
    
    /**
     * Creates new form format
     */
    public lingua() {
        initComponents();
        setLocationRelativeTo(null);
        
        try {
            Scanner scan = new Scanner (new File ("lingua.txt"));
            while(scan.hasNextLine()) {
                String lingua = scan.nextLine();
                System.out.println(lingua);
                if (lingua.equals("italiano")) {
                    ita.setIcon(new ImageIcon(getClass().getResource("italianosel.png")));
                    eng.setIcon(new ImageIcon(getClass().getResource("inglese.png")));
                    deu.setIcon(new ImageIcon(getClass().getResource("tedesco.png")));
                    italianosel = true;
                    inglesesel = false;
                    tedescosel = false;
                } else if (lingua.equals("inglese")) {
                    ita.setIcon(new ImageIcon(getClass().getResource("italiano.png")));
                    eng.setIcon(new ImageIcon(getClass().getResource("inglesesel.png")));
                    deu.setIcon(new ImageIcon(getClass().getResource("tedesco.png")));
                    italianosel = false;
                    inglesesel = true;
                    tedescosel = false;
                } else if (lingua.equals("tedesco")) {
                    ita.setIcon(new ImageIcon(getClass().getResource("italiano.png")));
                    eng.setIcon(new ImageIcon(getClass().getResource("inglese.png")));
                    deu.setIcon(new ImageIcon(getClass().getResource("tedescosel.png")));
                    italianosel = false;
                    inglesesel = false;
                    tedescosel = true;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lingua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ita = new javax.swing.JButton();
        eng = new javax.swing.JButton();
        deu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(693, 750));
        setSize(new java.awt.Dimension(693, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/italianosel.png"))); // NOI18N
        ita.setContentAreaFilled(false);
        ita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itaActionPerformed(evt);
            }
        });
        getContentPane().add(ita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 420, 80));

        eng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/inglese.png"))); // NOI18N
        eng.setContentAreaFilled(false);
        eng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engActionPerformed(evt);
            }
        });
        getContentPane().add(eng, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 420, 80));

        deu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/tedesco.png"))); // NOI18N
        deu.setContentAreaFilled(false);
        deu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deuActionPerformed(evt);
            }
        });
        getContentPane().add(deu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 420, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/ok.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 680, 180, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/annulla.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 680, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/Lingua_.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/sceglilingua.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/impostazioni.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/impostazioni.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try (FileWriter scrivi = new FileWriter ("lingua.txt")) {
            
            if (italianosel == true) {
                scrivi.write("italiano");
            } else if (inglesesel==true) {
                scrivi.write("inglese");
            } else if (tedescosel == true) {
                scrivi.write("tedesco");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(audio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        this.setVisible(false);
        new settings().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new settings().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itaActionPerformed
        // TODO add your handling code here:
        if (italianosel == false) {
            ita.setIcon(new ImageIcon(getClass().getResource("italianosel.png")));
            eng.setIcon(new ImageIcon(getClass().getResource("inglese.png")));
            deu.setIcon(new ImageIcon(getClass().getResource("tedesco.png")));
            italianosel = true;
            inglesesel = false;
            tedescosel = false;
        }
    }//GEN-LAST:event_itaActionPerformed

    private void engActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engActionPerformed
        // TODO add your handling code here:
        if (inglesesel == false) {
            ita.setIcon(new ImageIcon(getClass().getResource("italiano.png")));
            eng.setIcon(new ImageIcon(getClass().getResource("inglesesel.png")));
            deu.setIcon(new ImageIcon(getClass().getResource("tedesco.png")));
            italianosel = false;
            inglesesel = true;
            tedescosel = false;
        }
    }//GEN-LAST:event_engActionPerformed

    private void deuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deuActionPerformed
        // TODO add your handling code here:
        if (tedescosel == false) {
            ita.setIcon(new ImageIcon(getClass().getResource("italiano.png")));
            eng.setIcon(new ImageIcon(getClass().getResource("inglese.png")));
            deu.setIcon(new ImageIcon(getClass().getResource("tedescosel.png")));
            italianosel = false;
            inglesesel = false;
            tedescosel = true;
        }
    }//GEN-LAST:event_deuActionPerformed

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
            java.util.logging.Logger.getLogger(lingua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lingua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lingua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lingua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lingua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deu;
    private javax.swing.JButton eng;
    private javax.swing.JButton ita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
