package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isExtraCheseAdded;
    private int topping;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            this.topping=70;
        }else{
            this.price=400;
            this.topping=120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price +"/n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheseAdded==false){
            this.price+=80;
            isExtraCheseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            this.price += this.topping;
            isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isExtraCheseAdded) {
                this.bill += "Extra Cheese Added: 80" + "/n";
            }
            if (isExtraToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.topping + "/n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "/n";
            }

            this.bill += "Total Price: " + this.price;
            this.isBillCreated=true;
            return this.bill;
        }
        return "";
    }
}
