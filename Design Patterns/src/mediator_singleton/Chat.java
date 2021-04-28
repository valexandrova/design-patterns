package mediator_singleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private Singleton bot;
	private boolean botAdded = false;
	public Chat() {
		this.users = new ArrayList();
	}
	
	@Override
	public void addUser(User user) {
		users.add(user);
	}
	
	private void removeUser(User user) {
		users.remove(user);
	}
	
	@Override
	public void sendMessage(String message, User user) {
		for(User chatUser: users) {
			if(chatUser != user) {
				chatUser.receive(message);
			}
		}
		if("addBot".equals(message)) {
			bot = Singleton.getBot();
			String systemMessage = bot.getSystemMessage();
			for(User chatUser:users) {
				chatUser.receive(systemMessage);
			}
			botAdded = true;
		}
		if("cat".equals(message) && botAdded) {
			removeUser(user);
			for(User chatUser:users) {
				chatUser.receive("System Chat Message: " + user.name + " was removed from the chat.");
				chatUser.receive(bot.forbiddenWordMessage());
			}
		}	
	}
}
