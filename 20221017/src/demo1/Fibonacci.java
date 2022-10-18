package demo1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = 0;
        int f1 = 0, f2 = 1, f3 = 0;
        while (f3 < m){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        if (m - f1 > f2 - m){
            System.out.println(f2-m);
        }else {
            System.out.println(m-f1);
        }
    }
}
