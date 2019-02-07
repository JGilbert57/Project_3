package com.killoran.Week1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        Scanner dInput = new Scanner(System.in);
        String decision = "";
        Map<String, Double> cities = new TreeMap<>();
        while (!decision.equals("END")) {
            System.out.println("What city do you plan on visiting");
            String City = dInput.nextLine();
            System.out.println("What is your high temp for next 5 days in " + City);
            System.out.println("Enter your temp for day 1");
            double d1 = userInput.nextInt();
            System.out.println("Enter your temp for day 2");
            double d2 = userInput.nextInt();
            System.out.println("Enter your temp for day 3");
            double d3 = userInput.nextInt();
            System.out.println("Enter your temp for day 4");
            double d4 = userInput.nextInt();
            System.out.println("Enter your temp for day 5");
            double d5 = userInput.nextInt();
            double avg = (calc(d1, d2, d3, d4, d5));
            cities.put(City, avg);
            System.out.println("Input END to stop adding cities else type anything you want");
            decision = Input.nextLine();
        }
        display(cities);
    }

    static double calc(double d1, double d2, double d3, double d4, double d5) {
        double avgHigh = (d1 + d2 + d3 + d4 + d5) / 5;
        return avgHigh;

    }

    public static void display(Map<String, Double> cities) {
        for (String city : cities.keySet()) {
            System.out.println("The Average High temperature in " + city + " is " + cities.get(city));
        }
    }
}

