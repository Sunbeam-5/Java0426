package day1;

import java.util.Scanner;

public class Test1 {
    public static boolean func(String s){
        StringBuilder str1 = new StringBuilder(s);
        String str2 = new StringBuffer(str1).reverse().toString();
        if(s.equals(str2)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean a = func(str);
        System.out.println(a);
    }
}

    /*StringBuilder str1 = new StringBuilder(str);
    String str2 = new StringBuffer(str1).reverse().toString();
        if(str.equals(str2)){
                return true;
                }else {
                return false;
                }*/