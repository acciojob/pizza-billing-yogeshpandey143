package com.driver;

public class Pizza {
	  private int price;
	    private int nprice;
	    private Boolean isVeg;
	    private String bill;
	    private boolean takeAway = false; 
	    private boolean addCheese = false; 
	    private boolean addTop = false; 

	    public Pizza(Boolean isVeg){
	        this.isVeg = isVeg;
	        // your code goes here
	    }

	    public int getPrice(){
	    	
	    	if(isVeg)
	    	{
	    		this.price= this.price+300;
	    	
	    	}
	    	else
	    	{
	    		this.price= this.price+400;
	    		
	    		
	    	}
	    	
	        return this.price;
	    }

	    public void addExtraCheese(){
	    	if(this.addCheese==false)
	    	{
	        this.addCheese = true;
	    	
	    	this.nprice= this.nprice+80;
	    	}
	        
	    }

	    public void addExtraToppings(){
	    	
	    	if(isVeg)
	    	{
	    	if(this.addTop==false)
	    	{
	       this.addTop= true;
	    	
	    	this.nprice= this.nprice+70;
	    	}
	    	}
	    	else
	    	{
	    		if(this.addTop==false)
	    		{
	    		       this.addTop= true;
	    		    	
	    		    	this.nprice= this.nprice+120;	
	    		}
	    	}
	    }

	    public void addTakeaway(){
	    	if(this.takeAway==false)
	    	{
	       this.takeAway = true;
	    	this.nprice= this.nprice+20;
	    	}
	    }

	    public String getBill(){
	    	if(isVeg)
	    	{
	    		this.nprice = this.nprice+300;
	     this.bill = Integer.toString(this.nprice);
	    	}
	    	else
	    	{
	    		this.nprice = this.nprice+400;
	    	     this.bill = Integer.toString(this.nprice);	
	    	}
	        return this.bill;
}
}
