import java.util.Scanner;

public class 递归求N的阶乘 {
    public static int func(int n){
        if (n == 1){
            return 1;
        }
        else {
            return (func(n - 1) * n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = func(n);
        System.out.println(sum);
    }
}
