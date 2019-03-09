package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	public static void main(String[] args) {
		Random a = new Random();
		

		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			rob[i].setX(140 + i * 100);
			rob[i].setY(500);
		} // 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
		for (int i = 0; i < rob.length; i++) {
			int num = a.nextInt(100);
			rob[i].setSpeed(10);
			rob[i].move(num);

		}
		boolean isRaiseing = true;
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (isRaiseing) {
			for (int i = 0; i < rob.length; i++) {
				int num = a.nextInt(50);
				rob[i].move(num);
				if (rob[i].getY() <= 2) {
					isRaiseing = false;
					JOptionPane.showMessageDialog(null, "    Robot  " + i
							+ " is winner..................................................................................................................................................................................................................sadly");
				}
			}
		}

		// 7. declare that robot the winner and throw it a party!
		{

		}
		// 8. try different races with different amounts of robots.
		for (int j = 0; j < 37; j++) {

			// 9. make the robots race around a circular track.
			for (int i = 0; i < rob.length; i++) {
				int num = a.nextInt(50);

				rob[i].turn(25);
				rob[i].move(100);

			}
		}
	}
}