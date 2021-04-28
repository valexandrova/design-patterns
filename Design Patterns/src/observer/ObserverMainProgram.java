package observer;

public class ObserverMainProgram {
	
	public static void main(String[] args) {

	Product product1  = new Product("Iphone 12");
	
	User user1 = new User("Vanya");
	User user2 = new User("Nikola");
	User user3 = new User("Mirela");
	
	product1.subscribe(user1);
	product1.subscribe(user2);
	product1.subscribe(user3);
	
	product1.setAvailability(false);
	product1.setAvailability(true);
	
	}
}