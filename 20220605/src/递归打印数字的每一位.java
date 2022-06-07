import java.util.Scanner;

public class 递归打印数字的每一位 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        func1(n);
    }
    public static int[] func1(int n){
        int i = 0;
        int[] arr = new int[100];
        if (n < 10){
            arr[i] = n;
            return arr;
        }else{
            arr[i] = n % 10;
            i++;
            return n /= 10;
        }
    }
}
