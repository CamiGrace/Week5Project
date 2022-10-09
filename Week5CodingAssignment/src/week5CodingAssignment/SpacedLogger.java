package week5CodingAssignment;

public class SpacedLogger implements Logger {

	// print log variable with a space in between each character
	@Override
	public void log(String log) {
		
		for (int i=0; i< log.length(); i++) {
			System.out.print(log.charAt(i) +  " ");
		}
		
		
	}
	// print log variable with a space in between each character and preceded with error 
	@Override
	public void error(String error) {
		System.out.print("Error: ");
		
		for (int i=0; i< error.length(); i++) {
			System.out.print(error.charAt(i) +  " ");
		}
		
	}

}
