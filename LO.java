import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class LO extends JPanel {

  //content that will be placed in window
  @Override
  public void paintComponent(Graphics g) {
    g.setColor(Color.BLUE);
    g.drawString("'Ohana. Ohana means family", 10, 20);
    g.drawString("And family means nobody gets", 10, 40);
    g.drawString("left behind or forgotten' - Stitch", 10, 60);
  }

  //window size and place
  public static void main (String[] args) {
    var w = new JFrame();
    w.setSize(200,200);
    w.setContentPane(new LO());
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setVisible(true);
  }

}
 