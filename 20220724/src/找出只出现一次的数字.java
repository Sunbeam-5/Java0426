import java.util.Scanner;

public class 找出只出现一次的数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 1, 2, 2, 9, 3, 3, 4, 4, 5 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            for ( j = 0; j < arr.length; j++) {
                if (j == i){
                    continue;
                }
                if ((arr[i] ^ arr[j]) == 0){
                    break;
                }
            }
            if (j == arr.length){
                System.out.println(arr[i]);
            }
        }
    }
}

