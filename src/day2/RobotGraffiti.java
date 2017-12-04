package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		// 1.  Create a new Robot
		Robot Wall_E = new Robot();
		// 2. Make the Robot draw the first letter of your name
		Wall_E.setPenColor(Color.RED);
		Wall_E.penDown();
		Wall_E.setSpeed(100);
		Wall_E.move(180);
		Wall_E.turn(90);
	for(int D = 0; D < 180; D++){
		Wall_E.move(1);
		Wall_E.turn(1);
	}
	
	
	
	}
	

}
