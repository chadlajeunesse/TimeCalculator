/*
 * Author: Chad Lajeunesse
 * CST8110 - Introduction to Computer Programming
 * Section: 301
 * Prof: Howard Rosenblum
 * Assignment # 2
 * Date: November 22 2017
 * Purpose:  
 */
import java.text.DecimalFormat;
public class Assign2 {

	public static void main(String[] args) {
		TimeCalculator newEvent = new TimeCalculator();
		newEvent.enterDates();

		newEvent.calculateDifference();
		newEvent.display();
	}
}