import java.awt.*;
import java.util.Scanner;


public class 武汉加油 {

    public static  String mergedString1(String string1,String string2) {
        return   string1 + string2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(mergedString1(str1,str2));
        System.out.print(str1);
        System.out.println(str2);
    }
}
