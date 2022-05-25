import java.util.Locale;
import java.util.Scanner;

public class 计算某字符出现次数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char c = sc.next().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
