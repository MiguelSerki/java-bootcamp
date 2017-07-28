package topic2.ex1.src.main.java.com.exercise1.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String input = null;
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		input = reader.nextLine();
		System.out.println("Hello " + input + ", welcome to the app.");
		reader.close();
	}
}
