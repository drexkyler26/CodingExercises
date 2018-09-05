package dev.paulpalac.exercises;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(16));
        printPrime(16);
    }

    public static boolean isPrime(int x){
        if(x <= 1){return false;}
        else{
            for(int i = 2; i <= x/2; i++)
            if((x%i) == 0){
                return false;
            }
        }return true;
    }

    public static void  printPrime(int x){
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= x; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}
