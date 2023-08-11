package Week06;

public class Card {
	
//Two variables to assign each card a name and a point value.
//Describe method to print the card name with the point value. 
	
	int value;
	String name;
		
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void describe() {
		System.out.println(this.name + " = " + this.value);
	}

}
