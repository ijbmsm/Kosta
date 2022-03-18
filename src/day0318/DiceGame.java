package day0318;

public class DiceGame {
    public static void main(String args[]){
        DiceGame game = new DiceGame ();

        int result1 = game.countSameEye(10);
        System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

        int result2 = game.countSameEye(0);
        System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);


    }
    int countSameEye(int n) throws IllegalArgumentException {
        int count = 0;
        Dice dice = new Dice(n);
        Dice dice2 = new Dice(n);
        if(n <= 0){
            throw new IllegalArgumentException("1 이상의 숫자를 입력하세요.");
        }
        for(int i = 0; i < n; i++){
            if(dice.play() == dice2.play()){
                count++;
            }
        }
        return count;
    }
}

class Dice {
    int size;
    Dice(int size){
        this.size = size;
    }
    int play(){
        int number = (int)(Math.random() * size) + 1;
        return number;
    }



}

