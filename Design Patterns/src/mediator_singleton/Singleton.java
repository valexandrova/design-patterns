package mediator_singleton;

public class Singleton {

	private static Singleton bot;
	private static String systemMessage;
	
	
	private Singleton(){
		
	}
	
	public static Singleton getBot() {
		if(bot == null) {
			bot = new Singleton();
			systemMessage = "System Chat Message: Bot added!";
		} else {
			systemMessage = "System Chat Message: Bot already added!";	
		}
		return bot;
	}
	
	public String getSystemMessage() {
		return systemMessage;
	}
	
	public String forbiddenWordMessage() {
		return "Bot says: 'cat' is forbidden word!"
				+ " Don't use it or you will be removed from this chat!";
	}

}
