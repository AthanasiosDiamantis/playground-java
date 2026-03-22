package com.saki.captainciao.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrimListWithNonGrowingNumbers {

    public static void main(String[] args) {

        Double[] arryOrderdNumbers = {1.0,2.0,3.0,4.0,5.0};
        Double[] arryUnorderdNumbers = {1.0,2.0,2.0,1.0,3.0,1.0,7.0,8.0,6.0,9.0};

        List<Double> orderdNumbers = new ArrayList<>(List.of(arryOrderdNumbers));
        List<Double> unorderdNumbers = new ArrayList<>(List.of(arryUnorderdNumbers));

        System.out.println("ordered List: " + Arrays.toString(orderdNumbers.toArray()));
        System.out.println("unordered List: " + Arrays.toString(unorderdNumbers.toArray()));
        trimNonGrowingNumbers(orderdNumbers);
        trimNonGrowingNumbers(unorderdNumbers);
        System.out.println("ordered List: " + Arrays.toString(orderdNumbers.toArray()));
        System.out.println("unordered List: " + Arrays.toString(unorderdNumbers.toArray()));



    }

    static void trimNonGrowingNumbers(List<Double> numbers){
        if(!numbers.isEmpty() && numbers.size() > 2){
            for(int i = numbers.size()-1; i >= 1; i--){
                if(numbers.get(i-1) >= numbers.get(i)){
                    // i-1 = 1      >=  i = 3
                    numbers.remove(i);
                }
            }
        }
    }
}
