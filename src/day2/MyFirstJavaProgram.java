
package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot Spooder_Man = new Robot();
		Spooder_Man.setSpeed(100);
		Spooder_Man.setPenColor(Color.CYAN);
		Spooder_Man.penDown();

		for (int sq = 0; sq < 4; sq = sq + 1) {
			Spooder_Man.move(100);
			Spooder_Man.turn(90);
		}
		Spooder_Man.penUp();
		Spooder_Man.turn(-90);
		Spooder_Man.move(300);
		Spooder_Man.setPenColor(Color.MAGENTA);
		Spooder_Man.penDown();
		for (int c = 0; c < 360; c = c + 1) {
			Spooder_Man.move(1);
			Spooder_Man.turn(1);
		}
	}

}
