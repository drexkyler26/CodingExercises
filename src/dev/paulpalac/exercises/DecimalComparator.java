package dev.paulpalac.exercises;

public class DecimalComparator{
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(12.2345, .2345656));
    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){

        return (int) (first*1000) == (int) (second*1000);

    }

}