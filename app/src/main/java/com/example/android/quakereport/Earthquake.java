package com.example.android.quakereport;

/**
 * Created by clarissajarem on 8/16/18.
 */

public class Earthquake {
    private static String localCity;
    private static String localMagnitude;
    private static String localDate;

    /**@param city is where the earthquake took place
     * @param magnitude is the strength of the earthquake
     * @param date is when the earthquake happened
     */
    public Earthquake(String city, String magnitude, String date){

        localCity = city;
        localMagnitude = magnitude;
        localDate = date;
    }
    public static String getCity() {
        return localCity;
    }

    public static String getMagnitude() {
        return localMagnitude;
    }

    public static int getDate() {
        return localDate;
    }
}
