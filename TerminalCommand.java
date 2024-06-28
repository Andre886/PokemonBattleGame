package giocofinal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TerminalCommand {

    public static void comando() {
        try {
            // Esegui il comando nel terminale di macOS
            String command = "pmset -g batt "; // Comando di esempio (elencare i file nella directory corrente)
            Process process = Runtime.getRuntime().exec(command);

            // Leggi l'output del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                try (FileWriter f = new FileWriter("battery.txt")) {
                    f.write(line);
                }
            }

            // Attendere il completamento del comando
            int exitCode = process.waitFor();
            System.out.println("Il comando è stato eseguito con codice di uscita: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    public static int percentuale() {
        String input = "";
        try {
            Scanner scan = new Scanner (new File("battery.txt"));
            while (scan.hasNextLine()) {
                input = scan.nextLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TerminalCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // Definisci il pattern per estrarre il numero
        Pattern pattern = Pattern.compile("\\b(\\d{1,3})%");
        
        // Crea un matcher sull'input
        Matcher matcher = pattern.matcher(input);
        
        // Trova il match estraendo il numero
        if (matcher.find()) {
            String numberString = matcher.group(1); // Estrae il primo gruppo di cattura
            int number = Integer.parseInt(numberString); // Converte la stringa in un numero intero
            System.out.println("Il numero estratto è: " + number);
            return number;
        } else {
            System.out.println("Nessun numero trovato nell'input.");
            return -1;
        }
    }
    
    public static boolean ACPower() {
        String input = "";
        try {
            Scanner scan = new Scanner (new File("battery.txt"));
            while (scan.hasNextLine()) {
                input = scan.nextLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TerminalCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Definisci il pattern per estrarre lo stato della carica
        Pattern pattern = Pattern.compile("(charging|discharging)");
        
        // Crea un matcher sull'input
        Matcher matcher = pattern.matcher(input);
        
        // Trova il match estraendo lo stato della carica
        if (matcher.find()) {
            String chargingState = matcher.group(1); // Estrae il primo gruppo di cattura
            System.out.println("Lo stato della carica è: " + chargingState);
            if (chargingState.equals("charging")) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Nessuno stato della carica trovato nell'input.");
        }
        return false;
    }
    
}





