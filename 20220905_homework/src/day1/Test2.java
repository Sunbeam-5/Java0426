package day1;

import java.util.Scanner;

public class Test2 {
    public static int sqrt1 (int x) {
        // write code here
        int res = 0;
        // 注意转换为 long, 否则会产生溢出
        while ((long)res * res <= x) {
            ++res;
        }
        return --res;
    }
    public static int sqrt2(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            int sqrtTemp= x / mid;
            if (mid > sqrtTemp) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sqrt1(a);
        int c = sqrt2(a);
        System.out.println(b);
        System.out.println(c);
    }

}
