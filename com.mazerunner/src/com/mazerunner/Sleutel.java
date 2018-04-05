
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
public class Sleutel extends SpelObject {
    
    private int pinNummer;
    private final String Sleutel_Locatie = "src/images/sleutel.png";
    private BufferedImage Sleutel = null;
    
    public Sleutel(String objectNaam, int x, int y, int pinNummer) {
        super(objectNaam,x, y);
        this.pinNummer = pinNummer;
    }
    @Override
    public void initialiseerAfbeeldingen(){
        try{
            Sleutel = ImageIO.read(new File(Sleutel_Locatie));
        }catch (Exception e){
            System.out.println("Afbeelding niet gevonden");
        }
    }
    @Override
    public void teken(Graphics g){
        g.drawImage(Sleutel, x, y, 40, 40, null);
}
}
