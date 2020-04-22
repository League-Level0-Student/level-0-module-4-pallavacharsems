package _09_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"               I am on a trip in the Amazon Jungle!\n I need to save my family who somehow got trapped there!\n                      I am going to need your help!");
		int food = JOptionPane.showOptionDialog(null,
				"I am starving! Should I fish in a crcodile infested river or should I check an abandoned house for food?",
				"Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Abandoned House", "Crocodile Infested River" }, null);
		if (food == 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER! You have died!");
		} else {
			JOptionPane.showMessageDialog(null, "You have survived!");
			int fight = JOptionPane.showOptionDialog(null,
					"I am confused! Should I go through a crocodile infested river or should I go around and through the forest where there is a jaguar lurking out in the open?",
					"Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Crocodile Infested River", "Jaguar" }, null);
			if (fight == 0) {
				JOptionPane.showMessageDialog(null, "GAME OVER! You have died!");
			} else {
				JOptionPane.showMessageDialog(null, "You have survived!");
				int nextbattle = JOptionPane.showOptionDialog(null,
						"I am sore! Should I sit on a clean tree branch that is jaguar territory or should I sit on an abandonded boat that is in a crocodile infsted river?",
						"Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Tree", "Abonded Boat" }, null);
				if (nextbattle == 1) {
					JOptionPane.showMessageDialog(null, "GAME OVER! You have died!");
					
			}else {
				JOptionPane.showMessageDialog(null, "You have survived! You have WON the GAME! I am also safe and thriving back at home! Thank you for your guidance!");
			}

		}
	}
	}
}
