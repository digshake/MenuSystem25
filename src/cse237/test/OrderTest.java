package cse237.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cse237.menusystem.MenuItem;
import cse237.menusystem.Order;

public class OrderTest {
	
	private Order testOrder;
	private MenuItem fries;
	private MenuItem coke;
	private MenuItem burger;

	@BeforeEach
	public void testSetup() {
		testOrder = new Order();
		fries = new MenuItem("fries", 5.00);
		coke = new MenuItem("coke", 2.50);
		burger = new MenuItem("burger", 10.00);
	}
	
	@Test
	public void testNumberOfItems() {
		//1. Set up objects being tested
		
		//2. Call method(s) under test
		testOrder.addItem(fries);
		int actualValue = testOrder.getNumberOfItems();
		
		//3. Verify your results with assertions
		//Use multiple assertions if you need to!
		assertEquals(1, actualValue);
	}
	
	//An order should be empty when it is created
	@Test
	public void testEmptyOrder() {
		//1. Set up objects being tested
		//(handled in the beforeEach)
				
		//2. Call method(s) under test
		int actualValue = testOrder.getNumberOfItems();
				
		//3. Verify your results with assertions
		//Use multiple assertions if you need to!
		assertEquals(0, actualValue);
	}
	
	@Test
	public void testOrderSubtotal() {
		//1. Set up object(s)
		//(done in beforeEach)
		
		//2.Call method(s) being tested
		testOrder.addItem(burger);
		testOrder.addItem(coke);
		testOrder.addItem(fries);
		double actual = testOrder.computeSubtotal();
		
		//use assertion(s) to verify results
		assertEquals(17.50, actual, 0.005);

	}
	
	@Test
	public void testToString() {
		testOrder.addItem(burger);
		String orderText = testOrder.toString();
		assertTrue(orderText.contains("burger"));
	}
}
