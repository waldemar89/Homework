package com.lesson_4.task6;

public class Payment {
    private static Items [] itemsArray;
    private int price;
    private class Items{
        private String itemName;
        private int itemPrice;
        public Items(String itemName, int itemPrice){
            super();
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }

    public Payment(){
        super();
    }

    public void setPayment(){
        this.price = 0;
        itemsArray = new Items[3];
        itemsArray[0] = new Items("Book", 10);
        itemsArray[1] = new Items("Journal", 4);
        itemsArray[2] = new Items("Newspaper", 2);
        for (int i=0; i<itemsArray.length;i++)
            this.price = this.price + itemsArray[i].itemPrice;
    }
    int getPayment(){
        return this.price;
    }
    public void print() {
        for (int i = 0; i < itemsArray.length; i++)
            System.out.println("You bought one -- " + itemsArray[i].itemName + ",");
    }
}
