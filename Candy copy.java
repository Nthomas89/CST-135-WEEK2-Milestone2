/**
 *  Program: Milestone 2
 *  File: Candy.java
 *  Summary: Drink class used as a subclass for Snack
 *  Date: January 29, 2018
 */


public class Candy extends Snack {
	
	// varibales
		private String brand;
		private String type;
		private String flavor;
		private double sugar;
		
	// method with no constructors
		public Candy() {
			
		}
		
	// constructors for variables
		Candy (String name, String brand, double price, String type, String flavor,
							double sugar, int calories){
			
			super.setName(name);
			super.setPrice(price);
			super.setCalories(calories);
			this.setBrand(brand);
			this.setFlavor(flavor);
			this.setType(type);
			this.setSugar(sugar);
		}
		
	// getters and setters
		private String getType(String type) {
			return type;
		}
		
		private void setType(String type) {
			this.type = type;
		}
		
		private String getBrand(String brand) {
			return brand;
		}
		
		private void setBrand(String brand) {
			this.brand = brand;
		}
		
		private String getFlavor(String flavor) {
			return flavor;
		}
		
		private void setFlavor(String flavor) {
			this.flavor = flavor;
		}
		
		private double getSugar() {
			return sugar;
		}
		
		private void setSugar (double sugar) {
			this.sugar = sugar;
		}
	
		
	// toString method
		public String toString() {
			return name + " " +  price + " " + brand + " " + flavor + " " + sugar + " " +
							calories;
		}

}
