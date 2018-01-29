/**
 *  Program: Milestone 2
 *  File: Product.java
 *  Summary: Main class for Products
 *  Date: January 29, 2018
 */


public abstract class Product {
	
	// variables to be set for product
		double price;
		String name;
	
	// method with no constructors
		Product(){
		
		}
		
	//constructors for variables
		public Product (String nameOf, double priceOf) {
			
			this.name = nameOf;
			this.price = priceOf;
		}
		
	// setters and getters
		protected double getPrice() {
			return price;
		}
		
		void setPrice (double price) {
			this.price = price;
		}
		
		String getName() {
			return name;
		}
		
		void setName(String name) {
			this.name = name;
		}
		
	// toString method
		public String toString () {
			return name + " " + price;
		}

}
