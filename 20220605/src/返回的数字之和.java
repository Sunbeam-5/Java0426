import java.util.Scanner;

public class 返回的数字之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
    public static int func(int n){
        int m = n, count = 0, sum = 0;
        do{
            count++;
            m = m / 10;
            if (m == 0){
                break;
            }
        }while(true);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = n % 10;
            n = n / 10;
            sum += arr[i];
        }
        return sum;
    }
}
