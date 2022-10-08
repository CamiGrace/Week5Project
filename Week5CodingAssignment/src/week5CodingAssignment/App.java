package week5CodingAssignment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String userWord = kb.next();
		
		
		
		Logger logger = new AsteriskLogger ();
		logger.log(userWord);
		System.out.println();
		logger.error(userWord);
		System.out.println();
		
		
		
		Logger spacedlogger = new SpacedLogger ();
		spacedlogger.log(userWord);
		System.out.println();
		spacedlogger.error(userWord);
		System.out.println();
		
		
		
		
		
		
	}

}
