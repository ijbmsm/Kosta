package day0318;


import java.io.IOException;

public class BookManager {
    public static void main(String[] args) throws IOException {
        Book book1 = new Book("뇌를 자극하는 자바", 25000);
        book1.print();
        Book book2 = new Book("오라클 SQL", 20000);
        book2.print();
        System.out.println("count = " + book1.getCount());


    }
}

