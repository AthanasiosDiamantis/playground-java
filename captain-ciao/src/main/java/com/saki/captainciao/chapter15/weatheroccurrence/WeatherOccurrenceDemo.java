package com.saki.captainciao.chapter15.weatheroccurrence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WeatherOccurrenceDemo {

    //TODO: try to understand christians solution
    public static void main(String[] args) {

        List<String> weatherList = new ArrayList<>(Arrays.asList(
                "Regen", "Sonne", "Regen", "Regen", "Hagel", "Schnee", "Sturm",
                "Sonne", "Sonne", "Sonne", "Regen", "Regen", "Sonne"));

        System.out.println(longestSequenceOfSameWeather(weatherList));
    }

    static WeatherOccurrence longestSequenceOfSameWeather(List<String> weatherList) {
        int localMaxOccurrences = 1;
        int localStartIndex = 0;

        int globalMaxOccurrences = localMaxOccurrences;
        int globalStartIndex = localStartIndex;

        String recurringElement = weatherList.get(0);

        for (int i = 1; i < weatherList.size(); i++) {
            String currentElement = weatherList.get(i);

            if(Objects.equals(currentElement, recurringElement)){
                localMaxOccurrences++;
            }

            if (localMaxOccurrences > globalMaxOccurrences) {
                globalMaxOccurrences = localMaxOccurrences;
                globalStartIndex = localStartIndex;
            } else {// currentElement != recurringElement
                localStartIndex = i;
                localMaxOccurrences = 1;
                recurringElement = currentElement;
            }
        }
        return new WeatherOccurrence(weatherList.get(globalStartIndex), globalMaxOccurrences, globalStartIndex);

    }
}