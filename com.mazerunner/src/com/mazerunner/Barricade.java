
package com.mazerunner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author yassi
 */
public class Barricade extends SpelObject {
    private int pinNummer;
    private final String Barricade_Locatie = "src/images/barricade.png";
    private BufferedImage Barricade = null;
    
    public Barricade(String objectNaam, int x, int y, int pinNummer) {
        super(objectNaam, x, y);
        this.pinNummer = pinNummer;
    }
    
    @Override
    public void initialiseerAfbeeldingen(){
        try{
            Barricade = ImageIO.read(new File(Barricade_Locatie));
        }catch (Exception e){
            System.out.println("Afbeelding niet gevonden");
        }
    }
    @Override
    public void teken(Graphics g){
        g.drawImage(Barricade, x, y, 50, 50, null);
        
    }
}
