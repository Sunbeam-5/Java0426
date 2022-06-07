import java.util.Scanner;

public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isFibonacci(n));
    }
    public static int isFibonacci(int n){
        int a = 1, b = 1, c = 0;
        if (n == 1 || n == 2){
            return  1;
        }else{
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
