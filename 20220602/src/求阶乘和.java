import java.util.Scanner;

public class 求阶乘和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = func(n);
        System.out.println(ret);
    }

    public static int func(int n){
        int sum = 0, a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
            sum += a;
        }
        return sum;
    }
}
