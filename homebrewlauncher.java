/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giocofinal;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class homebrewlauncher extends javax.swing.JFrame {

    /**
     * Creates new form homebrewlauncher
     */
    public homebrewlauncher() {
        initComponents();
        setLocationRelativeTo(null);
        
        Current a = new Current ();
        String orav2 = a.ora() + "";
        
            ora.setText(orav2);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        test = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("THE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 107, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setText("HOMEBREW");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel3.setText("LAUNCHER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 50));

        ora.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ora.setText("ORA");
        jPanel1.add(ora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("hax 2.x V2.4.1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setText("sdmc:/");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 700, 50));

        test.setEditable(false);
        jScrollPane1.setViewportView(test);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 550, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 370));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(102, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/hblinstaller.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/theme.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/fbi.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/terminal.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 700, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            // Esegui il comando nel terminale di macOS
            String command = "open /Applications/OBS.app/Contents/MacOS/OBS --args -picture"; // Comando di esempio (elencare i file nella directory corrente)
            Process process = Runtime.getRuntime().exec(command);

            // Leggi l'output del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                jLabel1.setText("");
                jLabel2.setText("");
                jLabel3.setText("");
                test.setText(test.getText() + line + "\n");
                System.out.println(line);
                
                 
            }

            // Attendere il completamento del comando
            int exitCode = process.waitFor();
            System.out.println("Il comando è stato eseguito con codice di uscita: " + exitCode);
            
            
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
            // Esegui il comando nel terminale di macOS
            String command = "open -a Audacity "; // Comando di esempio (elencare i file nella directory corrente)
            Process process = Runtime.getRuntime().exec(command);

            // Leggi l'output del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                jLabel1.setText("");
                jLabel2.setText("");
                jLabel3.setText("");
                test.setText(test.getText() + line + "\n");
                System.out.println(line);
                
                 
            }

            // Attendere il completamento del comando
            int exitCode = process.waitFor();
            System.out.println("Il comando è stato eseguito con codice di uscita: " + exitCode);
            
            
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            // Esegui il comando nel terminale di macOS
            String command = "open /Applications/SysDVR-Client-MacOs-arm64/SysDVR-Client"; // Comando di esempio (elencare i file nella directory corrente)
            Process process = Runtime.getRuntime().exec(command);

            // Leggi l'output del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                jLabel1.setText("");
                jLabel2.setText("");
                jLabel3.setText("");
                test.setText(test.getText() + line + "\n");
                System.out.println(line);
                
                 
            }

            // Attendere il completamento del comando
            int exitCode = process.waitFor();
            System.out.println("Il comando è stato eseguito con codice di uscita: " + exitCode);
            
            
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void esci() {
        AudioPlayer.stop();
        this.setVisible(false);
                new menu().setVisible(true);
    }
    
    public void uscita() {
    TimerTask task = new TimerTask() {
        public void run() {
            System.out.println("Task performed on: " + new Date() + "n" +
              "Thread's name: " + Thread.currentThread().getName());
            
            esci();
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 5000L;
    timer.schedule(task, delay);
}
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String command =JOptionPane.showInputDialog(this,"Inserisci il comando da eseguire","Terminale",2);
        
        try {
            // Esegui il comando nel terminale di macOS
            jLabel1.setText("");
                jLabel2.setText("");
                jLabel3.setText("");
                jLabel4.setText("");
            test.setText(test.getText() + "andrea@Macbook-Pro-di-Andrea ~ % " + command + "\n");
            if (command.equals("clear")) {
                test.setText("andrea@Macbook-Pro-di-Andrea ~ % \n");
            } else if (command.equals("exit")) {
                test.setText(test.getText() + "\n Ritorno al menu home in 5 secondi");
                uscita();
            }
            
            
            Process process = Runtime.getRuntime().exec(command);

            // Leggi l'output del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            while ((line = reader.readLine()) != null) {
                
                test.setText(test.getText() + line + "\n");
                System.out.println(line);
                
                 
            }
            

            // Attendere il completamento del comando
            int exitCode = process.waitFor();
            if (exitCode!=0 && !command.equals("clear")){
                test.setText(test.getText()  + "Impossibile Eseguire il comando. Codice uscita: " + exitCode + "\n");
            }
            System.out.println("Il comando è stato eseguito con codice di uscita: " + exitCode);
            
            
            
        } catch (IOException | InterruptedException e) {
            if (!command.equals("exit") && !command.equals("clear"))
            test.setText(test.getText()  + "Unknown Command: " + command + "\n");
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(homebrewlauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homebrewlauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homebrewlauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homebrewlauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homebrewlauncher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ora;
    private javax.swing.JTextPane test;
    // End of variables declaration//GEN-END:variables
}
