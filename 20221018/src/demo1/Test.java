package demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = a, n = b;
        while (n != 0){
            int t = m % n;
            m = n;
            n = t;
        }
        System.out.println(a*b/m);
    }
}
