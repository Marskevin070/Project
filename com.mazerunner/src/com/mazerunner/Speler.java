
package com.mazerunner;

import java.awt.Graphics;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;




/**
 *
 * @author yassi
 */
public class Speler extends SpelObject{
    
    private final String Speler_Locatie = "src/images/speler.png";
    private BufferedImage Speler = null;   
    private int velx = 50;
    private int vely = 50;
    
    
    public Speler (String objectNaam, int x, int y) {
        super(objectNaam,x, y);
        
    }
    
    @Override 
    public void initialiseerAfbeeldingen(){
        try{
            Speler = ImageIO.read(new File(Speler_Locatie));
        }catch (Exception e){
            System.out.println("Afbeelding niet gevonden");
        }
    }

    
    @Override
    public void teken(Graphics g){
        g.drawImage(Speler, x, y, 30,40, null);
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void playerMoveRight(){
       if ( x >=0 && x <= 550 )
    {
       x = x + velx;
    }
    
    }
    public void playerMoveLeft(){
        if ( x >=0 && x <= 550 )
    {
        x = x - velx;
    }
    }
    public void playerMoveUp(){
        if ( y >=0 && y <= 550 )
    {
        y = y - vely;
    }
    }
    public void playerMoveDown(){
        if ( y >=0 && y <= 550 )
    {
        y = y + vely;
    }
    }
}



