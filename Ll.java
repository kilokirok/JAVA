import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

// l = scale of table
// ll = window and font size
// lll = y or n answer
// llllll = first for loop
// lllllll = second for loop



public class Ll extends JPanel {
  int l;
  static int ll;
  int lll;
  //Pop-ups
  public Ll() {
    lll = JOptionPane.showConfirmDialog(null, "Multiplication?");
    String s = JOptionPane.showInputDialog("Enter a number, the scale of table.\nEX) N X N");
    l = Integer.parseInt(s);
    String lllll = JOptionPane.showInputDialog("Enter a number, the size of window");
    ll = Integer.parseInt(lllll);
 
  }

  @Override
  public void paintComponent(Graphics g) {
    //(M)ultiplication table
    if (lll == 0) {
      g.setFont(new Font("Ariel",Font.ITALIC,15+(ll/100)));
      g.setColor(Color.GREEN);
      g.fillRect(0,0,((600+(ll/l))/l), (600+ll));
      g.fillRect(0,0,(600+ll), ((600+(ll/l))/l));
      g.setColor(Color.black);
      var wide = getWidth();
      var cwide = wide/l;
      var height = getHeight();
      var cheight = height/l;
      var a = 0;
      var b = 0;
      for(int llllll=0; llllll<l; llllll++) {
        for(int lllllll=0; lllllll<l; lllllll++) {
          g.drawRect(a,b,cwide,cheight);
          g.drawString(" "+(llllll+1)*(lllllll+1),a,b+15);
          a+=cwide;
        }
        b+=cheight;
        a=0;
      }
    }
   //(A)ddition table
    if (lll == 1) {
      g.setFont(new Font("Calabri",Font.ITALIC,15+(ll/100)));
      g.setColor(Color.GREEN);
      g.fillRect(0,0,((600+(ll/l))/l), (600+ll));
      g.fillRect(0,0,(600+ll), ((600+(ll/l))/l));
      g.setColor(Color.black);
      var wide = getWidth();
      var cwide = wide/l;
      var height = getHeight();
      var cheight = height/l;
      var a = 0;
      var b = 0;
      for(int llllll=0; llllll<l+1; llllll++) {
        for(int lllllll=0; lllllll<l+1; lllllll++) {
          g.drawRect(a,b,cwide,cheight);
          g.drawString(" "+((llllll-1)+lllllll),a,b+15);
          a+=cwide;
        }
        b+=cheight;
        a=0;
      }
    }
  }
    //window
  public static void main(String[] args) {
    var window = new JFrame();
    window.setSize(600+ll,600+ll);
    window.setContentPane(new Ll());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    }
  }