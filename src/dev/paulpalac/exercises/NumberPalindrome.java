package dev.paulpalac.exercises;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-11);
    }

    public static void isPalindrome(int number) {
       int reverse = 0;
       int verify = number;
        do {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        }
        while (number!=0);
        boolean condition;
        if(verify == reverse){
            condition = true;
        }else {condition = false;}
        System.out.println(reverse +", " +condition);
    }
}