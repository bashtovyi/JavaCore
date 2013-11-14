package edu.oop;

public class Clock {
	private static int hours;
	private  int minutes;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public String toString() {
		return getHours() + ":" + getMinutes(); 
	}
	
	public static void printInformation() {
		System.out.println("Привет");
	}

}