/**
 *  Program: Milestone 2
 *  File: Snack.java
 *  Summary: Snack class used as a subclass for Product
 *  Date: January 29, 2018
 */


public abstract class Snack extends Product {

		// variables
			int calories;
			int sugar;
			int servings;
			
		// method with no constructors
			Snack () {
				
			}
	
		// constructor for variables
			public Snack (String name, double price, int calories, int sugar, int servings) {
				super.setName(name);
				super.setPrice(price);
					this.setCalories(calories);
					this.setSugar(sugar);
					this.setServings(servings);
					
			}
			
		// getters and setters
			private int getCalories () {
				return calories;
			}
			
			void setCalories (int calories) {
				this.calories = calories;
			}
			
			private int getSugar () {
				return sugar;
			}
			
			void setSugar (int sugar) {
				this.sugar = sugar;
			}
			
			private int getServings () {
				return servings;
			}
			
			void setServings (int servings) {
				this.servings = servings;
			}
			
		// toString method
			public String toString () {
				return name + " " + calories + " " + sugar + " " + servings;
			}
			
			
}
