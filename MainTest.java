
package keshCode;
import javax.swing.JOptionPane;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Enter name");
		String input = JOptionPane.showInputDialog("Enter name");
		int inW = Integer.parseInt(JOptionPane.showInputDialog("Enter " + input + "'s weight"));
		
	
		
	    String in2 = JOptionPane.showInputDialog("Enter name");
	    int wOne = Integer.parseInt(JOptionPane.showInputDialog("Enter " + in2 + "'s weight"));
	    String in3 = JOptionPane.showInputDialog("Enter name");
		int wTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter " + in3 + "'s weight"));
	    
		
		Main inName = new Main(input, in2, in3, inW, wOne, wTwo);
		String total = input + "'s weight is: " + inW + ". " + in2 + "'s weight is: " + wOne + ". " + in3 + "'s weight is: "+ wTwo + ".";
		inName.printW(total, inW, wOne, wTwo);
		
	}

}
