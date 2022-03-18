package day0308;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    int numberOfPersons = 0;
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        numberOfPersons++;
        selfIntroduce();
    }

    void selfIntroduce(){
        System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
        System.out.println("총 인구수 = " + numberOfPersons);
    }
    int getPopulation(){
        return numberOfPersons;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        String name = br.readLine();

        Person person = new Person(age, name);
    }
}

