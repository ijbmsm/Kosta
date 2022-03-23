package day0323;

public class SystemTest {

    public static void main(String[] args) {
        f2();
    }
    private static void f2(){
        long a = System.currentTimeMillis();

        int sum= 0;
        for(int i = 0; i<10000000; i++){
            sum += i;
        }
        System.out.println(System.currentTimeMillis() - a);
    }
}
