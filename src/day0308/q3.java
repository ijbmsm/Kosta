package day0308;

public class q3 { // 오름차순
    public static void main(String[] args) {
        int arr[] = {3, 24, 1, 55, 17, 43, 5};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
