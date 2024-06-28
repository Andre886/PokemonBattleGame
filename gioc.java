/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giocofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class gioc extends javax.swing.JFrame {

    public void danni() {
    TimerTask task = new TimerTask() {
        public void run() {
            System.out.println("Task performed on: " + new Date() + "n" +
              "Thread's name: " + Thread.currentThread().getName());
            
             String[] tmp = jLabel10.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    double togli = Math.random()*10;
                    int toglivero = (int)togli;

                    
                    System.out.println(toglivero);
                    vita-=togli;
                    jLabel10.setText(vita+"/100");
            
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 1500L;
    timer.schedule(task, delay);
}
    
    
    /**
     * Creates new form gioc
     */
    public gioc() {
        initComponents();
        setLocationRelativeTo(null);
        
        try {
            Scanner scan = new Scanner (new File ("vita2.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                jLabel12.setText(linea+"/100");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            Scanner scan = new Scanner (new File ("mossa.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                if (linea.equals("terremoto")) {
                    String[] tmp = jLabel12.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita>0)
                    vita-=20;
                    System.out.println(vita);
                    jLabel12.setText(vita+"/100");
                    
                    try(FileWriter scrivi = new FileWriter ("mossa.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                if (linea.equals("fossa")) {
                    String[] tmp = jLabel12.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita>0)
                    vita-=10;
                    System.out.println(vita);
                    jLabel12.setText(vita+"/100");
                    
                    try(FileWriter scrivi = new FileWriter ("mossa.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                if (linea.equals("azione")) {
                    String[] tmp = jLabel12.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita>0)
                    vita-=15;
                    System.out.println(vita);
                    jLabel12.setText(vita+"/100");
                    
                    try(FileWriter scrivi = new FileWriter ("mossa.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                if (linea.equals("rapido")) {
                    String[] tmp = jLabel12.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita>0)
                    vita-=5;
                    System.out.println(vita);
                    jLabel12.setText(vita+"/100");
                    
                    try(FileWriter scrivi = new FileWriter ("mossa.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            Scanner scan = new Scanner (new File ("vita.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                jLabel10.setText(linea+"/100");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            Scanner scan = new Scanner (new File ("punti.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                punti.setText("Punti: " + linea);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            Scanner scan = new Scanner (new File ("selected.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                selected.setIcon(new ImageIcon(getClass().getResource(linea+"-back.png")));
                jLabel11.setText(linea);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         try {
            Scanner scan = new Scanner (new File ("pozione.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                if (linea.equals("pozione")) {
                    String[] tmp = jLabel10.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita <=90)
                    vita+=10;
                    jLabel10.setText(vita+"/100");
                    
                                try(FileWriter scrivi = new FileWriter ("pozione.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (linea.equals("superpozione")) {
                    String[] tmp = jLabel10.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita <=80)
                    vita+=20;
                    jLabel10.setText(vita+"/100");
                    
                                try(FileWriter scrivi = new FileWriter ("pozione.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (linea.equals("iperpozione")) {
                    String[] tmp = jLabel10.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita <=70)
                    vita+=30;
                    jLabel10.setText(vita+"/100");
                    
                                try(FileWriter scrivi = new FileWriter ("pozione.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (linea.equals("pozionemax")) {
                    String[] tmp = jLabel10.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    if (vita <=50)
                    vita+=50;
                    jLabel10.setText(vita+"/100");
                    
                                try(FileWriter scrivi = new FileWriter ("pozione.txt")) {
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
       danni();  
         
         
    }

        public void inv() {
            this.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        selected = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        punti = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(695, 754));
        setPreferredSize(new java.awt.Dimension(700, 790));
        setSize(new java.awt.Dimension(700, 790));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/charizard-dritto.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));
        getContentPane().add(selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 380, 250));

        jLabel12.setText("100/100");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/barrapiena.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/PS.png"))); // NOI18N
        jLabel14.setText("l8");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/vitavuota.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Garchomp");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 130, -1));

        jLabel10.setText("100/100");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/barrapiena.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/PS.png"))); // NOI18N
        jLabel8.setText("l8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/vitavuota.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Charizard");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/angolosinistra.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/vitarossa.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        punti.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        punti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        punti.setText("Punti: 0");
        getContentPane().add(punti, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/punti.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/pokemon.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/borsa.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 630, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/lotta.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/arrenditi.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/sfondogioca.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/sfondogiallo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 330, 820, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new borsa().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AudioPlayer.stop();
        try(FileWriter scrivi = new FileWriter ("vita2.txt")) {
                            jLabel12.setText("100/100");
                            scrivi.write("100");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    } 
        
        try(FileWriter scrivi = new FileWriter ("vita.txt")) {
                             jLabel10.setText("100/100");
                            scrivi.write("100");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    } 
        try(FileWriter scrivi = new FileWriter ("usati.txt")) {
                             
                            scrivi.write("");
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    } 
        
        
        this.setVisible(false);
        new start().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new lott().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new scegliPokemon().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowClosed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formPropertyChange

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        try(FileWriter scrivi = new FileWriter ("vita.txt")) {
                    String[] tmp = jLabel10.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    String dascrivere = vita + "";
                            scrivi.write(dascrivere);
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        //salva vita opponente
        try(FileWriter scrivi = new FileWriter ("vita2.txt")) {
                    String[] tmp = jLabel12.getText().split("/");
                    int vita = Integer.parseInt(tmp[0]);
                    String dascrivere = vita + "";
                            scrivi.write(dascrivere);
                    } catch (IOException ex) {
                        Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
                    } 
    }//GEN-LAST:event_formComponentHidden

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String[] tmp2 = jLabel12.getText().split("/");
         int vita2 = Integer.parseInt(tmp2[0]);
         if (vita2<=0) {
             inv();
             new Vittori().setVisible(true);
             
         }
         
          String[] tmp = jLabel10.getText().split("/");
         int vita = Integer.parseInt(tmp[0]);
         if (vita<=0) {
             inv();
             new Perdita().setVisible(true);
             
         }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(gioc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gioc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gioc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gioc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gioc().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel punti;
    private javax.swing.JLabel selected;
    // End of variables declaration//GEN-END:variables
}
