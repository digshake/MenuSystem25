package cse237.menusystem;

import java.util.ArrayList;

public class Order {

	private ArrayList<MenuItem> orderItems;
	
	public Order() {
		orderItems = new ArrayList<>();
	}
	
	public void addItem(MenuItem mi) {
		orderItems.add(mi);
	}
	
	public int getNumberOfItems() {
		return orderItems.size();
	}
	
	public double computeSubtotal() {
		double sum = 0;
		for(MenuItem i : orderItems) {
			sum += i.getPrice();
		}
		return sum;
	}
}
