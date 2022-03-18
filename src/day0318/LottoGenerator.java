package day0318;

import java.util.Arrays;

public class LottoGenerator {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(random()));
    }


    static int[] random(){
        int[] arr = new int[45];
        int[] arr2 = new int[6];
        int n = 0;
        int count =0;
        while(count <= 5){
            n = (int)(Math.random()*45)+1;
            if(arr[n] == 0) {
                arr2[count] = n;
                arr[n] = 1;
                count++;
            }
        }
        Arrays.sort(arr2);
        return arr2;
    }
}
