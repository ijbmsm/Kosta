package day0323;

public class Char {


        public static void main(String[] args) {


            Char fc = new Char();


            int count=fc.countChar("Boys, be ambitious", 'i');


            System.out.println(count);


        }


        public int countChar(String str, char c) {
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(c == str.charAt(i)){
                    count++;
                }
            }
            return count;

        }


    }

