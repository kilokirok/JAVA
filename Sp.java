import javax.swing.*;
import java.awt.Point;
import java.awt.Graphics;



public class Sp implements Drawable{

  protected Room currentRoom;
  protected ImageIcon image;

  public Sp() {

    image = null;
    currentRoom = null;

  }
  //setter
  public void setCurrentRoom(Room r) {

    this.currentRoom = r;

  }
  //getter
  public Room getCurrentRoom() {
    
    return currentRoom;
  
  }

  public void moveSouth() {
    if(currentRoom.hse() == true) {
      currentRoom = currentRoom.gse();
    }
  }

  public void moveNorth() {
    if(currentRoom.hne() == true) {
      currentRoom = currentRoom.gne();
    }
  }

  public void moveEast() {
    if(currentRoom.hee() == true) {
      currentRoom = currentRoom.gee();
    }
  }

  public void moveWest() {
    if(currentRoom.hwe() == true) {
      currentRoom = currentRoom.gwe();
    }
  }

  //return

  public void draw(Graphics g) {

    if (currentRoom != null && image != null) {

      Point q = currentRoom.getPosition();
      image.paintIcon(null, g, q.x, q.y);

    }
    
  }

}