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
public class Barricade extends SpelObject {
    private int pinNummer;
    
    public Barricade(int x, int y, int pinNummer) {
        super(x, y);
        this.pinNummer = pinNummer;
    }
    @Override
    public void teken(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 50);
        
    }
}
