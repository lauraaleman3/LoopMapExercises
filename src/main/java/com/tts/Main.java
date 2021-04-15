package com.tts;

import java.util.*;

public class Main {
    public static void main(String[] args) {

// // Created an array list
        List<Integer> a = new ArrayList<>();
        int i = 0;
        int product = 1;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        while (i < 5) {
            System.out.println("Please enter a number:");
            a.add(in.nextInt());
            i++;
        }
        Collections.sort(a);
        for(int z : a){
            product *= z;
        }
        for(int w : a){
            sum += w;
        }

        // // For array list
        System.out.println("Numbers in an array list: " + a);

       // // For Sum calculation
        System.out.println("Sum: " + sum);

        // // For Product calculation
        System.out.println("Product: " + product);

        // // For Smallest number
        System.out.println("The smallest number is: " + a.get(0));

        // // For Largest number
        System.out.println("The largest number is: " + a.get(4));


// // Exercise 2 Car Dealership
        HashMap<String, String> carMap = new HashMap<>();

        carMap.put("Skyline", "18 Nissans");
        carMap.put("Miata", "12 Mazdas");
        carMap.put("X", "6 Teslas");
        carMap.put("F-150", "14 Fords");


// // Shows available models
        System.out.println ("Are you looking for a Skyline, Miata, X, or a F-150?");

// // Asks What car they are looking for
        Scanner scanner = new Scanner(System.in);

        System.out.println ("If so, which car model are you interested in? " );
String carModel = scanner.next();

        String make = carMap.get(carModel);
        if(make == null){
            System.out.println("\nSorry we don't have that");
        } else {
            System.out.println("\nWe have " + make + " available over here!");
        }
    }
}