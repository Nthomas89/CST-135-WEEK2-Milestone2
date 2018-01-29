/**
 *  Program: Milestone 2
 *  File: Drink.java
 *  Summary: Drink class used as a subclass for Product
 *  Date: January 29, 2018
 */


public class Drink extends Product{

	// varibales
		private String brand;
		private double size;
		private int calories;
		private double sugar;
		private boolean caffeine;
		
		
	// method no constructors
		public Drink () {
			
		}
		
	// constructors for variables
		Drink (String name, String brand, double price, double size, int calories,
						double sugar, boolean caffeine) {
				
			super.setName(name);
			super.setPrice(price);
			this.setBrand(brand);
			this.setSize(size);
			this.calories(calories);
			this.sugar(sugar);
			this.caffeine(caffeine);
		}
		
	// getters and setters
		public String getBrand () {
			return brand;
		}
		
		private void setBrand(String brand) {
			this.brand = brand;
		}
		
		public double getSize() {
			return size;
		}
		
		private void setSize(double size) {
			this.size = size;
		}
		
		public int getCalories () {
			return calories;
		}
		
		private void setCalories (int calories) {
			this.calories = calories;
		}
		
		public double getSugar () {
			return sugar;
		}
		
		private void getSugar (double sugar) {
			this.sugar = sugar;
		}
		
		public Boolean getCaffeine() {
			return caffeine;
		}
		
		private void setCaffeine (Boolean caffeine) {
			this.caffeine = caffeine;
		}
		
	// toString method
		public String toString () {
			return name + " " + price + " " + brand + " " + size + " " + calories + " " + 
							sugar + " " + caffeine;
		}
	
	
}
