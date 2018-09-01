package dev.paulpalac.ooptutorial.overloadride;

class Burger{
    public static void main(String[] args) {
        OrdinaryBurger burger = new OrdinaryBurger(2);
        OrdinaryBurger burger1 = new OrdinaryBurger(2, 3);
        HealthyBurger burger2 = new HealthyBurger(2,3, 1);
        burger1.cook(3);
        burger2.cook(4);
    }
}
class OrdinaryBurger {
    private int patty, cheese;
    public OrdinaryBurger(int patty){
        this(patty, 0);
    }
    public OrdinaryBurger(int patty, int cheese){
        this.patty = patty;
        this.cheese = cheese;
        System.out.println(patty +" patty, " +cheese +" cheese, ");
    }
    public void cook(int time){
        System.out.println("\nWell done for " +time +" minutes.");
    }
}
class HealthyBurger extends OrdinaryBurger{
    private int tomato, lettuce, cucumber, patty, cheese, catsup, time;
    public HealthyBurger(int lettuce){
        this(lettuce, 0,0);
    }
    public HealthyBurger(int lettuce, int tomato){
        this(lettuce, tomato,0);
    }
    public HealthyBurger(int lettuce, int tomato, int cucumber){
        super(1, 1);
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cucumber = cucumber;
        System.out.print(lettuce +" lettuce, " +tomato +" tomato, " +cucumber +" cucumber");
    }
    public void cookMethod(int time){
        System.out.println("Well done for " +time +" minutes and blanched vegetables.");
    }
    @Override
    public void cook(int time){
        cookMethod(time);
    }
}
