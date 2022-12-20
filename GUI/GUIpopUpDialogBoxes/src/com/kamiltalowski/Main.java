package com.kamiltalowski;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something

        //JOptionPane.showMessageDialog(null,"This is some info", "title", JOptionPane.PLAIN_MESSAGE);
        /*JOptionPane.showMessageDialog(null,"This is some more info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"What?? ", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your computer has a virus!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Call now or else", "title", JOptionPane.ERROR_MESSAGE);*/

        //System.out.println(JOptionPane.showConfirmDialog(null," do you even code?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null," do you even code?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        /*String name= JOptionPane.showInputDialog("What is your name?: ");
        System.out.println("Hello "+ name);*/

        String[]  responses = {"No you are awesome","thank you", "blush"};
        ImageIcon icon = new ImageIcon("icon.png");

        JOptionPane.showOptionDialog(null,"You are awesome!","secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,responses,0);
    }
}
