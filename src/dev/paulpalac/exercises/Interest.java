package dev.paulpalac.exercises;

public class Interest {
    private int amount;
    private int interestRate;
    public static void main(String[] args) {
    calculateInterest(1000, 2);
    }
    public static void calculateInterest(double amount, double interestRate){
        double interest = amount*(interestRate/100);
        System.out.println("The amount of " +amount +" has interest of " +interest);
    }
}
