package com.saki.captainciao.chapter15.weatheroccurrence;


public class WeatherOccurrence {
    private String weather;
    private int occurrences;
    private int startIndex;

    public WeatherOccurrence(String weather, int occurrences, int startIndex) {
        this.weather = weather;
        this.occurrences = occurrences;
        this.startIndex = startIndex;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(int occurrences) {
        this.occurrences = occurrences;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public String toString() {
        return "Weathertype: " + getWeather() + ", occurrences: " +
                getOccurrences() + ", startIndex: " + getStartIndex();
    }
}
