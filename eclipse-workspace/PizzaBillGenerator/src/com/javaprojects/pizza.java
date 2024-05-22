package com.javaprojects;

public class pizza {
	private int price;
	private  boolean veg;
	private int extraCheesePrice =100;
	private int extraToppingsPrice=150;
	private int takeAwayPrice=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeAway=false;
	public pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	public void addExtraCheese() {
		isExtraCheeseAdded=true;	    
	    this.price+=extraCheesePrice;		
	}
	public void addExtraToppings() {
		isExtraToppingsAdded=true;		
		this.price+=extraToppingsPrice;	
	}
	public void takeAway() {
		isOptedForTakeAway=true;		
		this.price+=takeAwayPrice;	
	}
	public void getBill() {
		String Bill="";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			Bill+="Extra cheese Added:"+extraCheesePrice+"\n";	
		}
		if(isExtraToppingsAdded) {
			Bill+="Extra Toppings Added:"+extraToppingsPrice+"\n";
		}
		if(isOptedForTakeAway) {
			Bill+="Take Away :"+takeAwayPrice+"\n";	
		}
		Bill+="Bill:"+this.price+"\n";
		System.out.println(Bill);
		System.out.println("Hurray!!! Enjoy your pizza");	
	}	
}
/*Base pizza veg-300 
 *           non veg-400
 *           cheese-100
 *           toppings-150
 *           takeaway-20
 *           
 *           
 */
 