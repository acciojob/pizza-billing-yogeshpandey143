package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int takeAwayPrice;

    private int extraCheesePrice;
    private int extraToppingPrice;
    public Pizza(Boolean isVeg){

        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.extraCheesePrice=80;
        this.isVeg = isVeg;
        // your code goes here

        this.takeAwayPrice=20;

        if(isVeg){
            this.price=300;
            this.extraToppingPrice=70;
        }else{
            this.price=400;
            this.extraToppingPrice=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    private int ExtraCheesePrice;

    private int ExtraToppingPrice;

    private boolean isCheeseAdded=false;

    private boolean isToppingAdded=false;

    private boolean isTakeAwayAdded=false;

    private boolean isBillGenerated=false;

    public int getPrice(){

        return this.price;
    }



    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            this.isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price=this.price+this.extraToppingPrice;
            this.isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            this.isTakeAwayAdded=true;
        }
    }


    public String getBill() {
        // your code goes here

        if(isBillGenerated==false){

        isBillGenerated = true;

        if (isCheeseAdded) {
            this.bill = this.bill +"Extra Cheese Added: " + this.extraCheesePrice + "\n";
        }

        if (isToppingAdded) {
            this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
        }

        if (isTakeAwayAdded) {
            this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
        }
        return this.bill = this.bill + "Total Price: " + this.price + "\n";
     }
        return this.bill;
    }
}
