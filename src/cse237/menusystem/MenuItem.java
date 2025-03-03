package cse237.menusystem;

public class MenuItem {

	//has-a's
	private String name;
	private double price;
	
	public MenuItem(String n, double p) {
		name = n;
		price = p;
	}

	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name + ": " + price;
	}
}
