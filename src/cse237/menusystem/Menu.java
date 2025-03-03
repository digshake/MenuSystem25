package cse237.menusystem;

import java.util.Scanner;

public class Menu {

	private Order currentOrder;
	private Scanner keyboardInput;
	
	public Menu() {
		currentOrder = new Order();
		keyboardInput = new Scanner(System.in);
	}
	
	
	public void printOptions() {
		System.out.println("Hi what do you want?");
		System.out.println("1. Burger: $5");
		System.out.println("2. Fries: $2.50");
		System.out.println("3. Soda: $1");
	}
	
	public int getUserInput(int maxChoice) {
		System.out.println("Please enter a number from 1-" + maxChoice);
		int userInput = keyboardInput.nextInt();
		return userInput;
	}
	
	public void processSelection(int userSelected) {
		if(userSelected == 1) {
			MenuItem burger = new MenuItem("Burger", 5);
			currentOrder.addItem(burger);
		} else if(userSelected == 2) {
			MenuItem fries = new MenuItem("Fries", 2.50);
			currentOrder.addItem(fries);
		} else if(userSelected == 3) {
			MenuItem soda = new MenuItem("Soda", 1);
			currentOrder.addItem(soda);
		}
	}
	
	public static void main(String[] args) {
		Menu testMenu = new Menu();
		testMenu.printOptions();
		int userInput = testMenu.getUserInput(3);
		testMenu.processSelection(userInput);
	}
}
