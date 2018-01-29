/**
 *  Program: Milestone 2
 *  File: Dispenser.java
 *  Summary: calls up the products information
 *  Date: January 29, 2018
 */

import java.util.*;

public class Dispenser extends Product{
	
	// method with no constructors
		public Dispenser () {
			
		}
		
	// main method
		public static void main(String [] args) {
			displayProducts();
		}
		
	public static void displayProducts() {
		
		Stack<Drink> drinks1 = new Stack<>();
		for (int i = 0; i < 20; i++) {
			Drink drink1 = new Drink("Cola", "Coke", 1.50, 12, 210, 10, false);
			drinks1.push(drink1);
		}

		Stack<Candy> candys1 = new Stack<>();
		for (int i = 0; i < 20; i++) {
			Candy candy1 = new Candy("Candy bar", null, 1.0, "Hersheys", "Dark", 28, 320);
			candys1.push(candy1);
		}

		Stack<Chips> chips1 = new Stack<>();
		for (int i = 0; i < 20; i++) {
			Chips chip1 = new Chips("Cheetos", "Frito-Lay", .75, "Hot", "Regular", 1, 140);
			chips1.push(chip1);
		}


		//display drinks to console
		System.out.println("-----------------------------------------------------  DRINKS  ----------------------------" +
				"------------------------");
		System.out.printf("%-15s%-15s%-15s%-12s%-12s%-12s", "Brand", "Name", "Price", "Ounces",
				"Calories", "Sugar", "Caffeine");
		System.out.println(" ");

		System.out.println(drinks1.peek() + "" + drinks1.size());

		//display chips to console
		System.out.println();
		System.out.println("------------------------------------------------  CHIPS  ------------------------------" +
				"-------------------");
		System.out.printf( "%-15s%-15s%-15s%-12s%-12s%-12s","Brand", "Name", "Flavor", "Type", "Price",
				"Ounces", "Calories");
		System.out.println(" ");

		System.out.println(chips1.peek() + "" + chips1.size());

		//display candy to console
		System.out.println();
		System.out.println("------------------------------------------------------  CANDY  -------------------------" +
				"------------------------------");
		System.out.printf("%-15s%-15s%-15s%-12s%-12s%-12s", "Brand", "Name", "Type", "Flavor", "Price",
				"Ounces", "Calories", "Sugar");
		System.out.println(" ");

		System.out.println(candys1.peek() + "" + candys1.size());

	}

}
