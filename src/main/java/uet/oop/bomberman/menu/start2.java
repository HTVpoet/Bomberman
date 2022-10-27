
package uet.oop.bomberman.menu;
import java.awt.*;
import javax.swing.JFrame;

import java.awt.event.*;

import static java.awt.SystemColor.window;

public class start2 extends JFrame {

    Image img;

    public start2() {

        this.setSize(500,500);

//Lấy hình ảnh cần hiển thị

        img=this.getToolkit().getImage("src/main/resources/textures/bombomman.jpg");

    }

    public void paint(Graphics g){
//Vẽ hình vào khung cửa sổ
        g.drawImage(img,0,0,this);
    }

    public static void main(String args[]){

        start2 dr=new start2();
        dr.show();
       dr.getContentPane().addMouseListener(new PressStart());
    }

}