import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Al extends JPanel{
  //field
  String f;
	int a;	
	int b;
  int c;
  int d;
  int x;
	int y;
	Scanner e;
	public Al() {
		
		try{
      // Put the file name pop up
			f= JOptionPane.showInputDialog(null,"Enter The Filename with .txt");

      //Choose file popup
      //JFileChooser l = new JFileChooser();
      //l.showOpenDialog(null);
      //f = l.getSelectedFile().getName();
			
			String filename= f;
			File f= new File(filename);
			e= new Scanner(f);

      
			//Error check
		} catch (FileNotFoundException h) {
			System.out.println("Can not find the file");
			
		}

	}		
	
	//Programming part
	@Override
	public void  paintComponent(Graphics g) {
		int wid = getWidth();
    int high = getHeight();

    c = e.nextInt();
		d = e.nextInt();
		while (e.hasNext()){
			int b= e.nextInt();
			int[]x= new int[b];
			int[]y= new int[b];
			for (a=0 ;a<b ;a++){
				 x[a]=e.nextInt()*wid/c;
				 y[a]=e.nextInt()*high/d;

			}
			g.drawPolyline(x, y, b);
				}
			
	
	}
		// window part
	public static void main(String[] args){
		var window = new JFrame();
    window.setContentPane(new Al());
    window.setSize(400 ,400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
	}
}