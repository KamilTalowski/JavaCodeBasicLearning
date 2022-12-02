package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

        MyPanel panel;


        MyFrame(){
            panel= new MyPanel();

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500);

            this.add(panel);
            this.pack();
            this.setLocationRelativeTo(null); //set Label to middle of Monitor
            this.setVisible(true);
        }



}
