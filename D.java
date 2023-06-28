import javax.swing.ImageIcon;

public class D extends Sp {

  private int numStones = 0;

  public void pickUpStone(){
    numStones ++;
    return;
  }

  public boolean isArmed() {
    if (numStones == 5){
      return true;
    }

    else {
      return false;
    }
  }

  public void reset() {
    numStones = 0;
  }

  public D() {
    super();
    image = new ImageIcon("david.png");
  }
}