package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;

public class obedientrobot {

	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("Which shape do you want to draw a square, triangle, or circle?");
		if (shape.equals("square")) {

			drawSquare();
		} else if (shape.equals("triangle"))

		{
			drawTriangle();
		} else if (shape.equals("circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null,
					"Please spell the shape correctly, no capitlizations, or choose one of the shapes given.");
		}

	}

	public static void drawSquare() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(10);
		rob.turn(60);
		rob.move(100);
		rob.turn(60);
		rob.move(100);
		rob.turn(150);
		rob.move(150);
	}

	public static void drawCircle() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		for (int i = 0; i < 360; i++) {
			rob.turn(1);
			rob.move(1);
		}
	}
}
