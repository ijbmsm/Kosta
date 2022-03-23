package day0323;

interface MyInterface{
    void display();

}

class MyClass1 implements MyInterface{
    @Override
    public void display() {
        System.out.println("구현클래스");
    }
}

class MyClass2 implements MyInterface{
    @Override
    public void display() {
        System.out.println("구현클래스2");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        using(new MyClass1());
    }

    private static void using(MyInterface myInterface) {
    }
}

