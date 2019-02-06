package com.killoran.Week1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String decision = "";
        List<String> cities = new ArrayList<>();
        List<Double> temp = new ArrayList<>();
        while (!decision.equals("END")) {
            System.out.println("What city do you plan on visiting");
            String City = userInput.nextLine();
            cities.add(City);
            System.out.println("Input END to stop adding cities else type anything you want");
            decision = userInput.nextLine();

        }
        for (String city : cities) {
            System.out.println("What is your high temp for next 5 days in " + city);
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
            temp.add(calc(d1, d2, d3, d4, d5));

        }
        display(cities, temp);
    }

    static double calc(double d1, double d2, double d3, double d4, double d5) {
        double avgHigh = (d1 + d2 + d3 + d4 + d5) / 5;
        return avgHigh;

    }

    public static void display(List<String> cities, List<Double> temp) {
        int i = 0;
        for (String city : cities) {
            System.out.println("The Average High temperature in " + city + " will be " + temp.get(i));
            i++;
        }
    }
}

