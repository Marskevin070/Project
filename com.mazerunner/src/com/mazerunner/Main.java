//github
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
  private Speler speler = new Speler("Piraat",105,98);
  private Eindpunt eindpunt = new Eindpunt("eindpuntObject",545,540);
  private ArrayList<SpelObject> objects = new ArrayList<>();
  private Boolean objectCheck[][] = new Boolean[10][10];

  public Main() {

    }
    @Override
    public void paintComponent(Graphics g){
        for(int i = 0; i<speelveld.length; i++){
            for(int j = 0; j<speelveld[0].length; j++){
                g.drawRect(90 + (i * 50),90 + (j * 50) , 50, 50);
                if(this.speelveld[i][j] != null){
                this.speelveld[i][j].initialiseerAfbeeldingen();
                this.speelveld[i][j].teken(g);
                }
            }
        }

    }
    public void gridLayout(Graphics g){
        speelveld[0][0] = speler;
        speelveld[9][9] = eindpunt;
        
        Random rand = new Random();
        int pinNummer = rand.nextInt(3) + 1;
        //int x = rand.nextInt(speelveld.length);
        //int y = rand.nextInt(speelveld[0].length);

        for(int i = 0; i <4; i++){
            int x = rand.nextInt(speelveld.length);
            int y = rand.nextInt(speelveld[0].length);
            objects.add(new Sleutel("sleutel",50*x + 95, 50*y + 100, pinNummer));
        }
        for(int i = 0; i <4; i++){
            int x = rand.nextInt(speelveld.length);
            int y = rand.nextInt(speelveld[0].length);
            objects.add(new Barricade("barricade",50*x + 90, 50 * y + 90, pinNummer));
        }
        for(int i = 0; i <18; i++){
            int x = rand.nextInt(speelveld.length);
            int y = rand.nextInt(speelveld[0].length);
            objects.add(new Muur("muur",50*x + 90, 50 * y + 90));
        }
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(objects.size() <= 0){
                    break;
                }
                if(this.speelveld[i][j] == null && rand.nextInt(3) == 1){
                    this.speelveld[i][j] = objects.remove(objects.size() -1);
                    this.speelveld[i][j].setX(90 + 50*i);
                    this.speelveld[i][j].setY(90 + 50*j);
                }
            }

    }
    }
    }

