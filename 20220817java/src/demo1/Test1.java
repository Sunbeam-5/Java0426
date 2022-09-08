package demo1;

import java.util.Scanner;
import java.util.*;

class Main {
    public static int[] constructArr(int[] a){
        if (a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        int temp = 1;

        for (int i = 1; i < a.length; i ++){
            b[i] = b[i - 1] * a[i - 1];
        }

        for (int i = a.length - 1; i >= 0; i--){
            b[i] *= temp;
            temp = a[i];
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // code here
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(constructArr(arr));
        sc.close();
    }
}