package _07_years_alive;

import javax.swing.JOptionPane;

public class years_alive {
	public static void main(String[] args) {
	int year = 2005;
		for (int i = 0; i < 14; i++) {
			JOptionPane.showMessageDialog(null, year++);
		}
	}
}
