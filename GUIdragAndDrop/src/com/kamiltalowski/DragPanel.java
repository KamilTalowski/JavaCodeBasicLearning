package com.kamiltalowski;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("icon.png");
    final int WIDTH   = image.getIconWidth();
    final int HEIGHT   = image.getIconHeight();
    Point imageCorner;
    Point prevPt;


    DragPanel(){

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);


    }

    public  void  paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        image.paintIcon(this, graphics, (int)imageCorner.getX(), (int)imageCorner.getY());

    }
    private class ClickListener extends MouseAdapter{ //wait for click

        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();

        }

    }
    private class DragListener extends MouseMotionAdapter{ // dragging image after click
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imageCorner.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }


    }

}
