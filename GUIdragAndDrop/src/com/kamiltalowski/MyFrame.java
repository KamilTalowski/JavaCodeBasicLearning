package com.kamiltalowski;

import javax.swing.*;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();


    MyFrame(){


        this.setTitle("Drag&Drop demo");
        this.setSize(400,400);


        this.add(dragPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
