package day0308;

import java.util.Scanner;

public class q2 { // abs 메서드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(abs(a,b));
    }

    static int abs(int a, int b){
        int answer = 0;
        //answer = Math.abs(a-b);
        if(a-b < 0){
            answer = (a-b)*-1;
        }
        else{
            answer = a-b;
        }

        return answer;
    }
}
