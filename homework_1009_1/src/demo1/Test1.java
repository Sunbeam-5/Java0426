package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int i = 0;
            if (n == -1){
                break;
            }
            arr1[i] = n;
            i++;
        }
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int i = 0;
            if (n == -1){
                break;
            }
            arr2[i] = n;
            i++;
        }
        int[] arr3 = new int[arr1.length + arr2.length + 100];
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else if (i >= arr1.length && i < arr1.length + arr2.length){
                arr3[i] = arr2[i];
            }
        }
        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1){
                System.out.print(" ");
            }
        }
    }
}
