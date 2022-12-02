package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    // JFrame = a GUI window to add components to

/*        JFrame frame = new JFrame();// creates a frame
        frame.setTitle("Title goes here");//set title in the top bar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application that doesn't run in background(default hide)
        frame.setSize(420,420);//sets width and height of frame(window)
        frame.setVisible(true);//make frame visible

        ImageIcon image= new ImageIcon("sample-logo.png");//image icon in top bar
        frame.setIconImage(image.getImage());//change icon of frame
        //frame.getContentPane().setBackground(Color.GREEN);
        frame.getContentPane().setBackground(new Color(75, 75, 175));//change color of background*/

        MyFrame myFrame = new MyFrame();
        new MyFrame();//also works

    }
}
