package com.example.getmilk;

public class MyClass {

    public static void main(String[] args) {

        int balance = getMilk(1000,2);

        System.out.println("The Balance is: " + balance + " shillings");
    }
    
    public static int getMilk(int amountAtHand, int numberOfCartonsTOBuy) {

        int priceTOPay = numberOfCartonsTOBuy*50;

        System.out.println("1. Open the door");
        System.out.println("2. Walk to the store");
        System.out.println("3. Buy " + numberOfCartonsTOBuy + " cartons of milk");
        System.out.println("4. Pay " + priceTOPay + " shillings");
        System.out.println("5. Return to the house with milk");

        return amountAtHand - priceTOPay;
    }
}