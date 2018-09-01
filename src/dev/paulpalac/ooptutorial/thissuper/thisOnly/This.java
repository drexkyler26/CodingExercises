package dev.paulpalac.ooptutorial.thissuper.thisOnly;

public class This {
    public static void main(String[] args) {
        House greenHouse = new House("green");
        System.out.println(greenHouse.getColor());
    }
}

class House{
    private String color;

    public House(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}