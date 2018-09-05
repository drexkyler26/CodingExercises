package dev.paulpalac.ooptutorial.polymorphism.movie;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " +i
                    +" : " +movie.getName() +"\n"
                    +movie.moviePlot() +"\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.round(Math.random()*3 + 1));
        System.out.println("Random number is " +randomNumber);
        switch (randomNumber){
            case 1: return new Jaws();

            case 2: return new StarWars();

            case 3: return new ForgetMovie();
        }
        return null;
    }
}
