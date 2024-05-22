package com.javaprojects;

public class main {

	public static void main(String[] args) {
		/*pizza basePizza = new pizza(true);
		basePizza.addExtraToppings();
		basePizza.addExtraCheese();
		basePizza.takeAway();
		basePizza.getBill();*/
		
		DeluxPizza dp = new DeluxPizza(false);
		dp.takeAway();
		dp.getBill();

	}

}
