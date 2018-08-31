package dev.paulpalac.exercises;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(10500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
        System.out.println("Invalid Value");
    } else if(kiloBytes == 0){
        System.out.println("0 KB = 0 MB and 0 KB");
    }else{
        int remainderKiloBytes = (kiloBytes % 1024);
        int megaBytes = Math.round(kiloBytes / 1024);
        System.out.println(+kiloBytes +" KB = "+megaBytes +" MB and "
                +remainderKiloBytes +" KB");
    }
}
}