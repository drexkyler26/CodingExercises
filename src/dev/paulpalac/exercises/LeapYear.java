package dev.paulpalac.exercises;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(9199));
    }

    public static boolean isLeapYear(int year){

        if(year >= 1 && year <= 9999){
            int x = year%4;
            int y = year%100;
            int z = year%400;
            if(((x == 0) &&(y !=0)) || (z == 0)){
                return true;
                }
                return false;
        }
        return false;
    }
}
