package day0316;

public abstract class Shape {
    private int n;


    public Shape(int n) {
        this.n = n;
    }

    int getNumSides(){
        return n;
    }


    abstract double getArea();

    abstract double getPerimeter();
}
