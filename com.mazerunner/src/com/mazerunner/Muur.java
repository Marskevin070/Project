/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mazerunner;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author yassi
 */
public class Muur extends SpelObject {
    
    public Muur(int x, int y) {
        super(x, y);
    }
    @Override
    public void teken(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 35);
        }
}
