package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Wall_E = new Robot();
		// 5. Set your robot's pen to the down position
		Wall_E.penDown();
		// 3. Set the robot to go at max speed (10)
		Wall_E.setSpeed(100);
		// 4. Do the following (steps 6-8) 75 times
		for (int n = 0; n < 75; n = n + 1) {
			// 7. Change the pen color to random
			Wall_E.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing
			// (5*i)
			Wall_E.move(5*n);
			// 2. Turn the robot 1/7 of 360 degrees to the right
			Wall_E.turn(360 / 7);
			// 8. Set the pen width to i
			Wall_E.setPenWidth(n);
		}
	}
}