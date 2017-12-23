/*
 * Author: Chad Lajeunesse
 * CST8110 - Introduction to Computer Programming
 * Section: 301
 * Prof: Howard Rosenblum
 * Assignment # 2
 * Date: November 22 2017
 * Purpose:
 */
public class TimeCalculator {
	
	private DateTime todayDateTime = new DateTime(1,1,1,1,1);
	private DateTime eventDateTime = new DateTime(1,1,1,1,1);

	private String message;
	
	public TimeCalculator() {
		
	}
	
	public void enterDates() {
		System.out.println("Enter today's date and time");
		setDateTime(todayDateTime);

		System.out.print("\n");
		System.out.println("Enter event's date and time");
		setDateTime(eventDateTime);

		System.out.println("");

		todayDateTime.display("Today: ");
		eventDateTime.display("Event: ");
	}
	
	private void setDateTime(DateTime time) {
		time.inputMonth();
		time.inputDay();
		time.inputHours();
		time.inputMinutes();
		time.inputSeconds();
	}
	
	public void calculateDifference() {

		int monthInSeconds = 30*24*60*60;
		int weekInSeconds = 7*24*60*60;
		int dayInSeconds = 24*60*60;
		int hourInSeconds = 1*60*60;
		int minuteInSeconds = 60;

		int todaySeconds = todayDateTime.calcTotalSeconds();
		int eventSeconds = eventDateTime.calcTotalSeconds();
		int timeDifference = 0;

		if (todaySeconds == eventSeconds) {
			message = "\nThe event is now";
		} else if (todaySeconds < eventSeconds) {
//			EVENT IS IN THE FUTURE
			System.out.println("");
			timeDifference = eventSeconds - todaySeconds;

			if (timeDifference > monthInSeconds){
				timeDifference = timeDifference/monthInSeconds;
				// For practice I used a switch statement but understand there is more efficient way of doing this.
				switch (timeDifference) {
					case 1:
						message = "Event is a month away";
						break;
					case 2:
						message = "Event is 2 months away";
						break;
					case 3:
						message = "Event is 3 months away";
						break;
					case 4:
						message = "Event is 4 months away";
						break;
					case 5:
						message = "Event is 5 months away";
						break;
					case 6:
						message = "Event is 6 months away";
						break;
					case 7:
						message = "Event is 7 months away";
						break;
					case 8:
						message = "Event is 8 months away";
						break;
					case 9:
						message = "Event is 9 months away";
						break;
					case 10:
						message = "Event is 10 months away";
						break;
					case 11:
						message = "Event is 11 months away";
						break;
					default:
						message = "oops month default calculation error?";
						break;
				}
			} else if (timeDifference >= weekInSeconds) {
				timeDifference = timeDifference/weekInSeconds;
				switch (timeDifference) {
					case 1:
						message = "Even is in 1 week";
						break;
					case 2:
						message = "Event is 2 weeks away";
						break;
					case 3:
						message = "Event is in 3 weeks away";
						break;
					case 4:
						message = "Event is in 4 weeks away";
						break;
					case 5:
						message = "Event is in 5 weeks but we should be saying its in 1 month. check your code.";
						break;
					default:
						message = "Default switch for weeks. If this shows we prob have a miss calculation.";
						break;
				}
			} else if (timeDifference > dayInSeconds) {
				timeDifference = timeDifference/dayInSeconds;
				switch (timeDifference) {
					case 1:
						message = "Event is in 1 day";
						break;
					case 2:
						message = "Event is in 2 days";
						break;
					case 3:
						message = "Event is in 3 days";
						break;
					case 4:
						message = "Event is in 4 days";
						break;
					case 5:
						message = "Event is in 5 days";
						break;
					case 6:
						message = "Event is in 6 days";
						break;
					case 7:
						message = "Event is in 7 days";
						break;
					case 8:
						message = "Calc error, should display week not 8 days.";
						break;
					default:
						message = "Default switch for weeks. Should never see this msg";
						break;
				}
			} else if (timeDifference >= hourInSeconds) {
				timeDifference = timeDifference / hourInSeconds;
				if (timeDifference > 1) {
					message = "The event is in " + timeDifference + " hours";
				} else {
					message = "The event is in 1 hour";
				}
			} else if (timeDifference >= minuteInSeconds) {
				timeDifference = timeDifference / minuteInSeconds;
				if (timeDifference > 1) {
					message = "The event is in " + timeDifference + " minutes";
				} else {
					message = "The event is in 1 minute";
				}
			} else {
				if (timeDifference >= 1) {
					message = "The event is in " + timeDifference + " seconds";
				} else {
					message = "The event is in 1 second";
				}
			}
		} else {
//			EVENT IS IN THE PAST
			System.out.println("");
			timeDifference = todaySeconds - eventSeconds;

			if (timeDifference >= monthInSeconds){
				timeDifference = timeDifference/monthInSeconds;
				if(timeDifference > 1){
					message = "The event is " + timeDifference + " months in the past.";
				} else {
					message = "The event is " + timeDifference + " month in the past.";
				}

			} else if (timeDifference >= weekInSeconds){
				timeDifference = timeDifference/weekInSeconds;
				if(timeDifference > 1){
					message = "The event is " + timeDifference + " weeks in the past.";
				} else {
					message = "The event is " + timeDifference + " week in the past.";
				}
			} else if (timeDifference >= dayInSeconds){
				timeDifference = timeDifference/dayInSeconds;
				if(timeDifference > 1){
					message = "The event is " + timeDifference + " days in the past.";
				} else {
					message = "The event is " + timeDifference + " day in the past.";
				}
			} else if (timeDifference >= hourInSeconds){
				timeDifference = timeDifference/hourInSeconds;
				if(timeDifference > 1){
					message = "The event is " + timeDifference + " hours in the past.";
				} else {
					message = "The event is " + timeDifference + " hour in the past.";
				}
			} else if (timeDifference >= minuteInSeconds) {
				timeDifference = timeDifference/minuteInSeconds;
				if (timeDifference > 1){
					message = "The event is " + timeDifference + " minutes in the past";
				} else {
					message = "The event is 1 minute in the past";
				}
			} else {
				message = "The event is " + timeDifference + " seconds in the past.";
			}
		}
	}
	
	public void display() {
		System.out.println(message);
	}
}
