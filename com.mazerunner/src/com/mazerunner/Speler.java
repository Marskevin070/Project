/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mazerunner;

import java.awt.Graphics;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author yassi
 */
public class Speler extends SpelObject{
    public Speler(int x, int y) {
        super(x, y);
    
    }

    
    @Override
    public void teken(Graphics g){
        g.fillOval(x, y, 20, 35);
    }
}
