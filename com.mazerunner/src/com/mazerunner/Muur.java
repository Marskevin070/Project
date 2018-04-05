
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
public class Muur extends SpelObject {
    private final String Muur_Locatie = "src/images/muur.png";
    private BufferedImage Muur = null;
    public Muur(String objectNaam, int x, int y) {
        super(objectNaam,x, y);
        }
    @Override 
    public void initialiseerAfbeeldingen(){
        try{
            Muur = ImageIO.read(new File(Muur_Locatie));
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }
    @Override
    public void teken(Graphics g){
        g.drawImage(Muur, x, y, 50, 50, null);
        }
}
