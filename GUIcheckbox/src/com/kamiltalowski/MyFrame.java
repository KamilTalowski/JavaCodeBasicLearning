package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JCheckBox checkBox;
    ImageIcon checkIcon, xIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("xicon.png");
        checkIcon = new ImageIcon("icon.png");

        button = new JButton("Submit");
        button.addActionListener(this);



        checkBox = new JCheckBox();
        checkBox.setText("I' not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){

            System.out.println(checkBox.isSelected());
            /*
            button.setEnabled(false);

            */
        }

    }
}
