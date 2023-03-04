package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("How old is Andrew Tou?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase( "11"  )) {
			// 4.  if the user's answer was correct, add one to their score 
			score += 1;
		}   else {
			score -= 1;
		}

		answer = JOptionPane.showInputDialog("what is 1 doubled (as in 1, 2, 4 ,8, etc.) 16");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase( "65536"  ) || answer.equals("65,536")) {
			// 4.  if the user's answer was correct, add one to their score 
			score += 1;
		}   else {
			score -= 1;
		}
		answer = JOptionPane.showInputDialog("who is the second president?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase( "John Adams"  ) || answer.equalsIgnoreCase("Adams")) {
			// 4.  if the user's answer was correct, add one to their score 
			score += 1;
		}   else {
			score -= 1;
		}
		answer = JOptionPane.showInputDialog("who is the 99th Pokemon?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase( "Kingler"  )) {
			// 4.  if the user's answer was correct, add one to their score 
			score += 1;
		}   else {
			score -= 1;
		}
		answer = JOptionPane.showInputDialog("Kingler is the evolved form of which Pokemon?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase( "Krabby"  )) {
			// 4.  if the user's answer was correct, add one to their score 
			score += 1;
		}   else {
			score -= 1;
		}





		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer


		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"your score is " + score);
	}
}
