/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mazerunner;

import java.awt.Graphics;

/**
 *
 * @author yassi
 */
public class SpelObject {
    protected int x;
    protected int y;
    protected String objectNaam;
    
    public SpelObject (String objectNaam,int x,int y){
        this.x = x;
        this.y = y;
        this.objectNaam = objectNaam;
        
    }
    public void initialiseerAfbeeldingen(){};
    public void update(){};
    public void teken(Graphics g){};

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
}
