import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class Ml extends JPanel{
  ArrayList<String> french = new ArrayList<>();
  ArrayList<String> english = new ArrayList<>();
  
  public Ml(){
    loadEnglishWords();
    loadFrenchWords();
    mainLoop();

  }

  public void loadEnglishWords(){
    var ef = "english.txt";

    try{
      File f = new File(ef);
      Scanner s = new Scanner(f);
      while(s.hasNext()==true){
        String n = s.nextLine();
        english.add(n);
      }
      s.close();
    } catch(FileNotFoundException h) {
			System.out.println("Can not find the file");
      
    }
  }
  
  public void loadFrenchWords(){
    var ff = "french.txt";

    try{
      File fff = new File(ff);
      Scanner ss = new Scanner(fff);
      while(ss.hasNext()==true){
        String nn = ss.nextLine();
        french.add(nn);
      }
      ss.close();
   
    } catch(FileNotFoundException q) {
			System.out.println("Can not find the file");
      
    }
  }

  public String lookup(String word){
    for(int j = 0; j < english.size(); j++){
      var jj = english.get(j);
      if(word.equals(jj)) {
        return french.get(j);
      }
    }
    return "No match found";
  }

  public void mainLoop() {
    while(true) {
      String ws = JOptionPane.showInputDialog("Please enter an English word");
      String wf = lookup(ws);
      int aw = JOptionPane.showConfirmDialog(null, "The French word is: " + wf + ". Play again?" );
      if(aw == 1) {
        break;
      }
    }
  }


  public static void main(String[] args) {
	new Ml();
	}
}