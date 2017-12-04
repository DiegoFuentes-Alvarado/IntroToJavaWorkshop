package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot Wall_E = new Robot();
		// 3. Put the robot's pen down
		Wall_E.penDown();
		// 8. Make the robot go at maximum speed (10)
		Wall_E.setSpeed(100);
		// 9. Set the pen to a color that you like for the shape
		Wall_E.setRandomPenColor();
		// 4. Make a variable for the number of sides you want (can’t test
		// this one)
		int s = 4;
		// 5. Make a variable for the angle you want the robot to turn. Hint:
		// you can divide in Java using "/". Can’t test until step 6
		int a = 360 / s;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a
		// pentagon
		for (int n = 0; n < 99999; n++) {
			// 2. Move the robot 200 pixels
			Wall_E.move(n);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need
			// new
			// line of code for this, just change previous one)

			// 6. Turn the robot the amount in your angle variable
			Wall_E.turn(a);
			// 11. Turn the robot one more degree
			Wall_E.turn(1);
			Wall_E.setRandomPenColor();
		}
	}
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}