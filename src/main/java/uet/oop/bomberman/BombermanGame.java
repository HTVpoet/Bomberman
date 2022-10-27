package uet.oop.bomberman;
import java.awt.*;
import javax.swing.JFrame;

import uet.oop.bomberman.graphics.SpriteSheet;
import uet.oop.bomberman.gui.Frame;
import uet.oop.bomberman.menu.PressStart;
import uet.oop.bomberman.menu.start2;

import uet.oop.bomberman.menu.start2;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.MouseEvent;



public class BombermanGame extends PressStart{
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        start2 dr = new start2();
        dr.show();
        dr.getContentPane().addMouseListener(new PressStart());
            SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer();
            audioPlayer.play();
            new Frame();
    }
}