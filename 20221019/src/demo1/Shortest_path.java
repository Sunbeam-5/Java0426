package demo1;

import java.util.Scanner;

public class Shortest_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = m + n;
        int a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            a *= (sum - i);
        }
        for (int i = 0; i < n; i++) {
            b *= (i + 1);
        }
        System.out.println(a/b);
    }
}
