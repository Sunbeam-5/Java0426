package demo1;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        Parenthesis parenthesis = new Parenthesis();
        boolean flag = parenthesis.chkParenthesis(str);
        System.out.println(flag);
    }
}
