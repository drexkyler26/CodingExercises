package dev.paulpalac.ooptutorial.association.computer;

public class Dimensions {
    private int width, height, depth;

    public Dimensions(int length, int width, int height) {
        this.width = width;
        this.height = height;
        this.depth = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
