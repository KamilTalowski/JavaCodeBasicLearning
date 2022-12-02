package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        
        this.setTitle("Title goes here");//set title in the top bar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application that doesn't run in background(default hide)
        this.setSize(420,420);//sets width and height of this(window)
        this.setVisible(true);//make this visible

        ImageIcon image= new ImageIcon("sample-logo.png");//image icon in top bar
        this.setIconImage(image.getImage());//change icon of this
        //this.getContentPane().setBackground(Color.GREEN);
        this.getContentPane().setBackground(new Color(75, 75, 175));//change color of background
    }

}
