package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    // JPanel = a GUI component that function as a container to hold other components
        ImageIcon icon = new ImageIcon("icon.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);//border layout
        //label.setHorizontalAlignment(JLabel.RIGHT);//border layout
        label.setBounds(100,100,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        //redPanel.setLayout(new BorderLayout());//same as JFrame uses
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        //bluePanel.setLayout(new BorderLayout());//same as JFrame uses
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        //greenPanel.setLayout(new BorderLayout());//same as JFrame uses
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


    }
}
