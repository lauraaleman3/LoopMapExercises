package com.tts;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int numOne = Integer.parseInt(scanner.next());

        System.out.println("Please enter a second number.");
        int numTwo = Integer.parseInt(scanner.next());

        System.out.println("Please enter a third number.");
        int numThree = Integer.parseInt(scanner.next());

        System.out.println("Please enter a fourth number.");
        int numFour = Integer.parseInt(scanner.next());

        System.out.println("Please enter a fifth number.");
        int numFive = Integer.parseInt(scanner.next());

        List<Integer> intList = new ArrayList<>();

        intList.add(numOne);
        intList.add(numTwo);
        intList.add(numThree);
        intList.add(numFour);
        intList.add(numFive);

        System.out.println("Numbers in an array list: " + intList);

 // For Sum calculation

        int sum = numOne + numTwo + numThree + numFour + numFive;
        System.out.println("Sum: " + sum);

 // For Product calculation
        int product = numOne * numTwo * numThree * numFour * numFive;
        System.out.println("Product: " + product);

 // // For Smallest number
        int min = intList.get(0);
        for (int i = 1; i < intList.size(); i++) {
            int curr = intList.get(i);
            if (curr < min) {
                min = curr;
            }
        }
        System.out.println ("The smallest number is: " + min);

 // For Largest number
        List<Integer> sortedList = new ArrayList<>(intList);
        int max = sortedList.get(sortedList.size()-1);
        System.out.println ("The largest number is: " + max);

// // Car Dealer
        HashMap<String, String> carMap = new HashMap<>();

        carMap.put("Skyline", "18 Nissans");
        carMap.put("Miata", "12 Mazdas");
        carMap.put("X", "6 Teslas");
        carMap.put("F-150", "14 Fords");


// // Shows available models
        System.out.println ("Are you looking for a Skyline, Miata, X, or a F-150?");

// // Asks What car they are looking for
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