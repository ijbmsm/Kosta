import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main29 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dartResult = br.readLine();
        System.out.println(solution(dartResult));
    }


    public static int solution(String dartResult) {
        String[] strs = dartResult.split("");
        int[] nums = new int[3];
        int count = 0;
        int result = 0;
        for(int i=0; i < strs.length; i++) {
            try {
                int tmp = Integer.parseInt(strs[i]);
                if(0 <= tmp && tmp <= 10) {
                    if(tmp == 1 && strs[i+1].equals("0")) {
                        nums[count] = 10; i++;
                    }else {
                        nums[count] = tmp;
                    }
                }
            }catch(NumberFormatException e) {
                if(strs[i].equals("S")){
                    nums[count] = (int) Math.pow(nums[count], 1);
                }else if(strs[i].equals("D")) {
                    nums[count] = (int) Math.pow(nums[count], 2);
                }else if(strs[i].equals("T")) {
                    nums[count] = (int) Math.pow(nums[count], 3);
                }else if(strs[i].equals("*")) {
                    --count;
                    if(i==2) {
                        nums[count] *= 2 ;
                    }else {
                        nums[count] *= 2 ;
                        nums[count-1] *= 2 ;
                    }
                }else if(strs[i].equals("#")) {
                    --count; nums[count] *= -1;
                } count++;
            }
        } for(int i : nums) { result += i; }
        return result;


    }
}

