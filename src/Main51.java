import java.util.HashMap;

public class Main51 {
    
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
            
        HashMap<String, Integer> map = new HashMap<String, Integer>();
            
        for (String parti : participant) {
            map.put(parti, map.getOrDefault(parti, 0) + 1);
        }

        for (String compl : completion) {
            map.put(compl, map.get(compl) -1);
        }

        for (String parti : participant) {
            if (map.get(parti) != 0) {
                answer = parti;
                break;
            }
        }
        return answer;
    }
    
}
