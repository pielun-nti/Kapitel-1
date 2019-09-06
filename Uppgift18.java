import javax.swing.*;
import java.awt.*;


public class Uppgift18 { 
   public static void main(String[] args) {
	   System.getProperties().list(System.out);
	   JOptionPane.showMessageDialog(null, "You use " + System.getProperty("os.name"));
	   
	   
   }
}