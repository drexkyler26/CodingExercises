package dev.paulpalac.exercises;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(511155511);
    }
    public static void printYearsAndDays(long minutes){
        int x = 24*60*365;
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            int year = (int)(minutes/x);
            long remainYear = (minutes%x);
            int days = Math.round(remainYear/(24*60));
            System.out.println(minutes +" min = " +year +" y and " +days +" d");
        }

    }
}
