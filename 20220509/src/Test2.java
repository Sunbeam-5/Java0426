import java.util.Scanner;

public class Test2 {
    public static int f(int m, int n){
        int t;
        while(true){
            t = m % n;
            if (t == 0) {
                break;
            }
            m = n;
            n = t;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str1 = sc.next();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String str2 = sc.next();
        int d = sc.nextInt();
        int num1, num2, p;
        if (b == d){
            num1 = a + c;
            p = f(num1, b);
            num1 /= p;
        }
    }
}
