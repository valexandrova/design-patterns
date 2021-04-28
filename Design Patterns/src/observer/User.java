package observer;

public class User implements Observer {

	String userName;
	

	Observable product;
	
	public User(String name) {
		this.userName = name;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
			if(product== null) {
				System.out.println(getUserName() +" hasn't got product set");
				return;
			}
			boolean lastAvailability = product.getUpdate();
			if(lastAvailability == true) 
				System.out.println("Hello, " + getUserName() + "! Product is now available!");
			else 
				System.out.println("Hello, " + getUserName() + "! Product is not available at this moment!");
			
			
	}

	@Override
	public void setProduct(Observable product) {
		// TODO Auto-generated method stub
		this.product = product;
		
	}
	
	public String getUserName() {
		return userName;
	}

}
