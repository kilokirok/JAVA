import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;


public class Pyra extends JPanel {

  private Pyramid j;
  private Pyramid jj;
  
  public Pyra(){

    var pp = new Color(0xe5b473);
    j = new Pyramid(-100, 0);
    jj = new Pyramid(500, 25, pp, Color.black);

  }

  public void paintComponent(Graphics g) {

    var skyblue = new Color(0x79edff);
    var sc = new Color(242,66,62);
    var gc = new Color(0xabc900);
    var brown = new Color(0x6f4f28);

    //sky
    g.setColor(skyblue);
    g.fillRect(0, 0, 400, 400);

   //sun 
    g.setColor(sc);
    g.fillOval(20, 30, 50, 50);

   // cloud 1
    g. setColor(Color.white);
    g.fillOval(70, 80, 50, 50);
    g.fillOval(100, 80, 50, 50);
    g.fillOval(70, 110, 50, 50);
    g.fillOval(100, 110, 50, 50);
    g.fillOval(55, 95, 50, 50);
    g.fillOval(85, 95, 50, 50);
    g.fillOval(115, 95, 50, 50);

    //cloud 2
    g.fillOval(160, 20, 50, 50);
    g.fillOval(190, 20, 50, 50);
    g.fillOval(160, 50, 50, 50);
    g.fillOval(190, 50, 50, 50);
    g.fillOval(145, 35, 50, 50);
    g.fillOval(175, 35, 50, 50);
    g.fillOval(205, 35, 50, 50);

    //cloud 3
    g.fillOval(300, 90, 50, 50);
    g.fillOval(330, 90, 50, 50);
    g.fillOval(300, 120, 50, 50);
    g.fillOval(330, 120, 50, 50);
    g.fillOval(285, 105, 50, 50);
    g.fillOval(315, 105, 50, 50);
    g.fillOval(345, 105, 50, 50);


    //plants
    g.setColor(brown);
    g.fillRect(-25,200,50,150);
    g.fillRect(75,200,50,150);
    g.setColor(Color.green);
    g.fillOval(-75,100,150,150);
    g.fillOval(50,150,100,100);
    

    //ground
    g.setColor(gc);
    g.fillOval(-200,275,800,400);

    j.draw(g);
    jj.draw(g);

  }

  public static void main (String[] args) {

    var w = new JFrame();
    w.setSize(400,400);
    w.setContentPane(new Pyra());
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setVisible(true);
    
  }



}
