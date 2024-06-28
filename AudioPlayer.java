package giocofinal;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {

    private static Clip clip;

    public static void playInLoop(String path) {
    try {
        URL url = AudioPlayer.class.getResource(path);
        if (url != null) {
            try (AudioInputStream audioInput = AudioSystem.getAudioInputStream(url)) {
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        } else {
            System.out.println("File audio non esistente");
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Errore riproduzione audio: " + e.getMessage());
    }
}


    public static void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
