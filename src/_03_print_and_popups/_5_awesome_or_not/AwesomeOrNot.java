package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {



		Random ran = new Random();    //This will be used below to make a random number. 

		// 2. Make a variable that will hold a random whole number
		int hold;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		hold	=	ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(hold);
		// 4. Get the user to enter something that they think is awesome
		String awesome = JOptionPane.showInputDialog("Enter somthing awesome!");
		// 5. If your variable is  0
		if(hold == (0)) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, awesome + " is awesome!");
		}
		// 6. If your variable is  1
		if(hold == (1)) {
			// -- tell the user whatever they entered is OK.
			JOptionPane.showMessageDialog(null, awesome + " is OK!");
		}
		// 7. If your variable is  2
		if(hold == (2)) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, awesome + " is boring!");
		}
		// 8. If your variable is  3
		if(hold == (3)) {
			// -- invent your own message to give to the user (be nice).
			JOptionPane.showMessageDialog(null, awesome + " is horrendus!");
		}
	}
}

