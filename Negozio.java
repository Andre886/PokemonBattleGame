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
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Negozio extends javax.swing.JFrame {
    
    private int prezzo;
    private int valore;
    private int punti;
    
    /**
     * Creates new form Negozio
     */
    
    
    public Negozio() {
        initComponents();
        setLocationRelativeTo(null);
        
        AudioPlayer.playInLoop("negozio.wav");
        
        
        
        try {
            Scanner scan = new Scanner (new File ("punti.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                puntilbl.setText(linea);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Scanner scan = new Scanner (new File ("pozionen.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 qPozione.setText(linea);
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner scan = new Scanner (new File ("superpozione.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 qSuperpozione.setText(linea);
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner scan = new Scanner (new File ("iperpozione.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 qIperpozione.setText(linea);
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner scan = new Scanner (new File ("pozionemax.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 qPozionemax.setText(linea);
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
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

        puntilbl = new javax.swing.JLabel();
        totalelbl = new javax.swing.JLabel();
        qEtere = new javax.swing.JLabel();
        qPozionemax = new javax.swing.JLabel();
        qIperpozione = new javax.swing.JLabel();
        qSuperpozione = new javax.swing.JLabel();
        qPozione = new javax.swing.JLabel();
        qEteremax = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descrizione = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        prodottolbl = new javax.swing.JLabel();
        Spinner = new javax.swing.JSpinner();
        aggiungi = new javax.swing.JButton();
        sfondoNegozio = new javax.swing.JLabel();
        selezionaPozione = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 785));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        puntilbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        puntilbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        puntilbl.setText("0");
        puntilbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(puntilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 298, 70, 30));

        totalelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalelbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalelbl.setText("0");
        totalelbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(totalelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 327, 70, 30));

        qEtere.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        qEtere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qEtere.setText("0");
        qEtere.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(qEtere, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 232, 40, 30));

        qPozionemax.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        qPozionemax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qPozionemax.setText("0");
        qPozionemax.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(qPozionemax, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 187, 40, 30));

        qIperpozione.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        qIperpozione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qIperpozione.setText("0");
        qIperpozione.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(qIperpozione, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 141, 40, 30));

        qSuperpozione.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        qSuperpozione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qSuperpozione.setText("0");
        qSuperpozione.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(qSuperpozione, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 94, 40, 30));

        qPozione.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        qPozione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qPozione.setText("0");
        qPozione.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(qPozione, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 48, 40, 30));

        qEteremax.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        qEteremax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qEteremax.setText("0");
        qEteremax.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(qEteremax, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 277, 40, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/negozio/negozioStat.gif"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        descrizione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descrizione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/negozio/descrizionePozione.png"))); // NOI18N
        descrizione.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(descrizione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 700, 110));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/selezionaPokemon/homeOmbra.png"))); // NOI18N
        home.setContentAreaFilled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 676, 220, 160));

        prodottolbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prodottolbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prodottolbl.setText("Pozione");
        prodottolbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(prodottolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 547, 120, 30));

        Spinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Spinner.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        Spinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 70, 30));

        aggiungi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/negozio/aggiungiOmbra.png"))); // NOI18N
        aggiungi.setContentAreaFilled(false);
        aggiungi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aggiungi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aggiungiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aggiungiMouseExited(evt);
            }
        });
        aggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiActionPerformed(evt);
            }
        });
        getContentPane().add(aggiungi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 542, 40, 50));

        sfondoNegozio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sfondoNegozio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giocofinal/negozio/sfondoNegozio.png"))); // NOI18N
        sfondoNegozio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(sfondoNegozio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 700, 380));

        selezionaPozione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pozione", "Superpozione", "Iperpozione", "Pozionemax", "Etere", "Eteremax" }));
        selezionaPozione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selezionaPozioneActionPerformed(evt);
            }
        });
        getContentPane().add(selezionaPozione, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents






    private void aggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiActionPerformed
        int numero = (int) Spinner.getValue();
        
        int punti=0;
        Integer quantita = (Integer) valore;
        try {
            Scanner scan = new Scanner (new File ("punti.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                punti = Integer.parseInt(linea);
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        if (selezionaPozione.getSelectedIndex()==0) {
            int costo = numero*150;
            System.out.println(costo);
            
            if (punti>=costo) {
                try {
            Scanner scan = new Scanner (new File ("pozionen.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 int tmp = Integer.parseInt(linea);
                 tmp += numero;
                 
                 try(FileWriter scrivi = new FileWriter ("pozionen.txt")) {
                     String tmp2 = tmp+"";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                try(FileWriter scrivi = new FileWriter ("punti.txt")) {
                     punti -= costo;
                     String tmp2 = punti + "";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Non hai abbastanza punti per questo articolo", "Punti", JOptionPane.INFORMATION_MESSAGE);
            }
        } else 
        if (selezionaPozione.getSelectedIndex()==1) {
            int costo = numero*250;
            System.out.println(costo);
            
            if (punti>=costo) {
                try {
            Scanner scan = new Scanner (new File ("superpozione.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 int tmp = Integer.parseInt(linea);
                 tmp += numero;
                 
                 try(FileWriter scrivi = new FileWriter ("superpozione.txt")) {
                     String tmp2 = tmp+"";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                try(FileWriter scrivi = new FileWriter ("punti.txt")) {
                     punti -= costo;
                     String tmp2 = punti + "";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else {
                JOptionPane.showMessageDialog(null, "Non hai abbastanza punti per questo articolo", "Punti", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (selezionaPozione.getSelectedIndex()==2) {
            int costo = numero*350;
            System.out.println(costo);
            
            if (punti>=costo) {
                try {
            Scanner scan = new Scanner (new File ("iperpozione.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 int tmp = Integer.parseInt(linea);
                 tmp += numero;
                 
                 try(FileWriter scrivi = new FileWriter ("iperpozione.txt")) {
                     String tmp2 = tmp+"";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                try(FileWriter scrivi = new FileWriter ("punti.txt")) {
                     punti -= costo;
                     String tmp2 = punti + "";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else {
                JOptionPane.showMessageDialog(null, "Non hai abbastanza punti per questo articolo", "Punti", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (selezionaPozione.getSelectedIndex()==3) {
            int costo = numero*450;
            System.out.println(costo);
            
            if (punti>=costo) {
                try {
            Scanner scan = new Scanner (new File ("pozionemax.txt")); 
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                 int tmp = Integer.parseInt(linea);
                 tmp += numero;
                 
                 try(FileWriter scrivi = new FileWriter ("pozionemax.txt")) {
                     String tmp2 = tmp+"";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
                
            }    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                try(FileWriter scrivi = new FileWriter ("punti.txt")) {
                     punti -= costo;
                     String tmp2 = punti + "";
                scrivi.write(tmp2);
        } catch (IOException ex) {
            Logger.getLogger(borsa.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else {
                JOptionPane.showMessageDialog(null, "Non hai abbastanza punti per questo articolo", "Punti", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (selezionaPozione.getSelectedIndex()==4 || selezionaPozione.getSelectedIndex()==5) {
            JOptionPane.showMessageDialog(null, "Questo articolo non è disponibile", "non disponibile",JOptionPane.INFORMATION_MESSAGE);
        }
        AudioPlayer.stop();
        this.setVisible(false);
        new start().setVisible(true);
            
    }//GEN-LAST:event_aggiungiActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        AudioPlayer.stop();
        this.setVisible(false);
        new start().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void aggiungiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aggiungiMouseEntered
        aggiungi.setIcon(new ImageIcon(getClass().getResource("aggiungi.png")));
    }//GEN-LAST:event_aggiungiMouseEntered

    private void aggiungiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aggiungiMouseExited
        aggiungi.setIcon(new ImageIcon(getClass().getResource("aggiungiOmbra.png")));
    }//GEN-LAST:event_aggiungiMouseExited

    private void selezionaPozioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selezionaPozioneActionPerformed
        if(selezionaPozione.getSelectedIndex()==0){
            descrizione.setIcon(new ImageIcon(getClass().getResource("descrizionePozione.png")));
            prodottolbl.setText("Pozione");
            prezzo=150;
        }
        if(selezionaPozione.getSelectedIndex()==1){
            descrizione.setIcon(new ImageIcon(getClass().getResource("descrizioneSuperpozione.png")));
            prodottolbl.setText("Superpozione");
            prezzo=250;
        }
        if(selezionaPozione.getSelectedIndex()==2){
            descrizione.setIcon(new ImageIcon(getClass().getResource("descrizioneIperpozione.png")));
            prodottolbl.setText("Iperpozione");
            prezzo=350;
        }
        if(selezionaPozione.getSelectedIndex()==3){
            descrizione.setIcon(new ImageIcon(getClass().getResource("descrizionePozionemax.png")));
            prodottolbl.setText("Pozione Max");
            prezzo=450;
            
        }
        if(selezionaPozione.getSelectedIndex()==4){
            descrizione.setIcon(new ImageIcon(getClass().getResource("descrizioneEtere.png")));
            prodottolbl.setText("Etere");
            prezzo=200;
        }
        if(selezionaPozione.getSelectedIndex()==5){
            descrizione.setIcon(new ImageIcon(getClass().getResource("descrizioneEteremax.png")));
            prodottolbl.setText("Etere Max");
            prezzo=450;
        }
        
    }//GEN-LAST:event_selezionaPozioneActionPerformed

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
            java.util.logging.Logger.getLogger(Negozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Negozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Negozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Negozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Negozio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Spinner;
    private javax.swing.JButton aggiungi;
    private javax.swing.JLabel descrizione;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel prodottolbl;
    private javax.swing.JLabel puntilbl;
    private javax.swing.JLabel qEtere;
    private javax.swing.JLabel qEteremax;
    private javax.swing.JLabel qIperpozione;
    private javax.swing.JLabel qPozione;
    private javax.swing.JLabel qPozionemax;
    private javax.swing.JLabel qSuperpozione;
    private javax.swing.JComboBox<String> selezionaPozione;
    private javax.swing.JLabel sfondoNegozio;
    private javax.swing.JLabel totalelbl;
    // End of variables declaration//GEN-END:variables
}
