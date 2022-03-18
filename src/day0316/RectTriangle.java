package day0316;

public class RectTriangle extends Shape{

    int w;
    int h;

    public RectTriangle(int w, int h) {
        super(3);
        this.w = w;
        this.h= h;
    }

    @Override
    double getArea() {
        return (w*h)/2;
    }

    @Override
    double getPerimeter() {
        return (w+h)+Math.sqrt((w*w)+(h*h));
    }
}
