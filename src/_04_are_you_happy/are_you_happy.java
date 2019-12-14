package _04_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Are you happy?");

		if (ans.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		} else if (ans.equals("no")) {
			String answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equals("no")) {
				JOptionPane.showMessageDialog(null, "Then keep doing whatever you are doing.");
			} else if (answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}
	}
}
