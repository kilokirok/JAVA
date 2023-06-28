import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Main extends JPanel implements KeyListener {

  Room[] rooms;
  D h;
  G gi;
  S[] rs;
  ArrayList <Drawable> da ;

  public Main() {
    
    addKeyListener(this);
    da = new ArrayList<>();

    //Boxes or Rooms
    rooms = new Room[16];
    rooms[0] = new Room(10, 10);
    rooms[1] = new Room(70, 10);
    rooms[2] = new Room(130, 10);
    rooms[3] = new Room(190, 10);
    rooms[4] = new Room(10, 70); 
    rooms[5] = new Room(70, 70);
    rooms[6] = new Room(130, 70);
    rooms[7] = new Room(190, 70);
    rooms[8] = new Room(10, 130);
    rooms[9] = new Room(70, 130);
    rooms[10] = new Room(130, 130);
    rooms[11] = new Room(190, 130);
    rooms[12] = new Room(10, 190);
    rooms[13] = new Room(70, 190);
    rooms[14] = new Room(130, 190);
    rooms[15] = new Room(190, 190);

    //exit and enters
    rooms[2].se(rooms[3]);    
    rooms[3].ss(rooms[7]); 
    rooms[7].sw(rooms[6]);
    rooms[6].sw(rooms[5]);
    rooms[5].sw(rooms[4]);
    rooms[4].ss(rooms[8]);
    rooms[8].ss(rooms[12]);
    rooms[12].se(rooms[13]);
    rooms[13].se(rooms[14]);

    //David, Goliat, and rock
    h = new D();
    h.setCurrentRoom(rooms[2]);
    gi = new G();
    gi.setCurrentRoom(rooms[14]);
    rs = new S[5];

   //rocks place
    rs[0] = new S();
    rs[1] = new S();
    rs[2] = new S();
    rs[3] = new S();
    rs[4] = new S();

    rs[0].setCurrentRoom(rooms[3]);
    rs[1].setCurrentRoom(rooms[5]);
    rs[2].setCurrentRoom(rooms[7]);
    rs[3].setCurrentRoom(rooms[12]);
    rs[4].setCurrentRoom(rooms[13]);


    for (int q=0; q<16; q++){
      da.add(rooms[q]);
  }

  for (int qq=0; qq<5; qq++){
      da.add(rs[qq]);
  }

  da.add(h);

  da.add(gi);

  }


  @Override
  public void paintComponent (Graphics g) {

    requestFocusInWindow();
	  g.setColor(Color.PINK);
	  g.fillRect(0,0,260,260);
	
	  for (Drawable w : da){
      w.draw(g);
    }    

    }

    
    public void reset(){
      h = new D();
      h.setCurrentRoom(rooms[2]);
      gi = new G();
      gi.setCurrentRoom(rooms[14]);
      rs = new S[5];
  
      rs[0] = new S();
      rs[1] = new S();
      rs[2] = new S();
      rs[3] = new S();
      rs[4] = new S();
  
      rs[0].setCurrentRoom(rooms[3]);
      rs[1].setCurrentRoom(rooms[5]);
      rs[2].setCurrentRoom(rooms[7]);
      rs[3].setCurrentRoom(rooms[12]);
      rs[4].setCurrentRoom(rooms[13]);
  
      h.reset();

    }
  
    public void keyTyped(KeyEvent e){

    }
  
    public void keyPressed(KeyEvent e){
      int code = e.getKeyCode();

      if (code == KeyEvent.VK_W) {
        h.moveNorth();
      }
      
      
      if (code == KeyEvent.VK_A) {
        h.moveWest();
      }
  
      if (code == KeyEvent.VK_S) {
        h.moveSouth(); 
      }
  
  
      if (code == KeyEvent.VK_D) {
        h.moveEast();
      }

      if (code == KeyEvent.VK_UP) {
        gi.moveNorth();
      }

      if (code == KeyEvent.VK_DOWN) {
        gi.moveSouth();
      }

      if (code == KeyEvent.VK_RIGHT) {
        gi.moveEast();
      }

      if (code == KeyEvent.VK_LEFT) {
        gi.moveWest();
      }

      

      for (S s:rs) {
        if (s.getCurrentRoom() == h.getCurrentRoom()) {
          h.pickUpStone();
          s.setCurrentRoom(null);
        }
      }

      if (h.getCurrentRoom() == gi.getCurrentRoom()) {
        if (h.isArmed() == true){
          int y = JOptionPane.showConfirmDialog(null, "Congratulations David! You slew Goliath! You wanna play one more game?");
          if (y == 0) {
            reset();
          }
          if (y == 1) {
            System.exit(0);
          }
        }

        else {
          int y = JOptionPane.showConfirmDialog(null, "Oh no David! Goliath got you! You wanna play one more game?");
          if (y == 0) {
            reset();
          }
          if (y == 1) {
            System.exit(0);
          }
        }
      }



      repaint();
    }
  
    public void keyReleased(KeyEvent e) {
  
    }


  public static void main(String[] args) {
		var w = new JFrame();
		w.setSize(270,290);
		w.setContentPane(new Main());
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}
}