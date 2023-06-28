import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Castle2 extends JPanel {

    //calling Castle
    Castle c1;
    Castle c2;

    public Castle2() {
        c1 = new Castle(300,0);
        c2 = new Castle();

    }

    @Override
    public void paintComponent(Graphics g) {

        //blueSky background
        g.setColor(new Color(100, 255, 255));
        g.fillRect(0,0,600,300);

        //ground
        g.setColor(new Color(151, 255, 140));
        g.fillRect(0,200,600,130);

        // sea
        g.setColor(Color.BLUE);
        g.fillRect(0, 300, 600, 100);

        c1.draw(g);
        c2.draw(g);

    }

}