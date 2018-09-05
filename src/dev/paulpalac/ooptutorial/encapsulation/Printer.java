package dev.paulpalac.ooptutorial.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if((tonerLevel > -1)&&(tonerLevel <= 100)){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted =0;
        this.duplex = duplex;
    }
    public void fillUpToner(int increaseToner){
        if(((tonerLevel <= 1) || (tonerLevel < 100)) && !(increaseToner <= 0)){
            tonerLevel += increaseToner;
            int checkTonerLevel = tonerLevel;
            if(checkTonerLevel > 100){
                int returnToner = checkTonerLevel - 100;
                tonerLevel -= returnToner;
                System.out.println("Toner full, " +"returned " +returnToner);
            }else {
                System.out.println("New toner level is " +tonerLevel);
            }
        }else{
            if(increaseToner <= 0)
            System.out.println("Invalid Input. ");
            else{
                if(tonerLevel >= 100){
                    System.out.println("Toner already full");
                }
            }
        }
    }

    public void printPage(int pages){
        this.pagesPrinted = pagesPrinted + pages;
        System.out.println("Printed pages: " +pages);
        System.out.println("Overall pages printed: " +pagesPrinted);
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
