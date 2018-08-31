package dev.paulpalac.exercises;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(2, 13, 19));
    }

    public static boolean hasTeen(int x, int y, int z){
        if((x >= 13) && (x <= 19)){
            return true;
        }else if((y >= 13) && (y <= 19)){
            return true;
        }else if((z >= 13) && (z <= 19)){
            return true;
        }
        return false;
    }
}
