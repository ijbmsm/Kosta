package day0308;

public class OperatorTest {
    public static void main(String[] args) {
        print();

    }

    static void print(){
        int a[][] = {{30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}};
        int b[][] = {{1,2,3,4}, {5,6,7,8}, {9, 10, 11, 12}};

        int pp[][] = sub(a,b);

        for(int i = 0; i< a.length; i++){
            for(int j =0; j<= a.length; j++){
                System.out.print(pp[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sub(int[][] a, int[][] b){

        int c[][] = new int[a.length][a.length+1];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j <= a.length; j++){
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        return c;
    }

}
