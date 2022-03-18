package day0308;

import java.util.Scanner;


public class ddd { //계절 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printSeason(month);
        arrPrint(month);
    }

    static void printSeason(int month){
        switch(month){
            case 1: case 2: case 12:
                System.out.println("겨울에 태어나셨군요");
                break;

            case 3: case 4: case 5:
                System.out.println("봄에 태어나셨군요");
                break;

            case 6: case 7: case 8:
                System.out.println("여름에 태어나셨군요");
                break;

            case 9: case 10: case 11:
                System.out.println("가을에 태어나셨군요");
                break;

            default:
                System.out.println("1~12 사이의 숫자만 입력하셔야 합니다");

            }
        }

        static void arrPrint(int month){
            String arr[] = {null, "겨울", "겨울","겨울", "봄", "봄", "봄", "여름","여름","여름", "가을","가을","가을"};

            if(month == 0 || month > 12){
                System.out.println("1~12 사이의 숫자만 입력하셔야 합니다");
                return;
            }

            System.out.println(arr[month] + " 에 태어나셨군요");
        }


}


