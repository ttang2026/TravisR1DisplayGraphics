/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.awt.*;
import javax.swing.*;
// Create a constructor method
public class Main extends JPanel{
public Main(){
super();
}

/* Create a paintComponent() method to override the one in
JPanel.This is where the drawing happens. We don't have
to call it in our program, it gets called automatically
whenever the panel needs to be redrawn, like when it is
made visible or moved or whatever.
*/
@Override
public void paintComponent(Graphics g){
  // Making a mushroom head  
  g.setColor(Color.red);
  g.fillOval(750, 400, 350, 250);
  // Making the white spaces of the mushroom head
  g.setColor(Color.WHITE);
  g.fillOval(870, 405, 105, 103);
  g.fillOval(720, 460, 70, 110);
  g.fillOval(1050, 460, 70, 110);
  // Making the head
  g.setColor(Color.ORANGE);
  g.fillOval(807, 510, 240, 180);
  // Making the eyes
  g.setColor(Color.BLACK);
  g.fillOval(860, 530, 35, 75);
  g.fillOval(950,530, 35, 75);
  // Making the light in the eyes
  g.setColor(Color.WHITE);
  g.fillOval(872, 535, 10, 20);
  g.fillOval(962, 535, 10, 20);
  //Making a smile
  g.setColor(Color.BLACK);
  g.drawArc(850, 560, 150, 100, 0, -180);
  


}
public static void main(String arg[]){
JFrame frame = new JFrame("BasicJPanel");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
// Create a new identifier for a BasicJPanel called "panel",
// then create a new BasicJPanel object for it to refer to.
Main panel = new Main();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
frame.setContentPane(panel);
frame.setVisible(true);
}
}

/**
 *
 * @author TTang2026
 */

