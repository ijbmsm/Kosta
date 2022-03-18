public class Person {
    int no = 10;
    String name;

    Person(int no) {
        this.no = no;
        System.out.println("Person(int no) 호출됨 ");
    }

    Person(int no, String name) {
        this(no);
        this.name = name;
        System.out.println("Person(int no, String name) " +
                "호출됨 ");
    }
}
