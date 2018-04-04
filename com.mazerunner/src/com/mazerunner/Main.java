/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mazerunner;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;


import javax.swing.JFrame;
import javax.swing.JPanel;


  public class Main extends JComponent {
  private SpelObject[][] speelveld = new SpelObject[10][10];
  private Speler speler = new Speler(0,0);
  private Eindpunt eindpunt = new Eindpunt(9,9);
  private ArrayList<SpelObject> objects = new ArrayList<>();
  public Main() {
    
    }
    
    public void paintComponent(Graphics g){
        for(int i = 0; i<speelveld.length; i++){
           for(int j = 0; j<speelveld[0].length; j++){
              g.drawRect(90 + (i * 50),100 + (j * 50) , 50, 50);       
           }
        }  
        for(int i = 0; i < objects.size(); i++){
            objects.get(i).teken(g);
        }
        
    }
    public void gridLayout(Graphics g){
        objects.add(speler);
        Random rand = new Random();
        int pinNummer = rand.nextInt(3) + 1;
        int x = rand.nextInt(speelveld.length);
        int y = rand.nextInt(speelveld[0].length);
        
        for(int i = 0; i <4; i++){
            objects.add(new Sleutel(x, y, pinNummer));
        }
    }
}

