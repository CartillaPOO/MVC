package cvo.clases;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import java.io.IOException;

public class SFX {
    private File sonidoLabel = new File("cvo/Recursos/sonidosUI/LabelEnter2.wav");
    private AudioInputStream entradaAudioLabel;
    private AudioFormat formatoLabel;
    private Clip clipLabel;

    private File sonidoLabelClic = new File("cvo/Recursos/sonidosUI/LabelClick.wav");
    private AudioInputStream entradaAudioLabelClic;
    private AudioFormat formatoLabelClic;
    private Clip clipLabelClic;

    private File sonidoBoton = new File("cvo/Recursos/sonidosUI/Button2.wav");
    private AudioInputStream entradaAudioBoton;
    private AudioFormat formatoBoton;
    private Clip clipBoton;



    public SFX(){
        try{ 
        //Cargar archivo de sonido
        entradaAudioLabel = AudioSystem.getAudioInputStream(sonidoLabel);
        entradaAudioLabelClic = AudioSystem.getAudioInputStream(sonidoLabelClic);
        entradaAudioBoton = AudioSystem.getAudioInputStream(sonidoBoton);
        //System.out.println("error antes de cargar");

        // Obtener el formatoLabel de audio del archivo
        formatoLabel = entradaAudioLabel.getFormat();
        formatoLabelClic = entradaAudioLabelClic.getFormat();
        formatoBoton = entradaAudioBoton.getFormat();
        // Crear un DataLine.Info para reproducir el sonido
        DataLine.Info infoLabel = new DataLine.Info(Clip.class, formatoLabel);
        DataLine.Info infoLabelClic = new DataLine.Info(Clip.class, formatoLabelClic);
        DataLine.Info infoBoton = new DataLine.Info(Clip.class, formatoBoton);

        // Obtener una instancia del Clip
        clipLabel = (Clip)AudioSystem.getLine(infoLabel);
        clipLabelClic = (Clip)AudioSystem.getLine(infoLabelClic);
        clipBoton = (Clip)AudioSystem.getLine(infoBoton);

        // Abrir el flujo de audio y cargar los datos en el Clip
        clipLabel.open(entradaAudioLabel);
        clipLabelClic.open(entradaAudioLabelClic);
        clipBoton.open(entradaAudioBoton);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void sonidoLabel(){
        try{ 
        clipLabel.setFramePosition(0);
        clipLabel.start();

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void sonidoLabelClic(){
        try{ 
        clipLabelClic.setFramePosition(0);
        clipLabelClic.start();

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void sonidoBoton(){
        try{ 
        clipBoton.setFramePosition(0);
        clipBoton.start();

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
