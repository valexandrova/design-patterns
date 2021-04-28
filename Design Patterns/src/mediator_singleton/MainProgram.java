package mediator_singleton;

public class MainProgram {

	public static void main(String[] args) {
		
		Chat chat = new Chat();
		
		ChatUser user1 = new ChatUser(chat,"Vanya");
		ChatUser user2 = new ChatUser(chat,"Nikola");
		ChatUser user3 = new ChatUser(chat,"Mirela");
		
		user1.send("Hello!");
		user1.send("cat"); 
		user3.send("addBot"); 
		user1.send("cat");  
		
	}
}
