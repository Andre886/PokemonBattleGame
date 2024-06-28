/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giocofinal;



import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
public class menu extends javax.swing.JFrame{

    private int tema = 0;
    private int percentualebatteria = 15;
    private boolean ACState = false;
    /**
     * Creates new form menu
     */
    
    
    
    private static boolean netIsAvailable() {
    try {
        final URL url = new URL("http://www.google.com");
        final URLConnection conn = url.openConnection();
        conn.connect();
        conn.getInputStream().close();
        return true;
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        return false;
    }
}

    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        AudioPlayer.playInLoop("home.wav");
        
        
        TerminalCommand.comando();
        percentualebatteria = TerminalCommand.percentuale();
        ACState = TerminalCommand.ACPower();
        System.out.println(ACState);
        
        if (ACState == true) {
            if (percentualebatteria >=70) {
           ImageIcon icona = new ImageIcon(getClass().getResource("pienac.png"));
           jLabel3.setIcon(icona);
        } else if (percentualebatteria  >=25) {
            ImageIcon icona = new ImageIcon(getClass().getResource("metac.png")); 
            jLabel3.setIcon(icona);
        } else if (percentualebatteria<=25) {
            ImageIcon icona = new ImageIcon(getClass().getResource("scaricoc.png")); 
            jLabel3.setIcon(icona);
        }
        } else {
            if (percentualebatteria >=70) {
           ImageIcon icona = new ImageIcon(getClass().getResource("piena.png"));
           jLabel3.setIcon(icona);
        } else if (percentualebatteria  >=25) {
            ImageIcon icona = new ImageIcon(getClass().getResource("meta.png")); 
            jLabel3.setIcon(icona);
        } else if (percentualebatteria<=25) {
            ImageIcon icona = new ImageIcon(getClass().getResource("scarico.png")); 
            jLabel3.setIcon(icona);
        }
        }
        

        
        Calendar calendar = GregorianCalendar.getInstance();
        String orologiov = calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR);        // gets hour in 12h format
        String orav = calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE);

        data.setText(orologiov);
        
        
        Current a = new Current ();
        String orav2 = a.ora() + "";
        ora.setText(orav2);
        
        try {
            Scanner scan = new Scanner (new File ("tema.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                tema = Integer.parseInt(linea);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(netIsAvailable());
        if (netIsAvailable() == true) {
            jLabel4.setIcon(new ImageIcon(getClass().getResource("internet.png")));
            jLabel5.setText("Internet");
        } else {
            jLabel4.setIcon(new ImageIcon(getClass().getResource("streetpass.png")));
            jLabel5.setText("StreetPass");
        }
        
        if (tema == 0) {
            jLabel1.setIcon(new ImageIcon(getClass().getResource("sfondogiu.png")));
        } else if (tema == 1) {
            jLabel1.setIcon(new ImageIcon(getClass().getResource("sfondogiu2.png")));
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

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        nonloso = new javax.swing.JButton();
        musica = new javax.swing.JButton();
        pokemon = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        quiz = new javax.swing.JButton();
        manuale = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(694, 757));
        setSize(new java.awt.Dimension(694, 757));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/off.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 371, 50, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/homesettings.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 50, 50));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/sfondovuoto.png"))); // NOI18N
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 100, 90));

        nonloso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/bianco.png"))); // NOI18N
        nonloso.setContentAreaFilled(false);
        getContentPane().add(nonloso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 120, 120));

        musica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/musicaicona.png"))); // NOI18N
        musica.setContentAreaFilled(false);
        musica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musicaMouseExited(evt);
            }
        });
        musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicaActionPerformed(evt);
            }
        });
        getContentPane().add(musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 120, 120));

        pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/pokemonstarticon.png"))); // NOI18N
        pokemon.setContentAreaFilled(false);
        pokemon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pokemonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pokemonMouseExited(evt);
            }
        });
        pokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemonActionPerformed(evt);
            }
        });
        getContentPane().add(pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 120, 120));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/setting.png"))); // NOI18N
        settings.setContentAreaFilled(false);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 120, 120));

        quiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/geogicon.png"))); // NOI18N
        quiz.setContentAreaFilled(false);
        quiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quizMouseExited(evt);
            }
        });
        quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizActionPerformed(evt);
            }
        });
        getContentPane().add(quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 120, 120));

        manuale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/information.png"))); // NOI18N
        manuale.setContentAreaFilled(false);
        manuale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manualeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manualeMouseExited(evt);
            }
        });
        manuale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualeActionPerformed(evt);
            }
        });
        getContentPane().add(manuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 120, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/background.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        ora.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ora.setText("ORA");
        getContentPane().add(ora, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 50));

        data.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        data.setText("Data");
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 50));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Internet");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/internet.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/battery.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/sfondogiu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/sfondosu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemonActionPerformed
        // TODO add your handling code here:
        AudioPlayer.stop();
        pokemon();
    }//GEN-LAST:event_pokemonActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        // TODO add your handling code here:
        AudioPlayer.stop();
        AudioPlayer.playInLoop("settings.wav");
        settings();
    }//GEN-LAST:event_settingsActionPerformed

    private void musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Non disponibile\n questo software verrà aggiunto con un aggiornamento futuro", "Non disponibile",JOptionPane.INFORMATION_MESSAGE);
        //music();
    }//GEN-LAST:event_musicaActionPerformed

    private void manualeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualeActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
    try {
        File myFile = new File("analisi.pdf");
        Desktop.getDesktop().open(myFile);
    } catch (IOException ex) {
        // no application registered for PDFs
    }
}
        
        //manual();
    }//GEN-LAST:event_manualeActionPerformed

    private void quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Non disponibile\n questo software verrà aggiunto con un aggiornamento futuro", "Non disponibile",JOptionPane.INFORMATION_MESSAGE);
        
        //quiz();
    }//GEN-LAST:event_quizActionPerformed

    private void pokemonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemonMouseEntered
        // TODO add your handling code here:
        pokemon.setIcon(new ImageIcon(getClass().getResource("pokemonstarticonsel.png")));
    }//GEN-LAST:event_pokemonMouseEntered

    private void pokemonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemonMouseExited
        // TODO add your handling code here:
        pokemon.setIcon(new ImageIcon(getClass().getResource("pokemonstarticon.png")));
    }//GEN-LAST:event_pokemonMouseExited

    private void musicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicaMouseEntered
        // TODO add your handling code here:
        musica.setIcon(new ImageIcon(getClass().getResource("musicaiconsel.png")));
    }//GEN-LAST:event_musicaMouseEntered

    private void musicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicaMouseExited
        // TODO add your handling code here:
        musica.setIcon(new ImageIcon(getClass().getResource("musicaicona.png")));
    }//GEN-LAST:event_musicaMouseExited

    private void quizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizMouseEntered
        // TODO add your handling code here:
        quiz.setIcon(new ImageIcon(getClass().getResource("geogiconsel.png")));
    }//GEN-LAST:event_quizMouseEntered

    private void quizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizMouseExited
        // TODO add your handling code here:
        quiz.setIcon(new ImageIcon(getClass().getResource("geogicon.png")));
    }//GEN-LAST:event_quizMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        // TODO add your handling code here:
        settings.setIcon(new ImageIcon(getClass().getResource("settingsel.png")));
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        // TODO add your handling code here:
        settings.setIcon(new ImageIcon(getClass().getResource("setting.png")));
    }//GEN-LAST:event_settingsMouseExited

    private void manualeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualeMouseEntered
        // TODO add your handling code here:
        manuale.setIcon(new ImageIcon(getClass().getResource("informationsel.png")));
    }//GEN-LAST:event_manualeMouseEntered

    private void manualeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualeMouseExited
        // TODO add your handling code here:
        manuale.setIcon(new ImageIcon(getClass().getResource("information.png")));
    }//GEN-LAST:event_manualeMouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        AudioPlayer.stop();
        change();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AudioPlayer.stop();
        this.setVisible(false);
        new tem().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void exploit () {
        this.setVisible(false);
        new homebrewload().setVisible(true);
    }
    
    public void change() {
    TimerTask task = new TimerTask() {
        public void run() {
            System.out.println("Task performed on: " + new Date() + "n" +
              "Thread's name: " + Thread.currentThread().getName());
            
            exploit();
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 1500L;
    timer.schedule(task, delay);
}
    
    
    public void settings() {
        this.setVisible(false);
        new settings().setVisible(true);
    }

    public void music() {
        this.setVisible(false);
        new musica().setVisible(true);
    }

    public void pokemon() {
        this.setVisible(false);
        new welcomegioco().setVisible(true);
    }

    public void manual() {
        this.setVisible(false);
        new manuale().setVisible(true);
    }

    public void quiz() {
        this.setVisible(false);
        new quiz().setVisible(true);
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton manuale;
    private javax.swing.JButton musica;
    private javax.swing.JButton nonloso;
    private javax.swing.JLabel ora;
    private javax.swing.JButton pokemon;
    private javax.swing.JButton quiz;
    private javax.swing.JButton settings;
    // End of variables declaration//GEN-END:variables

    
    
    
}
