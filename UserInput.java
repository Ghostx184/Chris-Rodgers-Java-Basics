package Tutorials;

import java.util.Scanner; // needed to recieve user input

public class UserInput {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in); // What ever the user types in store in the x variable.
		System.out.println("Put in a statment");
		System.out.println(x.nextLine());// allows user to put in what the variable x means.
	}

}
