import java.util.Scanner;

public class InteractiveArray {

	private static Scanner keyboard;

	public static void main(String[] args) {
		System.out.println("please enter a number from 1-7 for weekday translation");

		String[]Weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		keyboard = new Scanner(System.in);
		int day = keyboard.nextInt();

		System.out.println(Weekdays[day-1]);
	}
}
