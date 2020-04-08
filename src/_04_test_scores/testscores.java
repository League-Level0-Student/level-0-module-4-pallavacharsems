package _04_test_scores;

import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	
	String testscoreresponse = JOptionPane.showInputDialog("What score (percentage) did you get on your previous test.");
	
	double testscore = Double.parseDouble(testscoreresponse);
	
	if (testscore >=90) {
		JOptionPane.showMessageDialog(null, "WOW! You must have studied really hard for that test!");
	} else {
		JOptionPane.showMessageDialog(null, "Better luck next time!");
	}
	
	
	
	
	
	
	
}
}
