import java.util.Scanner;

public class 递归打印数字的每一位 {
    public static void func(int a){
        if (a == 0){
            return;
        }
        int m = a;
        m = a / 10;
        func(m);
        System.out.println(a % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}
