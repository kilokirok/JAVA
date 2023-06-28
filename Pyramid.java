import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Pyramid {
  
  //field
  private Point p;
  private Color sc;
  private Color pc;

  //
  public Pyramid(){

    var pp = new Color(0xe5b473);
    sc = Color.black;
    pc = pp;
    p = new Point();

  }

  public Pyramid(int x, int y){

    this();
    p.setLocation(x,y);

  }


  public void setStairColor(Color i){

    sc = i;

  }

  public void setBrickColor(Color ii){

    pc = ii;

  }


  public Pyramid(int x, int y, Color i, Color ii){

    this(x,y);
    sc = i;
    pc = ii;

  }

  public void draw(Graphics g){
     
    //pyramid
    g.setColor(pc);
    g.fillRect(80+p.x,275+p.y,240,30);
    g.fillRect(110+p.x,p.y+245,180,30);
    g.fillRect(140+p.x,p.y+215,120,30);
    g.fillRect(170+p.x,p.y+185,60,30);

    //steps
    g.setColor(sc);
    g.fillRect(140+p.x,p.y+300,120,1);
    g.fillRect(155+p.x,p.y+290,90,1);
    g.fillRect(170+p.x,p.y+280,60,1);
    g.fillRect(185+p.x,p.y+270,30,1);

  }


}
