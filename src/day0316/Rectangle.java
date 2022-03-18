package day0316;

public class Rectangle extends Shape implements Resizable{

    double w;
    double h;

    public Rectangle(double w, double h) {
        super(4);
        this.w = w;
        this.h = h;
    }


    @Override
    double getArea() {
        return this.w*this.h;
    }

    @Override
    double getPerimeter() {
        return (this.w+this.h)*2;
    }

    @Override
    public void resize(double s) {
        this.w *= s;
        this.h *= s;
        getArea();
        getPerimeter();
    }
}
