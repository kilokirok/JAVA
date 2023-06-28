import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;


public class Mai extends JPanel {
	
	int dx;	//dx is a FIELD! Its scope spans the entire Main class.	
	ImageIcon sheepPicture;
	
	public Mai() {
		//Your custom initialization code here
		String parker = JOptionPane.showInputDialog("Please enter an X offset for the little prince");
		dx = Integer.parseInt(parker);
		sheepPicture = new ImageIcon("sheep.png");
	}

	@Override
	public void paintComponent(Graphics g) {
		
		final double PI = 3.14;
		double devi = 20;
		float area = (float)(devi*devi*PI);
		//PI = 8;
		double circ = 2*devi*PI;
		var intro = "The area of Devi's circle is ";
		System.out.println(intro + area);
		System.out.println("The circumference of her circle is " + circ);
		
		g.setColor(Color.BLACK);
		g.fillRect(0,0,400,400);
		
		g.setColor(Color.GRAY);
		g.fillOval(-100, 200, 600, 600);
		
		g.setColor(Color.YELLOW);
		g.fillRect(200+dx, 95, 80, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(175+dx,100, 50, 75);
		g.fillRect(175+dx, 175, 20, 50);
		g.fillRect(205+dx, 175, 20, 60);
		
		//var brownish = new Color(167, 116, 78);
		Color brownish = new Color(167, 116, 78);
		g.setColor(brownish);
		g.fillOval(180+dx, 50, 40, 50);
		
		g.setColor(Color.YELLOW);
		g.fillOval(185+dx, 95, 30, 10);	
		
		sheepPicture.paintIcon(null, g, 50, 250);

	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Mai());
		window.setVisible(true);
	}
}