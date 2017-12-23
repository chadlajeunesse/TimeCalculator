import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * Author: Chad Lajeunesse
 * CST8110 - Introduction to Computer Programming
 * Section: 301
 * Prof: Howard Rosenblum
 * Assignment # 2
 * Date: November 22 2017
 * Purpose:
 */
public class DateTime {
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	
	private Scanner keyboard = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("00.##");
	
	public DateTime() {
		
	}
	
	public DateTime(int month, int day, int hour, int minute, int second) {
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void inputMonth() {
		System.out.print("Enter the month(1-12) ");
		month = keyboard.nextInt();
	}
	
	public void inputDay() {
		System.out.print("Enter the day(1-30) ");
		day = keyboard.nextInt();
	}
	
	public void inputHours() {
		System.out.print("Enter the hours(0-23) ");
		hour = keyboard.nextInt();
	}
	
	public void inputMinutes() {
		System.out.print("Enter the minutes (0-59) ");
		minute = keyboard.nextInt();
	}
	
	public void inputSeconds() {
		System.out.print("Enter the seconds (0-59) ");
		second = keyboard.nextInt();
	}
	
	public void display(String date) {
		System.out.println (date + month + "/" + day + " " + hour + ":" + df.format(minute) + ":" + df.format(second));
	}
	
	public int calcTotalSeconds() {
		return ((((((month - 1) * 30) + (day - 1)) * 24 + hour) * 60 + minute) * 60 + second);
	}
}
