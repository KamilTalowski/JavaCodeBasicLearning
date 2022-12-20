package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;

public class PgrogressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);

    PgrogressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.DARK_GRAY);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(bar);

        frame.setVisible(true);

        fill();

    }
    public void fill(){
        int counter=0;
        while (counter<=100){
            bar.setValue(counter);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=1;
        }
        bar.setString("DONE :) ");

    }


}
