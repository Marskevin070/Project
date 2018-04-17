//github
package com.mazerunner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.Timer;



  public class Main extends JComponent implements KeyListener, ActionListener{
  private SpelObject[][] speelveld = new SpelObject[10][10];
  private Speler speler = new Speler("Piraat",90,90);
  private Eindpunt eindpunt = new Eindpunt("eindpuntObject",545,540);
  private ArrayList<SpelObject> objects = new ArrayList<>();
  Timer t = new Timer(5,this);
  private Boolean objectCheck[][] = new Boolean[10][10];
  
  public void actionPerformed(ActionEvent e){
      repaint();            
  }
  
  public void keyTyped(KeyEvent e){}
 
  public void keyReleased(KeyEvent e){}
  
  public void keyPressed(KeyEvent e){
    
    int code = e.getKeyCode();
    
        if(code == KeyEvent.VK_RIGHT && canMove ("right") == true){
        speler.playerMoveRight();
    }  
    
        if(code == KeyEvent.VK_LEFT && canMove ("left") == true){
        speler.playerMoveLeft();
    } 
    
        if(code == KeyEvent.VK_UP && canMove ("up") == true){
        speler.playerMoveUp();
    } 
    
        if(code == KeyEvent.VK_DOWN && canMove ("down") == true){
        speler.playerMoveDown();
    } 
        
       
  }
  
  
  public Main() {
      setFocusable(true);
      setFocusTraversalKeysEnabled(false);
      addKeyListener(this);
      t.start();
      
    }
  
    @Override
    public void paintComponent(Graphics g){
        for(int rij = 0; rij<speelveld.length; rij++){
            for(int kolom = 0; kolom<speelveld[0].length; kolom++){
                g.drawRect(90 + (rij * 50),90 + (kolom * 50) , 50, 50);
                if(this.speelveld[rij][kolom] != null){
                this.speelveld[rij][kolom].initialiseerAfbeeldingen();
                this.speelveld[rij][kolom].teken(g);
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
        for(int rij = 0; rij<10; rij++){
            for(int kolom = 0; kolom<10; kolom++){
                if(objects.size() <= 0){
                    break;
                }
                if(this.speelveld[rij][kolom] == null && rand.nextInt(3) == 1){
                    this.speelveld[rij][kolom] = objects.remove(objects.size() -1);
                    this.speelveld[rij][kolom].setX(90 + 50*rij);
                    this.speelveld[rij][kolom].setY(90 + 50*kolom);
                }
            }

    }
    }
    
    
    public boolean canMove(String move){
      int spelerXPos = speler.getX();
      int spelerYPos = speler.getY();
      
    if(move.equalsIgnoreCase("right")){
        spelerXPos = spelerXPos + 50;
    }
      
    if(move.equalsIgnoreCase("left")){
       spelerXPos = spelerXPos - 50;
    }

    if(move.equalsIgnoreCase("up")){
       spelerYPos = spelerYPos - 50;
    }

    if(move.equalsIgnoreCase("down")){
       spelerYPos = spelerYPos+ 50;
    }
    
    
    if(spelerXPos <= 100 || spelerXPos >560){
        return false;
    }

    if(spelerYPos <= 50 || spelerYPos >550){
        return false;
    }

    for(int rij = 0; rij<speelveld.length; rij++){
        for(int kolom = 0; kolom<speelveld[0].length; kolom++){
            if(this.speelveld[rij][kolom] != null){
                SpelObject spelObject = this.speelveld[rij][kolom];
                if(spelObject.getX() == spelerXPos && spelObject.getY() == spelerYPos){
                    return false;
                }
            }
        }
    }
    
    return true;
           
  }
  }
