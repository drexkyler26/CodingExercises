package dev.paulpalac.exercises;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(0);

    }
    public static void checkNumber(int num){
        if(num > 0){
            System.out.println(+num + " is positive.");
        }else if(num < 0){
            System.out.println(+num +"is negative.");
        }else{
        System.out.println(+num +" is zero.");
        }
    }
}
