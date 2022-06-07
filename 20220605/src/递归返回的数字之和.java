import java.util.Scanner;

public class 递归返回的数字之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }

    public static int func(int n){
        if (n <= 9){
            return n;
        }else {
            return n % 10 + func(n / 10);
        }
    }
}
