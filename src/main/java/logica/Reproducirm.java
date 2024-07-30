package logica;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Reproducirm {

    private static Reproducirm instancia = null; 
    private Clip clip;
    private boolean rp = false;
    private boolean bucle = true; 

    public Reproducirm() {
    }
    
    public static Reproducirm obinstancia() {
        if (instancia == null) {
            instancia = new Reproducirm();
        }
        return instancia;
    }

    public void reproducir() {
        try {
            if (clip == null || !clip.isRunning()) {
                File file = new File("/home/rodrigo/Descargas/lover.wav");
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                if (bucle) {
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                } else {
                    clip.start();
                }
                rp = true;
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
            rp = false;
        }
    }

    public boolean rpmusica() {
        return rp;
    }
    
    public void hacerloop(boolean bucle) {
        this.bucle = bucle;
    }
}
