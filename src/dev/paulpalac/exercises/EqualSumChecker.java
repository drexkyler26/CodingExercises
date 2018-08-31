package dev.paulpalac.exercises;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1, 0));
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        if(third == (first + second)){
            return true;
        }else{
            return false;
        }
    }
}
