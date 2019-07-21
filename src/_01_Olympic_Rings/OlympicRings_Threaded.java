package _01_Olympic_Rings;
import java.awt.Color;
import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blueRing = new Robot(400,300);
		Robot blackRing = new Robot(800,300);
		Robot redRing = new Robot(1200,300);
		Robot yellowRing = new Robot(600,500);
		Robot greenRing = new Robot(1000,500);
		blueRing.setPenColor(Color.BLUE);
		blackRing.setPenColor(Color.BLACK);
		redRing.setPenColor(Color.RED);
		yellowRing.setPenColor(Color.YELLOW);
		greenRing.setPenColor(Color.GREEN);
		blueRing.setSpeed(30);
		blackRing.setSpeed(30);
		redRing.setSpeed(30);
		yellowRing.setSpeed(30);
		greenRing.setSpeed(30);
		Thread r1 = new Thread(() -> blueRing.move(1));
		Thread rt1 = new Thread(() -> blueRing.turn(1));
		for (int i = 0; i < 360; i++) {
			r1.start();
			rt1.start();
		}
	}
}

