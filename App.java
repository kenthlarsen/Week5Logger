package Week5Logger;

public class App {

	public static void main(String[] args) {
		AstriskLogger aLog = new AstriskLogger();
		SpacedLogger sLog = new SpacedLogger();
		
		aLog.log("Good Bye");
		aLog.error("Hello");
		
		sLog.log("Warning");
		sLog.error("Red");
		
		
		
	}
}
