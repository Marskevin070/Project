
package com.mazerunner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author yassi
 */
public class Eindpunt extends SpelObject {
    private final String Einde_Locatie = "src/images/einde.png";
    private BufferedImage Einde = null;
    
    public Eindpunt(String objectNaam, int x, int y) {
        super(objectNaam,x, y);
    }
    @Override
    public void initialiseerAfbeeldingen(){
        try{
            Einde = ImageIO.read(new File(Einde_Locatie));
        }catch (Exception e){
            System.out.println("Afbeelding niet gevonden");
        }
    }
    @Override
    public void teken(Graphics g){
        g.drawImage(Einde, x, y, 50, 50, null);
    }
}
