import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Castle {

    // In general, most fields should be private
    // Fields
    private Color doorColor;
    private Color wallColor;
    private Vertex pos;

    // Constructors are almost always public
    // Constructors
    public Castle() {
        doorColor = new Color(255, 204, 74);
        wallColor = Color.BLACK;
        pos = new Vertex();
    }
    public Castle(int x, int y) {
        doorColor = Color.RED;
        wallColor = Color.WHITE;
        pos = new Vertex(x, y);
    }
    public Castle(Vertex p) {
        doorColor = Color.RED;
        wallColor = Color.WHITE;
        pos = p;
    }

    // Methods
    public void setDoorColor(Color c) {
        doorColor = c;
    }
    public void setWallColor(Color c) {
        wallColor = c;
    }
    public void draw(Graphics g) {
        // draw the castle
        var dx = 50;
        g.setColor(wallColor);
        g.fillRect(130-dx+pos.x, 160-dx+pos.y, 150, 150); // main rect
        g.fillRect(90-dx+pos.x, 140-dx+pos.y, 40, 180); // left tower
        g.fillRect(280-dx+pos.x, 140-dx+pos.y, 40, 180); // right tower
        g.fillRect(82-dx+pos.x, 135-dx+pos.y, 15, 15); // moat 1
        g.fillRect(102-dx+pos.x, 135-dx+pos.y, 15, 15); // moat 2
        g.fillRect(122-dx+pos.x, 135-dx+pos.y, 15, 15); // moat 3
        g.fillRect(272-dx+pos.x, 135-dx+pos.y, 15, 15); // moat #1
        g.fillRect(292-dx+pos.x, 135-dx+pos.y, 15, 15); // moat #2
        g.fillRect(312-dx+pos.x, 135-dx+pos.y, 15, 15); // moat #3
        g.setColor(doorColor);
        g.fillRoundRect(185-dx+pos.x, 250-dx+pos.y, 40, 60, 12, 15); // door
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setContentPane(new Castle2());
        window.setVisible(true);
    }
}