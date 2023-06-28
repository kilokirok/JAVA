import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Room implements Drawable {

  private Point pos;
  private Room n;
  private Room s;
  private Room e;
  private Room w;

  public static final int SIZE = 50;

    
  public Room(int x, int y) {
    pos = new Point(x,y);
    e = null; 
    w = null;
    n = null;
    s = null;
  }   

    // Exit Rooms
  public void se(Room j){

    e = j;
    j.w = this;
  }

  public void sn(Room j){

    n = j;
    j.s = this;
  }

  public void sw(Room j){

    w = j;
    j.e = this;
  }

  public void ss(Room j){

    s = j;
    j.n = this;
  }

  // hasExit
  public boolean hne(){
    if (n == null) {
      return false;
    }
    
    else {
      return true;
    }
  }

  public boolean hse(){
    if (s == null) {
      return false;
    }
    
    else {
      return true;
    }
  }

  public boolean hee(){
    if (e == null) {
      return false;
    }
    
    else {
      return true;
    }
  }


  public boolean hwe(){
    if (w == null) {
      return false;
    }
    
    else {
      return true;
    }
  }

  public Room gne(){
    return n;
  }

  public Room gse(){
    return s;
  }

  public Room gee(){
    return e;
  }

  public Room gwe(){
    return w;
  }

  public void draw(Graphics g) {
    //Wall
    g.setColor(Color.BLACK);
    g.drawRect(pos.x, pos.y, 50, 50);
    //Door, exit or way
    g.setColor(Color.pink);
     
    if (e !=null){
      g.drawLine(pos.x+50,pos.y+20,pos.x+50,pos.y+30);
    }

    if (w !=null){
      g.drawLine(pos.x,pos.y+20,pos.x,pos.y+30);
    }

    if (s !=null){
      g.drawLine(pos.x+20,pos.y+50,pos.x+30,pos.y+50);
    }

    if(n != null) {
      g.drawLine(pos.x+20, pos.y, pos.x+30, pos.y);
    }
  }

  public Point getPosition() {
    return pos;
  }
}