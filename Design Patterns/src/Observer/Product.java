package Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {

	private List<Observer> users;
	private boolean availability;
	private String productName;
	
	public Product(String name) {
		this.users = new ArrayList<>();
		this.productName = name;
	}
	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		users.add(observer);
		observer.setProduct(this);

	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		users.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		if(availability == true) 
			System.out.println(getProductName() + " current state: Available , Notifying users...");
		else
			System.out.println(getProductName()+ " current state: Out of stock, Notifying users...");
			
		for(Observer observer: this.users) {
			observer.update();
			
		}

	}

	@Override
	public boolean getUpdate() {
		// TODO Auto-generated method stub
		return availability;
	}
	
	public void setAvailability(boolean av) {
		availability = av;
		notifyObservers();
	}
	public String getProductName() {
		return productName;
	}

}
