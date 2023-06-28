import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;


public class CL extends JPanel {
  //field
  int j;
  ImageIcon clifford;
  ImageIcon badguys;
  ImageIcon drstrange;
  ImageIcon Daisy;
  int result;

  public CL() {
    //yes or no
    result = JOptionPane.showConfirmDialog(null,"Do you have a studnet or militury ID?");
    //age
    String jj = JOptionPane.showInputDialog("Enter your age");
    j = Integer.parseInt(jj);
    clifford = new ImageIcon("clifford.jpeg");
    badguys = new ImageIcon("badguys.jpeg");
    drstrange = new ImageIcon("drstrange.jpeg");
    Daisy = new ImageIcon("Daisy.jpeg");
  }



  @Override
  public void paintComponent(Graphics a) {
    
  // if no
    if (result == 1 ) {
      if ((j < 3) && (j>=0)){
        a.drawString("You get in free!", 0, 100);
        clifford.paintIcon(null,a, 100,0);
      }
    
      else if ((j >= 3) && (j<=11)) {
        badguys.paintIcon(null, a, 100,0);
        a.drawString("You owe $7.00!", 0,100);
      }
      else if ((j > 11) && (j<60)) {
        drstrange.paintIcon(null, a, 100,0);
        a.drawString("You owe $10.00!",0,100);
      }
      else if ((j >= 60 ) && (j<120)) {
        Daisy.paintIcon(null, a, 100,0);
        a.drawString("That will be $7.00, please.",0,320);
      }
      else if (j<0){
        a.drawString("You are too young to watch something", 0,200);
      }
      else if (j>=120){
        a.drawString("Can you really come and watch the movie? If you can you'r free.", 0,200);
      }
    }
    
    // if yes
    else if (result == 0 ) {
      if ((j < 3) && (j>=0)){
        a.drawString("You get in free!", 0, 100);
        clifford.paintIcon(null,a, 100,0);
      }
      else if ((j >= 3) && (j<=11)) {
        badguys.paintIcon(null, a, 100,0);
        a.drawString("You owe $7.00!", 0,100);
      }
      else if ((j > 11) && (j<60)) {
        drstrange.paintIcon(null, a, 100,0);
        a.drawString("You owe $8.00!",0,100);
      }
      else if ((j >= 60 ) && (j<120)) {
        Daisy.paintIcon(null, a, 100,0);
        a.drawString("That will be $7.00, please.",0,320);
      }
      else if (j<0){
        a.drawString("You are too young to watch something here", 200,200);
      }
      else if (j>=120){
        a.drawString("Can you really come and watch the movie? If you can, you'r free.", 200,200);
      }
    }
    }
  

  public static void main(String[] args){
    var jjjjj = new JFrame();
    jjjjj.setSize(400,400);
    jjjjj.setTitle("Movie world");
    jjjjj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jjjjj.setContentPane(new CL());
    jjjjj.setVisible(true);
  }
  
}