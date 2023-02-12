package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;

    private int takeAway;

    //private int topping;



     private boolean addTakeAway;
     private boolean addExtraCheese;

     private boolean addExtraTopping;
     private boolean isBillCreated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeAway=20;

        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }else{
            this.price=400;
            this.toppingPrice=120;
        }

        this.addExtraCheese=false;
        this.addTakeAway=false;
        this.isBillCreated=false;
        this.addExtraTopping=false;


        this.bill = "Base Price Of The Pizza: "+this.price +"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addExtraCheese==false){
            this.price += this.cheesePrice;
            addExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addExtraTopping==false){
            this.price += this.toppingPrice;
            addExtraTopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if( addTakeAway==false){
            this.price += this.takeAway;
             addTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillCreated==false) {
            if (addExtraCheese==true) {
                this.bill += "Extra Cheese Added: "+this.cheesePrice + "\n";
            }
            if (addExtraTopping==true) {
                this.bill += "Extra Toppings Added: " + this.toppingPrice + "\n";
            }
            if (addTakeAway==true) {
                this.bill += "Paperbag Added: "+this.takeAway + "\n";
            }

            this.bill += "Total Price: " + this.price +"\n";
             isBillCreated=true;
            //return this.bill;
        }

         return this.bill;
    }
}
