package demo1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String s = Integer.toBinaryString(n);//转化为二进制
            String[] str = s.split("0");//将其用0分隔
            int max = 0;
            for (String value : str) {//把每一段字符串给value
                if (value.length() > max) {//统计最大值
                    max = value.length();
                }
            }
            System.out.println(max);
        }
    }
}
