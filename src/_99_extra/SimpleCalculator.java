package _99_extra;

import java.awt.FontFormatException;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 1; ) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
		String firstnumber = JOptionPane.showInputDialog("Name a number, any number.");
		String secondnumber = JOptionPane.showInputDialog("Name any other number.");
		int first = Integer.parseInt(firstnumber);
		int second = Integer.parseInt(secondnumber);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What operation do you want to use?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
if (operation == 0) {
	add(first,second);
}
if (operation == 1) {
	subtract(first,second);
}
if (operation == 2) {
	multiply(first, second);
}
if (operation == 3) {
	divide(first, second);
}		





// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
}
	} 
	
	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.

	static void add(int num1, int num2) {
		int total = num1 + num2;
		JOptionPane.showMessageDialog(null, num1 +"+"+ num2 +"="+ total);
	}

	static void subtract(int num1, int num2) {
		int total = num1 - num2;
		JOptionPane.showMessageDialog(null, num1 + "-" + num2+"="+total);
	}

	static void multiply(int num1, int num2) {
		int total = num1 * num2;
		JOptionPane.showMessageDialog(null, num1+ "*"+ num2+ "=" +total);
	}

	static void divide(int num1, int num2) {
		int total = num1 / num2;
		JOptionPane.showMessageDialog(null, num1 +"/"+num2 +"="+ total);
	}
}
