
package com.mazerunner;

import java.awt.Graphics;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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
    private Sleutel zak = null;
    
    
    
    public Speler (String objectNaam, int x, int y) {
        super(objectNaam,x, y);
        
    }
    
    
    
     
    public void initialiseerAfbeeldingen(){
        try{
            Speler = ImageIO.read(new File(Speler_Locatie));
        }catch (IOException e){
            System.out.println("Afbeelding niet gevonden");
       }
    }

    public Sleutel getZak() {
        return this.zak;
    }
    public void setZak(Sleutel zak) {
        this.zak = zak;
    }
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
    x = x + 50;
    y = y + 0;
    }
    public void playerMoveLeft(){
    x = x - 50;
    y = y + 0;
    }
    public void playerMoveUp(){
    x = x + 0;
    y = y - 50;
    }
    public void playerMoveDown(){
    x = x + 0;
    y = y + 50;
    }

    
}





