import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class go extends JPanel{
  
  @Override
  public void paintComponent(Graphics g) {
    //colors
    var skyblue = new Color(0x79edff);
    var sc = new Color(242,66,62);
    var gc = new Color(0xabc900);
    var pc = new Color(0xe5b473);
    var brown = new Color(0x6f4f28);
    var sign = new Color(0xfbceb1);
    var apc = new Color(0x6464ff);
    
    //changable parameter
    var dy = 0;

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

  

    //pyramid
    g.setColor(pc);
    g.fillRect(80,dy+275,240,30);
    g.fillRect(110,dy+245,180,30);
    g.fillRect(140,dy+215,120,30);
    g.fillRect(170,dy+185,60,30);

    //steps
    g.setColor(Color.black);
    g.fillRect(140,dy+300,120,1);
    g.fillRect(155,dy+290,90,1);
    g.fillRect(170,dy+280,60,1);
    g.fillRect(185,dy+270,30,1);

    //sign
    g.setColor(sign);
    g.fillRect(300, 300, 10, 50);
    g.fillRect(255, 305, 100, 30);

    g.setColor(Color.black);
    g.drawString("Jiyul's Pyramid", 267, 325);

    //Airplane
    g.setColor(apc);
    g.fillOval(250, 35, 130, 35);
    g.fillOval(300, 10, 20, 90);
    g.fillOval(372, 28, 8, 30);

    g.setColor(Color.black);
    g.drawString("GO, SEASIDERS!", 268, 55);
    
  }



  public static void main (String[] args) {
    var w = new JFrame();
    w.setSize(400,400);
    w.setContentPane(new go());
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}
