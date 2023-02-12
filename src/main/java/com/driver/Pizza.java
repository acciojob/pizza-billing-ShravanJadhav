package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheseAdded;
    private int topping;
    private boolean isExtraToppingAdded;
    private boolean isBillCreated;
    private boolean isTakeAway;

    private int cheeseprice;
    private int topping;
    private int takeaway;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheeseprice=80;
        this.takeaway=20;
        if(isVeg){
            this.price=300;
            this.topping=70;
        }else{
            this.price=400;
            this.topping=120;
        }
        this.isExtraCheseAdded=false;
        this.isExtraToppingAdded=false;
        this.isBillCreated=false;
        this.isTakeAway=false;
        this.bill = "Base Price Of The Pizza: "+this.price +"/n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isExtraCheseAdded==false){
            this.price = this.price+this.cheeseprice;
            this.isExtraCheseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isExtraToppingAdded){
            this.price = this.price + this.topping;
            this.isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAway){
            this.price = this.price+this.takeaway;
            this.isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!this.isBillCreated) {
            if (this.isExtraCheseAdded) {
                this.bill = this.price+"Extra Cheese Added: " + this.cheeseprice + "/n";
            }
            if (this.isExtraToppingAdded) {
                this.bill = this.bill+ "Extra Toppings Added: " + this.topping + "/n";
            }
            if (this.isTakeAway) {
                this.bill = this.bill+ "Paperbag Added: " + this.takeaway+ "/n";
            }

            this.bill = this.bill + "Total Price: " + this.price +"/n";
            this.isBillCreated=true;
        }
        return this.bill;

    }
}
