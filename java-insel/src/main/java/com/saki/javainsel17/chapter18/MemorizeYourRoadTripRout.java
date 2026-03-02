package com.saki.javainsel17.chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemorizeYourRoadTripRout {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        while(true){
            System.out.println("What new city should be added?");
            String newCity = new Scanner(System.in).nextLine();
            cities.add(newCity);

            System.out.printf("What is the overall rout? (Hint: %d %s) %n ", cities.size(), cities.size() == 1 ? "city":"cities");
            for(String city : cities){
                String guess = new Scanner(System.in).nextLine();
                if(! city.equals(guess)){
                    System.out.printf("%s is not correct, %s would be correct. Too bad!%n", guess, city);
                    return;
                }
            }
            System.out.println("Great, all cities in the right order!");
        }
    }
}
