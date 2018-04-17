/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mazerunner;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author yassi
 */

public class Frame extends JFrame{
    private Graphics g;
    //private int width, height;


    
    public Frame(int width, int heigth){
        this.setVisible(true);
        this.setPreferredSize(new Dimension(width,heigth));
        this.setMinimumSize(new Dimension(width,heigth));
        this.setMaximumSize(new Dimension(width,heigth));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SleutelBarricade");
        
        Main main = new Main();
        main.setPreferredSize(new Dimension(width,heigth));
        this.add(main);
        main.gridLayout(g);
        
        
    }
    
    
  

    public static void main(String[] args){
        Frame frame = new Frame(700,800);        
    }
}