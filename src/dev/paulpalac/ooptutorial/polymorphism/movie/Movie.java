package dev.paulpalac.ooptutorial.polymorphism.movie;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String moviePlot(){
        return "No plot";
    }
    public String getName(){
        return this.name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String moviePlot(){
        return "Sharks eats people";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }
    @Override
    public String moviePlot(){
        return "Sharks eats people";
    }
}
class ForgetMovie extends Movie {
    public ForgetMovie() {
        super("ForgetMovie");
    }
}
