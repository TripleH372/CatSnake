import java.awt.geom.*;
import javax.swing.JApplet;
import java.awt.*; //The Color Class is included
import java.awt.EventQueue.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class CatSnake extends JFrame{
    private static final long serialVersionUID = 1L; //My dad suggested that I add this while we were doing the debugging process.
    public static final int CAT_MOVER = 20; //This will be a final static variable to move the cat (not object associated)
    boolean is_this_the_first_time = true; //change this to false when the first time is done
    int cat_head_left_side = 30;
    int cat_head_right_side = 80;
    int cat_left_ear = 45;
    int cat_right_ear = 65;
    int cat_left_eye = 37;
    int cat_right_eye = 63;
    //These are the starting positions with the x component.
    int appletHeight;
    int appletWidth;
    public CatSnake(){ //Might need to make this method static but I'm keeping it object oriented for right now
        this.setSize(600, 400);
        Dimension appletSize = this.getSize();
        appletHeight = appletSize.height;
        appletWidth = appletSize.width;
    }
    public void update(Graphics g){ //Might need to make this method static but I'm keeping it object oriented for right now
        paint(g);
    }
    public void paint(Graphics g){ //Might need to make this method static but I'm keeping it object oriented for right now
        Graphics2D myGraphics2D = (Graphics2D) g; //This will instantiate a new Graphics2D Object, casting a normal Graphics parameter as a Graphics2D
        if(is_this_the_first_time){
            Rectangle2D.Float grassRectangle = new Rectangle2D.Float(0, appletHeight/2, appletWidth, appletHeight/2);
            myGraphics2D.setColor(Color.green);
            myGraphics2D.fill(grassRectangle);
        }
    }
    public static void main (String[] args){
        CatSnake f = new CatSnake();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}