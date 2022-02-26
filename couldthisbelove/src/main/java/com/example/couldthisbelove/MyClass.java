package com.example.couldthisbelove;

import java.util.Random;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("Your Love Score is: " + ifYouHadMyLove("Kanye", "Kanye from the block"));
    }

    public static int ifYouHadMyLove(String yourName, String theirName) {

        Random randomObject = new Random();

        int loveScore = randomObject.nextInt(101);

        if (loveScore > 80) {
            System.out.println(yourName + " and " + theirName + " love each other like Kanye loves Kanye.");
        } else if (loveScore > 40) {
            System.out.println(yourName + " and " + theirName + ", you go together like coke and menthos.");
        } else {
            System.out.println("No love possible. You'll forever be alone...");
        }

        return loveScore;
    }
}