package day0323;

import java.io.UnsupportedEncodingException;

public class SystemTest {

    public static void main(String[] args) throws UnsupportedEncodingException {

    }
    private static void f2(){
        long a = System.currentTimeMillis();

        int sum= 0;
        for(int i = 0; i<10000000; i++){
            sum += i;
        }
        System.out.println(System.currentTimeMillis() - a);
    }
    
    private static void f3(){
        String result = System.getProperty("java.version");
        System.out.println("result = " + result);
    }
}
