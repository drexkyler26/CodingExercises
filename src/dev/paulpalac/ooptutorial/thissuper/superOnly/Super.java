package dev.paulpalac.ooptutorial.thissuper.superOnly;

public class Super {//parent class
    public void printMethod(){
        System.out.println("Super class method is called.");
    }

}
class SubClass extends Super{//child class
    @Override//overrides method from parent
    public void printMethod(){
        super.printMethod();//call parent method
        System.out.println("Subclass method is called.");
    }
}
class Main{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}
