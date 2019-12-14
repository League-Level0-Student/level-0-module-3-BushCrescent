package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("What is your star sign?");
		if (ans.equals("aries")) {
			JOptionPane.showMessageDialog(null,
					"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		} else if (ans.equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		} else if (ans.equals("gemini")) {
			JOptionPane.showMessageDialog(null,
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if (ans.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
		} else if (ans.equals("leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
		} else if (ans.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
		} else if (ans.equals("libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
		} else if (ans.equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
		} else if (ans.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
		} else if (ans.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
		} else if (ans.equals("aquarius")) {
			JOptionPane.showMessageDialog(null,
					"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		} else if (ans.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
