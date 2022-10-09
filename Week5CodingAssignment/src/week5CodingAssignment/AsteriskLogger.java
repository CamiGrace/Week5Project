package week5CodingAssignment;

public class AsteriskLogger  implements Logger{
	
	// print log variable book ended by asterisks
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}
	// print error variable in a box of asterisks and preceded with error 
	@Override
	public void error(String error) {
		
		System.out.println("*************************");
		System.out.println("*** Error: " + error + "***");
		System.out.println("*************************");
	}

}
