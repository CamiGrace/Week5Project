package week5CodingAssignment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// implement scanner 
		Scanner kb = new Scanner(System.in);
		String userWord = kb.next();
		
		
		//call on methods created in AsteriskLogger 
		Logger logger = new AsteriskLogger ();
		logger.log(userWord);
		System.out.println();
		logger.error(userWord);
		System.out.println();
		
		
		//call on methods created in SpacedLogger 
		Logger spacedlogger = new SpacedLogger ();
		spacedlogger.log(userWord);
		System.out.println();
		spacedlogger.error(userWord);
		System.out.println();
		
		
		
		
		
		
	}

}
