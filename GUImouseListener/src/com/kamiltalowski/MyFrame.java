package com.kamiltalowski;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;

    ImageIcon icon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        icon1 = new ImageIcon("1.png");
        icon2 = new ImageIcon("2.png");
        icon3 = new ImageIcon("3.png");
        icon4 = new ImageIcon("4.png");

        label = new JLabel();
        /*label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);*/
        label.addMouseListener(this);
        label.setIcon(icon1);


        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // invoked when the mouse button  has been clicked (pressed and released) on a component
        //System.out.println("You clicked(pressed+released) the mouse button");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        /*System.out.println("You pressed the mouse button");
        label.setBackground(Color.orange);*/
        label.setIcon(icon3);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has released on a component
        /*System.out.println("You released mouse button");
        label.setBackground(Color.green);*/
        label.setIcon(icon4);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when the mouse enters a component
        /*System.out.println("You entered the component with mouse cursor");
        label.setBackground(Color.blue);*/
        label.setIcon(icon2);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // invoked when the mouse exits a component
        /*System.out.println("You exited the component with mouse cursor");
        label.setBackground(Color.red);*/
        label.setIcon(icon1);

    }
}




