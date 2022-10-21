package demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int count = 0, max = 0;
        String binStr = Integer.toBinaryString(m);
        String[] s = binStr.split("");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("1")){
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }

        }
        if (max == 0 && count != 0){
            max = count;
        }
        System.out.println(binStr);
        System.out.println(max);
    }
}


