package mediator_singleton;

public interface MessageMediator {

	void addUser(User user);
	void sendMessage(String message, User user);
	
	
	
}
