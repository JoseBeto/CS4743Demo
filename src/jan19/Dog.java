package jan19;

import javafx.beans.property.SimpleStringProperty;

public class Dog {
	private SimpleStringProperty dogName;
	
	public Dog() {
		dogName = new SimpleStringProperty();
	}
	
	public Dog(String dogName) {
		this();
		
		if(!isValidDogName(dogName))
			throw new IllegalArgumentException("Dog name must be between 1 and 50 characters!");
		
		setDogName(dogName);
	}

	//biz logic
	public boolean isValidDogName(String dogName) {
		//dog name must be between 1 and 50 chars
		if(dogName.length() < 1 || dogName.length() > 50)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Dog: " + getDogName();
	}
	
	//accessors 
	public String getDogName() {
		return dogName.get();
	}

	public void setDogName(String dogName) {
		this.dogName.set(dogName);
	}
	
	public SimpleStringProperty dogNameProperty() {
		return dogName;
	}
}
