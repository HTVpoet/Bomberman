package uet.oop.bomberman.menu;
import uet.oop.bomberman.SimpleAudioPlayer;
import uet.oop.bomberman.gui.Frame;

import java.awt.event.MouseAdapter;
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PressStart extends MouseAdapter{

    public static int RUN = 0;

    public void mouseClicked(MouseEvent e){
         System.out.println(e.getX()+" "+e.getY());
         RUN++;
    }

}