package Observer;

public interface Observable {
	
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
	void notifyObservers();
	boolean getUpdate();
	
}
