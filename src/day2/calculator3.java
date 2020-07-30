package day2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class calculator3 extends JFrame {
	//variable declaration//

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number1:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter number2:"));
		int sum = a + b;
		JOptionPane.showMessageDialog(null, "Addition of " + a + " and " + b +" is :" + sum);
		
	}

}
